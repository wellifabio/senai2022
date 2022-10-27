import { useState } from 'react';
import { View, Text, Button } from 'react-native';
import { RadioButton } from 'react-native-paper';
import AsyncStorage from '@react-native-async-storage/async-storage';

export default function Quest2({navigation, route}) {
    const [checked, setChecked] = useState("first");

    const storeData = async (value) => {
        try {
            const data = await AsyncStorage.getItem('resp');
            
            await AsyncStorage.setItem('resp', data + ";" + value);
        } catch (e) {
            console.log(e);
          // saving error
        }
    }


    return(
        <View>
            <Text>2 + 2 = ?</Text>
            <View style={{flexDirection: 'row', alignItems: 'center'}}>
                <RadioButton
                    value="first"
                    status={ checked === 'first' ? 'checked' : 'unchecked' }
                    onPress={() => setChecked('first')}
                />
                <Text>1</Text>
            </View>
            <View style={{flexDirection: 'row', alignItems: 'center'}}>
                <RadioButton
                    value="second"
                    status={ checked === 'second' ? 'checked' : 'unchecked' }
                    onPress={() => setChecked('second')}
                />
                <Text>2</Text>
            </View>
            <View style={{flexDirection: 'row', alignItems: 'center'}}>
                <RadioButton
                    value="second"
                    status={ checked === 'third' ? 'checked' : 'unchecked' }
                    onPress={() => setChecked('third')}
                />
                <Text>3</Text>
            </View>
            <View style={{flexDirection: 'row', alignItems: 'center'}}>
                <RadioButton
                    value="second"
                    status={ checked === 'fourth' ? 'checked' : 'unchecked' }
                    onPress={() => setChecked('fourth')}
                />
                <Text>4</Text>
            </View>
            <Button title="Proximo" onPress={() => {
                let ponto = route.params.score;
                
                if(checked === 'fourth') ponto++;

                storeData(checked);

                navigation.navigate("q3", {"score":ponto});
            }}/>
        </View>
    )
}