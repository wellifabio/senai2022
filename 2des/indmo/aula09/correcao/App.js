import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

import Login from './src/screens/login';
import Home from './src/screens/home';
import Historico from './src/screens/historico';
import Registro from './src/screens/registro';

const Stack = createNativeStackNavigator();

export default function App() {
  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name="Login" component={Login} />
        <Stack.Screen name="Home" component={Home} />
        <Stack.Screen name="Registro" component={Registro} />
        <Stack.Screen name="Historico" component={Historico} /> 
      </Stack.Navigator>
    </NavigationContainer>
  );
}