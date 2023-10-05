import { Link } from "react-router-dom";
import "./Header.css";
const Header =()=>{
  return(
    <>
     <header className="unique-header">
      <div className="logo"><img src="https://queencity3d.com/wp-content/uploads/2020/05/demo-logo.jpg" alt="Card image cap"></img></div>
      <nav className="nav-menu">
        <ul>
      <div className="h5 p-3 mb-2 ">
    <Link className="text-light" to ="/">home</Link>&nbsp;
    <Link className="text-light" to ="/About">About</Link>&nbsp;
    <Link className="text-light" to ="/Main">Main</Link>&nbsp;
    <Link className="text-light" to ="/Data">Data</Link>&nbsp;
    <Link className="text-light" to ="/Data/Data1">Data1</Link>&nbsp;
    <Link className="text-light" to ="/L8-9">lab 8-9</Link>&nbsp;
    <Link className="text-light" to ="/lab10a">lab10a student</Link>&nbsp;
    <Link className="text-light" to ="/lab10b">lab10b faculty</Link>&nbsp;
    <Link className="text-light" to ="/lab10c">lab10c product</Link>&nbsp;
    <Link className="text-light" to ="/lab12a">lab12a count</Link>&nbsp;
    <Link className="text-light" to ="/lab12b">lab12b Calculator</Link>&nbsp;
    <Link className="text-light" to ="/lab12d">lab12d Curd</Link>&nbsp;
    </div>
  
      </ul>
      </nav>
    </header>
    <br/>
    </>
  )
}
export {Header};