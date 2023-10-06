import React, {useEffect, useState} from "react";
import axios from "axios";

export function List() {
    const [students, setStudents] = useState([]);

    // useEffect(() => {
    //     axios.get('http://localhost:8080/students')
    //         .then((res) => {
    //             console.log(res.data);
    //             setStudents(res.data);
    //         })
    //         .catch((error) => {
    //             console.log(error)
    //         })
    // })

    useEffect(() => {
        const fetchApi = async () => {
            try {
                const result = await axios.get('http://localhost:8080/students')
                setStudents(result.data)
            } catch (e) {
                console.log(e)
            }
        }
        fetchApi();
    }, [])
    return (
        <>
            <h1>Student List</h1>

            <table className="table">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Gender</th>
                    <th>Languages</th>
                </tr>
                </thead>
                <tbody>
                {
                    students.map((student) => (
                        <tr key={student.id}>
                            <td>{student.id}</td>
                            <td>{student.name}</td>
                            <td>{student.gender == '1' ? 'Male' : 'Female'}</td>
                            <td>{
                                student.languages.map((lang) => (
                                    <span key={lang}>{lang +''}</span>
                                ))
                            }</td>
                        </tr>
                    ))
                }
                </tbody>
            </table>
        </>
)

}