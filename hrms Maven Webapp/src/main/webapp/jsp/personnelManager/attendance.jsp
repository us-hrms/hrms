<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'attdance.jsp' starting page</title>
    
	<meta charset="UTF-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

 	<!-- JQuery -->
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/jquery-3.2.1.min.js"></script>
	<!-- Bootstrap -->
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.js"></script>
 	<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.css">
	<!-- Semantic -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/semantic/components/table.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/semantic/components/icon.min.css">
	<!-- nvabar js -->
	<script type="text/javascript" src="${pageContext.request.contextPath }/customize/js/comm.js"></script>
  	<!-- load transition -->
 	<link rel="stylesheet" href="${pageContext.request.contextPath }/customize/css/load.css">
 	<!-- menu  -->
 	<link rel="stylesheet" href="${pageContext.request.contextPath }/customize/css/menu.css">
  </head>
  
  <body>
  	<jsp:include page="../commons/headerNavbar.jsp" />
	<!-- 网页中部 -->
	<div class="container-fluid" style="max-width:96%;">
  		<jsp:include page="../commons/bodyMenu.jsp" />
  		<div class="col-md-10 main">
	    <div class="container-fluid well">
	    <form >
	      <!-- search header -->
	      <div class="container-fluid" style="border-top:1px dashed #87CEEB;border-bottom:1px dashed #87CEEB;border-radius:20px;padding:20px 0px 10px 0px;max-width:90%;">
	        <div class="form-group form-inline text-center col-md-offset-1 col-md-10">
	          <div class="form-group col-md-4">
	              <label class="control-label">姓 名：</label>
	              <input type="text" class="form-control" placeholder="Like Staff Name">
	          </div>
	          <div class="form-group col-md-4">
	              <label class="control-label">工 号：</label>
	              <input type="text" class="form-control" placeholder="Like Staff No">
	          </div>
	          <div class="form-group col-md-4">
	              <label class="control-label">类 型：</label>
	              <select class="form-control" style="width:196px;">
	                <option value="-1">全部</option>
	                <c:forEach items="${Dictionarylist}" var="item">
	                	<option value="${item.id}">${item.value}</option>
	               	</c:forEach>
	              </select>
	          </div>
	        </div>
	        <div class="form-group form-inline text-center col-md-offset-1 col-md-10">
	          <div class="form-group ">
	              <label class="control-label">查询时间：</label>
	              <input type="datetime-local" class="form-control">
	              <!-- <input type="time" class="form-control"> -->
	              <label class="control-label" style="margin:0px 10px;">至</label>
	              <input type="datetime-local" class="form-control">
	              <!-- <input type="time" class="form-control"> -->
	          </div>
	        </div>
	        <div class="form-group form-inline text-center col-md-offset-1 col-md-10">
	          <div class="form-group col-md-offset-3 col-md-6">
	            <button class="btn btn-info btn-block"><span style="letter-spacing:40px;">查</span>询</button>
	          </div>
	        </div>
	      </div>
	
	
	      <!-- attendance info -->
	      <div class="container-fluid" style="margin-top:20px;border-left:1px dashed #008080;border-right:1px dashed #008080;border-radius:20px;padding:30px 40px 0px;max-width:95%;">
	      <table class="ui blue selectable celled table">
	        <thead>
	          <tr>
	            <th colspan="5" class="h4 center aligned">员工考勤信息</th>
	          </tr>
	          <tr>
	            <th>工号 / No</th>
	            <th>姓名 / Name</th>
	            <th>日期 / Date</th>
	            <th>类型 / Type</th>
	            <th class="center aligned">操作 / Operating</th>
	          </tr>
	        </thead>
	        <tbody>
	        	<c:forEach items="${atteList}" var="item">
	        		<tr>
			            <td>${item.staff.no}</td>
			            <td>${item.staff.name}</td>
			            <td>${item.time}</td>
			            <c:if test="${item.dataDictionary.id ==27}">
			            	<td class="info">${item.dataDictionary.value}</td>
			            </c:if>
			            <c:if test="${item.dataDictionary.id ==28}">
			            	<td class="warning">${item.dataDictionary.value}</td>
			            </c:if>
			            <c:if test="${item.dataDictionary.id ==29}">
			            	<td class="warning">${item.dataDictionary.value}</td>
			            </c:if>
			            <c:if test="${item.dataDictionary.id ==30}">
			            	<td class="danger">${item.dataDictionary.value}</td>
			            </c:if>
			            <c:if test="${item.dataDictionary.id ==31}">
			            	<td class="success">${item.dataDictionary.value}</td>
			            </c:if>
			            <td class="center aligned">
			              <!-- <a href="#" title="编辑"><span class="glyphicon glyphicon-edit text-success" aria-hidden="true"></span></a> -->
			              <a href="#" title="编辑"><i class="edit icon text-success"></i></a>
			              <a href="#" title="删除"><i class="trash outline icon text-danger"></i></a>
			            </td>
			         </tr>
	        	</c:forEach>
	        </tbody>
	      </table>
	      <!-- 分页 -->
	      <div class="text-center">
	        <ul class="pagination">
	          <li><a href="#">上一页</a></li>
	          <li class="active"><a>1</a></li>
	          <li><a href="#">2</a></li>
	          <li><a href="#">3</a></li>
	          <li><a href="#">4</a></li>
	          <li><a href="#">5</a></li>
	          <li><a href="#">下一页</a></li>
	        </ul>
	      </div>
	      </div>
	      </form>
	    </div>
	  </div>
	</div>
  </body>
</html>
