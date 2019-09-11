<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>   
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServletPath();
	
 %>     
    
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>111111</title>
<script src="../../../js/jquery-1.8.2.js"></script>
    <style>
        *{
            list-style: none;
            padding:0;
            margin:0;
        }
        div{
            text-align: center;
            padding-top:40px;
        }
        ul{
            padding-top:50px;
            width:30%;
            margin:0 50% 0 35%;
        }
        li{
            padding:3px;
            border:1px solid silver;
            box-shadow: 1px 1px;
        }
    </style>
</head>
  <body>
  <div>
  <form action="/solrWeb/servlet/solrServlet" method="post">
    	<input type="text" id="txt">
    	<button type="button" id="btn">search</button>
    	
 </form>
    	
	</div>
		<div class="container" style="margin-top: 50px;">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title"></h3>
				</div>
				<div class="panel-body">
					<form class="form-horizontal" action="#">
						<div class="form-group" style="position: relative;">
							
							
						</div>
						<div class="panel panel-default" id = "showWord" style="position: absolute;display:none; ">
							  <ul class="list-group"></ul>
						</div>
					</form>
				</div>
			</div>
		</div>
	</body>
	<script type="text/javascript">
	
	function findWord(obj){
		var content = "";
		var word = $(obj).val();
		if(word.trim()== '')return;
			$.ajax({ 
				type: "POST",
				url: '/CopyKey/showWrod',
				async:true,
				data:{word:word},
				success: function(data){
					if(data.length > 0){
						for(var i = 0;i<data.length;i++){
							 content+="<li class='list-group-item' onclick = 'clickFn(this)' οnmοuseοver='overFn(this)' οnmοuseοut='outFn(this)'style='cursor:pointer'>"+data[i]+"</li>";
							}
						$("#showWord ul").html(content);
						$("#showWord").css("display","block");
						}
				  },
				dataType: "json"
			});
		};
	function clickFn(obj){
		var clickWord = $(obj).html();
		$("#inWord").val(clickWord);
		$("#showWord").css("display","none");
		}
	function outFn(obj){
		$(obj).css("background","#fff");
		}
	function overFn(obj){
		$(obj).css("background","#f2dede");
	}
	</script>

</html>