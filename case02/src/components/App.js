import React, {Component} from 'react';
import RepositoryList from './repository_list';
import Pagination from './page_list';

const url = 'https://api.github.com/search/repositories?q=language:javascript&sort=stars&order=desc&per_page=100';
const results_per_pages = 20;

export default class App extends Component {
    constructor(props) {
        super(props);
        this.state = {
            githubData: [],
            pages: 0,
            selectedPage: 1
        };
    }

    componentDidMount() {
        fetch(url) // Get data from API
            .then(d => d.json()) // convert data to json format
            .then(d => { // when data has finished loading, do this
                this.setState({githubData: d.items })
                this.setState({pages: Math.ceil(this.state.githubData.length/results_per_pages)});
            });        
    }

    componentDidUpdate() { // Ensures selected page cannot be less than 0, or more than the total number of pages.
        if (this.state.selectedPage < 1) this.setState({selectedPage: 1});
        else if (this.state.selectedPage > this.state.pages && this.state.pages > 0) this.setState({selectedPage: this.state.pages});
    }

    render () {
        if (this.state.githubData.length == 0 || this.state.pages == 0) return (
            <div>
                <h1>Top Github Repositories!</h1>
                <p>Loading ...</p>
            </div>
        )
        return (
            <div className="app_Div">
                <h1>Top Github Repositories!</h1>
                <RepositoryList repositories={
                    this.state.githubData.slice(
                        (this.state.selectedPage - 1) * results_per_pages,
                        this.state.selectedPage * results_per_pages
                        )
                }/>
                <Pagination
                    onPageSelect={selectedPage => this.setState({selectedPage})}
                    pages={this.state.pages}
                    selectedPage={this.state.selectedPage}
                />
            </div>
        );
    }
}
