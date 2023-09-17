import React, {Component} from "react";
// import "bootstrap/dist/css/bootstrap.css";

export class ListStudent extends Component {

    constructor() {
        super();
        this.state = {
            studentList: [
                { id: 1, name: 'John Doe', age: 20, address: '123 Main Street' },
                { id: 2, name: 'Jane Smith', age: 22, address: '456 Elm Street' },
                { id: 3, name: 'Bob Johnson', age: 21, address: '789 Oak Street' },
            ]
        }
    }

    render() {
        const styleCss = {
            // backgroundColor: 'lightblue',
        }
        return (
            <>
                <div style={styleCss}>
                    <table border="1">
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
                            <th>Age</th>
                            <th>Address</th>
                        </tr>
                        {this.state.studentList.map((student) => (
                            <tr key={student.id}>
                                <td>{student.id}</td>
                                <td>{student.name}</td>
                                <td>{student.age}</td>
                                <td>{student.address}</td>
                            </tr>
                        ))}
                    </table>
                </div>

            </>
        )
    }
}