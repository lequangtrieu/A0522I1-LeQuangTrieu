import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap/dist/js/bootstrap'
import 'bootstrap/dist/js/bootstrap.bundle'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/css/bootstrap-grid.css'
import 'bootstrap/dist/css/bootstrap-grid.rtl.css'

import './App.css';
import {Route, Routes} from "react-router-dom";
import Header from "./components/header/Header";
import Footer from "./components/footer/Footer";
import {StudentList} from "./components/student_management/StudentList";
import {CreateStudent} from "./components/student_management/CreateStudent";


function App() {
  return (
    <>
        <Header/>
      <Routes>
        <Route path="/" element={<StudentList/>}></Route>
        <Route path="/createStudent" element={<CreateStudent/>}></Route>
        <Route path="/updateStudent/:id" element={<CreateStudent/>}></Route>
      </Routes>
        <Footer/>
    </>
  );
}

export default App;
