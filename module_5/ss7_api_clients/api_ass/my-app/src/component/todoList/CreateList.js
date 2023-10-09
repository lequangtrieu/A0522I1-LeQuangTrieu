import React from "react";
import {ErrorMessage, Field, Form, Formik} from "formik";
import axios from "axios";

export function CreateList() {

    return (
        <>
            <Formik
                initialValues={{
                    name: 'todo list'
                }}
                onSubmit={
                    (values, {setSubmitting}) => {
                        const create = async () => {
                            await save(values);
                        }
                        create();
                        console.log(values)
                    }
                }
            >

                {
                    ({isSubmitting}) => (
                        <>
                            <h1>To_do List</h1>

                            <Form>
                                <Field type="text" name="name"/>
                                <button type="submit">Submit</button>
                            </Form>
                        </>
                    )
                }

            </Formik>
        </>

    )
}

export const save = async (task) => {
    try {
        const result = await axios.post('http://localhost:8080/taskList', task);
        return result.data;
    } catch (e) {
        console.log(e);
    }
}