import { useEffect } from 'react';
import { useState } from 'react';
import { Link, useNavigate, useParams } from 'react-router-dom';
const Facdetails=()=>{
    const params=useParams()
    const [fac1,setfac1]=useState({});
    const nav =useNavigate();
    useEffect(()=>{
        fetch("https://64e8603a99cf45b15fdf77ff.mockapi.io/faculty/"+params.id)
            .then((res)=>{
                return res.json();
            })
            .then((res)=>{
                setfac1(res);
            })
    },[]);
    
    return(
        <>
            <div className="">
                    <img src={fac1.pho} alt="image cap" />
        
                      
                        <h5 >name:{fac1.facultyname}{params.id}</h5>
                        <p >salary:{fac1.salary}</p>
                        <p >exp:{fac1.exp}</p>
                        <p >id:{fac1.id}</p><br/> &nbsp;
                       
                        <Link to="/Faculty" className="btn btn-primary">Back </Link>&nbsp;
                        <button className="btn btn-primary "onClick={() => {nav("/editfaculty/" + params.id);}}>Edit</button>&nbsp;
                        <button className="btn btn-primary" onClick={()=>{ fetch("https://64e8603a99cf45b15fdf77ff.mockapi.io/faculty/"+params.id,{method:"DELETE"})
            .then((res)=>{
                return res.json();
            })
            .then(()=>{
               nav("/Faculty")
            })}}>delete</button>
                </div> 
    
        </> 
    ) 
}
export {Facdetails};