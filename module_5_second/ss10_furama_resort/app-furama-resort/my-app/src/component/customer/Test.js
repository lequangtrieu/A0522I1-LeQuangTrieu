import {useNavigate} from "react-router-dom";
import axios from "axios";
import {toast} from "react-toastify";
import {Field, Form, Formik} from "formik";
import {useEffect, useState} from "react";

export function CustomerCreate(){
    const navigate = useNavigate();
    const [typeCustomers,setTypeCustomers] = useState();
    const [customer,setCustomer] = useState({
        name: "",
        birthDay: "",
        gender: 0,
        CMND: "",
        numberPhone: "",
        email: "",
        typeCustomer: {
            id: 0,
            name: ""
        }
    })
    useEffect(() => {
        getAllTypeCustomer();
    }, []);
    const handleCreate = async (values) => {
        values.gender = +values.gender;
        try {
            await axios.post("http://localhost:8080/customer",values);
            toast("thêm mới thành công",{
                position: "top-center",
                autoClose: 2000
            })
            navigate("/customer/list");
        }catch (e){
            console.log(e);
        }
    }
    const getAllTypeCustomer = async () => {
        try {
            let temp = await axios.get("http://localhost:8080/typeCustomer")
            console.log(temp.data)
            setTypeCustomers(temp.data)
        }catch (e){
            console.log(e);
        }
    }

    if (!typeCustomers) return null;

    return (
        <>
            <h1>Create Customer</h1>
            <Formik initialValues={
                {...customer, typeCustomer: JSON.stringify(typeCustomers[0])}
            }

                    onSubmit={
                (values,{setSubmitting}) => {
                setSubmitting(false);
                const obj = {
                    ...values, typeCustomer: JSON.parse(values.typeCustomer)
                }
                console.log("value")
                console.log(obj)
                handleCreate(obj);
            }}>
                {
                    ({isSubmitting}) => (
                        <Form>
                            <div className="mb-3">
                                <label className="form-label">name</label>
                                <Field type="text"  className="form-control" name="name"/>
                            </div>
                            <div className="mb-3">
                                <label className="form-label">birthDay</label>
                                <Field type="date"  className="form-control" name="birthDay"/>
                            </div>
                            <div className='mb-3'>
                                <div className="form-check form-check-inline">
                                    <Field className="form-check-input" type="radio" name="gender" id="inlineRadio1"
                                           value="1"/>
                                    <label className="form-check-label" htmlFor="inlineRadio1">Male</label>
                                </div>
                                <div className="form-check form-check-inline">
                                    <Field className="form-check-input" type="radio" name="gender" id="inlineRadio2"
                                           value="0"/>
                                    <label className="form-check-label" htmlFor="inlineRadio2">FeMale</label>
                                </div>
                            </div>
                            <div className="mb-3">
                                <label className="form-label">CMND</label>
                                <Field type="text"  className="form-control" name="CMND"/>
                            </div>
                            <div className="mb-3">
                                <label className="form-label">numberPhone</label>
                                <Field type="text"  className="form-control" name="numberPhone"/>
                            </div>
                            <div className="mb-3">
                                <label className="form-label">email</label>
                                <Field type="text"  className="form-control" name="email"/>
                            </div>
                            <div className="mb-3">
                                <label className="form-label">typeCustomer</label>
                                <Field as="select" name="typeCustomer" className="form-select">
                                    {typeCustomers.map((type) => (
                                        <option key={type.id} value={JSON.stringify(type)}>
                                            {type.name}
                                        </option>
                                    ))}
                                </Field>
                            </div>
                            {
                                isSubmitting ? <></> : <button type="submit" className="btn btn-primary" >Create</button>
                            }
                        </Form>
                    )
                }
            </Formik>
        </>
    )
}