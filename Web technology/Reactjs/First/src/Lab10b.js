const faculty=[
    {name:"jogi sir",exp:"5",sub:"3",img1 :"https://darshan.ac.in/U01/Faculty-Photo/3---28-04-2023-02-02-42.jpg"},
    {name:"bala sir",exp:"8.5",sub:"2",img1 :"https://darshan.ac.in/U01/Faculty-Photo/3---28-04-2023-02-02-42.jpg"},
    {name:"nilesh sir",exp:"9.6",sub:"3",img1 :"https://darshan.ac.in/U01/Faculty-Photo/3---28-04-2023-02-02-42.jpg"}

];
//------------------map
const facultya=faculty.map((s)=>{
    return(
        <>
        <h1>
            {s.name}
            </h1><h1>
            {s.sub}
            </h1><h1>
            {s.exp}
        </h1>
        </>
    )
})

//-----------filter
const faculty2=faculty.filter((p)=>{
    if(p.exp>8){
        return true
    }
})

const facultyb=faculty2.map((p)=>{
    return(
        <>
        <div className="card" style={{width: "18rem" }}>
        <img className="card-img-top" src={p.img1} alt="Card image cap"/>
        <div className="card-body">
          <h5 className="card-title">{p.name}</h5>
          <p className="card-text">{p.exp}</p>
          <p className="card-text">{p.sub}</p>
        </div>
      </div>
      </>
    )
})
function Fac(){
    return(
        <>
        {facultya}
        {facultyb}
        </>
    )
}



export {Fac} ;
