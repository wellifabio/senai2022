import {TouchableOpacity, Text} from 'react-native';

import styles from './style';

export default function ButtonCadastrar(props) {
    const { value, onPress } = props;

    return(
        <TouchableOpacity style={styles.button} onPress={()=>{onPress()}}>
            <Text style={styles.text}>{value}</Text>
        </TouchableOpacity>
    )
}