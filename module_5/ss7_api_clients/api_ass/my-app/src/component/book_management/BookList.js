import React, {useEffect, useState} from "react";
import axios from "axios";
import "bootstrap/dist/css/bootstrap.css";
import {Link, useNavigate} from "react-router-dom";

export function BookList() {
    // const navigate = useNavigate();

    const [books, setBooks] = useState([]);
    useEffect(() => {
        const fetchApi = async () => {
            try {
                const result = await axios.get('http://localhost:8080/books');
                setBooks(result.data);
            } catch (e) {
                console.log(e)
            }
        }
        fetchApi();
    }, [books])
    return (
        <>
            <h1 className="text-light bg-success p-3 text-center">BOOK LIST</h1>

            <div className="container-fluid">
                <Link to="/ass2/create" className="btn btn-primary">Add new book</Link>
                <table className="table">
                    <thead>
                    <tr>
                        <th>Id</th>
                        <th>Title</th>
                        <th>Quantity</th>
                        <th>Action</th>
                    </tr>
                    </thead>

                    <tbody>
                    {
                        books.map((book) => (
                            <tr key={book.id}>
                                <td>{book.id}</td>
                                <td>{book.title}</td>
                                <td>{book.quantity}</td>
                                <td>
                                    <Link to={`/ass2/edit/${book.id}`} className="btn btn-success px-4">Edit</Link>
                                    <input type="button" value="Remove" className="btn btn-danger mx-2"/>

                                </td>
                            </tr>
                        ))
                    }
                    </tbody>
                </table>
            </div>

        </>
    )
}