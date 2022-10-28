import { useState } from 'react';
import { View, TextInput, Text, TouchableOpacity, StyleSheet } from 'react-native';
import AsyncStorage from '@react-native-async-storage/async-storage';

export default function Registro({ navigation }) {
    const [pet, setPet] = useState("");
    const [medico, setMedico] = useState("");
    const [vacina, setVacina] = useState("");
    const [data, setData] = useState("");

    return (
        <View style={styles.container}>
            <TextInput style={styles.input} placeholder="Nome do pet" placeholderTextColor={"#00000077"} onChangeText={(val) => setPet(val)}/>
            <TextInput style={styles.input} placeholder="Nome do médico veterinário" placeholderTextColor={"#00000077"} onChangeText={(val) => setMedico(val)}/>
            <TextInput style={styles.input} placeholder="Nome da vacina" placeholderTextColor={"#00000077"} onChangeText={(val) => setVacina(val)}/>
            <TextInput style={styles.input} placeholder="Data da aplicação" placeholderTextColor={"#00000077"} onChangeText={(val) => setData(val)}/>
            <TouchableOpacity style={styles.button} onPress={async () => {
                let form = {
                    pet,
                    medico,
                    vacina,
                    data
                }

                try {
                    let info = await AsyncStorage.getItem("historico");
                    if(info !== null) {
                        info = JSON.parse(info);
                        info.push(form);
                    }else {
                        info = new Array(form);
                    }

                    await AsyncStorage.setItem("historico", JSON.stringify(info));

                    navigation.navigate("Home");
                }catch(e) {
                    console.log(e);
                }
            }}>
                <Text style={styles.textButton}>Registar</Text>
            </TouchableOpacity>
        </View>
    );  
}

const styles = StyleSheet.create({
    container : {
        flex: 1,
        padding: '5vw',
        alignItems: 'center',
        gap: '20px',
        backgroundColor: '#505050'
    },
    input: {
        width: '75%',
        paddingHorizontal: '12px',
        paddingVertical: '12px',
        backgroundColor: '#EFEFEF',
        outlineStyle: 'none',
        border: 'none',
        borderRadius: '5px',
    },
    button: {
        width: '75%',
        backgroundColor: '#8a66fa',
        paddingHorizontal: '12px',
        paddingVertical: '12px',
        alignItems: 'center',
        justifyContent: 'center',
        borderRadius: '5px',
    },
    textButton: {
        fontSize: '1.2rem',
        fontWeight: 'bold',
        color: '#EFEFEF',
    }
});