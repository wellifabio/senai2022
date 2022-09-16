import { View, Text } from 'react-native';

export default function Descricao({ route }) {
    var {descricao} = route.params;

    return(
        <View>
            <Text>Marca : {descricao.marca}</Text>
            <Text>Sabor : {descricao.sabor}</Text>
        </View>
    )
}