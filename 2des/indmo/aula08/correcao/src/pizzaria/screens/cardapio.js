import { View, Text, TouchableOpacity, Image, Button } from 'react-native';
import AsyncStorage from '@react-native-async-storage/async-storage';

const addIcon = require('../../../assets/more.png');

export default function Cardapio({navigation}) {
    const data = [
        {
            "nome": "Pizza de Muçarela",
            "descricao": "massa tradicional da casa, molho de tomate, muita mussarela, tomate fatiado, organo",
            "preco": "R$50",
            "imagem": "https://s2.glbimg.com/Y3m2i25amIvN85VhN6iXEzN1Lds=/0x0:960x640/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_1f540e0b94d8437dbbc39d567a1dee68/internal_photos/bs/2021/3/k/BwB0YgQOynPsY4EiIG0g/pizza-de-mucarela.jpg"
        },
        {
            "nome": "calabresa",
            "descricao": "massa tradicional da casa, molho de tomate, muita calabresa e opçao de cebola picata ou catupiry",
            "preco": "R$50",
            "imagem": "http://folhadomate.com/wp-content/uploads/2016/09/48328-receita_pizza.jpg",
        },
        {
            "nome": "frango com catupiry",
            "descricao": "massa tradicional da casa, molho de tomate, frango desfiado bem temperado com queijo ralado, uma generosa camada de catupiry",
            "preco": "R$50",
            "imagem": "https://www.comidaereceitas.com.br/img/sizeswp/1200x675/2007/12/Pizza_frango_catupiryy.jpg",
        },
        {
            "nome": "queijo com brocolis",
            "descricao": "massa tradicional da casa, molho de tomate, creme de muçarela com brocolis bem temperado",
            "preco": "R$50",
            "imagem": "https://static.wixstatic.com/media/953e7f_10d1b5c015404487815c6001313c8e22~mv2.jpg/v1/fill/w_548,h_328,al_c,q_80,usm_0.66_1.00_0.01,enc_auto/pizz%2043.jpg",
        },
        {
            "nome": "peito de peru",
            "descricao": "massa tradicional da casa, molho de tomate, muçarela, peito de peru",
            "preco": "R$50",
            "imagem": "https://atm-accounts.s3-sa-east-1.amazonaws.com/50/files/thumbs/ha7itmzvdasrluqbidtd-large.jpg",
        }
    ]

    var carrin = new Array();

    const storeData = async (value) => {
        try {
          await AsyncStorage.setItem('carrinho', JSON.stringify(value));
        } catch (e) {
          // saving error
        }
    }

    return (
        <View>
            {
                data.map((pizza, indice) => {
                    return(
                        <View style={{width: '90vw', flexDirection: 'row', alignItems: 'center', marginTop: '10px'}} key={indice}>
                            <Image source={{uri:pizza.imagem}} style={{width: '70px', height: '70px', borderRadius: '50%'}}/>
                            <View style={{width: '80%'}}>
                                <Text>{pizza.nome}</Text>
                                <Text>{pizza.descricao}</Text>
                            </View>
                            <TouchableOpacity onPress={() => {
                                carrin.push(pizza);
                                storeData(carrin);
                            }}>
                                <Image source={addIcon} style={{width: '40px', height: '40px'}}/>
                            </TouchableOpacity>
                        </View>
                    )
                })
            }
            <Button title="Carrinho" onPress={() => {navigation.navigate("Carrinho")}}/>
        </View>
    )
}