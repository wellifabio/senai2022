import {View, Text} from 'react-native';

export default function Descricao({ route }) {
    const { id } = route.params;

    const data = [
        {
            "id_compromisso": 1,
            "descricao":"- Entrega da Atividade.\n- Matéria Nova.",
            "observacoes":"",
        },
        {
            "id_compromisso": 4,
            "descricao":"",
            "observacoes":"Não esquecer a carteirinha !!!",
        },
        {
            "id_compromisso": 3,
            "descricao":"- Pão.\n- Presunto.\n- Queijo.",
            "observacoes":"Ver se o sabão está em promoção e levar uma caixa.",
        },
        {
            "id_compromisso": 2,
            "descricao":"Consulta de retorno.",
            "observacoes":"Levar os exames.",
        },
    ]
    

    return (
        <View>
            {
                data.map((desc, indice) => {
                    if(desc.id_compromisso === id) {
                        return(
                            <View key={indice}>
                                <Text>Descricao</Text>
                                <Text>{desc.descricao}</Text>
                                <Text>Observacoes</Text>
                                <Text>{desc.observacoes}</Text>
                            </View>
                        )
                    }
                })
            }
        </View>
    )
}