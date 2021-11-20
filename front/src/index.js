import React from 'react';
import ReactDOM from 'react-dom';
import { Router, Route } from 'react-router-dom'
import axios from 'axios';
import './index.css';
import App from './App';
import { CookiesProvider } from "react-cookie";

axios.defaults.baseURL = 'http://localhost:8080/';

ReactDOM.render(
  <React.StrictMode>
    {/* <CookiesProvider> */}
      <App />
    {/* <Router history={history}>
      <div>
          <Route exact path="/" component={Login} />
          <Route exact path="/home" component={Home} />
        </div>
    </Router> */}
    {/* </CookiesProvider> */}
  </React.StrictMode>,
  document.getElementById('root')
);
