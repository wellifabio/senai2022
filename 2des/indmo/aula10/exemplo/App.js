import { useState, useEffect } from 'react';
import { StyleSheet, Text, View, TextInput, Button, Image } from 'react-native';
export default function App() {
  const [pokemon, setPokemon] = useState();

  useEffect(() => {
    fetch("https://pokeapi.co/api/v2/pokemon/1")
    .then(res => {return res.json()})
    .then(data => {
      setPokemon(data);
    })
  });

  return (
    <View style={styles.container}>
      {
        (pokemon !== undefined)
        ?
        <View>
          <Text>{pokemon.name}</Text>
          <Image style={styles.img} source={{uri: pokemon.sprites.front_default}}/>
        </View>
        :
        <View>
          <Image style={styles.img} source={{uri: "https://raw.githubusercontent.com/Codelessly/FlutterLoadingGIFs/master/packages/cupertino_activity_indicator.gif"}}/>
        </View>
      }
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
  img: {
    width: '100px',
    height: '100px',
  }
});
