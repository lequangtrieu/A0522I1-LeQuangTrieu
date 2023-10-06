import React from "react";
import {ErrorMessage, Field, Form, Formik} from "formik";
import * as Yup from 'yup';
import "bootstrap/dist/css/bootstrap.css";

export function ContactForm() {
    return (
        <>

            <Formik initialValues={{
                name: '',
                email: '',
                phone: '',
                message: ''
            }}

                    validationSchema={Yup.object({
                        name: Yup.string().required(),
                        email: Yup.string().required(),
                        phone: Yup.string().required(),
                        message: Yup.string().required(),
                    })}

                    onSubmit={(values, {setSubmitting}) => {
                        console.log(values);
                    }}


            >

                {
                    ({isSubmitting}) => (
                        <div>
                            <h1>Contact Form</h1>
                            <Form>
                                <table>
                                    <tr>
                                        <th>Name</th>
                                        <td><Field type="text" name="name"/></td>
                                        <ErrorMessage name='name' component='span' className='text-danger'/>
                                    </tr>
                                    <tr>
                                        <th>Email</th>
                                        <td><Field type="text" name="email"/></td>
                                            <ErrorMessage name='email' component='span' className='text-danger'/>
                                    </tr>
                                    <tr>
                                        <th>Phone</th>
                                        <td><Field type="text" name="phone"/></td>
                                        <ErrorMessage name='phone' component='span' className='text-danger'/>
                                    </tr>
                                    <tr>
                                        <th>Message</th>
                                        <td><Field type="textarea" name="message"/></td>
                                        <ErrorMessage name='message' component='span' className='text-danger'/>
                                    </tr>
                                    <tr>
                                        <button type="submit">Submit</button>
                                    </tr>
                                </table>
                            </Form>
                        </div>
                    )
                }

            </Formik>
        </>
    )
}