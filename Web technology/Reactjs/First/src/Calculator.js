import { useState } from "react"
import './Cc.css'
function Cal(){
const[input,Setinput]=useState("");
const[result,setreult]=useState("");

const handleclear=()=>{
    Setinput("")
    setreult("")
}
const handleans=()=>{
    try {
        setreult(eval(input))
    } catch (error) {
        setreult("error")
    }
}
const handleonclick=(val)=>{
    Setinput(input+val)
    console.log(input)
}
return(<>
<table  border="1" width="22%" align="center" id="main">
<tr id="bor">
            <td colspan="4" id="ans">
            <h1 style={{color:"white"}}>{input}</h1>
            <h1>{result}</h1>   
            </td>
        </tr>
        <tr id="bor">
            <td id="sp2">
            <button onClick={()=>{handleonclick("7");}}>7</button>   
           </td>
            <td id="sp">
            <button onClick={()=>{handleonclick("8");}}>8</button>   
            </td>
            <td id="sp">
            <button onClick={()=>{handleonclick("9");}}>9</button>   
            </td>
            <td id="sp1">
            <button onClick={()=>{handleonclick("+");}}>+</button>   
            </td>
        </tr>
        <tr id="bor">
            <td id="sp">
            <button onClick={()=>{handleonclick("4");}}>4</button>      
            </td>
            <td id="sp">
            <button onclick={()=>{handleonclick("5");}}>5</button>   
            </td>
            <td id="sp">
            <button onClick={()=>{handleonclick("6");}}>6</button>   
            </td>
            <td id="sp">
            <button onClick={()=>{handleonclick("-");}}>-</button>   
            </td>
        </tr>
        <tr id="bor">
            <td id="sp">
            <button onClick={()=>{handleonclick("1");}}>1</button>   
            </td>
            <td id="sp">
            <button onClick={()=>{handleonclick("2");}}>2</button>   
            </td>
            <td id="sp">
            <button onClick={()=>{handleonclick("3");}}>3</button>   
            </td>
            <td id="sp">
            <button onClick={()=>{handleonclick("*");}}>*</button>   
            </td>
        </tr>
        <tr id="bor">
            <td id="sp">
            <button onClick={()=>{handleclear();;}}>c</button>   
            </td>
            <td id="sp">
            <button onClick={()=>{handleonclick("0");}}>0</button>   
            </td>
            <td id="sp">
            <button onClick={()=>{handleans("");}}>=</button>   
            </td>
            <td id="sp">
            <button onClick={()=>{handleonclick("/");}}>/</button>   
            </td>
        </tr>
</table> 
</>)
}
export {Cal}