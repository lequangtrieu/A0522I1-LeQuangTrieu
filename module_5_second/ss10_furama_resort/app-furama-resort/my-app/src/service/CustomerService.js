import axios from "axios";

export const getAllCustomer = async () => {
    try {
        const data = await axios.get(`http://localhost:8080/customers`);
        return data.data;
    } catch (e) {
        console.log(e)
    }
}

export const createCustomer = async (customer) => {
    try {
        await axios.post(`http://localhost:8080/customers`, customer);
    } catch (e) {
        console.log(e)
    }
}

export const getCustomerById = async (id) => {
    try {
        const customer = await axios.get(`http://localhost:8080/customers/${id}`);
        return customer.data;
    } catch (e) {
        console.log(e)
    }
}

export const updateStudentById = async (customer, id) => {
    try {
        await axios.put(`http://localhost:8080/customers/${id}`, customer);
    } catch (e) {
        console.log(e)
    }
}

export const deleteCustomer = async (id) => {
    try {
        await axios.delete(`http://localhost:8080/customers/${id}`)
    } catch (e) {
        console.log(e)
    }
}