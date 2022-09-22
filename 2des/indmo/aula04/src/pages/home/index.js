import { ScrollView, View, Text, TouchableOpacity } from 'react-native';
import ButtonCadastrar from '../../components/buttonCadastrar';

import styles from './style'

export default function Home({ navigation }) {
    const data = [
        {
            "nome": "Restaurante 01",
            "avaliacao": 3.5,
            "info": {
                "imagem":"https://s2.glbimg.com/TYVOVw7XXf6DwUashZWbGR3eZoY=/512x320/smart/e.glbimg.com/og/ed/f/original/2021/09/02/predio-tombado-de-1940-em-sao-paulo-recebe-novo-restaurante-italiano_5.jpg",
                "endereco":"Rua das Avenidas, 123",
                "telefone":"(11) 4859-6215"
            }
        },
        {
            "nome": "Restaurante 02",
            "avaliacao": 4.5,
            "info": {
                "imagem":"https://cozil.com.br/wp-content/uploads/2019/05/restaurant-237060_1920-1920x960.jpg",
                "endereco":"Rua das Avenidas, 123",
                "telefone":"(11) 4859-6215"
            }
        },
        {
            "nome": "Restaurante 03",
            "avaliacao": 2.5,
            "info": {
                "imagem":"https://www.peru.travel/Contenido/Noticia/Imagen/pt/1464/1.0/Principal/central-restaurante-barranco.jpg",
                "endereco":"Rua das Avenidas, 123",
                "telefone":"(11) 4859-6215"
            }
        }
    ]

    const funcao = () => {
        console.log("Um texto teste");
    }

    return (
        <ScrollView style={styles.container}>
            {
                data.map((item, index) => {
                    return(
                        <TouchableOpacity style={styles.item} key={index} onPress={() =>{ navigation.navigate("Restaurante", {"info":item.info}) }}>
                            <Text style={styles.title}>{item.nome}</Text>
                            <Text>Nota : {item.avaliacao}</Text>
                        </TouchableOpacity>
                    )
                })
            }
            <ButtonCadastrar value="Cadastro" onPress={funcao}/>
        </ScrollView>
    );
}