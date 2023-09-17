import {Header} from "./components/Header"
import './App.css';
import React from "react";
import {Student} from "./components/Student";
import {Count} from "./components/Count";

function App() {
    return (
        <>
            <Header studentName="React"></Header>
            <Header>ABC</Header>
            <Count></Count> <br/> <br/>
            <Student></Student>
        </>
    );
}

export default App;
