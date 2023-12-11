import React, { useState, useEffect } from "react";
import axios from "axios";
import { useParams, Link } from "react-router-dom";
import {useNavigate} from "react-router-dom";

export function DeleteBook() {
    const { id } = useParams();
    const navigate = useNavigate();
    console.log(id)

    const [book, setBook] = useState(null);

    useEffect(() => {
        if (id) {
            const fetchBook = async () => {
                try {
                    const response = await axios.get(`http://localhost:8080/books/${id}`);
                    console.log(response.data)
                    setBook(response.data);
                } catch (error) {
                    console.error("Error fetching book:", error);
                }
            };
            fetchBook();
        }
    }, [id]);

    const handleDelete = async () => {
        try {
            await axios.delete(`http://localhost:8080/books/${id}`);
            navigate("/ass2");
        } catch (error) {
            console.log(error);
        }
    };

    if (!book) {
        console.log(book)
        return <div>Loading...</div>;
    }

    return (
        <div className="container-fluid">
            <h1 className="text-light bg-success p-3 text-center text-uppercase">Delete Book</h1>
            <h2>Are you sure you want to delete the book  <span className="text-danger display-3 fw-bold">"{book.title}"</span>?</h2>
            <button onClick={handleDelete} className="btn btn-danger">Delete</button>
            <Link to="/ass2" className="btn btn-success mx-2">Cancel</Link>
        </div>
    );
}