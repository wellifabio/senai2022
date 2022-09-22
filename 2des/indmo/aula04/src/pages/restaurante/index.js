import { View, Text, Image } from 'react-native';

import styles from './style'

export default function Restaurante({route}) {
    const { info } = route.params;

    return(
        <View>
            <Image style={styles.image} source={{uri:info.imagem}} />
            <Text>{info.endereco}</Text>
            <Text>{info.telefone}</Text>
        </View>
    )
}