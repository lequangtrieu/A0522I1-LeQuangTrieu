import React from "react";
import {ErrorMessage, Field, Form, Formik} from "formik";
import "bootstrap/dist/css/bootstrap.css";
import * as Yup from 'yup';


export function FormCovid() {
    return (
        <>
            <Formik initialValues={{
                name: 'trieu',
                cmnd: '123456',
                birth: '2005',
                gender: '1',
                nation: 'nation',
                company: 'company',
                position: 'position',
                bhyt: ['have'],
                province: 'province',
                district: 'district',
                town: 'town',
                address: 'address',
                phone: 'phone',
                email: 'email',
                sickness: ['FEVER'],
                check: ['check1']
            }}

                    validationSchema={Yup.object({
                        name: Yup.string().required(),
                        cmnd: Yup.string().required(),
                        birth: Yup.number().required().min(1900).max(2023),
                        nation: Yup.string().required(),
                        province: Yup.string().required(),
                        district: Yup.string().required(),
                        town: Yup.string().required(),
                        address: Yup.string().required(),
                        phone: Yup.string().required(),
                        email: Yup.string().required()

                    })

                    }

                    onSubmit={(values, {setSubmitting}) => {
                        console.log(values);
                    }

                    }

            >

                {
                    ({isSubmitting}) => (
                        <div>
                            <h1 className="text-center">FORM COVID 19</h1>

                            <h3>Tờ khai y tế</h3>
                            <Form>
                                <table>
                                    <tr>
                                        <th>Name</th>
                                        <td><Field type="text" name="name"/></td>
                                        <ErrorMessage name='name' component='span' className='text-danger'/>
                                    </tr>
                                    <tr>
                                        <th>CMND</th>
                                        <td><Field type="text" name="cmnd"/></td>
                                        <ErrorMessage name='cmnd' component='span' className='text-danger'/>
                                    </tr>
                                    <tr>
                                        <th>Birth</th>
                                        <td><Field type="text" name="birth"/></td>
                                        <ErrorMessage name='birth' component='span' className='text-danger'/>
                                    </tr>
                                    <tr>
                                        <th>Gender</th>
                                        <Field type="radio" value="1" name='gender'/> <label>Male</label>
                                        <Field type="radio" value="0" name='gender'/> <label>Female</label>
                                        <ErrorMessage name='gender' component='span' className='text-danger'/>
                                    </tr>
                                    <tr>
                                        <th>Nationality</th>
                                        <td><Field type="text" name="nation"/></td>
                                        <ErrorMessage name='nation' component='span' className='text-danger'/>
                                    </tr>
                                    <tr>
                                        <th>Company</th>
                                        <td><Field type="text" name="company"/></td>
                                        <ErrorMessage name='company' component='span' className='text-danger'/>
                                    </tr>
                                    <tr>
                                        <th>Position</th>
                                        <td><Field type="text" name="position"/></td>
                                        <ErrorMessage name='position' component='span' className='text-danger'/>
                                    </tr>
                                    <tr>
                                        <th>Having BHYT</th>
                                        <td><Field type="checkbox" name='bhyt' value="have"/></td>
                                        <ErrorMessage name='bhyt' component='span' className='text-danger'/>
                                    </tr>

                                </table>
                                <br/>

                                <h3>Địa chỉ liên lạc tại Việt Nam</h3>
                                <table>
                                    <tr>
                                        <th>Province</th>
                                        <td><Field type="text" name="province"/></td>
                                        <ErrorMessage name='province' component='span' className='text-danger'/>
                                    </tr>
                                    <tr>
                                        <th>District</th>
                                        <td><Field type="text" name="district"/></td>
                                        <ErrorMessage name='district' component='span' className='text-danger'/>
                                    </tr>
                                    <tr>
                                        <th>Town</th>
                                        <td><Field type="text" name="town"/></td>
                                        <ErrorMessage name='town' component='span' className='text-danger'/>
                                    </tr>
                                    <tr>
                                        <th>Address</th>
                                        <td><Field type="text" name="address"/></td>
                                        <ErrorMessage name='address' component='span' className='text-danger'/>
                                    </tr>
                                    <tr>
                                        <th>Phone</th>
                                        <td><Field type="text" name="phone"/></td>
                                        <ErrorMessage name='phone' component='span' className='text-danger'/>
                                    </tr>
                                    <tr>
                                        <th>Email</th>
                                        <td><Field type="text" name="email"/></td>
                                        <ErrorMessage name='email' component='span' className='text-danger'/>
                                    </tr>
                                </table>

                                <h5>Trong vòng 14 ngày qua, Anh/Chị có đến quốc gia/ vùng lãnh thổ nào (Có thể đi qua nhiều quốc gia)</h5>
                                <Field type="text" name="detailNationVisited"/>
                                <br/>
                                <h5>Trong vòng 14 ngày qua, Anh/Chị có thấy xuất hiện dấu hiệu nào sau đây không</h5>
                                <p><Field type="checkbox" value="FEVER" name='sickness'/> FEVER</p>
                                <p><Field type="checkbox" value="COUGH" name='sickness'/> COUGH</p>
                                <p><Field type="checkbox" value="BREATHING" name='sickness'/> DIFFICULT BREATHING</p>
                                <p><Field type="checkbox" value="LUNG" name='sickness'/> LUNG PAIN</p>
                                <p><Field type="checkbox" value="SORE_THROAT" name='sickness'/> SORE THROAT</p>
                                <p><Field type="checkbox" value="TIRED" name='sickness'/> TIRED</p>
                                <br/>

                                <h5>Trong vòng 14 ngày qua, Anh/Chị có tiếp xúc với?</h5>
                                <p><Field type="checkbox" value="check1" name='check'/> Người bệnh hoặc nghi ngờ, mắc bệnh Covid-19</p>
                                <p><Field type="checkbox" value="check2" name='check'/> Người từ nước có bệnh covid-19</p>
                                <p><Field type="checkbox" value="check3" name='check'/> Người có biểu hiện (sốt, ho, khó thở, viêm phổi)</p>

                                <button type="submit">Submit</button>
                            </Form>
                        </div>
                    )
                }

            </Formik>
        </>
    )
}