<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/5/2023
  Time: 9:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="includes/import-head.jsp"/>
<body>
<jsp:include page="includes/pre-loader.jsp"/>
<jsp:include page="includes/canvas-menu.jsp"/>
<jsp:include page="includes/header.jsp"/>

<!-- Hero Section Begin -->
<section class="hero-section">
  <div class="container">
    <div class="row">
      <div class="col-lg-6">
        <div class="hero-text">
          <h1>BIBEO A Luxury Resort</h1>
          <p>Here are the best hotel booking sites, including recommendations for international
            travel and for finding low-priced hotel rooms.</p>
          <a href="#" class="primary-btn">Discover Now</a>
        </div>
      </div>
      <div class="col-xl-4 col-lg-5 offset-xl-2 offset-lg-1">
        <div class="booking-form">
          <h3>Booking Your Hotel</h3>
          <form action="#">
            <div class="check-date">
              <label for="date-in">Check In:</label>
              <input type="text" class="date-input" id="date-in">
              <i class="icon_calendar"></i>
            </div>
            <div class="check-date">
              <label for="date-out">Check Out:</label>
              <input type="text" class="date-input" id="date-out">
              <i class="icon_calendar"></i>
            </div>
            <div class="select-option">
              <label for="guest">Guests:</label>
              <select id="guest">
                <option value="">2 Adults</option>
                <option value="">3 Adults</option>
              </select>
            </div>
            <div class="select-option">
              <label for="room">Room:</label>
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
    <div class="hs-item set-bg" data-setbg="../static/img/bibeo.jpg"></div>
    <div class="hs-item set-bg" data-setbg="../static/img/hero/hero-1.jpg"></div>
    <div class="hs-item set-bg" data-setbg="../static/img/hero/hero-2.jpg"></div>
    <div class="hs-item set-bg" data-setbg="../static/img/hero/hero-3.jpg"></div>
  </div>
</section>
<!-- Hero Section End -->

<!-- About Us Section Begin -->
<section class="aboutus-section spad">
  <div class="container">
    <div class="row">
      <div class="col-lg-6">
        <div class="about-text">
          <div class="section-title">
            <span>About Us</span>
            <h2>Intercontinental LA <br />Westlake Hotel</h2>
          </div>
          <p class="f-para">Sona.com is a leading online accommodation site. We’re passionate about
            travel. Every day, we inspire and reach millions of travelers across 90 local websites in 41
            languages.</p>
          <p class="s-para">So when it comes to booking the perfect hotel, vacation rental, resort,
            apartment, guest house, or tree house, we’ve got you covered.</p>
          <a href="#" class="primary-btn about-btn">Read More</a>
        </div>
      </div>
      <div class="col-lg-6">
        <div class="about-pic">
          <div class="row">
            <div class="col-sm-6">
              <img src="img/about/about-1.jpg" alt="">
            </div>
            <div class="col-sm-6">
              <img src="img/about/about-2.jpg" alt="">
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
<!-- About Us Section End -->

<jsp:include page="includes/footer.jsp"/>

<!-- Search model Begin -->
<div class="search-model">
  <div class="h-100 d-flex align-items-center justify-content-center">
    <div class="search-close-switch"><i class="icon_close"></i></div>
    <form class="search-model-form">
      <input type="text" id="search-input" placeholder="Search here.....">
    </form>
  </div>
</div>
<!-- Search model end -->


<jsp:include page="includes/import-script.jsp"/>
</body>
</html>
