import './App.css';
import {ListStudent} from "./component/ListStudent";
import React from "react";
import {ToDoApp} from "./component/ToDoApp";

function App() {
    return (
        <>
          <ListStudent></ListStudent>
            <br/>
            <ToDoApp></ToDoApp>
        </>
    );
}

export default App;
