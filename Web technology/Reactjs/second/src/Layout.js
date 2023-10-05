import { Outlet } from "react-router-dom";
import { Header } from "./Header";
import { Footer } from "./Footer";
import "./Header.css";

function Layout(){
    return(<>
     <div className=" h5 mb-2  text-body">
        <Header/>
        <div className="bg-secondary">
        <Outlet/>
        </div>
        <div className="unique-header">
        <Footer/>
        </div > 
        </div>
        </>
    )
}
export {Layout}