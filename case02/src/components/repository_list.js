import React from 'react';
import RepositoryListItem from './repository_list_item';

const RepositoryList = (props) => {
    const repositoryItems = props.repositories.map((repository) => {
        return <RepositoryListItem key={repository.id} repository={repository} />;
    });

    return (
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th></th>
                    <th>Description</th>
                    <th>Language</th>
                    <th>Type</th>
                    <th><i className="glyphicon glyphicon-star"></i></th>
                    <th><i className="glyphicon glyphicon-eye-open"></i></th>
                    <th>Forks</th>
                    <th>URL</th>
                </tr>
                {repositoryItems}
            </thead>
        </table>
    );
};

export default RepositoryList;
