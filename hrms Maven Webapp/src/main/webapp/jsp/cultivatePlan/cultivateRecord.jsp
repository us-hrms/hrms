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
	<!-- tool js -->
	<script type="text/javascript" src="${pageContext.request.contextPath }/customize/js/tool.js"></script>
  	<!-- load transition -->
 	<link rel="stylesheet" href="${pageContext.request.contextPath }/customize/css/load.css">
 	<!-- menu  -->
 	<link rel="stylesheet" href="${pageContext.request.contextPath }/customize/css/menu.css">
 	
 	<script type="text/javascript">
 	$(function(){
      //tool.js里面的功能
      $(".edit.icon").click(function(){
        mySwitch("#container-Info","#container-Edit");
        //tomcat 里需要 否则会回到根目录的#页面
        return false;
      });
      // 培训项目负责人提示框初始化
      $('[data-toggle="popover"]').popover({trigger:'hover',placement:'bottom',title:'负责人信息',
        content:function(){
          return $(this).text();
        }
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
		    <form >
		      <!-- search header -->
		      <div class="container-fluid" style="border-top:1px dashed #87CEEB;border-bottom:1px dashed #87CEEB;border-radius:20px;padding:20px 0px 10px 0px;max-width:90%;">
		        <div class="form-group form-inline text-center col-md-offset-1 col-md-10">
		          <div class="form-group col-md-4">
		              <label class="control-label">平 台 名 称：</label>
		              <input type="text" class="form-control" placeholder="Like Cultivate Name">
		          </div>
		          <div class="form-group col-md-4">
		              <label class="control-label">培 训 类 型：</label>
		              <select class="form-control" style="width:196px;">
		                <option value="-1">所有</option>
		               <c:forEach items="${dataDictionarylists}" var="item">
	                		<option value="${item.id}">${item.value}</option>
	               	  	</c:forEach>
		              </select>
		          </div>
		          <div class="form-group col-md-4">
		              <label class="control-label">培 训 状 态：</label>
		              <select class="form-control" style="width:196px;">
		                <option value="-1">所有</option>
		                <c:forEach items="${dataDictionarylist}" var="item">
		                		<option value="${item.id}">${item.value}</option>
		                </c:forEach>
		              </select>
		          </div>
		        </div>
		        <div class="form-group form-inline text-center col-md-offset-1 col-md-10">
		          <div class="form-group col-md-4">
		              <label class="control-label">负责人：</label>
		              <input type="text" class="form-control" placeholder="Responsible Name">
		          </div>
		          <div class="form-group col-md-8">
		              <label class="control-label">查 询 时 间 范 围：</label>
		              <input type="date" class="form-control">
		              <label class="control-label" style="margin:0px 13px;">到</label>
		              <input type="date" class="form-control">
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
		              <th colspan="8" class="h4 center aligned"><span style="letter-spacing:20px;">培训项目记</span>录</th>
		            </tr>
		            <tr>
		              <th>编号 / ID</th>
		              <th>平台名称 / Name</th>
		              <th>负责人 / SName</th>
		              <th>培训状态 / Type</th>
		              <th>费用 / Cost</th>
		              <th>开始时间 / Date</th><!-- start~end -->
		              <th>结束时间 / Date</th>
		              <th class="center aligned">操作 / Operating</th>
		            </tr>
		          </thead>
		          <tbody>
		          <c:forEach items="${cultivateRecordlists}" var="item">
		            <tr>
		              <td>${item.id}</td>
		              <td>${item.cultivate.name}</td>
		              <td data-container="body" data-toggle="popover">${item.staff.name}</td>
		              <td>${item.dataDictionary.value}</td>
		              <td>${item.cost}</td>
		              <td>${item.start}</td>
		              <td>${item.stop}</td>
		              <td class="center aligned">
		                <a href="#" title="查看详情"><i class="unhide icon text-info"></i></a>
		                <a href="#" title="修改"><i class="edit icon text-success"></i></a>
		                <a href="#" title="删除"><i class="trash outline icon text-danger"></i></a>
		              </td>
		            </tr>
		            </c:forEach>
		          </tbody>
		          <tfoot class="full-width">
		            <tr>
		              <th colspan="8">
		                <!-- <div class="ui right floated small primary labeled icon button"><i class="user icon"></i> 新增部门 </div> -->
		                <div class="col-md-2 col-md-offset-5">
		                  <button class="btn btn-info btn-block" data-toggle="modal" data-target="#newCultReco"><span style="letter-spacing:10px;">创建培训项</span>目</button>
		                </div>
		              </th>
		            </tr>
		          </tfoot>
		        </table>
		
		        <!-- 分页  -->
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
		    <!-- 创建培训项目 Model -->
	        <div class="modal fade" id="newCultReco" tabindex="-1" role="dialog" aria-labelledby="CultRecoModel" style="margin-top:230px;">
	          <div class="modal-dialog" role="document">
	            <div class="modal-content">
	              <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	                <h4 class="modal-title" id="CultRecoModel">创建培训项目</h4>
	              </div>
	              <div class="modal-body">
	                ...
	              </div>
	              <div class="modal-footer">
	                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
	                <button type="button" class="btn btn-primary">创建</button>
	              </div>
	            </div>
	          </div>
	        </div>
		
		    <!-- background -->
		    <div class="container-fluid well" id="container-Edit">
		      <!-- search header -->
		      <div class="container-fluid" style="border-top:1px dashed #87CEEB;border-bottom:1px dashed #87CEEB;border-radius:20px;padding:20px 0px 10px 0px;max-width:90%;">
		      <form >
		        表单
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
