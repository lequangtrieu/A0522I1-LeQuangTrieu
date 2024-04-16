import React, {useEffect, useState} from "react";
import axios from "axios";
import "bootstrap/dist/css/bootstrap.css";
import {Link, useNavigate} from "react-router-dom";
import {useLocation} from "react-router-dom";

export function BookList() {
    // const navigate = useNavigate();

    const [books, setBooks] = useState([]);
    const [searchKeyword, setSearchKeyword] = useState(""); // State cho từ khóa tìm kiếm

    // const [currentPage, setCurrentPage] = useState(1);
    const [booksPerPage] = useState(3); // Số sách trên mỗi trang


    // phân trang theo url
    const location = useLocation();
    const searchParams = new URLSearchParams(location.search);
    const pageParam = searchParams.get("page");

    const [currentPage, setCurrentPage] = useState(pageParam ? parseInt(pageParam) : 1); // nếu có đoạn này thì kh cần đoạn currentPage trên kia

    // Xử lý khi người dùng thay đổi từ khóa tìm kiếm
    const handleSearchChange = (e) => {
        setSearchKeyword(e.target.value);
    };

    // // Lọc danh sách sách dựa trên từ khóa tìm kiếm
    // const filteredBooks = books.filter((book) =>
    //     book.title.toLowerCase().includes(searchKeyword.toLowerCase())
    // );

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
    }, []);



    const indexOfLastBook = currentPage * booksPerPage;
    const indexOfFirstBook = indexOfLastBook - booksPerPage;
    const filteredBooks = books.filter((book) =>
        book.title.toLowerCase().includes(searchKeyword.toLowerCase())
    );
    const currentBooks = filteredBooks.slice(indexOfFirstBook, indexOfLastBook);

    const paginate = (pageNumber) => {
        setCurrentPage(pageNumber);
    };



    return (
        <>

            <h1 className="text-light bg-success p-3 text-center">BOOK LIST</h1>

            <div className="container-fluid">
                <Link to="/ass2/create" className="btn btn-primary">Add new book</Link>

                <input
                    type="text"
                    placeholder="Search by title..."
                    value={searchKeyword}
                    onChange = {(e) => setSearchKeyword(e.target.value)}
                    className="form-control my-2"
                />

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

                        // books.filter((book) =>
                        //     book.title.toLowerCase().includes(searchKeyword.toLowerCase())
                        // )
                        currentBooks
                            .map((book) => (
                            <tr key={book.id}>
                                <td>{book.id}</td>
                                <td>{book.title}</td>
                                <td>{book.quantity}</td>
                                <td>
                                    <Link to={`/ass2/edit/${book.id}`} className="btn btn-success px-4">Edit</Link>
                                    <Link to={`/ass2/delete/${book.id}`} className="btn btn-danger mx-2">Remove</Link>
                                </td>
                            </tr>
                        ))
                    }
                    </tbody>
                </table>


                <Pagination
                    itemsPerPage={booksPerPage}
                    totalItems={filteredBooks.length}
                    paginate={paginate}
                    currentPage={currentPage}
                />


            </div>

        </>
    )
}

function Pagination({ itemsPerPage, totalItems, currentPage, paginate }) {
    const pageNumbers = [];

    for (let i = 1; i <= Math.ceil(totalItems / itemsPerPage); i++) {
        pageNumbers.push(i);
    }

    return (
        <nav>
            <ul className="pagination">
                {pageNumbers.map((number) => (
                    <li key={number} className={`page-item ${currentPage === number ? "active" : ""}`}>
                        <Link
                            to={`/ass2?page=${number}`}
                            className="page-link"
                            onClick={() => paginate(number)} // Gọi paginate khi nhấn vào trang
                        >
                            {number}
                        </Link>
                    </li>
                ))}
            </ul>
        </nav>
    );
}



