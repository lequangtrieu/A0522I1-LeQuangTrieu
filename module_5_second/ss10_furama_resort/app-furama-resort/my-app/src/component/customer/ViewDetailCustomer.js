import React, {useEffect, useState} from 'react';
import { Container, Row, Col } from 'react-bootstrap';
import {Link, useParams} from "react-router-dom";
import * as customerService from "../../service/CustomerService"
export function ViewDetailCustomer() {
    const [customer, setCustomer] = useState([]);
    const { id } = useParams();

    const getCustomerById = async () => {
        const customer = await customerService.getCustomerById(id);
        setCustomer(customer);
        console.log(customer);
    }

    useEffect(() => {
        getCustomerById();
    }, []);
    return (
        <>
            <div className="container mt-4 mb-4">
                <h1 className="text-center">View Detail {customer.name}</h1>
                <table className="table table-striped table-bordered mt-3">
                    <tbody>
                    <tr>
                        <th>Id:</th>
                        <td>{customer.customerId}</td>
                    </tr>
                    <tr>
                        <th>Name:</th>
                        <td>{customer.name}</td>
                    </tr>
                    <tr>
                        <th>Gender:</th>
                        <td>{customer.gender ? "Male" : "Female"}</td>
                    </tr>
                    <tr>
                        <th>Birthday:</th>
                        <td>{customer.birthday}</td>
                    </tr>
                    <tr>
                        <th>IdCard:</th>
                        <td>{customer.idCard}</td>
                    </tr>
                    <tr>
                        <th>Phone:</th>
                        <td>{customer.phone}</td>
                    </tr>
                    <tr>
                        <th>Email:</th>
                        <td>{customer.email}</td>
                    </tr>
                    <tr>
                        <th>Address:</th>
                        <td>{customer.address}</td>
                    </tr>
                    <tr>
                        <th>CustomerType:</th>
                        <td>{customer.customerType?.customerTypeName}</td>
                    </tr>
                    </tbody>
                </table>

                <div className="text-center m-2">
                    <Link to="/customers" className="btn btn-secondary">Back to Customer List</Link>
                </div>
            </div>
        </>
    )
}