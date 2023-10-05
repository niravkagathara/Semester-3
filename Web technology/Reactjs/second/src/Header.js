import { Link } from "react-router-dom";
import "./Header.css";
const Header = () => {
  return (
    <>
    <header className="unique-header">
      <div className="logo"><img src="https://queencity3d.com/wp-content/uploads/2020/05/demo-logo.jpg" alt="Card image cap"></img></div>
      <nav className="nav-menu">
        <ul>
      <div className="h5 p-3 mb-2 ">
        <div className="row">
       <div className="col"> <Link to="/Main" className="text-light">Main  </Link></div>
       <div className="col"> <Link to="/" className="text-light">home  </Link></div>
       <div className="col"> <Link to="/About" className="text-light">About  </Link></div>
       <div className="col"> <Link to="/Faculty" className="text-light">Faculty  </Link></div>
       <div className="col"> <Link to="/Addfaculty" className="text-light">Addfaculty </Link></div>
       <div className="col"> <Link to="/curd" className="text-light">curd  </Link></div>
       <div className="col"> <Link to="/Facdetails/:id" className="text-light">Facdetails </Link></div>
       <div className="col"> <Link to="/Counter" className="text-light">Counter </Link></div>
       </div>
      </div> 
      </ul>
      </nav>
    </header>
    </> 
  )
}
export { Header };
 
       