import { useState } from 'react';
import { View, Text, Button } from 'react-native';
import AsyncStorage from '@react-native-async-storage/async-storage';

export default function Final({navigation, route}) {
    const [resp, setResp] = useState([]);

    const gabarito = ["second", "fourth", "second", "third", "first"];

    const getData = async () => {
        try {
            const value = await AsyncStorage.getItem('resp');
            console.log(value)
            setResp(value.split(";"));
        } catch(e) {
            console.log(e);
            //error reading value
        }
    }

    if(resp.length === 0) getData();

    return(
        <View>
            <Text>Sua pontucao e : {route.params.score}</Text>
            {
                resp.map((item, index) => {
                    return(
                        <Text key={index}>Questao {index + 1} : {(item === gabarito[index]) ? "Acertou" : "Errou"}</Text>
                    )
                })
            }
        </View>
    )
}