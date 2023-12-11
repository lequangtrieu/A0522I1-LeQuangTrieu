import {ErrorMessage, Field, Form, Formik} from "formik";
import axios from "axios";
import * as Yup from 'yup';
import React from "react";
import {date, number, string} from "yup";

export function CreateProduct() {
    return (
        <>
            <Formik initialValues={
                {
                    id: "id",
                    name: "name",
                    price: "price",
                    category: "category",
                    dateRelease: "dateRelease"
                }
            }

                    validationSchema={
                        Yup.object(
                            {
                                id: Yup.string().required().matches("^P[0-9]{3}$"),
                                name: Yup.string().required(),
                                price: number().required().min(10),
                                category: string().required(),
                                dateRelease: date().required().max(new Date(), 'Date must be in the pass or today')
                                    // .min(new Date(), 'Date must be in the future')
                                    // .max(new Date('2030-12-31'), 'Date must be before 2031-01-01')
                            }
                        )
                    }
                    onSubmit={
                        values => {
                            const save = async (product) => {
                                try {
                                    const result = await axios.post(('http://localhost:8080/products'), product);
                                    console.log(result.data);
                                } catch (e) {
                                    console.log(e);
                                }
                            }
                            save(values);
                        }
                    }>
                <div>
                    <h1 className="text-light bg-success p-3 text-center text-uppercase">Create Book</h1>
                <Form className="container-fluid">

                    <table className="table">
                        <tbody>
                        <tr className="form-group">
                            <th>Id:</th>
                            <td>
                                <Field type="text" name="id" className="form-control"></Field>
                                <ErrorMessage name='id' component='span' className='text-danger'/>
                            </td>
                        </tr>
                        <tr>
                            <th>Name:</th>
                            <td>
                                <Field type="text" name="name" className="form-control"></Field>
                                <ErrorMessage name='name' component='span' className='text-danger'/>
                            </td>
                        </tr>
                        <tr>
                            <th>Price:</th>
                            <td>
                                <Field type="text" name="price" className="form-control"></Field>
                                <ErrorMessage name='price' component='span' className='text-danger'/>
                            </td>
                        </tr>
                        <tr>
                            <th>DateRelease:</th>
                            <td>
                                <Field type="text" name="dateRelease" className="form-control"></Field>
                                <ErrorMessage name='dateRelease' component='span' className='text-danger'/>
                            </td>
                        </tr>
                        <tr>
                            <th>Category:</th>
                            <td>
                                <Field type="text" name="category" className="form-control"></Field>
                                <ErrorMessage name='category' component='span' className='text-danger'/>
                            </td>
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