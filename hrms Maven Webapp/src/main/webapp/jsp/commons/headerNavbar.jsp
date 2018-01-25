<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- Modal -->
  <div class="modal fade" id="nav-search" tabindex="-1" role="dialog" aria-labelledby="searchHeader" style="margin-top:200px;">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
          <h4 class="modal-title" id="searchHeader">搜索结果</h4>
        </div>
        <div class="modal-body transition-loader-container" >
          <!-- loading -->
          <div class="transition-loader">
            <div class="transition-loader-inner">
              <label></label>
              <label></label>
              <label></label>
              <label></label>
              <label></label>
              <label></label>
            </div>
          </div>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal"> 取 消 </button>
        </div>
      </div>
    </div>
  </div>
  <!-- login model -->
  <c:if test="${currStaff == null}">
	  <div class="modal fade" id="login" tabindex="-1" role="dialog" aria-labelledby="logintitle" style="margin-top:200px;">
	    <form action="/basic/staffloginAjax.do" method="post" >
	    <div class="modal-dialog" role="document">
	      <div class="modal-content">
	        <div class="modal-header">
	          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	          <h4 class="modal-title text-center" id="logintitle">员工登录</h4>
	        </div>
	        <div class="modal-body container" style="max-width:90%;padding:10px;">
	          <div class="alert alert-info text-center">
	            请填入工号和密码
	          </div>
	          <div class="form-group"> <!-- has-error has-feedback -->
	            <label for="no" class="control-label" style="letter-spacing:20px;cursor:pointer;">工号</label>
	            <div class="input-group">
	              <div class="input-group-addon">
	                <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
	              </div>
	              <input type="text" class="form-control" id="no" placeholder="No" aria-describedby="staffNo"required oninvalid="setCustomValidity('请填写工号！')" oninput="setCustomValidity('')">
	            </div>
	            <!-- <span class="glyphicon glyphicon-remove form-control-feedback" aria-hidden="true"></span>
	            <span id="staffNo" class="sr-only">(success)</span> -->
	          </div>
	          <div class="form-group "> <!-- has-success has-feedback -->
	            <label for="password" class="control-label" style="letter-spacing:20px;cursor:pointer;">密码</label>
	            <div class="input-group">
	              <div class="input-group-addon">
	                <span class="glyphicon glyphicon-lock" aria-hidden="true"></span>
	              </div>
	              <input type="password" class="form-control" id="password" placeholder="Password" aria-describedby="staffPassword" required oninvalid="setCustomValidity('请填写密码！')" oninput="setCustomValidity('')">
	            </div>
	           <!--  <span class="glyphicon glyphicon-ok form-control-feedback" aria-hidden="true"></span>
	            <span id="staffPassword" class="sr-only">(success)</span> -->
	            </div>
	        </div>
	        <div class="modal-footer">
	          <div class="col-md-6">
	            <button type="button" class="btn btn-default btn-block" data-dismiss="modal">取消</button>
	          </div>
	          <div class="col-md-6">
	            <button type="submit" class="btn btn-primary btn-block">登录</button>
	          </div>
	        </div>
	      </div>
	    </div>
	    </form>
	  </div>
  </c:if>

  <!-- navbar-fixed-top -->
  <nav class="navbar navbar-default navbar-fixed-top">
    <div class="container" style="width:85%;">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
        <button type="button"  class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#">HYH <span class="glyphicon glyphicon-leaf" aria-hidden="true"></span></a>
      </div>

      <!-- Collect the nav links, forms, and other content for toggling -->
      <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav">
          <%-- <li class="active"><a href="#">首页<span class="sr-only">(current)</span></a></li>
          <li ><a href="#" ${currStaff==null?"data-toggle='modal' data-target='#login'":""}>HRMS</a></li> --%>
          <c:forEach items="${currNavbar!=null?currNavbar:commonNavbar}" var="currNB">
          	<li class="${currNB.selected?'active':''}"><a href="${currNB.link}" ${currStaff==null?"data-toggle='modal' data-target='#login'":""} >${currNB.name}</a></li>
          </c:forEach>
          <li class=""><a href="#" title="more..."><span class="glyphicon glyphicon-plus" aria-hidden="true"></span></a></li>
        </ul>
        <form class="navbar-form navbar-left">
          <!-- 搜索表单 -->
          <div class="form-group">
            <div class="input-group">
              <input type="text" class="form-control" placeholder="搜索...">
              <div class="input-group-btn">
                <button id="navbar-btn" type="submit" class="btn btn-default"  data-toggle="modal" data-target="#nav-search">
                  <span  class="glyphicon glyphicon-search" ></span>
                </button>
              </div>
            </div>
          </div>
        </form>
        <ul class="nav navbar-nav navbar-right">
          <c:choose>
          	<c:when test="${currStaff!=null}">
          	<li class="dropdown">
	            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">${currStaff.name},欢迎您！<span class="caret"></span></a>
	            <ul class="dropdown-menu">
	              <li><a href="#">今日考勤</a></li>
	              <li><a href="#">其它</a></li>
	              <!-- <li><a href="#">Something else here</a></li> -->
	              <li role="separator" class="divider"></li>
	              <li><a href="#">个人信息 <i class="info circle icon"></i></a></li>
	              <li><a href="#">退出登录 <i class="info circle icon"></i></a></li>
	            </ul>
         	</li>
          	</c:when>
          	<c:otherwise>
          		<li><a href="basic/stafftoLogin.do">登录</a></li>
          	</c:otherwise>
          </c:choose>
          <li><a href="#">关于</a></li>
        </ul>
      </div><!-- /.navbar-collapse -->
  </div><!-- /.container -->
</nav>