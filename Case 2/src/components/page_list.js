import React, { Component } from 'react';

let pages = [];

export default class PageList extends Component{
    constructor(props) {
        super(props);
        this.state = {pageColor: 'page_white'};
    }

    _loadPages() { // dynamical initialization for pages that are numbered
        pages = new Array(this.props.pages);
        for (let i = 1; i<=this.props.pages; i++) {
            if (i == this.props.selectedPage) this.state.pageColor = 'page_green';
            else this.state.pageColor = 'page_white';
            pages[i] = 
            <div
                key={i}
                className={this.state.pageColor}
                onClick={this.props.onPageSelect.bind(null, i)}>
            {i}
            </div>;
        };
    }

    render() {
        if (this.props.pages == 0) return null; // if props did not load yet return null
        this._loadPages();
        return (
            <div className="pagination">
                <div className="page_white" id="<<" onClick={() => this.props.onPageSelect(0)}>&#60;&#60;</div>
                <div className="page_white" id="<" onClick={() => this.props.onPageSelect(this.props.selectedPage - 1)}>&#60;</div>        
                {pages}
                <div className="page_white" id=">" onClick={() => this.props.onPageSelect(this.props.selectedPage + 1)}>&#62;</div>
                <div className="page_white" id=">>" onClick={() => this.props.onPageSelect(this.props.pages)}>&#62;&#62;</div>
        </div>
        );
    }
}
