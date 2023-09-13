import React from "react";
import ReactDOM from "react-dom/client";

function demo_th() {
    return (
        <div className="demo_th">
            <h4>Hello World</h4>
        </div>
    );
}

export default demo_th;


// demo

// import React from "react";
// import ReactDOM from "react-dom/client";
//
// const name = "Le Quang Trieu";
//
// const fruits = [
//     "Apple",
//     "Banana",
//     "Orange",
//     "Apricot",
//     "Black rowan",
//     "Cranberry"
// ];
//
// const root = ReactDOM.createRoot(document.getElementById("root"));
//
// const tick = () => {
//     root.render(
//         <div>
//             <h1>Hello world!</h1>
//             <h2>It is {new Date().toLocaleTimeString()}.</h2>
//         </div>
//     );
// };
//
// setInterval(tick, 1000);

// root.render(
//     React.createElement("h1", { style: { textAlign: "center" } }, name)
// );
//
//
// root.render(
//     <div>
//         <h1>List of fruits</h1>
//         <ul>
//             {fruits.map(item => (
//                 <li>{item}</li>
//             ))}
//         </ul>
//     </div>
// );
