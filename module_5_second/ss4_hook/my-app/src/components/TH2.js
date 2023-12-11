import {useEffect, useState} from "react";

export function TH2() {
    const [selected, setSelected] = useState("0");
    const [valueSelected, setValueSelected] = useState("");
    const choice = (e) => {
        setSelected(e.target.value);
    }

    useEffect(() => {
        switch (selected) {
            case "0":
                setValueSelected("Java");
                break
            case "1":
                setValueSelected("PHP");
                break
            case "2":
                setValueSelected("Js");
                break

        }
    }, [selected]);
    return (
        <>
            Course:
            <select onChange={(e) => choice(e)} name="" id="">
                <option value="0">Java</option>
                <option value="1">PHP</option>
                <option value="2">JS</option>
            </select>

            <h2>Your selected: {valueSelected}</h2>
        </>
    )
}