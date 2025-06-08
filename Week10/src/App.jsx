import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import Signup from './components/Signup';
import Login from './components/Login';
import Dashboard from './components/Dashboard';
import './App.css'; // Import the CSS file

function App() {
  return (
    <Router>
      <div className="container">
        <nav className="navbar">
          <ul className="navbar-nav">
            <li className="nav-item">
              <Link to="/Signup" className="nav-link">Signup</Link>
            </li>
            <li className="nav-item">
              <Link to="/Login" className="nav-link">Login</Link>
            </li>
            <li className="nav-item">
              <Link to="/dashboard" className="nav-link">Dashboard</Link>
            </li>
          </ul>
        </nav>

        <div className="welcome-message">
          <h1 style={{ color:'#b8a1a1'}}>Welcome to Student Management System</h1>
          <p>This is a platform to manage students' information efficiently.</p>
        </div>

        <Routes>
          <Route path="/Signup" element={<Signup />} />
          <Route path="/Login" element={<Login />} />
          <Route path="/dashboard" element={<Dashboard />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
