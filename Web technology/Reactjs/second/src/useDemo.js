import {useState} from "react";
const useDemo = (a) => {
  const [count, setCount] = useState(a);
  const Increase = () => {
    setCount(count + 1);
  };
  const Decrease = () => {
    setCount(count - 1);
  };

  return [count, Increase, Decrease];
};

export {useDemo};
