<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/bootstrap-3.3.7-dist/css/bootstrap.css">
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-6 column">
			<form role="form" id="myForm">
				<div class="form-group">
					 <label for="exampleInputEmail1">用户名</label><input type="email" class="form-control" id="exampleInputEmail1" name="userName" />
				</div>
				<div class="form-group">
					 <label for="exampleInputPassword1">密码</label><input type="password" class="form-control" id="exampleInputPassword1" name="userPass"/>
				</div>
				<div class="checkbox">
					 验证码：<input name="volidImgText" id="volidImgTextId"/>
					<img id='volidImg'  onclick='flushImg()' src="<%=request.getContextPath()%>/authImage" height="20" width="100"/>
				</div>
				<div class="checkbox">
					 <label><input type="checkbox" />记住帐号</label>
				</div> <input type="button" class="btn btn-default" onclick="logins()" value="登录"/>
			</form>
		</div>
		<div class="col-md-6 column">
			<form role="form">
				<div class="form-group">
					 <label for="exampleInputEmail1">用户名</label><input type="email" class="form-control" id="exampleInputEmail1" />
				</div>
				<div class="form-group">
					 <label for="exampleInputPassword1">密码</label><input type="password" class="form-control" id="exampleInputPassword1" />
				</div>
				<div class="checkbox">
					 <label><input type="checkbox" />记住帐号</label>
				</div> <input type="button" class="btn btn-default" value="注册"/>
			</form>
		</div>
	</div>
</div>
<script type="text/javascript" src="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/js/jquery-1.11.3.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/login.js"></script>
</body>
<script type="text/javascript">
	function logins(){
		if($("#volidImgTextId").val() != ""){
			$.ajax({
		        url: "<%=request.getContextPath()%>/login.do",
		        type:"post",
		        data:$("#myForm").serialize(),
		        dataType:"json",//规定返回值格式
		      	async:false,//同步上传
		        success:function (data){//成功回调函数
		        	alert(data==0?"成功":"失败");
			        if(data==1){
						alert("注册页面");
			        }else{
			        	location.href="<%=request.getContextPath()%>/addUser.do";
					}
		        },
		        error :function(data){//错误回调函数
		            console.info(data)
		        }
			});
			return;
		}
		alert("请填写验证码");
		
	}
</script>
</html>