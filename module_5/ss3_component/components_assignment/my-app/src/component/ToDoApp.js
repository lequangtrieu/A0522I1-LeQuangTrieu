import React, {Component} from "react";
import "bootstrap/dist/css/bootstrap.css";


export class ToDoApp extends Component {
    constructor() {
        super();
        this.state = {
            name: 'work',
            list: ['work1', 'work2']
        }
    }



    render() {
        const handleInputTask = (value) => {
            this.setState( {
                name: value
            })
        }

        const addTask = () => {
            let currentInput = this.state.name;
            this.setState( {
                list: [currentInput, ...this.state.list]
            })
            this.state.name = '';
        }
        return (
            <>

                <center>
                    <h1>To Do List</h1>
                    <input onChange={event => handleInputTask(event.target.value)} value={this.state.name}/>
                    <button onClick={() => addTask()}>Add</button>

                    <ul>
                        {this.state.list.map((task, index) => (
                            <li key={index}>{task}</li>
                        ))}
                    </ul>
                </center>

            </>
        )
    }
}
