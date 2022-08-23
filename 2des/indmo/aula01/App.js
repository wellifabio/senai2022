import {View, Text, StyleSheet, Image, TextInput, Button, TouchableOpacity} from 'react-native';

export default function App() {  
  const usuarios = [
    {
      "nome":"Fulano",
      "matricula":"12345"
    },
    {
      "nome":"Beltrano",
      "matricula":"54321"
    },
    {
      "nome":"Ciclano",
      "matricula":"124578"
    }
  ];

  const imgGatin = require('./assets/gatin.jpeg');
  const trashIcon = require('./assets/trash.png');

  return(
    <View style={style.container}>
      <View style={style.primeira}>
        <Text>Bem vindo, Fulano</Text>
        <TextInput style={style.input} placeholder="Email"/>
        <Button title="Cadastrar" />
        <TouchableOpacity style={style.btExclui}>
          <Image style={{width: '32px', height: '32px'}} source={trashIcon}/>
          <Text>Apagar Registro</Text>
        </TouchableOpacity>
        {
          usuarios.map(usuario => {
            return (
              // <View>
              //   <Text>{usuario.matricula}</Text>
              //   <Text>{usuario.nome}</Text>
              // </View>
              // <Text>{`${usuario.matricula} - ${usuario.nome}`}</Text>
              <TouchableOpacity style={style.btExclui}>
                <Text>{`${usuario.matricula} - ${usuario.nome}`}</Text>
              </TouchableOpacity>
            )
          })
        }
      </View>
      <View style={style.segunda}>
        <Text>Minha Segunda View</Text>
        <Image style={style.imgAnimal} source={imgGatin} />
        <Image style={style.imgAnimal} source={{uri:'https://conteudo.imguol.com.br/c/entretenimento/54/2020/04/28/cachorro-pug-1588098472110_v2_1x1.jpg'}} />
      </View>
    </View>
  );
}

const style = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  primeira: {
    flex: 1,
    backgroundColor: '#F1D2E7'
  },
  segunda: {
    flex: 1,
    backgroundColor: '#E2F5C8'
  },
  imgAnimal: {
    width: '200px',
    height: '200px',
  },
  input : {
    borderBottomWidth: '1px',
    borderBottomColor: 'gray',
    padding: '10px',
  },
  btExclui: {
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'center',
    backgroundColor: '#FCFFA6',
    border: '2px solid #adffa6',
    borderRadius: '10px',
  }
});