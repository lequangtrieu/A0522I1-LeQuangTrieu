import React from "react";
import {ErrorMessage, Field, Form, Formik} from "formik";
import "bootstrap/dist/css/bootstrap.css";
import * as Yup from 'yup';
import {toast, ToastContainer} from "react-toastify";
import 'react-toastify/dist/ReactToastify.css';
import {Dna} from "react-loader-spinner"
import axios from "axios";
import {useNavigate} from "react-router-dom";
import * as StudentService from "../service/StudentService"


export function Create() {
    const navigate = useNavigate();
    return (
        <>
            <Formik initialValues={{
                name: 'Hung',
                age: 22,
                gender: '1',
                languages: ['JAVA', 'C']
            }}

                    validationSchema={Yup.object({
                        name: Yup.string().required('bat buoc nhap')
                    })}

                    onSubmit={
                        (values, {setSubmitting}) => {

                            const create = async () => {
                                setSubmitting(false);
                                await StudentService.save(values);
                                toast(`Student ${values.name} create okela`);
                                navigate("/");
                            }
                            create();
                        }
                    }
            >
                {
                    ({isSubmitting}) => (
                        <div>
                            <h1>Create Student</h1>
                            <Form>
                                <table className="table">
                                    <tr>
                                        <th>Name:</th>
                                        <td><Field type="text" name='name'/></td>
                                        <ErrorMessage name='name' component='span' className='text-danger'/>
                                    </tr>
                                    <tr>
                                        <th>Age:</th>
                                        <td><Field type="text" name='age'/></td>
                                    </tr>
                                    <tr>
                                        <th>Gender:</th>
                                        <td>
                                            <Field type="radio" value="1" name='gender'/> <label
                                            htmlFor="">Male </label>
                                            <Field type="radio" value="0" name='gender'/> <label
                                            htmlFor="">Female </label>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colSpan={2}>
                                            <div>
                                                <Field type="checkbox" value="JAVA" name='languages'/> JAVA
                                            </div>
                                            <div>
                                                <Field type="checkbox" value="C" name='languages'/> C
                                            </div>
                                            <div>
                                                <Field type="checkbox" value="PHP" name='languages'/> PHP
                                            </div>
                                        </td>
                                    </tr>
                                    <tr>
                                        {
                                            isSubmitting ? <Dna
                                                    visible={true}
                                                    height="80"
                                                    width="80"
                                                    ariaLabel="dna-loading"
                                                    wrapperStyle={{}}
                                                    wrapperClass="dna-wrapper"
                                                />
                                                :
                                                <button type='submit'>Submit</button>
                                        }
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