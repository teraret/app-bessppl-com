import { StatusBar } from 'expo-status-bar';
import React, { Component } from 'react';

import { StyleSheet, Text, View } from 'react-native';
import { DefaultTheme, Provider as PaperProvider } from 'react-native-paper';
import { ECharts } from "react-native-echarts-wrapper";

 function Main (){
  let option = {
      xAxis: {
          type: 'category',
          data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
      },
      yAxis: {
          type: 'value'
      },
      series: [{
          data: [820, 932, 901, 934, 1290, 1330, 1320],
          type: 'line'
      }]
  };


      return (
          <View style={styles.chartContainer}>
              <ECharts option={option}></ECharts>
          </View>
      );
 
}

const styles = StyleSheet.create({
  chartContainer: {
      flex: 1,
  },
});


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




