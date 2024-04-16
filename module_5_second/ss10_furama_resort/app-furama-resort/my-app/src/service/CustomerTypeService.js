import axios from "axios";

export const getAllCustomerType = async () => {
    try {
        const data = await axios.get(`http://localhost:8080/customerType`)
        return data.data
    } catch (e) {
        console.log(e)
    }
}