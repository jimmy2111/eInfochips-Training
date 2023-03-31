import logo from './logo.svg';
import './App.css';
import Sample from './democomponent/Sample';
import Example from './democomponent/Example';
import Demoevent from './Demoevent';
import ArrayDemo from './Arraydemo';
import Userregistration from './Userregistration';
import { Link, Route, Routes } from 'react-router-dom';
import Home from './Home';
import Arraydemo from './Arraydemo';
import { Userformikform } from './Userformikform';

function App() {
  return (
    <div className="App">
      {/* <h1>Welcome To React</h1>
      <Sample name="Jimmy" className="M1"><p>This is paragraph</p></Sample>
      <Sample name="Sachin" className="M2"/>
      <Sample name="Virat" className="M3"/>
      <Example/>
      <Demoevent/>
      <ArrayDemo/>
      <Userregistration/> */}
      <Link to="/">Home</Link>
      <Link to="/arrays">Arrays</Link>
      <Link to="/register">Registration</Link>
      <Link to="/formikregister">FormikRegistration</Link>
      <Routes>
        
        <Route path="/" element={<Home/>}/>
        <Route path="/arrays" element={<Arraydemo/>}/>
        <Route path="/register" element={<Userregistration/>}/>
        <Route path="/formikregister" element={<Userformikform/>}/>
      </Routes>
    </div>
  );
}

export default App;
