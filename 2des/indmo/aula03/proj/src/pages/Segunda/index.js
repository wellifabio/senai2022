import { View, Text, Button, TouchableOpacity } from 'react-native';

export default function Segunda({ navigation }) {
    const produtos = [
        {
            "nomeprod":"Detergente",
            "preco":1.75,
            "descricao":{
                "marca":"Ype",
                "sabor":"Maça"
            }
        },
        {
            "nomeprod":"Bucha",
            "preco":6.50,
            "descricao": {
                "marca":"Assolam",
                "sabor":"Morte"
            }
        },
        {
            "nomeprod":"Sabão em Barra",
            "preco":3.50,
            "descricao":{
                "marca":"Ype",
                "sabor":"Coco"
            }
        }
    ];
    return(
        <View>
            {
                produtos.map((produto, indice) => {
                    return(
                        <TouchableOpacity onPress={() => {navigation.navigate("Descricao", { "descricao":produto.descricao} )}}>
                            <Text>{produto.nomeprod}</Text>
                            <Text>R$ {produto.preco}</Text>
                        </TouchableOpacity>
                    )
                })
            }
        </View>
    )
}