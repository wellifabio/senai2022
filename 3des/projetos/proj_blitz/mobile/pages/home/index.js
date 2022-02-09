import React, { useState, useEffect } from 'react';
import { View, Text, Dimensions, StyleSheet, ToastAndroid, Image } from 'react-native';

import * as Location from 'expo-location';

import MapView, { Marker } from 'react-native-maps';

export default function Home() {
    const [marcadores, setMarcadores] = useState([]);
    const [coord, setCoord] = useState({
        latitude: 37.78825,
        longitude: -122.4324,
    })

    useEffect(async () => {
        let { status } = await Location.requestForegroundPermissionsAsync();

        if (status !== 'granted') {
            ToastAndroid.show('Localização negada', ToastAndroid.SHORT);
        }else {
            let location = await Location.getCurrentPositionAsync({ accuracy: Location.Accuracy.BestForNavigation});

            setCoord({
                latitude: location.coords.latitude,
                longitude: location.coords.longitude
            });

            let posi = {
                coordenadas: location.coords.latitude + ',' + location.coords.longitude,
                alertum: {
                    tipo: "marker",
                    descricao: "Minha Localização",
                },                
            }

            let arr = [];

            arr.push(posi);

            setMarcadores(arr);
        }
    }, []);

    return(
        <View style={styles.container}>
            <MapView 
            style={styles.map} 
            region={{
                ...coord,
                latitudeDelta: 0.0065,
                longitudeDelta: 0.00065,
            }}>
                {
                    marcadores.map((marcador, index) => {
                        let loc = marcador.coordenadas.split(',');
                        let teste = "marker";
                        let image = require(`../../assets/app/${teste}.png`);
                        return(
                            <Marker
                                key={index}
                                coordinate={{
                                    latitude: Number(loc[0]),
                                    longitude: Number(loc[1]),
                                }}
                                title={marcador.alertum.tipo}
                                description={""}
                            >
                                <Image source={image} style={styles.marcador} />
                            </Marker>
                        )
                    })
                }                
            </MapView>
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
    marcador: {
        width: 32,
        height: 32,
    }
});