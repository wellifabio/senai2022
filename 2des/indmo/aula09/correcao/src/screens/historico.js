import { useState } from 'react';
import { View, Text, StyleSheet, TextInput, ScrollView } from 'react-native';
import AsyncStorage from '@react-native-async-storage/async-storage';

export default function Historico() {
    const [lista, setLista] = useState([]);
    const [busca, setBusca] = useState("");

    const carregaLista = async () => {
        try {
            let data = await AsyncStorage.getItem("historico");

            if (data !== null) setLista(JSON.parse(data));
        } catch (e) {
            console.log(e);
        }
    }

    if (lista.length === 0) carregaLista();

    return (
        <View style={styles.container}>
            <TextInput style={styles.input} onChangeText={(val) => { setBusca(val) }} placeholder="Digite para buscar..." placeholderTextColor={"#00000077"} />
            <ScrollView>
                <View style={styles.lista}>
                    {
                        lista.map((item, index) => {
                            if (item.pet.includes(busca) || item.medico.includes(busca) || item.vacina.includes(busca) || item.data.includes(busca))
                                return (
                                    <View style={styles.item} key={index}>
                                        <Text style={styles.text}>PET : {item.pet}</Text>
                                        <Text style={styles.text}>Veterinário : {item.medico}</Text>
                                        <Text style={styles.text}>Vacina : {item.vacina}</Text>
                                        <Text style={styles.text}>Data : {item.data}</Text>
                                    </View>
                                )
                        })
                    }
                </View>
            </ScrollView>
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#505050',
        alignItems: 'center',
    },
    input: {
        width: '90%',
        paddingHorizontal: '12px',
        paddingVertical: '12px',
        backgroundColor: '#EFEFEF',
        outlineStyle: 'none',
        border: 'none',
        borderRadius: '5px',
        marginVertical: '10px',
        shadowColor: "#000",
        shadowOffset: {
            width: 0,
            height: 6,
        },
        shadowOpacity: 0.58,
        shadowRadius: 20.00,
        elevation: 16,
    },
    lista: {
        width: '100vw',
        alignItems: 'center'
    },
    item: {
        width: '90%',
        marginVertical: '5px',
        borderRadius: '5px',
        borderRadius: '5px',
        marginBottom: '10px',
        shadowColor: "#000",
        shadowOffset: {
            width: 0,
            height: 6,
        },
        shadowOpacity: 0.58,
        shadowRadius: 20.00,
        elevation: 16,
        padding: 15,
    },
    linha: {
        width: '100%',
        height: '1px',
        backgroundColor: '#8a66fa',
        marginTop: '15px',
    },
    text: {
        color: '#EFEFEF',
    }
});