import {useEffect, useState} from "react";

export function BT1_Countdown() {
    const [timer, setTimer] = useState(5);
    const [intervalId, setIntervalId] = useState(null);

    useEffect(() => {
        if (timer === 0) {
            alert("Countdown successful");
            clearInterval(intervalId); // Dừng chu kỳ lặp lại khi timer = 0
        }

        const id = setInterval(() => {
            setTimer(prevTimer => prevTimer - 1);
        }, 1000);

        // Lưu trữ intervalId để sử dụng cho việc clearInterval() sau này
        setIntervalId(id);

        // Clean up effect: Dừng chu kỳ lặp lại khi component bị unmount hoặc khi timer = 0
        return () => clearInterval(id);
    }, [timer]);

    return (
        <>
            Countdown: {timer}
        </>
    );
}