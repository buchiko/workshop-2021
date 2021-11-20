import { useCookies } from "react-cookie";


const Logout = () => {
    const [cookies, removeCookie] = useCookies();
    removeCookie("acceptLoggedIn");
    window.location.href = "login";
};
  
  export default Logout