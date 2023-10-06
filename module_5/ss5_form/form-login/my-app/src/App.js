import logo from './logo.svg';
import './App.css';
import {ContactForm} from "./conponent/ContactForm";
import React from "react";
import {FormCovid} from "./conponent/FormCovid19";

function App() {
    return (
        <>
            {/*<ContactForm></ContactForm>*/}
            <FormCovid></FormCovid>
        </>
    );
}

export default App;
