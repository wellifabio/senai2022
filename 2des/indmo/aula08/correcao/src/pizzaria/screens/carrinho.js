import { useState } from 'react';
import {View, Text, TouchableOpacity, Image} from 'react-native';
import AsyncStorage from '@react-native-async-storage/async-storage';

const removeIcon = require('../../../assets/close.png');

export default function Carrinho({navigation}) {
    const [carrinho, setCarrinho] = useState([]);

    const getData = async () => {
        try {
          const value = await AsyncStorage.getItem('carrinho')
          
          setCarrinho(JSON.parse(value));
        } catch(e) {
          // error reading value
        }
    }

    if(carrinho.length == 0) getData();

    return(
        <View>
            {
                carrinho.map((pizza, indice) => {
                    return (
                        <View style={{width: '90vw', flexDirection: 'row', alignItems: 'center', marginTop: '10px'}} key={indice}>
                            <Image source={{uri:pizza.imagem}} style={{width: '70px', height: '70px', borderRadius: '50%'}}/>
                            <View style={{width: '80%'}}>
                                <Text>{pizza.nome}</Text>
                                <Text>{pizza.descricao}</Text>
                            </View>
                            <TouchableOpacity onPress={() => {
                                let tempArr = new Array(...carrinho);
                                tempArr.splice(indice, 1);
                                if(tempArr.length == 0) navigation.navigate("Cardapio");
                                setCarrinho(tempArr);
                            }}>
                                <Image source={removeIcon} style={{width: '40px', height: '40px'}}/>
                            </TouchableOpacity>
                        </View>
                    )
                })
            }
        </View>
    )
}