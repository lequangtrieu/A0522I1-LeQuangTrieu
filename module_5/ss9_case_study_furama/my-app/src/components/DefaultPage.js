// import './App.css';
import React from 'react';
import { Helmet } from 'react-helmet-async';
import "bootstrap/dist/css/bootstrap.css";
import "../css/bootstrap.min.css"
import "../css/font-awesome.min.css"
import "../css/elegant-icons.css"
import "../css/flaticon.css"
// import "../css/owl.carousel.min.css"
import "../css/nice-select.css"
// import "../css/jquery-ui.min.css"
import "../css/magnific-popup.css"
import "../css/slicknav.min.css"
import "../css/style.css"

function App() {
    return (
        <>
            {/*<Helmet>*/}
            {/*    <meta charSet="UTF-8" />*/}
            {/*    <meta name="description" content="Sona Template" />*/}
            {/*    <meta name="keywords" content="Sona, unica, creative, html" />*/}
            {/*    <meta name="viewport" content="width=device-width, initial-scale=1.0" />*/}
            {/*    <meta httpEquiv="X-UA-Compatible" content="ie=edge" />*/}
            {/*    <title>Sona | Template</title>*/}

            {/*    /!* Các link CSS *!/*/}
            {/*    <link href="https://fonts.googleapis.com/css?family=Lora:400,700&display=swap" rel="stylesheet" />*/}
            {/*    <link href="https://fonts.googleapis.com/css?family=Cabin:400,500,600,700&display=swap" rel="stylesheet" />*/}
            {/*    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />*/}
            {/*    <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css" />*/}
            {/*    <link rel="stylesheet" href="css/elegant-icons.css" type="text/css" />*/}
            {/*    <link rel="stylesheet" href="css/flaticon.css" type="text/css" />*/}
            {/*    <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css" />*/}
            {/*    <link rel="stylesheet" href="css/nice-select.css" type="text/css" />*/}
            {/*    <link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css" />*/}
            {/*    <link rel="stylesheet" href="css/magnific-popup.css" type="text/css" />*/}
            {/*    <link rel="stylesheet" href="css/slicknav.min.css" type="text/css" />*/}
            {/*    <link rel="stylesheet" href="css/style.css" type="text/css" />*/}
            {/*</Helmet>*/}

            {/* Page Preloder */}
            <div id="preloder">
                <div className="loader"></div>
            </div>

            {/* Offcanvas Menu Section Begin */}
            <div className="offcanvas-menu-overlay"></div>
            <div className="canvas-open">
                <i className="icon_menu"></i>
            </div>
            <div className="offcanvas-menu-wrapper">
                <div className="canvas-close">
                    <i className="icon_close"></i>
                </div>
                <div className="search-icon  search-switch">
                    <i className="icon_search"></i>
                </div>
                <div className="header-configure-area">
                    <div className="language-option">
                        <img src="img/flag.jpg" alt="" />
                        <span>EN <i className="fa fa-angle-down"></i></span>
                        <div className="flag-dropdown">
                            <ul>
                                <li><a href="#">Zi</a></li>
                                <li><a href="#">Fr</a></li>
                            </ul>
                        </div>
                    </div>
                    <a href="#" className="bk-btn">Booking Now</a>
                </div>
                <nav className="mainmenu mobile-menu">
                    <ul>
                        <li className="active"><a href="./index.html">Home</a></li>
                        {/* Add other list items */}
                    </ul>
                </nav>
                {/* Add other elements */}
            </div>
            {/* Offcanvas Menu Section End */}

            <header className="header-section">
                <div className="top-nav">
                    <div className="container">
                        <div className="row">
                            <div className="col-lg-6">
                                <ul className="tn-left">
                                    <li><i className="fa fa-phone"></i> (12) 345 67890</li>
                                    <li><i className="fa fa-envelope"></i> info.colorlib@gmail.com</li>
                                </ul>
                            </div>
                            <div className="col-lg-6">
                                <div className="tn-right">
                                    <div className="top-social">
                                        <a href="#"><i className="fa fa-facebook"></i></a>
                                        <a href="#"><i className="fa fa-twitter"></i></a>
                                        <a href="#"><i className="fa fa-tripadvisor"></i></a>
                                        <a href="#"><i className="fa fa-instagram"></i></a>
                                    </div>
                                    <a href="#" className="bk-btn">Booking Now</a>
                                    <div className="language-option">
                                        <img src="img/flag.jpg" alt=""/>
                                            <span>EN <i className="fa fa-angle-down"></i></span>
                                            <div className="flag-dropdown">
                                                <ul>
                                                    <li><a href="#">Zi</a></li>
                                                    <li><a href="#">Fr</a></li>
                                                </ul>
                                            </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div className="menu-item">
                    <div className="container">
                        <div className="row">
                            <div className="col-lg-2">
                                <div className="logo">
                                    <a href="./index.html">
                                        <img src="img/furama_logo.png" alt=""/>
                                    </a>
                                </div>
                            </div>
                            <div className="col-lg-10">
                                <div className="nav-menu">
                                    <nav className="mainmenu">
                                        <ul>
                                            <li className="active"><a href="./index.html">Home</a></li>
                                            <li><a href="./rooms.html">Rooms</a></li>
                                            <li><a href="./about-us.html">About Us</a></li>
                                            <li><a href="./pages.html">Pages</a>
                                                <ul className="dropdown">
                                                    <li><a href="./room-details.html">Room Details</a></li>
                                                    <li><a href="./blog-details.html">Blog Details</a></li>
                                                    <li><a href="#">Family Room</a></li>
                                                    <li><a href="#">Premium Room</a></li>
                                                </ul>
                                            </li>
                                            <li><a href="./blog.html">News</a></li>
                                            <li><a href="./contact.html">Contact</a></li>
                                        </ul>
                                    </nav>
                                    <div className="nav-right search-switch">
                                        <i className="icon_search"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </header>

            <section className="hero-section">
                <div className="container">
                    <div className="row">
                        <div className="col-lg-6">
                            <div className="hero-text">
                                <h1>Sona A Luxury Hotel</h1>
                                <p>Here are the best hotel booking sites, including recommendations for international
                                    travel and for finding low-priced hotel rooms.</p>
                                <a href="#" className="primary-btn">Discover Now</a>
                            </div>
                        </div>
                        <div className="col-xl-4 col-lg-5 offset-xl-2 offset-lg-1">
                            <div className="booking-form">
                                <h3>Booking Your Hotel</h3>
                                <form action="#">
                                    <div className="check-date">
                                        <label htmlFor="date-in">Check In:</label>
                                        <input type="text" className="date-input" id="date-in"/>
                                            <i className="icon_calendar"></i>
                                    </div>
                                    <div className="check-date">
                                        <label htmlFor="date-out">Check Out:</label>
                                        <input type="text" className="date-input" id="date-out"/>
                                            <i className="icon_calendar"></i>
                                    </div>
                                    <div className="select-option">
                                        <label htmlFor="guest">Guests:</label>
                                        <select id="guest">
                                            <option value="">2 Adults</option>
                                            <option value="">3 Adults</option>
                                        </select>
                                    </div>
                                    <div className="select-option">
                                        <label htmlFor="room">Room:</label>
                                        <select id="room">
                                            <option value="">1 Room</option>
                                            <option value="">2 Room</option>
                                        </select>
                                    </div>
                                    <button type="submit">Check Availability</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="hero-slider owl-carousel">
                    <div class="hs-item set-bg" data-setbg="img/hero/hero-1.jpg"></div>
                    <div class="hs-item set-bg" data-setbg="img/hero/hero-2.jpg"></div>
                    <div class="hs-item set-bg" data-setbg="img/hero/hero-3.jpg"></div>
                </div>
            </section>



            <section className="aboutus-section spad">
                <div className="container">
                    <div className="row">
                        <div className="col-lg-6">
                            <div className="about-text">
                                <div className="section-title">
                                    <span>About Us</span>
                                    <h2>Intercontinental LA <br />Westlake Hotel</h2>
                                </div>
                                <p className="f-para">Sona.com is a leading online accommodation site. We’re passionate about
                                    travel. Every day, we inspire and reach millions of travelers across 90 local websites in 41
                                    languages.</p>
                                <p className="s-para">So when it comes to booking the perfect hotel, vacation rental, resort,
                                    apartment, guest house, or tree house, we’ve got you covered.</p>
                                <a href="#" className="primary-btn about-btn">Read More</a>
                            </div>
                        </div>
                        <div className="col-lg-6">
                            <div className="about-pic">
                                <div className="row">
                                    <div className="col-sm-6">
                                        <img src="img/about/about-1.jpg" alt=""/>
                                    </div>
                                    <div className="col-sm-6">
                                        <img src="img/about/about-2.jpg" alt=""/>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>


            <footer className="footer-section">
                <div className="container">
                    <div className="footer-text">
                        <div className="row">
                            <div className="col-lg-4">
                                <div className="ft-about">
                                    <div className="logo">
                                        <a href="#">
                                            <img src="img/footer-logo.png" alt=""/>
                                        </a>
                                    </div>
                                    <p>We inspire and reach millions of travelers<br /> across 90 local websites</p>
                                    <div className="fa-social">
                                        <a href="#"><i className="fa fa-facebook"></i></a>
                                        <a href="#"><i className="fa fa-twitter"></i></a>
                                        <a href="#"><i className="fa fa-tripadvisor"></i></a>
                                        <a href="#"><i className="fa fa-instagram"></i></a>
                                        <a href="#"><i className="fa fa-youtube-play"></i></a>
                                    </div>
                                </div>
                            </div>
                            <div className="col-lg-3 offset-lg-1">
                                <div className="ft-contact">
                                    <h6>Contact Us</h6>
                                    <ul>
                                        <li>(12) 345 67890</li>
                                        <li>info.colorlib@gmail.com</li>
                                        <li>856 Cordia Extension Apt. 356, Lake, United State</li>
                                    </ul>
                                </div>
                            </div>
                            <div className="col-lg-3 offset-lg-1">
                                <div className="ft-newslatter">
                                    <h6>New latest</h6>
                                    <p>Get the latest updates and offers.</p>
                                    <form action="#" className="fn-form">
                                        <input type="text" placeholder="Email"/>
                                            <button type="submit"><i className="fa fa-send"></i></button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div className="copyright-option">
                    <div className="container">
                        <div className="row">
                            <div className="col-lg-7">
                                <ul>
                                    <li><a href="#">Contact</a></li>
                                    <li><a href="#">Terms of use</a></li>
                                    <li><a href="#">Privacy</a></li>
                                    <li><a href="#">Environmental Policy</a></li>
                                </ul>
                            </div>
                            <div className="col-lg-5">
                                <div class="co-text"><p>
                                    Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                                </p></div>
                            </div>
                        </div>
                    </div>
                </div>
            </footer>

            <div className="search-model">
                <div className="h-100 d-flex align-items-center justify-content-center">
                    <div className="search-close-switch"><i className="icon_close"></i></div>
                    <form className="search-model-form">
                        <input type="text" id="search-input" placeholder="Search here....."/>
                    </form>
                </div>
            </div>

            {/*<Helmet>*/}
            {/*    <script src="https://code.jquery.com/jquery-3.3.1.min.js" />*/}
            {/*    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.bundle.min.js" />*/}
            {/*    /!* Thêm các script khác tại đây *!/*/}
            {/*</Helmet>*/}

        </>
    );
}

export default App;
