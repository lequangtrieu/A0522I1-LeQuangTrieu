import React from 'react';
import {Navbar, Nav, Container, Button} from 'react-bootstrap';
import '../header/Header.css';
import {Link, NavLink} from "react-router-dom"; // Import file CSS

const Header = () => {
    return (
        <Navbar expand="lg" bg="light" variant="light" sticky="top">
            <Container>
                <Link to="/" className="navbar-brand">PRODUCT MANAGEMENT</Link>
                <Navbar.Toggle aria-controls="basic-navbar-nav" />
                <Navbar.Collapse id="basic-navbar-nav">
                    <Nav className="ms-auto">
                        <NavLink to="/" className="nav-link" activeClassName="active">Home</NavLink>
                        <NavLink to="/create" className="nav-link" activeClassName="active">Create Product</NavLink>
                        <NavLink to="/update" className="nav-link" activeClassName="active">Update Product</NavLink>
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