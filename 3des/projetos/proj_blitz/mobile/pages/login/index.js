import React from 'react';
import { View, Text, Button } from 'react-native';

export default function Login({ navigation }) {
    return(
        <View>
            <Text>Tela Login</Text>
            <Button onPress={() => { navigation.navigate('Main') }} title="Ir"></Button>
        </View>
    )
}