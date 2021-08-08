import { StatusBar } from 'expo-status-bar';
import React from 'react';

import { StyleSheet, Text, View } from 'react-native';
import { DefaultTheme, Provider as PaperProvider } from 'react-native-paper';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import Home from './pages/Home';
import Login from './pages/Login';

const Stack = createNativeStackNavigator();

 function Main (){
      return <NavigationContainer>
               <Stack.Navigator
                screenOptions={{
                  headerShown: false
                }}
               >
                <Stack.Screen name="Login" component={Login} />
                <Stack.Screen name="Home" component={Home} />
               </Stack.Navigator>
            </NavigationContainer>;
 
}


const theme = {
  ...DefaultTheme,
  roundness: 2,
  colors: {
    ...DefaultTheme.colors,
    primary: '#3498db',
    accent: '#f1c40f',
  },
};

export default function App(){
  return(
      <PaperProvider theme={theme}>
          <Main />
      </PaperProvider>)
}




