import {useState} from 'react';
import {View, TouchableOpacity, Text, TextInput, StyleSheet} from 'react-native';

export default function App() {
  const [value, setValue] = useState();
  const [value2, setValue2] = useState();
  const [res, setRes] = useState();
  const [op, setOp] = useState();

  const calcular = () => {
    // if(op == "+"){
    //   setRes(value + value2);
    // }else if(op == "-") {
    //   setRes(value - value2);
    // }else if(op == "*") {
    //   setRes(value * value2);
    // }else if(op == "/") {
    //   setRes(value / value2);
    // }
    //setRes(eval(`${value} ${op} ${value2}`));
    setRes(op);
  }

  return (
    <View>
      <TextInput value={value} onChangeText={(val) => { setValue(Number(val)); }} />
      <TextInput value={value2} onChangeText={(val) => { setValue2(Number(val)); }} />
      <TouchableOpacity onPress={() => {setOp(value + value2)}}><Text>+</Text></TouchableOpacity>
      <TouchableOpacity onPress={() => {setOp(value - value2)}}><Text>-</Text></TouchableOpacity>
      <TouchableOpacity onPress={() => {setOp(value * value2)}}><Text>*</Text></TouchableOpacity>
      <TouchableOpacity onPress={() => {setOp(value / value2)}}><Text>/</Text></TouchableOpacity>
      <TouchableOpacity onPress={() => {calcular()}}>
        <Text>Calcular</Text>
      </TouchableOpacity>
      <Text>{res}</Text>
    </View>
  );
}
