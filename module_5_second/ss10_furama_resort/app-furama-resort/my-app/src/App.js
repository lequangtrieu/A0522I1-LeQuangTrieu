import "bootstrap/dist/css/bootstrap.css"
import Header from "./component/header/Header";
import Footer from "./component/footer/Footer";
import HomePage from "./component/HomePage/HomePage";
import {Route, Routes} from "react-router-dom";
import {CustomerList} from "./component/customer/CustomerList";
import {CreateCustomer} from "./component/customer/CreateCustomer";
import {ViewDetailCustomer} from "./component/customer/ViewDetailCustomer";


function App() {
  return (
    <>
        <Header/>
        <Routes>
            <Route path="/" element={<HomePage/>}></Route>
            <Route path="/customers" element={<CustomerList/>}></Route>
            <Route path="/customers/create" element={<CreateCustomer/>}></Route>
            <Route path="/customers/viewDetail/:id" element={<ViewDetailCustomer/>}></Route>
            <Route path="/customers/update/:id" element={<CreateCustomer/>}></Route>
        </Routes>
        <Footer/>
    </>
  );
}

export default App;
