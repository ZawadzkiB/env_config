const fetch = require('node-fetch');

const args = process.argv.splice(2);
const name = JSON.parse(args[0]).name;

let data = {
    'token': 'Z7rs4vnTMgobpthGpYEW',
    'users_url': 'http://localhost/api/v4/users'
};

let userData = {
    'email': 'test-user-api3@mailinator.com',
    'username': 'test-user-api3',
    'name': 'Name',
    'password': 'Password',
    'skype': 'Skype ID',
    'linkedin': 'LinkedIn',
    'twitter': 'Twitter account',
    'website_url': 'Website URL',
    'organization': 'Organization name',
    'projects_limit': 1,
    'extern_uid': '',
    'provider': {},
    'bio': 'api user',
    'skip_confirmation': 'true'
};

let getUserData = () => {
    userData.email = name + '@mailinator.com';
    userData.username = name
    return userData
};

let user = getUserData();

let getUsers = () => fetch(data.users_url, {
    method: 'GET',
    headers: {
        'Private-Token': data.token
    }
}).then(response => {
    return response.json();
});


let postUser = (user) => {
    let url = new URL(data.users_url);
    Object.keys(user).forEach(key => url.searchParams.append(key, user[key]));

    return fetch(url, {
        method: 'POST',
        headers: {
            'Private-Token': data.token
        }
    }).then(response => {
        return response;
    });
};

let createUser = async () => {
    const postResponse = await postUser(user);
    const getResponse = await getUsers()
        .then(response => {
        return response.filter(obj => {
            return obj.username === user.username
        })
    });
    console.log('User ' + user.username + ' creation status code => ' + postResponse.status + '; User id => ' + getResponse[0].id)
};

createUser();
