import { useState } from 'react';
import { View, Text, TextInput, Button } from 'react-native';

export default function Login({navigation}) {
    const [email, setEmail] = useState("user01@empresa.com");
    const [password, setPassword] = useState("teste1234");

    const users = [
        {
            "id": 1,
            "email": "user01@empresa.com",
            "senha": "teste1234",
        },
        {
            "id": 2,
            "email": "user02@empresa.com",
            "senha": "1234teste",
        }
    ]

    return(
        <View>
            <TextInput onChangeText={(value) => {setEmail(value)}} />
            <TextInput onChangeText={(value) => {setPassword(value)}} />
            <Button title="Login" onPress={() => {
                users.forEach(user => {
                    if(user.email === email && user.senha === password) navigation.navigate("Lista", {"id": user.id - 1});
                 })
            }}/>
        </View>
    )
}