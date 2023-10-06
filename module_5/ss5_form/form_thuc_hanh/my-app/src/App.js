import logo from './logo.svg';
import './App.css';
import React from "react";
import {FormInput} from "./component/FormInput";
import {FormValidation} from "./component/FormValidation";
import {FormLogin} from "./component/FormLogin";
import {FormFormik} from "./component/FormFormik";

function App() {
    return (
        <>
            {/*<FormInput></FormInput>*/}
            {/*<FormValidation></FormValidation>*/}
            {/*<FormLogin></FormLogin>*/}
            <FormFormik></FormFormik>
        </>
    );
}

export default App;
