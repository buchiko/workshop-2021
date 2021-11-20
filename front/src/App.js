import React from 'react';
import { BrowserRouter as Router, Route, Redirect } from 'react-router-dom';
import Login from './Login';
import Home from './Home';
import Logout from './Logout';
import LoginError from './LoginError';
import { CookiesProvider, useCookies } from "react-cookie";

const App = () => {
    return (
        <div className="App">
        <Router>
            <CookiesProvider>
                <Route exact path='/' component={Login}/>
                <Route exact path='/login' component={Login}/>
                <Route exact path='/logout' component={Logout}/>
                {/* Auth */}
                <Route exact path='/home' component={Auth}/>
                <Route exact path='/loginError' component={LoginError}/>
            </CookiesProvider>
        </Router>
        </div>
    );
}

const Auth = () => {
    const [cookies] = useCookies();
    if (cookies.acceptLoggedIn === "true") {
        return <Home />;
    }
    return <Redirect to='/loginError'/>;
}

export default App;