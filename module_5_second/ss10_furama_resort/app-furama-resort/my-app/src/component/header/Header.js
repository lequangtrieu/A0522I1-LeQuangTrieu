import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Navbar, Nav, Container, Button } from 'react-bootstrap';
import '../header/Header.css';
import {Link, NavLink} from "react-router-dom"; // Import file CSS

const Header = () => {
    // const handleClick = (e) => {
    //     e.preventDefault()
    // }
    return (
        <Navbar expand="lg" bg="light" variant="light" sticky="top">
            <Container>
                {/*<Navbar.Brand href="/home" onClick={handleClick} className="navbar-brand">BI BEO RESORT</Navbar.Brand>*/}
                <Link to="/" className="navbar-brand">BI BEO RESORT</Link>
                <Navbar.Toggle aria-controls="basic-navbar-nav" />
                <Navbar.Collapse id="basic-navbar-nav">
                    <Nav className="ms-auto">
                        <NavLink to="/" className="nav-link" activeClassName="active">Service</NavLink>
                        <NavLink to="/customers" className="nav-link" activeClassName="active">Customer</NavLink>
                        <NavLink to="/contacts" className="nav-link" activeClassName="active">Contact</NavLink>
                        {/* Add more Nav.Link components for additional pages */}
                    </Nav>
                    <Nav className="me-auto">
                        {/* Add additional Nav components or dropdown menus */}
                    </Nav>
                    <Button variant="outline-primary" className="btn-login">Login</Button>
                    <Button variant="primary" className="btn-signup">Sign Up</Button>
                    {/* Additional buttons for user authentication */}
                </Navbar.Collapse>
            </Container>
        </Navbar>
    );
};

export default Header;