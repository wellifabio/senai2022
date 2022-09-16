import * as React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

import Home from './src/pages/Home/index.js';
import Segunda from './src/pages/Segunda/index.js';
import Descricao from './src/pages/Descricao/index.js';

const Stack = createNativeStackNavigator();

export default function App() {
  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name="Segunda" component={Segunda}/>
        <Stack.Screen name="Home" component={Home} />
        <Stack.Screen name="Descricao" component={Descricao}/>
      </Stack.Navigator>
    </NavigationContainer>
  );
}