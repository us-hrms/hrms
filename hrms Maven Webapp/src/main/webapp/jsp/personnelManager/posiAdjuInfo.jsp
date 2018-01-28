<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	                <label class="control-label">职 位 名 称：</label>
	                <input type="text" class="form-control" placeholder="Like Position Name">
	            </div>
	            <div class="form-group col-md-4">
	                <label class="control-label">部 门：</label>
	                <select class="form-control" style="width:196px;">
	                  <option value="-1">全部</option>
	                  <option>部门1</option>
	                  <option>部门2</option>
	                  <option>部门3</option>
	                  <option>部门4</option>
	                </select>
	            </div>
	            <div class="form-group col-md-4">
	                <label class="control-label">职 位：</label>
	                <select class="form-control" style="width:196px;">
	                  <option value="-1">全部</option>
	                  <option>职位1</option>
	                  <option>职位2</option>
	                  <option>职位3</option>
	                  <option>职位4</option>
	                </select>
	            </div>
	          </div>
	          <div class="form-group form-inline text-center col-md-offset-1 col-md-10">
	            <div class="form-group col-md-6">
	                <label class="control-label">工 号：</label>
	                <input type="text" class="form-control" placeholder="Like Staff No">
	            </div>
	            <div class="form-group col-md-6">
	                <label class="control-label">姓 名：</label>
	                <input type="text" class="form-control" placeholder="Like Staff Name">
	            </div>
	          </div>
	          <div class="form-group form-inline text-center col-md-offset-1 col-md-10">
	            <div class="form-group col-md-offset-4 col-md-4">
	              <button class="btn btn-info btn-block" data-toggle="modal" data-target="#findResult"><span style="letter-spacing:30px;">查</span>询</button>
	            </div>
	          </div>
	        
	        </div>
	        <!-- attendance info -->
	        <div class="container-fluid" style="margin-top:20px;border-left:1px dashed #008080;border-right:1px dashed #008080;border-radius:20px;padding:30px 40px 0px;max-width:95%;">
	          <table class="ui blue selectable celled table">
	            <thead>
	              <tr>
	                <th colspan="6" class="h4 center aligned"><span style="letter-spacing:20px;">职称聘任记</span>录</th>
	              </tr>
	              <tr>
	                <th>所属部门 / Dept</th>
	                <th>聘任职称 / Position</th>
	                <th>聘任时间 / Date</th>
	                <th>任职人员 / Staff</th>
	                <th>聘任类型 / Type</th>
	                <th class="center aligned">操作 / Operating</th>
	              </tr>
	            </thead>
	            <tbody>
	              <tr>
	                <td>1</td>
	                <td>No Action</td>
	                <td  >None</td>
	                <td>None</td>
	                <td>None</td>
	                <td class="center aligned">
	                  <a href="#" title="查看"><i class="unhide icon text-info"></i></a>
	                  <a href="#" title="修改"><i class="edit icon text-success"></i></a>
	                  <a href="#" title="删除"><i class="trash outline icon text-danger"></i></a>
	                </td>
	              </tr>
	              <tr>
	                <td>2</td>
	                <td>Approved</td>
	                <td >Requires call</td>
	                <td>None</td>
	                <td>None</td>
	                <td class="center aligned disabled">
	                  <a href="#" title="查看"><i class="unhide icon text-info"></i></a>
	                  <a href="#" title="修改"><i class="edit icon text-success"></i></a>
	                  <a href="#" title="删除"><i class="trash outline icon text-danger"></i></a>
	                </td>
	              </tr>
	              <tr>
	                <td>3</td>
	                <td>Denied</td>
	                <td >None</td>
	                <td>None</td>
	                <td>None</td>
	                <td class="center aligned">
	                  <a href="#" title="查看"><i class="unhide icon text-info"></i></a>
	                  <a href="#" title="修改"><i class="edit icon text-success"></i></a>
	                  <a href="#" title="删除"><i class="trash outline icon text-danger"></i></a>
	                </td>
	              </tr>
	              <tr>
	                <td>4</td>
	                <td>No Action</td>
	                <td >None</td>
	                <td>None</td>
	                <td>None</td>
	                <td class="center aligned">
	                  <a href="#" title="查看"><i class="unhide icon text-info"></i></a>
	                  <a href="#" title="修改"><i class="edit icon text-success"></i></a>
	                  <a href="#" title="删除"><i class="trash outline icon text-danger"></i></a>
	                </td>
	              </tr>
	              <tr>
	                <td>5</td>
	                <td>Approved</td>
	                <td >Requires call</td>
	                <td>None</td>
	                <td>None</td>
	                <td class="center aligned">
	                  <a href="#" title="查看"><i class="unhide icon text-info"></i></a>
	                  <a href="#" title="修改"><i class="edit icon text-success"></i></a>
	                  <a href="#" title="删除"><i class="trash outline icon text-danger"></i></a>
	                </td>
	              </tr>
	              <tr>
	                <td>6</td>
	                <td>Denied</td>
	                <td >None</td>
	                <td>None</td>
	                <td>None</td>
	                <td class="center aligned">
	                  <a href="#" title="查看"><i class="unhide icon text-info"></i></a>
	                  <a href="#" title="修改"><i class="edit icon text-success"></i></a>
	                  <a href="#" title="删除"><i class="trash outline icon text-danger"></i></a>
	                </td>
	              </tr>
	              <tr>
	                <td>7</td>
	                <td>Denied</td>
	                <td >None</td>
	                <td>None</td>
	                <td>None</td>
	                <td class="center aligned">
	                  <a href="#" title="查看"><i class="unhide icon text-info"></i></a>
	                  <a href="#" title="修改"><i class="edit icon text-success"></i></a>
	                  <a href="#" title="删除"><i class="trash outline icon text-danger"></i></a>
	                </td>
	              </tr>
	              <tr>
	                <td>8</td>
	                <td>Denied</td>
	                <td>None</td>
	                <td>None</td>
	                <td>None</td>
	                <td class="center aligned">
	                  <a href="#" title="查看"><i class="unhide icon text-info"></i></a>
	                  <a href="#" title="修改"><i class="edit icon text-success"></i></a>
	                  <a href="#" title="删除"><i class="trash outline icon text-danger"></i></a>
	                </td>
	              </tr>
	              <tr>
	                <td>9</td>
	                <td>Denied</td>
	                <td >None</td>
	                <td>None</td>
	                <td>None</td>
	                <td class="center aligned">
	                  <a href="#" title="查看"><i class="unhide icon text-info"></i></a>
	                  <a href="#" title="修改"><i class="edit icon text-success"></i></a>
	                  <a href="#" title="删除"><i class="trash outline icon text-danger"></i></a>
	                </td>
	              </tr>
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
	
	 <!-- 查询 Model -->
	          <div class="modal fade" id="findResult" tabindex="-1" role="dialog" aria-labelledby="findResultModel" style="margin-top:230px;">
	            <div class="modal-dialog" role="document">
	              <div class="modal-content">
	                <div class="modal-header">
	                  <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	                  <h4 class="modal-title" id="findResultModel">查询结果</h4>
	                </div>
	                <div class="modal-body"  style="padding:30px 0px;">
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
	                  <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
	                  <button type="button" class="btn btn-primary">确认</button>
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
