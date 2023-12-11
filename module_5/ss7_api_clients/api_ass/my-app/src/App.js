
import './App.css';
import React from "react";
import {ListToDo} from "./component/todoList/List2";
import {BookList} from "./component/book_management/BookList";
import {NavLink,Route, Routes} from "react-router-dom";
import {WelcomePage} from "./component/WelcomePage";
import {CreateBook} from "./component/book_management/CreateBook";
import {EditBook} from "./component/book_management/EditBook";
import {DeleteBook} from "./component/book_management/DeleteBook";

function App() {
    return (
        <>
            <Routes>
                <Route path="/" element={<WelcomePage/>}></Route>
                <Route path="/ass1" element={<ListToDo/>}></Route>
                <Route path="/ass2" element={<BookList/>}></Route>
                <Route path="/ass2/create" element={<CreateBook/>}></Route>
                <Route path="/ass2/edit/:id" element={<EditBook/>}></Route>
                <Route path="/ass2/delete/:id" element={<DeleteBook/>}></Route>
            </Routes>

        </>

    );
}

export default App;
