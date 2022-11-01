import { useState } from 'react';
import {View, Text, Image, StyleSheet, TextInput, TouchableOpacity} from 'react-native';

const dog = require("../../assets/dog.png");

export default function Login({navigation}) {
    const [email, setEmail] = useState("");
    const [senha, setSenha] = useState("");

    const data = [
        {
            "email":"fulano@gmail.com",
            "senha":"umdoistresquatro",
        },
        {
            "email":"beltrano@ig.com.br",
            "senha":"s3nh4",
        }
    ];

    return (
        <View style={styles.container}>
            <Image style={styles.dog} source={dog} />
            <TextInput style={styles.input} onChangeText={(val) => {setEmail(val)}} placeholder="Informe o email" placeholderTextColor={"#00000077"} />
            <TextInput style={styles.input} onChangeText={(val) => {setSenha(val)}} secureTextEntry={true} placeholder="Informe sua senha" placeholderTextColor={"#00000077"} />
            <TouchableOpacity style={styles.button} onPress={() => {
                data.forEach(user => {
                    if(user.email === email && user.senha === senha) {
                        navigation.navigate("Home");
                    }
                })
            }}>
                <Text style={styles.textButton}>Conectar</Text>
            </TouchableOpacity>
        </View>
    );
}

const styles = StyleSheet.create({
    container : {
        flex: 1,
        alignItems: 'center',
        justifyContent: 'center',
        gap: '20px',
        backgroundColor: '#505050'
    },
    dog: {
        width: '200px',
        height: '200px',
        shadowColor: "#000",
        shadowOffset: {
            width: 0,
            height: 12,
        },
        shadowOpacity: 0.58,
        shadowRadius: 3.00,
        elevation: 24,
    },
    input: {
        width: '75%',
        paddingHorizontal: '12px',
        paddingVertical: '12px',
        backgroundColor: '#EFEFEF',
        outlineStyle: 'none',
        border: 'none',
        borderRadius: '5px',
        shadowColor: "#000",
        shadowOffset: {
            width: 0,
            height: 6,
        },
        shadowOpacity: 0.58,
        shadowRadius: 20.00,
        elevation: 16,
    },
    button: {
        width: '75%',
        backgroundColor: '#8A66FA',
        paddingHorizontal: '12px',
        paddingVertical: '12px',
        alignItems: 'center',
        justifyContent: 'center',
        borderRadius: '5px',
        shadowColor: "#000",
        shadowOffset: {
            width: 0,
            height: 6,
        },
        shadowOpacity: 0.58,
        shadowRadius: 20.00,
        elevation: 16,
    },
    textButton: {
        fontSize: '1.2rem',
        fontWeight: 'bold',
        color: '#EFEFEF',
    }
});