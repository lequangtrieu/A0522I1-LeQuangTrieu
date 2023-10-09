import React, {useEffect, useState} from "react";
import axios from "axios";

export function List() {
    const [taskLists, setTaskLists] = useState([]);

    useEffect(() => {
        const fetchApi = async () => {
            try {
                const result = await axios.get('http://localhost:8080/taskList')
                setTaskLists(result.data)
            } catch (e) {
                console.log(e)
            }
        }
        fetchApi();
    })

    return (
        <>
            <h1>To do List</h1>

            <ul>
                {
                    taskLists.map((task) => (
                        <li key={task.name}>{task.name}</li>
                    ))
                }
            </ul>
        </>
    )
}