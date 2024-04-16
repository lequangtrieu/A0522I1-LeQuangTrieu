import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Container } from 'react-bootstrap';
import '../footer/Footer.css';

const Footer = () => {
    return (
        <footer className="footer">
            <Container>
                <div className="footer-content">
                    <div className="footer-section">
                        <h4>BI BEO RESORT</h4>
                        <p>Some text about the resort and its services.</p>
                        <div className="social-icons">
                            <a href="#" target="_blank" rel="noopener noreferrer">
                                <i className="fab fa-facebook-f"></i>
                            </a>
                            <a href="#" target="_blank" rel="noopener noreferrer">
                                <i className="fab fa-twitter"></i>
                            </a>
                            <a href="#" target="_blank" rel="noopener noreferrer">
                                <i className="fab fa-instagram"></i>
                            </a>
                        </div>
                    </div>
                    <div className="footer-section">
                        <h4>Quick Links</h4>
                        <ul>
                            <li><a href="#">Home</a></li>
                            <li><a href="#">Rooms</a></li>
                            <li><a href="#">Amenities</a></li>
                            {/* Add more quick links */}
                        </ul>
                    </div>
                    <div className="footer-section">
                        <h4>Contact Us</h4>
                        <p>123 Resort St, City, Country</p>
                        <p>Email: info@resort.com</p>
                        <p>Phone: +1234567890</p>
                    </div>
                </div>
            </Container>
        </footer>
    );
};

export default Footer;
