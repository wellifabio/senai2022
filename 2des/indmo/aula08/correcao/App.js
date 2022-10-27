import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

// CORRECAO QUIZ
// import Quest1 from './src/quiz/screens/quest1';
// import Quest2 from './src/quiz/screens/quest2';
// import Quest3 from './src/quiz/screens/quest3';
// import Quest4 from './src/quiz/screens/quest4';
// import Quest5 from './src/quiz/screens/quest5';
// import Final from './src/quiz/screens/final';
// FIM QUIZ

//CORRECAO PIZZARIA
// import Cardapio from './src/pizzaria/screens/cardapio';
// import Carrinho from './src/pizzaria/screens/carrinho';

//CORRECAO COMPROMISSOS
// import Home from './src/compromissos/screens/home'
// import Descricao from './src/compromissos/screens/descricao'

//CORRECAO CHAMADOS
import Login from './src/chamados/screens/login';
import Lista from './src/chamados/screens/lista';

const Stack = createNativeStackNavigator();

export default function App() {
  return (
    <NavigationContainer>
      {/*
      CORRECAO QUIZ 
      <Stack.Navigator>
        <Stack.Screen name="q1" component={Quest1} />
        <Stack.Screen name="q2" component={Quest2} />
        <Stack.Screen name="q3" component={Quest3} />
        <Stack.Screen name="q4" component={Quest4} />
        <Stack.Screen name="q5" component={Quest5} />
        <Stack.Screen name="final" component={Final} />
      </Stack.Navigator> 
      */}
      
      {/* 
      CORRECAO PIZZARIA 
      <Stack.Navigator>
        <Stack.Screen name="Cardapio" component={Cardapio} />
        <Stack.Screen name="Carrinho" component={Carrinho} />
      </Stack.Navigator> 
      */}
      {/* 
      CORRECAO COMPROMISSOS
      <Stack.Navigator>
        <Stack.Screen name="Home" component={Home} />
        <Stack.Screen name="Descricao" component={Descricao} />
      </Stack.Navigator>  
      */}
      {/*
      CORRECAO CHAMADOS 
      
      */}
      <Stack.Navigator>
        <Stack.Screen name="Login" component={Login} />
        <Stack.Screen name="Lista" component={Lista} />
      </Stack.Navigator>  
    </NavigationContainer>
  );
}
