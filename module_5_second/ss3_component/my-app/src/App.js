import logo from './logo.svg';
import './App.css';
import {Th1} from "./component/Th1";
import {Link, Route, Routes} from "react-router-dom";
import {AddComponent} from "./component/AddComponent";
import "bootstrap/dist/css/bootstrap.css";

function App() {
  return (
    <>
        <Link className={"m-2"} to={"/th1"}>Thuc hanh 1</Link>
        <Link className={"m-2"} to={"/th2"}>Thuc hanh 2</Link>
        <Link className={"m-2"} to={"/th3"}>Thuc hanh 3</Link>
        <Link className={"m-2"} to={"/th4"}>Thuc hanh 4</Link>
        <Routes>
            <Route path="/th1" element={<Th1 name={"Admin"}/>}></Route>
            <Route path="/th2" element={<AddComponent firstNumber={1} secondNumber={2} />}></Route>

        </Routes>
    </>
  );
}

export default App;
