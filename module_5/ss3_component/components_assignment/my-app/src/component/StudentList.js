import React, { useState } from 'react';

export function StudentList({ students, editStudent, deleteStudent }) {
    return (
        <div>
            <h2>LIST STUDENT</h2>
            <table>
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Address</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>
                {students.map((student) => (
                    <tr key={student.id}>
                        <td>{student.id}</td>
                        <td>{student.name}</td>
                        <td>{student.age}</td>
                        <td>{student.address}</td>
                        <td>
                            <button onClick={() => editStudent(student.id)}>Sửa</button>
                            <button onClick={() => deleteStudent(student.id)}>Xóa</button>
                        </td>
                    </tr>
                ))}
                </tbody>
            </table>
        </div>
    );
}