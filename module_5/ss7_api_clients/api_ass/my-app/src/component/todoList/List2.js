import {useEffect, useState} from "react";
import axios from "axios";
import {Field, Form, Formik} from "formik";
import "bootstrap/dist/css/bootstrap.css";

export function ListToDo() {
    const [listWork, setListWork] = useState([])
    useEffect(() => {
        const fetchApi = async () => {
            try {
                const result = await axios.get('http://localhost:8080/taskList')
                setListWork(result.data)
            } catch (e) {
                console.log(2)
            }

        }

        fetchApi();
    }, [listWork]);
    return (
        <>
            <Formik initialValues={{
                id:"",
                work: ""
            }}

                    onSubmit={(values => {
                            const save = async (work) => {
                                try {
                                    const result = await axios.post(('http://localhost:8080/taskList'), work)
                                    return result.data
                                } catch (e) {
                                    console.log(e)
                                }
                            }
                            save(values)
                        }


                    )}>
                <div className="container">


                    <Form>
                        <h1>To Do List</h1>
                        <Field type="text" name='id'></Field>
                        <Field type="text" name='work'></Field>
                        <button type="submit">add</button>

                        <table className="table">
                            <thead>
                            <tr>
                                <th>#</th>
                                <th>Work</th>
                            </tr>
                            </thead>

                            <tbody>
                            {
                                listWork.map((work) => (
                                    <tr key={work.id}>
                                        <td>{work.id}</td>
                                        <td>{work.work}</td>
                                    </tr>
                                ))
                            }
                            </tbody>
                        </table>

                    </Form>


                </div>
            </Formik>

        </>

    )
}