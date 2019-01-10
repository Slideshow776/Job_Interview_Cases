import axios from 'axios'

const instance = axios.create({
  baseURL: process.env.NODE_ENV === 'development' ? 'http://localhost:5000/' : 'https://example.com/',
  timeout: 10000 // If this is too low it will give a network status of 'canceled'.
})

const getResource = (url) => {
  return instance.get(url)
    .then(result => {
      return result.data
    })
    .catch(error => {
      console.log(error)
      return error
    })
}

const performRpcWithPromise = (rpcMethod, rpcParams) => {
  let requestId = Math.random().toString(36).slice(4)
  let url1 = process.env.NODE_ENV === 'development' ? 'http://localhost:5000/rpc' : 'https://example.com/'
  return axios.post(url1, {
    id: requestId,
    jsonrpc: '2.0',
    method: rpcMethod,
    params: rpcParams
  }).then(function (result) {
    return result.data.result
  }).catch(error => {
    console.log(error)
    return error
  })
}

export default {
  getResource,
  performRpcWithPromise
}
