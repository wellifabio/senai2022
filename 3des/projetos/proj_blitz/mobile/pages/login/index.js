import React, { useState } from 'react';
import { View, TextInput, Text, ToastAndroid, TouchableOpacity, Image } from 'react-native';
import AsyncStorage from '@react-native-async-storage/async-storage';
import * as ImagePicker from 'expo-image-picker';
import md5 from 'md5';

export default function Login({ navigation }) {
    const [email, setEmail] = useState("");
    const [senha, setSenha] = useState("");

    const [imagem, setImagem] = useState(require('../../assets/app/avatar.png'));

    const autenticar = () => {
        let usuario = {
            email: email,
            senha: md5(senha),
        }

        fetch('http://10.87.207.2:3000/login', {
            "method": "POST",
            "headers": {
                "Content-Type": "application/json"
            },
            "body": JSON.stringify(usuario),
        })
        .then(resp => { return resp.json() })
        .then(async data => {
            if(data.length > 0) {
                await AsyncStorage.setItem('userdata', JSON.stringify(data[0]));
                navigation.navigate('Main');
            }else {
                ToastAndroid.show('Email ou Senha Invalidos', ToastAndroid.SHORT);
            }
        })
    }

    const selecionarImagem = async () => {
        let result = await ImagePicker.launchImageLibraryAsync({
            mediaTypes: ImagePicker.MediaTypeOptions.All,
            allowsEditing: true,
            aspect: [4, 3],
            quality: 1,
        });

        if (!result.cancelled) {
            setImagem({
                uri: result.uri,
            })
        }
    }

    return(
        <View>
            <Image source={imagem} style={{width: 128, height: 128}} />
            
            <TextInput
                value={email}
                onChangeText={setEmail}
            />
            <TextInput
                value={senha}
                onChangeText={setSenha}
            />

            <TouchableOpacity onPress={() => { selecionarImagem() }}>
                <Image source={require('../../assets/app/camera.png')} style={{width: 32, height: 32}} />
            </TouchableOpacity>

            <TouchableOpacity onPress={() => autenticar()}>
                <Text>Login</Text>
            </TouchableOpacity>
        </View>
    )
}