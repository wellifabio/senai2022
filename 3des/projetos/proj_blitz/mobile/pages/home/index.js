import React, { useState, useEffect } from 'react';
import { View, Text, Dimensions, StyleSheet, ToastAndroid } from 'react-native';

import * as Location from 'expo-location';

import MapView from 'react-native-maps';

export default function Home() {
    const [coord, setCoord] = useState({
        latitude: 37.78825,
        longitude: -122.4324,
    })

    useEffect(async () => {
        let { status } = await Location.requestForegroundPermissionsAsync();

        if (status !== 'granted') {
            ToastAndroid.show('Localização negada', ToastAndroid.SHORT);
        }else {
            let location = await Location.getCurrentPositionAsync({});

            console.log(location);
        }
    }, []);

    return(
        <View style={styles.container}>
            <MapView 
            style={styles.map} 
            region={{
                ...coord,
                latitudeDelta: 0.05,
                longitudeDelta: 0.05,
            }}/>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
      flex: 1,
      backgroundColor: '#fff',
      alignItems: 'center',
      justifyContent: 'center',
    },
    map: {
      width: Dimensions.get('window').width,
      height: Dimensions.get('window').height,
    },
});