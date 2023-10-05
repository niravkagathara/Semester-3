import React from 'react';
import ReactDOM from 'react-dom/client';
import { About } from './About';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import reportWebVitals from './reportWebVitals';
import { Layout } from './Layout';
import { Main } from './Main';
import { Home } from './Home';
import { Faculty1 } from './Faculty';
import { Curd } from './curdapi';
import { Facdetails } from './Facdetails';
import { AddFaculty } from './Addfaculty';
import { Counter } from './Counter';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<>
 
 
  <BrowserRouter>
    <Routes>
      <Route path="/" element={<Layout />}>
        <Route path="/" element={<Home />} ></Route>
        <Route path="/About" element={<About />} ></Route>
        <Route path="/Main" element={<Main />}></Route>
        <Route path="/Faculty" element={<Faculty1 />}></Route>
        <Route path="/Addfaculty" element={<AddFaculty />}></Route>
        <Route path="/editfaculty/:id" element={<AddFaculty />}></Route>
        <Route path="/curd" element={<Curd/>}></Route>
        <Route path="/Facdetails/:id" element={<Facdetails/>}></Route>
        <Route path="/Counter" element={<Counter/>}></Route>
         
      
      </Route>
    </Routes>
  </BrowserRouter>
</>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
 