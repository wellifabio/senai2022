import { useState } from 'react';
import { StyleSheet, Text, View, TextInput, Button } from 'react-native';

import AsyncStorage from '@react-native-async-storage/async-storage';

export default function App() {
  const [info, setInfo] = useState("");
  const [lida, setLida] = useState("");

  const salvar = async () => {
    try {
      await AsyncStorage.setItem("data", info);
      setInfo("");
    }catch(err) {
      console.log(err);
    }
  }

  const ler = async () => {
    try {
      let data = await AsyncStorage.getItem("data");
      setLida(data);
    }catch(err) {
      console.log(err);
    }
  }

  return (
    <View style={styles.container}>
      <TextInput value={info} onChangeText={(val) => { setInfo(val) }}/>
      <Button title="Salvar" onPress={() => { salvar() }}/>
      <Button title="Ler" onPress={() => { ler() }} />
      <Text>{lida}</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
