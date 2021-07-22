import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
//import './built/bundle.js'
import App from './App';

if(document.getElementById('managername')!=null){
  ReactDOM.render(
    
        <App loggedInManager={document.getElementById('managername').innerHTML } />
    
    ,
    document.getElementById('react')
  );  
 }
 else {
   ReactDOM.render(
    
        <App loggedInManager="" />
    
    ,
    document.getElementById('react')
  );  
 }

