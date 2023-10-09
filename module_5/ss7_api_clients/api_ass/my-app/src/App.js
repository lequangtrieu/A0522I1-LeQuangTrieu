import logo from './logo.svg';
import './App.css';
import React from "react";
import {CreateList} from "./component/todoList/CreateList";
import {List} from "./component/todoList/List";
import {ListToDo} from "./component/todoList/List2";
import {BookList} from "./component/book_management/BookList";
import {NavLink,Route, Routes} from "react-router-dom";
import {WelcomePage} from "./component/WelcomePage";
import {CreateBook} from "./component/book_management/CreateBook";

function App() {
    return (
        <>
            <Routes>
                <Route path="/" element={<WelcomePage/>}></Route>
                <Route path="/ass1" element={<ListToDo/>}></Route>
                <Route path="/ass2" element={<BookList/>}></Route>
                <Route path="/ass2/create" element={<CreateBook/>}></Route>
                {/*<Route path="/" element={<WelcomePage/>}></Route>*/}
            </Routes>

        </>

    );
}

export default App;
