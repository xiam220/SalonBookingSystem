import logo from './logo.svg';
import './App.css';
import React from "react";
import NavigationBar from './components/NavigationBar'
import LoadingIndicator from './components/LoadingIndicator'
import AppNotification from './components/AppNotification'

import ChooseService from './components/ChooseService'
import ServiceCard from './components/ServiceCard'

function App(){
  return(
    <main>
      <NavigationBar/>
      {/* <LoadingIndicator/>
      <AppNotification/> */}
      <ChooseService/>
      {/* <ServiceCard/> */}
    </main>
  );
}

export default App