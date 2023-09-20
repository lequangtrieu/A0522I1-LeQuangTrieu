import './App.css';
import React, {useState} from "react";
import {AddStudent} from "./component/AddStudent";
import {EditStudent} from "./component/EditStudent";
import {StudentList} from "./component/StudentList";

function App() {
    const [students, setStudents] = useState([]);
    const [isEditing, setIsEditing] = useState(false);
    const [editingId, setEditingId] = useState(null);
    const [nextId, setNextId] = useState(1); // Khởi đầu ID tự tăng từ 1

    const addStudent = (newStudent) => {
        const studentWithId = { ...newStudent, id: nextId };
        setNextId(nextId + 1); // Tăng biến nextId cho sinh viên tiếp theo
        setStudents([...students, studentWithId]);
    };

    const editStudent = (id) => {
        setIsEditing(true);
        setEditingId(id);
    };

    const updateStudent = (updatedStudent) => {
        const updatedStudents = students.map((student) =>
            student.id === editingId ? { ...student, ...updatedStudent } : student
        );
        setStudents(updatedStudents);
        setIsEditing(false);
        setEditingId(null);
    };

    const deleteStudent = (id) => {
        const updatedStudents = students.filter((student) => student.id !== id);
        setStudents(updatedStudents);
    };

    return (
        <div>
            <h1>Quản Lý Sinh Viên</h1>
            <AddStudent addStudent={addStudent} />
            {isEditing ? (
                <EditStudent student={students.find((student) => student.id === editingId)} updateStudent={updateStudent} />
            ) : null}
            <StudentList students={students} editStudent={editStudent} deleteStudent={deleteStudent} />
        </div>
    );
}

export default App;
