const product=[
    {name:"bag",price:"800",rate:"3",img1 :"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRh-AU4PKwqtGqvFPmjqZTa3xxUo2jRJ1RAag&usqp=CAU"},
    {name:"bottle",price:"220",rate:"2",img1 :"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRh-AU4PKwqtGqvFPmjqZTa3xxUo2jRJ1RAag&usqp=CAU"},
    {name:"pen",price:"120",rate:"3",img1 :"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRh-AU4PKwqtGqvFPmjqZTa3xxUo2jRJ1RAag&usqp=CAU"}

];
//------------------map
const product1=product.map((s)=>{
    return(
        <>
        <h1>
            {s.name}
            </h1><h1>
            {s.price}
            </h1><h1>
            {s.rate}
        </h1>
        </>
    )
})

//-----------filter
const pro2=product.filter((p)=>{
    if(p.price>200){
        return true
    }
})

const product2=pro2.map((p)=>{
    return(
        <>
        <div className="card" style={{width: "18rem" }}>
        <img className="card-img-top" src={p.img1} alt="Card image cap"/>
        <div className="card-body">
          <h5 className="card-title">{p.name}</h5>
          <p className="card-text">{p.price}</p>
          <p className="card-text">{p.rate}</p>
        </div>
      </div>
      </>
    )
})

function Produ(){
    return(
        <>
       {product1}
       {product2}
        </>
    )
}



export {Produ} ;
