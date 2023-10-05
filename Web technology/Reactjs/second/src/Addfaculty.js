import { useState } from "react";
import { useEffect } from "react";
import { useParams,  useNavigate } from "react-router-dom";

const AddFaculty=()=>{
    const parms = useParams();
  const initialState = {
    facultyname: "",
    pho: "",
    salary: "",
    exp: ""
  };
  const [fac, setFac] = useState({});
  const nav = useNavigate();
  useEffect(() => {
    if (parms.id != null) {
      fetch("https://64e8603a99cf45b15fdf77ff.mockapi.io/faculty/" + parms.id)
        .then((res) => {
          return res.json();
        })
        .then((res) => {
          setFac(res);
         
        });
    } else {
      setFac(initialState);
    }
  }, [parms]);
  return (
    <>
      <table>
        <tr>
          <td>Enter Name : </td>
          <td>
            <input
              value={fac.facultyname}
              placeholder="enter name"
              onChange={(e) => {
                setFac({ ...fac, facultyname: e.target.value });
              }}
            />
          </td>
        </tr>
        <tr>
          <td>Enter exp : </td>
          <td>
            <input
              value={fac.exp}
              placeholder="enter exp"
              onChange={(e) => {
                setFac({ ...fac, exp: e.target.value });
              }}
            />
          </td>
        </tr>
        <tr>
          <td>Enter salary : </td>
          <td>
            <input
              value={fac.salary}
              placeholder="enter salary"
              onChange={(e) => {
                setFac({ ...fac, salary: e.target.value });
              }}
            />
          </td>
        </tr>
        <tr>
          <td>Enter photo path : </td>
          <td>
            <input
              value={fac.pho}
              placeholder="enter path"
              onChange={(e) => {
                setFac({ ...fac, pho: e.target.value });
              }}
            />
          </td>
        </tr>
        <button
          onClick={() => {
            if (parms.id != null) {
              fetch(
                "https://64e8603a99cf45b15fdf77ff.mockapi.io/faculty/" + parms.id,
                {
                  method: "PUT",
                  body: JSON.stringify(fac),
                  headers: {
                    "Content-Type": "application/json"
                  }
                }
              ).then(() => {
                return nav("/Faculty");
              });
            } else {
              fetch("https://64e8603a99cf45b15fdf77ff.mockapi.io/faculty/", {
                method: "POST",
                body: JSON.stringify(fac),
                headers: {
                  "Content-Type": "application/json"
                }
              }).then(() => {
                return nav("/Faculty");
              });
            }
          }}
        >
          add
        </button>
      </table>
    </>
  );
}
export {AddFaculty}