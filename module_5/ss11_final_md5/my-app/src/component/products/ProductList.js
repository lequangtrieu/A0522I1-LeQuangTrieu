import {Link} from "react-router-dom";
import {useEffect, useState} from "react";
import axios from "axios";

export function ProductList() {
    const [products, setProducts] = useState([]);
    const [productType, setProductType] = useState([]);

    const [nameField, setNameField] = useState("");
    const [productTypeField, setProductTypeField] = useState("");

    useEffect(() => {
        getProductList()
        getAllProductType();
    }, []);

    const getProductList = async () => {
        try {
            const result = await axios.get(`http://localhost:8080/products?name_like=${nameField}&productType.productTypeName_like=${productTypeField}&_sort=quantity&_order=desc`);
            setProducts(result.data);
            console.log(result.data)
        } catch (error) {
            console.log(error)
        }
    }

    const getAllProductType = async () => {
        try {
            const data = await axios.get("http://localhost:8080/productType");
            setProductType(data.data);
        } catch (error) {
            console.error(error);
        }
    };


    return (
        <>
            <div className="container mt-4 mb-4">
                <h1 className="text-center">Product List</h1>
                <Link to="/create" className="btn btn-primary my-2">Add new product</Link>

                <div style={{display:"flex"}}>
                    <input type="text" className="form-control col-lg-4" placeholder="Name" onChange={e => setNameField(e.target.value)}/>

                    <select className="form-control col-lg-4 mx-4"
                            value={productTypeField}
                            onChange={e => setProductTypeField(e.target.value)}
                    >
                        <option value="">Select Classroom</option>
                        {productType.map((productType) => (
                            <option key={productType.id} value={productType.productTypeName}>
                                {productType.productTypeName}
                            </option>
                        ))}
                    </select>
                    <button className="btn btn-primary" onClick={getProductList}>Search</button>
                </div>

                {products.length === 0 ?
                    <h1>KHONG TIM THAY SAN PHAM</h1>
                    :
                    <table className="table table-striped table-bordered mt-3">
                        <thead className="thead-dark">
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
                            <th>DateRelease</th>
                            <th>Quantity</th>
                            <th>ProductType</th>
                            <th>Action</th>
                        </tr>
                        </thead>
                        <tbody>
                        {
                            products.map((product) => (
                                <tr key={product.id}>
                                    <td>{product.id}</td>
                                    <td>{product.name}</td>
                                    <td>{product.dateRelease}</td>
                                    <td>{product.quantity}</td>
                                    <td>{product.productType.productTypeName}</td>
                                    <td>
                                        <Link to={`/update/${product.id}`} className="btn btn-success px-4">Edit</Link>
                                        {/*<button className="btn btn-danger" onClick={() => confirmDelete(product.id)}>Remove</button>*/}
                                    </td>
                                </tr>
                            ))
                        }
                        </tbody>
                    </table>
                }
            </div>
        </>
    )
}