<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<div class="col-md-2 sidebar">
   <!-- 左侧菜单栏 -->
   <div class="well" >
       <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
         <!-- 人事管理 -->
         <div class="panel panel-default">
           <div class="panel-heading" role="tab" id="headingOne">
             <h4 class="panel-title">
               <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
               <a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="" aria-controls="collapseOne">
 				人事管理
               </a>
             </h4>
           </div>
           <div id="collapseOne" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
             <ul class="list-group">
               <li class="list-group-item choose"><a href="#">考勤管理</a></li>
               <li class="list-group-item"><a href="#">部门信息</a></li>
               <li class="list-group-item"><a href="#">职位信息</a></li>
               <li class="list-group-item"><a href="#">假期管理</a></li>
               <li class="list-group-item"><a href="#">住房管理</a></li>
               <li class="list-group-item"><a href="#">职称聘任记录</a></li>
               <li class="list-group-item"><a href="#">职位调整</a></li>
               <li class="list-group-item"><a href="#">离职管理</a></li>
             </ul>
           </div>
         </div>
         <!-- 员工信息管理 -->
         <div class="panel panel-default">
           <div class="panel-heading" role="tab" id="headingTwo">
             <h4 class="panel-title">
               <span class="glyphicon glyphicon-comment" aria-hidden="true"></span>
               <a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="" aria-controls="collapseTwo">
 				  员工信息管理
               </a>
             </h4>
           </div>
           <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
             <ul class="list-group">
               <li class="list-group-item">员工基本信息</li>
               <li class="list-group-item">员工档案</li>
               <li class="list-group-item">员工合同管理</li>
               <li class="list-group-item">新进员工管理</li>
               <li class="list-group-item">员工证书记录</li>
             </ul>
           </div>
         </div>
         <!-- 培训计划 -->
         <div class="panel panel-default">
           <div class="panel-heading" role="tab" id="headingThree">
             <h4 class="panel-title">
               <span class="glyphicon glyphicon-duplicate" aria-hidden="true"></span>
               <a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="" aria-controls="collapseThree">
 				 培训计划
               </a>
             </h4>
           </div>
           <div id="collapseThree" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
             <ul class="list-group">
               <li class="list-group-item">培训项目</li>
               <li class="list-group-item">培训记录</li>
               <li class="list-group-item">培训人员及成绩</li>
             </ul>
           </div>
         </div>
         <!-- 薪酬管理 -->
         <div class="panel panel-default">
           <div class="panel-heading" role="tab" id="headingFour">
             <h4 class="panel-title">
               <span class="glyphicon glyphicon-yen" aria-hidden="true"></span>
               <a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseFour" aria-expanded="" aria-controls="collapseFour">
 				薪酬管理
               </a>
             </h4>
           </div>
           <div id="collapseFour" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFour">
             <ul class="list-group">
               <li class="list-group-item">薪酬发放</li>
               <li class="list-group-item">薪酬标准信息</li>
               <li class="list-group-item">薪酬奖罚管理</li>
               <li class="list-group-item">福利待遇管理</li>
             </ul>
           </div>
         </div>
         <!-- 系统管理 -->
         <div class="panel panel-default">
           <div class="panel-heading" role="tab" id="headingFive">
             <h4 class="panel-title">
               <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
               <a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseFive" aria-expanded="" aria-controls="collapseFive">
 				系统管理
               </a>
             </h4>
           </div>
           <div id="collapseFive" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFive">
             <ul class="list-group">
               <li class="list-group-item">用户信息管理</li>
               <li class="list-group-item">角色管理</li>
               <li class="list-group-item">公司信息管理</li>
               <li class="list-group-item">测评分析</li>
             </ul>
           </div>
         </div>
       </div>
   </div>
 </div>