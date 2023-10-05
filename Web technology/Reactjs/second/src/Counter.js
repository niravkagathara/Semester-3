
import React from "react";
import {useDemo} from "./useDemo";
const Counter = () => {
  const [count,Increase,Decrease]=useDemo(6)
  return (
    <>
      <h1>hello</h1>
      <h1>{count}</h1>
      <button onClick={Increase}>Increase</button>
      <button onClick={Decrease}>Decrease</button>

    </>
  );
};
export { Counter }; 