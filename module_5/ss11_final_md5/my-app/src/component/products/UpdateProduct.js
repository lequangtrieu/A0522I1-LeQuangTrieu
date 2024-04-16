import {ErrorMessage, Field, Form, Formik} from "formik";
import * as Yup from "yup";
import {useEffect, useState} from "react";
import {Link, useNavigate, useParams} from "react-router-dom";
import axios from "axios";
import {toast} from "react-toastify";

const init = {
    name: "",
    dateRelease: "",
    quantity: "",
    productType: ""
}
export function UpdateProduct() {
    const [initialValues, setInitialValues] = useState(init);
    const [productType, setProductType] = useState([]);
    const navigate = useNavigate();
    const { id } = useParams();

    const validateSchema = {
        name: Yup.string().required("Name is not empty")
            .max(100, "name not too long <100 char"),

        dateRelease: Yup.string().required("dateRelease is not empty")
        .matches(/^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{4}$/, "please follow format DD/MM/YYYY"),

        quantity: Yup.number().required("quantity is not empty")
            .min(1, "quantity must > 0").integer("must integer")
    }


    useEffect(() => {
        getAllProductType();
        getProductById();
    }, []);

    const getAllProductType = async () => {
        try {
            const data = await axios.get("http://localhost:8080/productType");
            setProductType(data.data);
        } catch (error) {
            console.error(error);
        }
    };

    const getProductById = async () => {
        try {
            const getProductById = await axios.get(`http://localhost:8080/products/${id}`);
            getProductById.data.productType = JSON.stringify(getProductById.data.productType);
            setInitialValues(getProductById.data);
            console.log(getProductById.data)
        } catch (e) {
            console.log(e)
        }
    }

    const updateProductById = async (product) => {
        product.productType = JSON.parse(product.productType);
        try {
            await axios.put(`http://localhost:8080/products/${id}`, product)
            toast("Update successfully");
            console.log("Update successfully")
            navigate("/");
        } catch (e) {
            console.log(e)
        }
    }

    if (!initialValues.name) return null

    return (
        <>
            <Formik initialValues={initialValues}
                    onSubmit={values => {
                        console.log(values)
                        updateProductById(values)
                    }}
                    validationSchema={Yup.object(validateSchema)}
            >
                {
                    <div className="container mt-5 border border-dark border-3 rounded p-4 mb-3">
                        <Form>
                            <h1 className={"text-center"}>Update Product</h1>
                            <div className='mb-3'>
                                <label htmlFor='name' className='form-label fw-bold'>Name</label>
                                <Field type='text' className='form-control' id='name' name="name"/>
                                <ErrorMessage name="name" component="span" style={{color: "red"}}></ErrorMessage>
                            </div>

                            <div className='mb-3'>
                                <label htmlFor='dateRelease' className='form-label fw-bold'>DateRelease</label>
                                <Field type='text' className='form-control' id='dateRelease' name="dateRelease"/>
                                <ErrorMessage name="dateRelease" component="span" style={{color: "red"}}></ErrorMessage>
                            </div>

                            <div className='mb-3'>
                                <label htmlFor='quantity' className='form-label fw-bold'>Quantity</label>
                                <Field type='text' className='form-control' id='quantity' name="quantity"/>
                                <ErrorMessage name="quantity" component="span" style={{color: "red"}}></ErrorMessage>
                            </div>


                            <div className='mb-3'>
                                <label htmlFor='productType' className='form-label fw-bold'>
                                    Product Type
                                </label>
                                <Field
                                    className='form-select'
                                    id='productType'
                                    name='productType'
                                    as="select"
                                >
                                    <option value="" disabled>Select Product Type</option>
                                    {productType.map((productType) => (
                                        <option key={productType.productTypeId} value={JSON.stringify(productType)}>
                                            {productType.productTypeName}
                                        </option>
                                    ))}
                                </Field>
                            </div>

                            <div className="text-center m-2">
                                <button type="submit" className="btn btn-primary ">Submit</button>
                                <button type="reset" className="btn btn-success mx-1">Reset</button>
                                <Link to="/" className="btn btn-secondary">Back to Student List</Link>
                            </div>
                        </Form>
                    </div>
                }
            </Formik>
        </>
    )
}