import React from 'react';
import ReactDOM from 'react-dom';
import './index.css'; // You can add this if you have CSS for styling
import App from './app'; // App.js will be your main app component

// Render the app into the div with id="root" in index.html
ReactDOM.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);
