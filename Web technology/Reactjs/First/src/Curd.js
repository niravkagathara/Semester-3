import { useState } from "react";

let isEdit=-1;
const Disply=()=>{

const [Preson,setPerson]=useState(
    [{
        PersonName:"nirav1",
        Personage:281
    },
    {
        PersonName:"raj2",
        Personage:282
    },
    {
        PersonName:"meet3",
        Personage:283
    },
    {
        PersonName:"jay4",
        Personage:284
    },
    {
        PersonName:"dev5",
        Personage:285
    }
]);

const [detail,setdetail]=useState({});
let formetedperson=Preson.map((pe,i)=>{
    return (
<>
<tr>
    <td>
    {pe.PersonName}
    </td>
    <td>
        {pe.Personage}
    </td>
    <td>
        <button 
        onClick={()=>{Preson.splice(i,1);
            setPerson([...Preson])
        }}>delete</button>
    </td>
    <td>
          <button onClick={()=>{
            isEdit=i;
            setdetail({
                PersonName:Preson[i].PersonName,
                Personage:Preson[i].Personage
            });
            
        }}>edit</button> 
    </td> 
</tr>
</>
   
   );

})

return(
    <table>
                    <tr>
                        <th>enter name </th>
                        <td>
                            <input type="text"
                            value={detail.PersonName}
                            onChange={
                                (e)=>{
                                    setdetail({...detail,PersonName:e.target.value})
                                }
                            }/>
                        </td>
                    </tr>
                    <tr>
                        <th>enter age</th>
                        <td>
                        <input type="text"
                            value={detail.Personage}
                            onChange={
                                (e)=>{
                                    setdetail({...detail,Personage:e.target.value})
                                }
                            }/>
                        </td>
                    </tr>
                        <tr>
                            <td>
                                <input type="button" value="submit"
                                onClick={
                                    (e)=>{
                                        if(isEdit>-1){
                                            Preson[isEdit]=detail;
                                            isEdit=-1;
                                        }
                                        else{
                                    setPerson([...Preson,detail]);
                                    
                                   
                                      
                                    
                                    e.preventDefault()
                                }
                                setdetail({
                                    PersonName:"",
                                    Personage:""
                                })
                                }}
                                />
                            </td>
                        </tr>
                
        <td>{formetedperson}</td>
    </table>
);
}
export {Disply}