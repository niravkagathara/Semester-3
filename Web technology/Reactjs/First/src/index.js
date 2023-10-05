import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import { Fac } from './Lab10b';
import reportWebVitals from './reportWebVitals';
import { Produ } from './Lab10c';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import { Layout } from './Layout';
import { Home } from './Home';
import { About } from './About';
import { Main } from './Main';
import { Data } from './Data';
import { Data1 } from './Data1';
import { State } from './lab-12_1';
import { Cal } from './Calculator';
import { Disply } from './Curd';
import { Pro1 } from './Lab10';
import { Lab } from './L8-9';
const root = ReactDOM.createRoot(document.getElementById('root'));

root.render(
<>
<h1>lab-11</h1> 

<BrowserRouter>
<Routes>
 <Route path="/" element={<Layout/>}>
   <Route path="/" element={<Home/>} ></Route>
   <Route path="/About" element={<About/>} ></Route>
   <Route path="/Main" element={<Main/>}></Route>
   <Route path="/Data" element={<Data/>}>
     <Route path="/Data/Data1" element={<Data1/>}></Route>
     </Route>
     <Route path="/L8-9" element={<Lab/>}></Route>
  <Route path="/lab10a" element={<Pro1/>}></Route>
  <Route path="/lab10b" element={<Fac/>}></Route>
  <Route path="/lab10c" element={<Produ/>}></Route>
  <Route path="/lab12a" element={<State/>}></Route>
  <Route path="/lab12b" element={<Cal/>}></Route>
  <Route path="/lab12d" element={<Disply/>}></Route>
  
 </Route>
</Routes>
 </BrowserRouter>
 {/* <Calculator/> */}
</>

);
// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();