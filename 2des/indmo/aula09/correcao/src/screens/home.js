import {View, Text, Image, StyleSheet, TextInput, TouchableOpacity} from 'react-native';

const agenda = require("../../assets/agenda.png");
const agendar = require("../../assets/agendar.png");
const relatorio = require("../../assets/arquivo.png");
const vacinacao = require("../../assets/vacinacao.png");

export default function Home({navigation}) {
    return (
        <View style={styles.container}>
            <View style={styles.cards}>
                {/* <TouchableOpacity style={styles.card}>
                    <Image style={styles.image} source={agenda}/>
                    <Text style={styles.text}>Agendamentos</Text>
                </TouchableOpacity>
                <TouchableOpacity style={styles.card}>
                    <Image style={styles.image} source={agendar}/>
                    <Text style={styles.text}>Novo Agendamento</Text>
                </TouchableOpacity> */}
                <TouchableOpacity style={styles.card} onPress={() => navigation.navigate("Historico")}>
                    <Image style={styles.image} source={relatorio}/>
                    <Text style={styles.text}>Histórico de Vacinas</Text>
                </TouchableOpacity>
                <TouchableOpacity style={styles.card} onPress={() => navigation.navigate("Registro")}>
                    <Image style={styles.image} source={vacinacao}/>
                    <Text style={styles.text}>Regristar Vacina</Text>
                </TouchableOpacity>
            </View>
        </View>
    );
}

const styles = StyleSheet.create({
    container : {
        flex: 1,
        padding: '5vw',
        backgroundColor: '#505050'
    },
    cards: {
        flexDirection: 'row',
        gap: '5vw',
        flexWrap: 'wrap',
    },
    card: {
        width: '42.5vw',
        height: '42.5vw',
        alignItems: 'center',
        justifyContent: 'center',
        gap: '30px',
        backgroundColor: '#E5E5E5',
        borderRadius: '20px',
        shadowColor: "#000",
        shadowOffset: {
            width: 0,
            height: 12,
        },
        shadowOpacity: 0.58,
        shadowRadius: 16.00,
        elevation: 24,
    },
    image: {
        width: '50px',
        height: '50px',
    },
    text: {
        fontWeight: 'bold',
        color: "#8a66fa",
    }
});