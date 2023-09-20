import React, {useState} from "react";

export function AddStudent({ addStudent }) {
    const [formData, setFormData] = useState({
        name: '',
        age: '',
        address: '',
    });

    const handleChange = (e) => {
        const { name, value } = e.target;
        setFormData({ ...formData, [name]: value });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        addStudent(formData);
        setFormData({ name: '', age: '', address: '' });
    };

    return (
        <div>
            <h2>Thêm Sinh Viên</h2>
            <form onSubmit={handleSubmit}>
                <label>
                    Tên:
                    <input type="text" name="name" value={formData.name} onChange={handleChange} />
                </label>
                <label>
                    Tuổi:
                    <input type="number" name="age" value={formData.age} onChange={handleChange} />
                </label>
                <label>
                    Địa chỉ:
                    <input type="text" name="address" value={formData.address} onChange={handleChange} />
                </label>
                <button type="submit">Thêm</button>
            </form>
        </div>
    );
}