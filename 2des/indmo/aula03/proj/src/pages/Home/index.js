import { useState } from 'react';
import { StyleSheet, Text, View, TextInput, Button, ScrollView } from 'react-native';

export default function Home({route}) {
  // var matricula = route.params.matricula;
  // var nomefunc = route.params.nome;

  var { matricula, nomefunc } = route.params;

  const [nome, setNome] = useState("");
  const [cargo, setCargo] = useState("");
  const [lista, setLista] = useState([
    {
      "nome":"Fulano",
      "cargo":"Programador"
    },
    {
      "nome":"Beltrano",
      "cargo":"Analista"
    }
  ]);

  const cadastrar = () => {
    let nFunc = {
      "nome":nome,
      "cargo":cargo
    }

    setLista([...lista, nFunc]);
  }

  return (
    <View style={styles.container}>
      <Text>{matricula}</Text>
      <Text>{nomefunc}</Text>
      <TextInput placeholder="Nome do Funcionario" onChangeText={(val) => { setNome(val) }} />
      <TextInput placeholder="Cargo do Funcionario" onChangeText={(val) => { setCargo(val) }}/>
      <Button title="Cadastrar Funcionario" onPress={() => { cadastrar() }}/>
      <ScrollView>
        {
          lista.map((funcionario, indice) => {
            return(
              <View key={indice}>
                <Text>{funcionario.nome}</Text>
                <Text>{funcionario.cargo}</Text>
              </View>
            )
          })
        }
      </ScrollView>
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
