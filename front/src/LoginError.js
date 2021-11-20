import './LoginError.css';
import React from 'react';
import { Button } from '@mui/material';


const LoginError = () => {  
    const getValue = () => {
        window.location.href = "login";
    };

    return (
        <div className="LoginError">
            <h1 className="app-title">セッションエラー</h1>
            <div className="sessionMessage">
            セッションが切れました。再ログインしてください。
            </div>
            <Button className="backToLoginButton"
        variant="contained" color="primary"
        onClick={() => getValue()}>
          ログイン画面に戻る
      </Button>
        </div>
    )
  }
  
  export default LoginError