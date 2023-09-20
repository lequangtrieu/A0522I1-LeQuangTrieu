import React, {useEffect, useState} from "react";
export function EditStudent({ student, updateStudent }) {
    const [formData, setFormData] = useState(student);

    useEffect(() => {
        setFormData(student);
    }, [student]);

    const handleChange = (e) => {
        const { name, value } = e.target;
        setFormData({ ...formData, [name]: value });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        updateStudent(formData);
    };

    return (
        <div>
            <h2>Sửa Sinh Viên</h2>
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
                <button type="submit">Cập Nhật</button>
            </form>
        </div>
    );
}