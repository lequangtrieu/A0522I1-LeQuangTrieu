import React, {Component} from "react";

export class Student extends Component {
    constructor() {
        super();
        this.state = {
            studentName: 'no name',
            studentList: ['Nguyen Van A', 'Nguyen Van B']

        }
    }

    handleInputName(value) {
        console.log(value);
        this.setState( {
            studentName : value
        })
    }

    addStudent() {
        let currentInput = this.state.studentName;
        this.setState( {
            studentList: [currentInput, ...this.state.studentList]
        })
        this.state.studentName = '';
    }
    render() {
        return (
            <>
                <input value={this.state.studentName}
                       onChange={(event => this.handleInputName(event.target.value))}
                />
                {/*<input onClick={() => this.addStudent()} type="submit" value={"submit"}/>*/}
                <button onClick={() => this.addStudent()}>Add</button>

                <ul>
                    {
                        this.state.studentList.map((student, index) => (
                            <li key={index}>{student}</li>
                        ))
                    }
                </ul>
            </>
        )
    }
}