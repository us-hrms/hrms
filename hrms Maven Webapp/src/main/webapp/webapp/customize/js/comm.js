$(function(){
  //搜索结果模型初始化
  $("form [data-toggle=modal]").click(function(){
    $($(this).attr("data-target")).modal();
    return false;
  });
});