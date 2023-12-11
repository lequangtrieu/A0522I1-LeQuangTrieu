import {useState} from "react";

export function TH1() {
    const [count, setCount] = useState(0);
    const handleClick = () => {
        const newValue = count + 1;
        setCount(newValue);
    }
    return (
        <>
            <div>
                Value: {count}
            </div>
            <div>
                <button onClick={handleClick}>Increase</button>
            </div>
        </>
    )
}