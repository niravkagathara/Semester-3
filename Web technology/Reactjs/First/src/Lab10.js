import n1 from './n1.jpg'
const student=[
    {name:"nirav",spi:"8.1",sem:"3",img1 :n1},
    {name:"meet",spi:"5",sem:"2",img1 :n1},
    {name:"jay",spi:"9.6",sem:"3",img1 :n1}

];

//------------------map
const sut1=student.map((s)=>{
    return(
        <>
        <h1>
            {s.name}
            </h1><h1>
            {s.spi}
            </h1><h1>
            {s.sem}
        </h1>
        </>
    )
})

//-----------filter
const student2=student.filter((p)=>{
    if(p.spi>8){
        return true
    }
})

const stu2=student2.map((p)=>{
    return(
        <>
        <div className="card" style={{width: "18rem" }}>
        <img className="card-img-top" src={p.img1} alt="Card image cap"/>
        <div className="card-body">
          <h5 className="card-title">{p.name}</h5>
          <p className="card-text">{p.spi}</p>
          <p className="card-text">{p.sem}</p>
        </div>
      </div>
      </>
    )
})
function Pro1(){
    return(<>
        {stu2}
        <h1>hello</h1>
        {sut1}
    </>
    )
    }


export {Pro1} ;
