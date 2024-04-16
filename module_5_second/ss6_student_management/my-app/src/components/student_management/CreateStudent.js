import {ErrorMessage, Field, Form, Formik} from "formik";
import axios from "axios";
import {Link, useNavigate, useParams} from "react-router-dom";
import {useEffect, useState} from "react";
import * as Yup from "yup";

const init = {
    name: "",
    gender: "",
    birthday: "",
    idCard: "",
    languages: [],
    classroom: {}
}
export function CreateStudent() {
    const [classrooms, setClassrooms] = useState([]);

    const validateSchema = {
        name: Yup.string().required("Name is not empty")
            .min(3, "Name too short")
            .max(100, "name too long")
            .matches(/^[A-Za-z ]{3,100}$/, "name invalid"),

        birthday: Yup.string().required("Birthday is not empty"),
            // .matches(/^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{4}$/, "please follow format DD/MM/YYYY"),

        idCard: Yup.string().required("IdCard is not empty")
            .matches(/^\d{9}$/, "idCard must be have 9 numbers")
    }

    const navigate = useNavigate();
    const { id } = useParams();

    const [initialValues, setInitialValues] = useState(init);

    const fetchClassrooms = async () => {
        try {
            const data = await axios.get("http://localhost:8080/classrooms");
            setClassrooms(data.data);
        } catch (error) {
            console.error(error);
        }
    };

    useEffect(() => {
        fetchClassrooms();
        // Kiểm tra nếu có id từ URL thì gọi API để lấy dữ liệu sinh viên
        if (id) {
            getStudentById();
        }
    }, [id]);

    const createStudent = async (values) => {
        values.gender = +values.gender
        try {
            await axios.post("http://localhost:8080/students", values);
            console.log("ok")
            navigate("/");
        } catch (e) {
            console.log(e);
        }
    }

    // Hàm để lấy dữ liệu sinh viên từ API dựa trên id từ URL
    const getStudentById = async () => {
        try {
            const getStudentById = await axios.get(`http://localhost:8080/students/${id}`);
            getStudentById.data.gender = getStudentById.data.gender + "";
            setInitialValues(getStudentById.data);
            console.log(getStudentById.data)
        } catch (e) {
            console.log(e)
        }
    }

    const updateStudentById = async (student) => {
        student.gender = +student.gender;
        try {
            await axios.put(`http://localhost:8080/students/${id}`, student)
            console.log("update ok")
            navigate("/");
        } catch (e) {
            console.log(e)
        }
    }

    const selectClassroom = async (event) => {
        const selectedClassroomId = event.target.value;
        const selectedClassroom = classrooms.find(
            (classroom) => classroom.id === parseInt(selectedClassroomId)
        );

        setInitialValues((prevValues) => ({
            ...prevValues,
            classroom: selectedClassroom
        }));
    };

    if (!initialValues.name && id) return null
    // console.log(initialValues.name)

    return (
        <>
            <Formik initialValues={initialValues}
                    onSubmit={values => {
                        {id == null ? createStudent(values) : updateStudentById(values)}
            }}
            validationSchema={Yup.object(validateSchema)}
            >
                {
                    <div className="container mt-5 border border-dark border-3 rounded p-4 mb-3">
                        <Form>
                            <h1 className={"text-center"}>{id == null ? "Create Student" : "Update Student"}</h1>
                            <div className='mb-3'>
                                <label htmlFor='name' className='form-label fw-bold'>Name</label>
                                <Field type='text' className='form-control' id='name' name="name"/>
                                <ErrorMessage name="name" component="span" style={{color: "red"}}></ErrorMessage>
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


                            <label htmlFor='languages' className='form-label fw-bold'>Languages</label>
                            <div className="form-check">
                                <Field className="form-check-input" type="checkbox" value="C#" name="languages"
                                       id="flexCheckDefault"/>
                                <label className="form-check-label" htmlFor="flexCheckDefault">
                                    C#
                                </label>
                            </div>
                            <div className="form-check">
                                <Field className="form-check-input" type="checkbox" value="JAVA" name="languages"
                                       id="cb1"/>
                                <label className="form-check-label" htmlFor="cb1">
                                    JAVA
                                </label>
                            </div>
                            <div className="form-check">
                                <Field className="form-check-input" type="checkbox" value="ReactJs" name="languages"
                                       id="cb2"/>
                                <label className="form-check-label" htmlFor="cb2">
                                    ReactJs
                                </label>
                            </div>

                            <div className='mb-3'>
                                <label htmlFor='classroom' className='form-label fw-bold'>
                                    Classroom
                                </label>
                                <select
                                    className='form-select'
                                    id='classroom'
                                    name='classroom'
                                    onChange={selectClassroom}
                                    value={initialValues.classroom.id || ""}
                                >
                                    <option value='' disabled>Select Classroom</option>
                                    {classrooms.map((classroom) => (
                                        <option key={classroom.id} value={classroom.id}>
                                            {classroom.classroomName}
                                        </option>
                                    ))}
                                </select>
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