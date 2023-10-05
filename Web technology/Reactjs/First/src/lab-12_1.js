import { useState } from "react";

function State(){
    const [cou, setcount] = useState(0);
    // let c = 0;
    let a=0;
    const Add=()=>{
        a=a+1;
        document.getElementById("demo").innerHTML=a;

    }

    const [a2,seta2]=useState(1);
    const Add2=()=>{
        seta2(a2+1);

    }
    const [a3,seta3]=useState(2);
    const Add3=()=>{
        seta3(a3+1);
        seta3(a3=>a3+1);

    }

    const countState = () => {
        setcount(cou+1);
        // c = c+1;
        // console.log(c);
    }

return(
<>
<h1 id="demo">{a}</h1>
<button onClick={Add}>add</button>
<h1>{a2}</h1>
<button onClick={Add2}>add2</button>
<h1>{cou}</h1>
<button onClick={countState}>add3</button>
</>
)
}


export {State}