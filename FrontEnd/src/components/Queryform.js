import axios from "axios";
import { useEffect, useState } from "react";
import authHeader from "../services/auth-header";



const Queryform=()=>{
    const [userlogged,setuserlogged]=useState(false);
    const [message, setmessage] = useState("");
    const [query, setquery] = useState("");
    useEffect(()=>{
        document.title="Profile"
        setuserlogged(sessionStorage.getItem('userlogged'));
        
      },[])
      const handleChange = (args) => {

        
       
        setquery( args.target.value);
        setmessage("");

    }
    console.log(query)
function submitquery(){
    axios.post("/test/query", {query_comments:query},{ headers: authHeader()}).then((response) => {
       window.location.href="/home";
    }, (error) => {
        const _content =
            (error.response && error.response.data) ||
            error.message ||
            error.toString();

       setmessage(_content);
    });
}
    
return(
    <div className="container-fluid text-light " >
       <h2>Query Form</h2> 

    <div className="container">
        Subject : <input type={Text}></input>
        
    </div>
    <br></br>
    <div className="container" style={{lineHeight:"80px",width:"80%"}}>
        Comments : <textarea name="comment" form="usrform" style={{width:"500px"}} onChange={handleChange}></textarea>
    </div>
    <div className="container" ><button className="btn btn-outline-success" onClick={()=>(submitquery())}>Submit Query</button></div>
    <div>{message}</div>
    </div>
)
    
}

export default Queryform;