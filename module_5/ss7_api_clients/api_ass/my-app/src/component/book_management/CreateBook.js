import React from "react";
import {Field, Form, Formik} from "formik";
import axios from "axios";
import {Link, useNavigate} from "react-router-dom";
import "bootstrap/dist/css/bootstrap.css";

export function CreateBook() {
    const navigate = useNavigate();
    return (
        <>
            <Formik initialValues={
                {
                    id: "",
                    title: "",
                    quantity: ""
                }
            }
                    onSubmit={(values => {
                        const save = async (book) => {
                            try {
                                const result = await axios.post(('http://localhost:8080/books'), book);
                                console.log(result.data);
                                navigate("/ass2")
                                // return result.data;
                            } catch (e) {
                                console.log(e);
                            }
                        }
                        save(values);
                    })}
            >

                <div className="container-fluid">
                    <Form>
                        <h1 className="text-light bg-success p-3 text-center text-uppercase">Create Book</h1>
                        <Link to="/ass2" className="btn btn-primary">Back to list</Link>

                        <table className="table">
                            <tbody>
                            <tr>
                                <th>Id</th>
                                <td><Field type="text" name='id'></Field></td>
                            </tr>
                            <tr>
                                <th>Title</th>
                                <td><Field type="text" name='title'></Field></td>
                            </tr>
                            <tr>
                                <th>Quantity</th>
                                <td><Field type="text" name='quantity'></Field></td>
                            </tr>
                            <tr>
                                <td><input type="reset" className="btn btn-success"/></td>
                                <td><input type="submit" className="btn btn-primary"/></td>
                            </tr>
                            </tbody>
                        </table>
                    </Form>
                </div>

            </Formik>
        </>
    )


}