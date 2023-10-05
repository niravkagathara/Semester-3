import React from 'react';

function Demo1() {
    return (
      <>
        <h1>demo1 hiii</h1>
      </>
    )
  }
  const Demo2 = () => {
    return (
      <>
        <h1>demo2</h1>
      </>
    )
  }
  const Demo3 = (pro) => {
    return (
      <>
        <h1>name: {pro.name}  is age:{pro.age}</h1>
      </>
    )
  }
  const Demo4 = () => {
    return (
     alert("error")
    )
  }
  const Demo5 = (but) => {
    return (
      
        alert("error "+but)
    )
  }
  class Demo6 extends React.Component{
    render()
    {
      return(
        <>
        <h1>demo6 class</h1>
        </>
      )
    }
  }
  const Demo7 =(porp)=>{
    const isdisply =(porp.isdisply);
    console.log(isdisply);
    return(
      <>
      {isdisply&&<h1>demo7 done</h1>}
      {!isdisply&&<h1>demo7 not perameter</h1>}
      </>
    )
  }
  const Coll=(prop)=>{
    const {name,repyu,insti}=prop;
    return(
      <>
      <h1>name is :{name} then repyutation :{repyu} and institute type is: {insti}</h1>
      </>
    )
  }
  
  function Lab(){
    return(
        <>
   <Demo1/>
   <Demo2 />
   <Demo3 name="Krushil" age="19" />
   <button onClick={Demo4}> but</button>
   <button onClick={() => {Demo5("good")}}> but2</button>
   <Demo6/>
   <Demo7/>
   <Demo7 isdisply="welcome"/>
   <Coll name="darshan" repyu="good" insti="university"/>
    </>
    )
  }
export {Lab};  