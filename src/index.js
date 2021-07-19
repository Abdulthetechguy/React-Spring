import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
//import './built/bundle.js'
import App from './App';

ReactDOM.render(
  
    	<App loggedInManager={document.getElementById('managername').innerHTML } />
	
  ,
  document.getElementById('react')
);

