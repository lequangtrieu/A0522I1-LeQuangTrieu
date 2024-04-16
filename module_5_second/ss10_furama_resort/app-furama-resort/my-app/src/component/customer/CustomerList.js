import {useEffect, useState} from "react";
import * as customerService from '../../service/CustomerService'
import {Link} from "react-router-dom";
import {getCustomerById} from "../../service/CustomerService";

export function CustomerList() {
    const [customers, setCustomers] = useState([])

    const [deleteCustomerId, setDeleteCustomerId] = useState(null);
    const [showModal, setShowModal] = useState(false);

    useEffect(() => {
        getAllCustomer();
        // console.log(customers);
    }, []);

    const getAllCustomer = async () => {
        try {
            const data = await customerService.getAllCustomer();
            setCustomers(data);
        } catch (e) {
            console.log(e)
        }
    }

    const confirmDelete = (customerId) => {
        setDeleteCustomerId(customerId);
        setShowModal(true);
    }

    const deleteCustomerById = async () => {
        try {
            await customerService.deleteCustomer(deleteCustomerId);
            const data = await customerService.getAllCustomer();
            setCustomers(data);
        } catch (e) {
            console.log(e)
        }
        setShowModal(false);

    };
    return (
        <>
        <div className="container mt-4 mb-4">
            <h1 className="text-center">Customer List</h1>
            <Link to="/customers/create" className="btn btn-primary my-2">Add new customer</Link>
            <table className="table table-striped table-bordered mt-3">
                <thead className="thead-dark">
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Gender</th>
                    <th>IdCard</th>
                    <th>CustomerType</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>
                {
                    customers?.map((customer) => (
                        <tr key={customer.customerId}>
                            <td>{customer.customerId}</td>
                            <td>{customer.name}</td>
                            <td>{customer.gender ? "Male" : "Female"}</td>
                            <td>{customer.idCard}</td>
                            <td>{customer?.customerType?.customerTypeName}</td>
                            <td>
                                <Link to={`/customers/update/${customer.customerId}`} className="btn btn-success px-4">Edit</Link>
                                <Link to={`/customers/viewDetail/${customer.customerId}`} className="btn btn-primary px-4">View Detail</Link>
                                <button className="btn btn-danger" onClick={() => confirmDelete(customer.customerId)}>Remove</button>
                            </td>
                        </tr>
                    ))
                }
                </tbody>
            </table>
        </div>

            {/* Modal xác nhận xóa */}
            <div className={`modal ${showModal ? 'show' : ''}`} style={{ display: showModal ? 'block' : 'none' }} tabIndex="-1" role="dialog">
                <div className="modal-dialog" role="document">
                    <div className="modal-content">
                        <div className="modal-header">
                            <h5 className="modal-title">Confirm Delete</h5>
                            <button type="button" className="close" onClick={() => setShowModal(false)}>
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div className="modal-body">
                            <p>Are you sure you want to delete this customer?</p>
                        </div>
                        <div className="modal-footer">
                            <button type="button" className="btn btn-secondary" onClick={() => setShowModal(false)}>Cancel</button>
                            <button type="button" className="btn btn-danger" onClick={deleteCustomerById}>Delete</button>
                        </div>
                    </div>
                </div>
            </div>
        </>
    )
}