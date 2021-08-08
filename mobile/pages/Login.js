import React from 'react';
import { View, StyleSheet,SafeAreaView } from 'react-native';
import { Button, Image, Text } from 'react-native-elements';

const uri ='https://rne.gallerycdn.vsassets.io/extensions/rne/snippets/1.2.1/1622009552732/Microsoft.VisualStudio.Services.Icons.Default';

const Login = ({ navigation }) => (
  <SafeAreaView style={styles.box}>
    <Image
      source={{
        uri,
      }}
      style={styles.image}
    />
    <Text h4 style={styles.text}>
      Cross Platform React Native UI Toolkit
    </Text>
    <Button title="Getting Started" 
            onPress={() => navigation.navigate('Home')}    
    />
  </SafeAreaView>
);

export default Login;

const styles = StyleSheet.create({
  box: {
    display: 'flex',
    alignItems: 'center',
    justifyContent: 'space-between',
    flexGrow: 1,
    padding: 20,
  },
  image: { width: 200, height: 200 },
  text: { textAlign: 'center', fontWeight: 'bold' },
});


