import React from 'react'
import { StyleSheet, View } from 'react-native';
import { ECharts } from "react-native-echarts-wrapper";

export default function Home (){
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
