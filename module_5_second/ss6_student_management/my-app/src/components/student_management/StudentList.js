import {useEffect, useState} from "react";
import axios from "axios";
import {Link} from "react-router-dom";

export function StudentList() {
    const [students, setStudents] = useState([]);

    const [deleteStudentId, setDeleteStudentId] = useState(null);
    const [showModal, setShowModal] = useState(false);

    const [nameField, setNameField] = useState("");
    const [idCardField, setIdCardField] = useState("");
    const [genderField, setGenderField] = useState("");
    const [classrooms, setClassrooms] = useState([]);
    const [selectClassroomName, setSelectClassroomName] = useState("");

    const [startDateField, setStartDateField] = useState(null);
    const [endDateField, setEndDateField] = useState(null);

    const confirmDelete = (studentId) => {
        setDeleteStudentId(studentId);
        setShowModal(true);
    }

    const deleteStudent = async () => {
        try {
            await axios.delete(`http://localhost:8080/students/${deleteStudentId}`)
            const result = await axios.get('http://localhost:8080/students')
            setStudents(result.data)
        } catch (e) {
            console.log(e)
        }
        setShowModal(false); // Ẩn modal sau khi xóa
    }

    const getStudentList = async () => {
        try {
            // let result;
            // const result = await axios.get(`http://localhost:8080/students?classroom.classroomName_like=${selectClassroomName}`);
            const result = await axios.get(`http://localhost:8080/students?name_like=${nameField}&idCard_like=${idCardField}&gender_like=${genderField}&classrooms.id_like=${selectClassroomId}`);

            // if (startDateField == null || endDateField == null) {
            //     result = await axios.get(`http://localhost:8080/students?name_like=${nameField}&idCard_like=${idCardField}&gender_like=${genderField}`);
            // } else {
            //     result = await axios.get(`http://localhost:8080/students?birthday_gte=${startDateField}&birthday_lte=${endDateField}`);
            // }
            setStudents(result.data);
            console.log(result.data)
        } catch (error) {
            console.log(error)
        }
    }

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
        getStudentList();
    }, []);
    return (
        <>
            <div className="container mt-4 mb-4">
                <h1 className="text-center">Student List</h1>
                <Link to="/createstudent" className="btn btn-primary my-2">Add new student</Link>
                
                <div style={{display:"flex"}}>
                    <input type="text" className="form-control col-lg-1" placeholder="Name" onChange={e => setNameField(e.target.value)}/>

                    <input type="text" className="form-control col-lg-1 mx-3" placeholder="IdCard" onChange={e => setIdCardField(e.target.value)}/>

                    <input type="date" className="form-control col-lg-2" placeholder="StartDate" onChange={e => setStartDateField(e.target.value)}/>

                    <input type="date" className="form-control col-lg-2 mx-3" placeholder="EndDate" onChange={e => setEndDateField(e.target.value)}/>


                    <select className="form-control col-lg-2" value={genderField} onChange={e => setGenderField(e.target.value)}>
                        <option value="">Select Gender</option>
                        <option value="1">Male</option>
                        <option value="0">Female</option>
                    </select>

                    <select className="form-control col-lg-2 mx-4"
                            value={selectClassroomName}
                            onChange={e => setSelectClassroomName(e.target.value)}
                    >
                        <option value="">Select Classroom</option>
                        {classrooms.map((classroom) => (
                            <option key={classroom.id} value={classroom.classroomName}>
                                {classroom.classroomName}
                            </option>
                        ))}
                    </select>
                    <button className="btn btn-primary" onClick={getStudentList}>Search</button>
                </div>

                <table className="table table-striped table-bordered mt-3">
                    <thead className="thead-dark">
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
                            <th>Gender</th>
                            <th>Birthday</th>
                            <th>IdCard</th>
                            <th>Languages</th>
                            <th>Classroom</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                    {
                        students.map((student) => (
                            <tr key={student.id}>
                                <td>{student.id}</td>
                                <td>{student.name}</td>
                                <td>{student.gender ? "Male" : "Female"}</td>
                                <td>{student.birthday}</td>
                                <td>{student.idCard}</td>
                                <td>{student.languages.map(language => (
                                    <span className="p-2">{language}</span>
                                ))}</td>
                                <td>{student.classroom.classroomName}</td>
                                <td>
                                    <Link to={`/updateStudent/${student.id}`} className="btn btn-success px-4">Edit</Link>
                                    <button className="btn btn-danger" onClick={() => confirmDelete(student.id)}>Remove</button>
                                </td>
                            </tr>
                        ))
                    }
                    </tbody>
                </table>
            </div>

            {/* Modal xác nhận xóa */}
            <div className={`modal ${showModal ? 'show' : ''}`} style={{ display: showModal ? 'block' : 'none' }} tabIndex="-1" role="dialog">
                <div className="modal-dialog" role="document">
                    <div className="modal-content">
                        <div className="modal-header">
                            <h5 className="modal-title">Confirm Delete</h5>
                            <button type="button" className="close" onClick={() => setShowModal(false)}>
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div className="modal-body">
                            <p>Are you sure you want to delete this student?</p>
                        </div>
                        <div className="modal-footer">
                            <button type="button" className="btn btn-secondary" onClick={() => setShowModal(false)}>Cancel</button>
                            <button type="button" className="btn btn-danger" onClick={deleteStudent}>Delete</button>
                        </div>
                    </div>
                </div>
            </div>
        </>
    )
}