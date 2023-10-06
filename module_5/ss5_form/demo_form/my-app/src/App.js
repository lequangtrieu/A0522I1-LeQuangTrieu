
import './App.css';
import React from "react";
import {Create} from "./component/Create";
import {NavLink,Route, Routes} from "react-router-dom";
import {List} from "./component/List";

function App() {
    return (
        <>
            <NavLink to='/'>Home</NavLink>
            <NavLink to='/create' className='ms-2'>Create</NavLink>

            <Routes>
                <Route path="/" element={<List/>}></Route>
                <Route path="/create" element={<Create/>}></Route>
            </Routes>
            {/*<Create></Create>*/}
        </>
    )
}

export default App;
