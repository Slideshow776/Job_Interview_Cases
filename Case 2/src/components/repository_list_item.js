import React from 'react';

const RepositoryListItem = ({repository}) => {
    const name = repository.name;
    const avatar = repository.owner.avatar_url;
    let description = repository.description;
    const language = repository.language;
    const type = repository.owner.type;
    const stargazers = repository.stargazers_count;
    const watchers = repository.watchers;
    const forks = repository.forks;
    const url = repository.svn_url;

    if (description.length > 110) { // cuts off texts that are too long
        description = description.slice(0, 110) + " ...";
    }

    return (
        <tr>
            <td>{name}</td>            
            <td><img src={avatar} /></td>
            <td>{description}</td>
            <td>{language}</td>
            <td>{type}</td>
            <td>{stargazers}</td>
            <td>{watchers}</td>
            <td>{forks}</td>
            <td><a href={url} >{url}</a></td>
        </tr>
    );
};

export default RepositoryListItem;
