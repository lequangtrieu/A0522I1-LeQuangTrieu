<%--<nav class="navbar-top navbar-default navbar-fixed-top nav-custom">--%>
<%--  <div class="container-fluid">--%>
<%--    <div class="navbar-header">--%>
<%--      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"--%>
<%--              aria-expanded="false" aria-controls="navbar">--%>
<%--        <span class="sr-only">Toggle navigation</span>--%>
<%--        <span class="icon-bar"></span>--%>
<%--        <span class="icon-bar"></span>--%>
<%--        <span class="icon-bar"></span>--%>
<%--      </button>--%>
<%--      <a class="navbar-brand" href="/static/product/list"><img src="/static/img/brand.png" width="50px" alt=""></a>--%>
<%--    </div>--%>
<%--  </div>--%>
<%--</nav>--%>

<nav class="navbar-top navbar-default navbar-fixed-top nav-custom">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
              aria-expanded="false" aria-controls="navbar">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="<%= request.getContextPath() %>/product/list">
        <img src="/static/img/brand.png" width="50px" alt="">
      </a>
    </div>

    <div id="navbar" class="navbar-collapse collapse">
      <ul class="nav navbar-nav" style="margin-left: 270px">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
             aria-expanded="false" style="font-size: 16px">
            Product
            <span class="caret"></span>
          </a>
          <ul class="dropdown-menu">
            <li><a href="<%= request.getContextPath() %>/product/list">List</a></li>
            <li><a href="<%= request.getContextPath() %>/product/create">Create</a></li>
          </ul>
        </li>
      </ul>
<%--      <form action="<%= request.getContextPath() %>/logout" method="post">--%>
<%--        <input type="submit" value="Log out" class="log-out">--%>
<%--      </form>--%>
      <ul class="nav navbar-nav navbar-right">
      </ul>
    </div>
  </div>
</nav>