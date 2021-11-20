import './Login.css';
import React, { useState } from 'react';
import { TextField, Button, Alert, LinearProgress } from '@mui/material';
import axios from 'axios';
import { useCookies } from "react-cookie";


const Login = () => {
  const [data, setData] = useState([]);
  const [form, setForm] = useState({id: "", password: ""});
  const [message, setmessage] = useState([]);
  const [cookies, setCookie] = useCookies();
  const [loading ,setLoading] = useState(false);
  
  const handleChange = (event) => {
    setForm({ ...form, [event.target.name]: event.target.value });
  };

   const login = () => {
    clearMessage()
    setLoading(true);
    axios.post("login", {loginId: form.id, password: form.password})
      .then(response => {
        setLoading(false);
        setData(response.data.value);
        setCookie("acceptLoggedIn", true);
        setmessage(["success", "ログインに成功しました！"]);
        window.location.href = "home";
      },[])
      .catch(({error}) => {
        if (error !== undefined) {
          if (error.response.status >= 500) {
            setmessage(["error", "サーバーで問題が発生しました。"]);
          }
          else if (error.response.status >= 400) {
            setmessage(["error", "リクエストが誤っています。"]);
          }
        } else {
          setmessage(["error", "サーバーに接続できませんでした。"]);
        }
        setLoading(false);
      });
  };
  
  const clearMessage = () => {
    setmessage([]);
  }

  return (
    <div className="Login">
      <h1 className="app-title">ようこそ</h1>
      
      <div className="textField"><TextField label="ID" name={"id"} value={form.id} onChange={handleChange} variant="outlined" fullWidth /></div>
      <div className="textField"><TextField label="パスワード" name={"password"} value={form.password} onChange={handleChange} variant="outlined" type="password" fullWidth /></div>
      <Button className="button"
        variant="contained" color="primary"
        onClick={login}>
          ログイン
      </Button>
        <p>{0 !== message.length && <Alert onClose={clearMessage} severity={message[0]}>{message[1]}</Alert>}</p>
      {loading && <LinearProgress />}
    </div>
  )
}

export default Login