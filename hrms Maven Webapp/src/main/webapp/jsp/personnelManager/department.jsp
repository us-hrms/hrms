<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
	<!-- tool js -->
	<script type="text/javascript" src="${pageContext.request.contextPath }/customize/js/tool.js"></script>
  	<!-- load transition -->
 	<link rel="stylesheet" href="${pageContext.request.contextPath }/customize/css/load.css">
 	<!-- menu  -->
 	<link rel="stylesheet" href="${pageContext.request.contextPath }/customize/css/menu.css">
 	
 	<script type="text/javascript">
 	$(function(){
      // 部门负责人提示框初始化
      $("[data-toggle=popover]").popover({trigger:'hover',placement:'bottom',title:'负责人信息',
        content:function(){
          return $(this).text();
        }
      });
      //tool.js里面的功能
      $(".edit.icon").click(function(){
        mySwitch("#container-Info","#container-Edit");
        //tomcat 里需要 否则会回到根目录的#页面
        return false;
      });
    });
 	</script>
  </head>
  
  <body>
  	<jsp:include page="../commons/headerNavbar.jsp" />
	<!-- 网页中部 -->
	<div class="container-fluid" style="max-width:96%;">
  		<jsp:include page="../commons/bodyMenu.jsp" />
  		<div class="col-md-10 main">
	    <div class="container-fluid well" id="container-Info">
	    <form action="pers/department2InDaOf*.html" method="post">
	      <!-- search header -->
	      <div class="container-fluid" style="border-top:1px dashed #87CEEB;border-bottom:1px dashed #87CEEB;border-radius:20px;padding:20px 0px 10px 0px;max-width:90%;">
	      
	        <div class="form-group form-inline text-center col-md-offset-1 col-md-10">
	          <div class="form-group col-md-4">
	              <label class="control-label">部 门 名 称：</label>
	              <input type="text" class="form-control" name ="department.name" placeholder="Like Dept Name">
	          </div>
	          <div class="form-group col-md-4">
	              <label class="control-label">部 门 编 号：</label>
	              <input type="text" class="form-control" name ="department.id" placeholder="Dept ID">
	          </div>
	          <div class="form-group col-md-4">
	              <label class="control-label">部 门 规 模：</label>
	              <select class="form-control" name="department.sum" style="width:196px;">
	                <option value="-1">全部</option>
	                <option>1~50</option>
	                <option>51~100</option>
	                <option>101~150</option>
	                <option>151+</option>
	              </select>
	          </div>
	        </div>
	        <div class="form-group form-inline text-center col-md-offset-1 col-md-10">
	          <div class="form-group col-md-offset-4 col-md-4">
	            <button class="btn btn-info btn-block"><span style="letter-spacing:30px;">查</span>询</button>
	          </div>
	        </div>
	      </div>
	
	
	      <!-- attendance info -->
	      <div class="container-fluid" style="margin-top:20px;border-left:1px dashed #008080;border-right:1px dashed #008080;border-radius:20px;padding:30px 40px 0px;max-width:95%;">
	      <table class="ui blue selectable celled table">
	        <thead>
	          <tr>
	            <th colspan="5" class="h4 center aligned"><span style="letter-spacing:20px;">部门信</span>息</th>
	          </tr>
	          <tr>
	            <th>编号 / ID</th>
	            <th>部门名称 / Name</th>
	            <th>负责人 / Principal</th>
	            <th>在职人数 / Sum</th>
	            <th class="center aligned">操作 / Operating</th>
	          </tr>
	        </thead>
	        <tbody>
	         <c:forEach items="${departments}" var="item">   	
	          <tr>
	            <td>${item.id}</td>
	            <td>${item.name}</td>
	            <c:forEach items="${item.staffs}" var="it"> 
	            <c:if test="${it.position.id == 2}">
	            	<td data-container="body" data-toggle="popover">${it.name}</td>
	            </c:if>
	            <c:if test="${it.position.id == 4}">
	            	<td data-container="body" data-toggle="popover">${it.name}</td>
	            </c:if>
	            <c:if test="${it.position.id == 8}">
	            	<td data-container="body" data-toggle="popover">${it.name}</td>
	            </c:if>
	            <c:if test="${it.position.id == 14}">
	            	<td data-container="body" data-toggle="popover">${it.name}</td>
	            </c:if>
	            <c:if test="${it.position.id == 23}">
	            	<td data-container="body" data-toggle="popover">${it.name}</td>
	            </c:if>
	            <c:if test="${it.position.id == 25}">
	            	<td data-container="body" data-toggle="popover">${it.name}</td>
	            </c:if>
	            <c:if test="${it.position.id == 32}">
	            	<td data-container="body" data-toggle="popover">${it.name}</td>
	            </c:if>
	            <c:if test="${it.position.id == 38}">
	            	<td data-container="body" data-toggle="popover">${it.name}</td>
	            </c:if>
	            </c:forEach>
	            <!-- data-content="Vivamus sagittis lacus vel augue  laoreet rutrum faucibus." -->
	            <td>
	            	${fn:length(item.staffs)}
	            </td>
	            <td class="center aligned">
	              <a href="#" title="查看"><i class="unhide icon text-info"></i></a>
	              <a href="#" title="修改"><i class="edit icon text-success"></i></a>
	              <a href="#" title="删除"><i class="trash outline icon text-danger"></i></a>
	            </td>
	          </tr>
	          </c:forEach>
	        </tbody>
	        <tfoot class="full-width">
	          <tr>
	            <th colspan="5">
	              <!-- <div class="ui right floated small primary labeled icon button"><i class="user icon"></i> 新增部门 </div> -->
	              <div class="col-md-2 col-md-offset-5">
	                <button class="btn btn-info btn-block" data-toggle="modal" data-target="#newDept"><span style="letter-spacing:10px;">新增部</span>门</button>
	              </div>
	            </th>
	          </tr>
	        </tfoot>
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
	 	<!-- 新增部门 Model -->
          <div class="modal fade" id="newDept" tabindex="-1" role="dialog" aria-labelledby="deptModel" style="margin-top:230px;">
            <div class="modal-dialog" role="document">
              <div class="modal-content">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                  <h4 class="modal-title" id="deptModel">新增部门信息</h4>
                </div>
                <div class="modal-body">
                  ...
                </div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                  <button type="button" class="btn btn-primary">新增</button>
                </div>
              </div>
            </div>
          </div>
	
	    <!-- background -->
	    <div class="container-fluid well" id="container-Edit">
	      <!-- search header -->
	      <div class="container-fluid" style="border-top:1px dashed #87CEEB;border-bottom:1px dashed #87CEEB;border-radius:20px;padding:20px 0px 10px 0px;max-width:90%;">
	      <form >
	        内容头部
	      </form>
	      </div>
	      <!-- attendance info -->
	      <div class="container-fluid" style="margin-top:20px;border-left:1px dashed #008080;border-right:1px dashed #008080;border-radius:20px;padding:30px 40px 0px;max-width:95%;">
	        编辑内容区域
	      </div>
	    </div><!-- back -->
	
	  </div>
	</div><!-- 网页中部结尾 -->
  </body>
</html>
