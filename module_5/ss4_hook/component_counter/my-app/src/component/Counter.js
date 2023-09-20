import React, { useState, useEffect } from 'react';
export function Counter() {
    const [count, setCount] = useState(0);


    // Hàm tăng số đếm khi nút "Tăng" được bấm
    const increment = () => {
        setCount(count + 1);
    };

    // Hàm giảm số đếm khi nút "Giảm" được bấm
    const decrement = () => {
        setCount(count - 1);
    };

    return (
        <div>
            <h1>Count: {count}</h1>
            <button onClick={increment}>Tăng</button>
            {/*<button onClick={decrement}>Giảm</button>*/}
        </div>
    );
}