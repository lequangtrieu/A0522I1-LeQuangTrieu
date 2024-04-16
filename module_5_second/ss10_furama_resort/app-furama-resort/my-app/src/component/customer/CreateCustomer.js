import {Link, useNavigate, useParams} from "react-router-dom";
import {useEffect, useState} from "react";
import {ErrorMessage, Field, Form, Formik} from "formik";
import * as customerTypeService from "../../service/CustomerTypeService"
import * as customerService from "../../service/CustomerService"

const init = {
    name: "",
    gender: "",
    birthday: "",
    idCard: "",
    phone: "",
    email: "",
    address: "",
    customerType: ""
}
export function CreateCustomer() {
    const [customerType, setCustomerType] = useState([]);
    const [initialValues, setInitialValues] = useState(init);
    const navigate = useNavigate();
    const { id } = useParams();

    useEffect(() => {
        getAllCustomerType();
        if (id) {
            getCustomerById();
        }
    }, [id]);

    const getCustomerById = async () => {
        try {
            const customerUpdate =  await customerService.getCustomerById(id);
            customerUpdate.gender = customerUpdate.gender + "";
            customerUpdate.customerType = JSON.stringify(customerUpdate.customerType);
            setInitialValues(customerUpdate);
            console.log(customerUpdate)
        } catch (e) {
            console.log(e)
        }
    }

    const getAllCustomerType = async () => {
        try {
            const data = await customerTypeService.getAllCustomerType();
            setCustomerType(data);
        } catch (e) {
            console.log(e)
        }
    }

    const createCustomer = async (customer) => {
        console.log(customer)
        // customer.gender = +customer.gender
        customer.customerType = JSON.parse(customer.customerType);
        try {
            await customerService.createCustomer(customer);
            navigate("/customers")
        } catch (e) {
            console.log(e)
        }
    }

    const updateCustomerById = async (customer) => {
        // customer.gender = +customer.gender
        customer.customerType = JSON.parse(customer.customerType);
        console.log(customer)
        try {
            await  customerService.updateStudentById(customer, id)
            navigate("/customers")
        } catch (e) {
            console.log(e)
        }
    }

    if (!initialValues.name && id) return null

    return (
        <>
        <Formik
            initialValues={initialValues}
            onSubmit={values => {
                {id == null ? createCustomer(values) : updateCustomerById(values)}
            }}>
            {
                <div className="container mt-5 border border-dark border-3 rounded p-4 mb-3">
                    <Form>
                        <h1 className={"text-center"}>{id == null ? "Create Customer" : "Update Customer"}</h1>
                        <div className='mb-3'>
                            <label htmlFor='name' className='form-label fw-bold'>Name</label>
                            <Field type='text' className='form-control' id='name' name="name"/>
                            <ErrorMessage name="name" component="span" style={{color: "red"}}></ErrorMessage>
                        </div>

                        <div className='mb-3'>
                            <div className="form-check form-check-inline">
                                <Field className="form-check-input" type="radio" name="gender" id="inlineRadio1"
                                       value="true"/>
                                <label className="form-check-label" htmlFor="inlineRadio1">Male</label>
                            </div>
                            <div className="form-check form-check-inline">
                                <Field className="form-check-input" type="radio" name="gender" id="inlineRadio2"
                                       value="false"/>
                                <label className="form-check-label" htmlFor="inlineRadio2">FeMale</label>
                            </div>
                        </div>

                        <div className='mb-3'>
                            <label htmlFor='birthday' className='form-label fw-bold'>Birthday</label>
                            <Field type='date' className='form-control' id='birthday' name="birthday"/>
                            <ErrorMessage name="birthday" component="span" style={{color: "red"}}></ErrorMessage>
                        </div>

                        <div className='mb-3'>
                            <label htmlFor='idCard' className='form-label fw-bold'>IdCard</label>
                            <Field type='text' className='form-control' id='idCard' name="idCard"/>
                            <ErrorMessage name="idCard" component="span" style={{color: "red"}}></ErrorMessage>
                        </div>

                        <div className='mb-3'>
                            <label htmlFor='phone' className='form-label fw-bold'>Phone</label>
                            <Field type='text' className='form-control' id='phone' name="phone"/>
                            <ErrorMessage name="phone" component="span" style={{color: "red"}}></ErrorMessage>
                        </div>

                        <div className='mb-3'>
                            <label htmlFor='email' className='form-label fw-bold'>Email</label>
                            <Field type='text' className='form-control' id='email' name="email"/>
                            <ErrorMessage name="email" component="span" style={{color: "red"}}></ErrorMessage>
                        </div>

                        <div className='mb-3'>
                            <label htmlFor='address' className='form-label fw-bold'>Address</label>
                            <Field type='text' className='form-control' id='address' name="address"/>
                            <ErrorMessage name="address" component="span" style={{color: "red"}}></ErrorMessage>
                        </div>

                        <div className='mb-3'>
                            <label htmlFor='customerType' className='form-label fw-bold'>
                                Customer Type
                            </label>
                            <Field
                                className='form-select'
                                id='customerType'
                                name='customerType'
                                as="select"
                            >
                                <option value="" disabled>Select Customer Type</option>
                                {customerType.map((customerType) => (
                                    <option key={customerType.customerTypeId} value={JSON.stringify(customerType)}>
                                        {customerType.customerTypeName}
                                    </option>
                                ))}
                            </Field>
                        </div>

                        <div className="text-center m-2">
                            <button type="submit" className="btn btn-primary ">Submit</button>
                            <button type="reset" className="btn btn-success mx-1">Reset</button>
                            <Link to="/customers" className="btn btn-secondary">Back to Customer List</Link>
                        </div>
                    </Form>
                </div>
            }
        </Formik>
        </>
    )
}