import axios from "axios";

export const save = async (student) => {
    try {
        const result = await axios.post('http://localhost:8080/students', student);
        return result.data;
    } catch (e) {
        console.log(e);
    }
}