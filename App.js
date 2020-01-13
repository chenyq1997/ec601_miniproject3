import React from 'react';
import { StyleSheet, Text, View, Button } from 'react-native';

export default class App extends React.Component {
  state = {
    count: 0
  }

  render() {
    return (
      <View style={styles.container}>
        <Text style={{fontSize:40}}>{this.state.count}</Text>
		
		<Button
		title="Click"
		onPress={()=> this.setState({count: this.state.count + 1})}
		/>
		
		<Button
		title="Reset"
		onPress={()=> this.setState({count: this.state.count = 0})}
		/>
      </View>
    );
  }
}

const styles = StyleSheet.create({

  container: {
	flex: 1,
	backgroundColor: '#fff',
	alignItems: 'center',
	justifyContent: 'center',
  },

});
