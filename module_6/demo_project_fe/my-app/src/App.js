import logo from './logo.svg';
import './App.css';
import {MedicineGroupList} from "./components/MedicineGroupList";
import {ToastContainer} from "react-toastify";
import 'react-toastify/dist/ReactToastify.css';
import {MedicineInfoList} from "./components/MedicineInfoList";

function App() {
  return (
    <>
        <MedicineGroupList/>
        {/*<MedicineInfoList></MedicineInfoList>*/}
        <ToastContainer/>
    </>
  );
}

export default App;
