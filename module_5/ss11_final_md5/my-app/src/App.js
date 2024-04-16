import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap/dist/js/bootstrap'
import 'bootstrap/dist/js/bootstrap.bundle'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/css/bootstrap-grid.css'
import 'bootstrap/dist/css/bootstrap-grid.rtl.css'

import './App.css';
import Header from "./component/header/Header";
import Footer from "./component/footer/Footer";
import {Route, Routes} from "react-router-dom";
import {ProductList} from "./component/products/ProductList";
import {UpdateProduct} from "./component/products/UpdateProduct";
import {ToastContainer} from "react-toastify";
import React from "react";
import 'react-toastify/dist/ReactToastify.css';

function App() {
  return (
    <>
        <Header/>
        {/*<h1>hello</h1>*/}
        <Routes>
            <Route path="/" element={<ProductList/>}></Route>
            <Route path="/create" element={<UpdateProduct/>}></Route>
            <Route path="/update/:id" element={<UpdateProduct/>}></Route>
        </Routes>
        <Footer/>
        <ToastContainer/>

    </>
  );
}

export default App;
