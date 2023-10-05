import { useEffect,useState } from "react";
let isEdit = -1;
function Curd() {

    const [Faculty, setfaculty] = useState([]);

    useEffect(() => {
        fetch("https://64e8603a99cf45b15fdf77ff.mockapi.io/faculty")
            .then((res) => {
                return res.json();
            })
            .then((res) => {
                setfaculty(res);
            })
    }, []);
    const [detail, setdetail] = useState({});
    let formetedfaculty = Faculty.map((e, i) => {
        return (
            <>
                <tr>
                <div className="card" style={{ width: "18rem" }}>
                    <img className="card-img-top" src={e.pho} alt="Card image cap" />
                    <div className="card-body">
                        <h5 className="card-title">name:{e.facultyname}</h5>
                        <p className="card-text">salary:{e.salary}</p>
                        <p className="card-text">exp:{e.exp}</p>
                        <a href="/curd" class="btn btn-primary">id:{e.id}</a>

                    </div>
                </div>
                   
                    <td>
                        <button
                            onClick={() => {
                                Faculty.splice(i, 1);
                                setfaculty([...Faculty])
                            }}>delete</button>
                    </td>
                    <td>
                        <button onClick={() => {
                            isEdit = i;
                            setdetail({
                                id:Faculty[i].id,
                                facultyname: Faculty[i].facultyname,
                                exp: Faculty[i].exp,
                                pho:Faculty[i].pho,
                                salary:Faculty[i].salary,

                            });

                        }}>edit</button>
                    </td>
                </tr>
            </>

        );

    })

    return (
        <table>
             <tr>
                <th>enter id</th>
                <td>
                    <input type="text"
                        value={detail.id}
                        onChange={
                            (e) => {
                                setdetail({ ...detail, id: e.target.value })
                            }
                        } />
                </td>
            </tr>
            <tr>
                <th>enter name </th>
                <td>
                    <input type="text"
                        value={detail.facultyname}
                        onChange={
                            (e) => {
                                setdetail({ ...detail, facultyname: e.target.value })
                            }
                        } />
                </td>
            </tr>
            <tr>
                <th>enter exp</th>
                <td>
                    <input type="text"
                        value={detail.exp}
                        onChange={
                            (e) => {
                                setdetail({ ...detail, exp: e.target.value })
                            }
                        } />
                </td>
            </tr>

            <tr>
                <th>enter salary</th>
                <td>
                    <input type="text"
                        value={detail.salary}
                        onChange={
                            (e) => {
                                setdetail({ ...detail, salary: e.target.value })
                            }
                        } />
                </td>
            </tr>

            <tr>
                <th>enter photo path</th>
                <td>
                    <input type="text"
                        value={detail.pho}
                        onChange={
                            (e) => {
                                setdetail({ ...detail, pho: e.target.value })
                            }
                        } />
                </td>
            </tr>

            <tr>
                <td>
                    <input type="button" value="submit"
                        onClick={
                            (e) => {
                                if (isEdit > -1) {
                                    Faculty[isEdit] = detail;
                                    isEdit = -1;
                                }
                                else {
                                    setfaculty([...Faculty, detail]);




                                    e.preventDefault()
                                }
                                setdetail({
                                    facultyname: "",
                                    exp: "",
                                    pho:"",
                                    salary:"",
                                    id:""
                                })
                            }}
                    />
                </td>
            </tr>
            
            <td>{formetedfaculty}</td>
        </table>
    );
}
export { Curd };
