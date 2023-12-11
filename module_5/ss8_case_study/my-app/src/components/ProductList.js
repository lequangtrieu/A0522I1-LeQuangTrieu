import "bootstrap/dist/css/bootstrap.css";
import {useEffect, useState} from "react";
import axios from "axios";
export function ProductList() {

    const [products, setProducts] = useState([]);

    useEffect(() => {
        const fetchApi = async () => {
            try {
                const result = await axios.get("http://localhost:8080/products")
                setProducts(result.data);
            } catch (e) {
                console.log(e);
            }
        }
        fetchApi();
    }, [products]);
    return (
            <>

                <div className="container-fluid">
                    <h1 className="text-light bg-success p-3 text-center">PRODUCT LIST</h1>
                    <table className="table">
                        <thead>
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
                            <th>Price</th>
                            <th>DateRelease</th>
                            <th>Category</th>
                            <th>Action</th>
                        </tr>
                        </thead>

                        <tbody>
                        {
                            products.map((product) => (
                                <tr key={product.id}>
                                    <td>{product.id}</td>
                                    <td>{product.name}</td>
                                    <td>{product.price}</td>
                                    <td>{product.dateRelease}</td>
                                    <td>{product.category}</td>
                                    <td>Action</td>
                                </tr>
                            ))
                        }
                        </tbody>
                    </table>
                </div>
            </>
    )
}