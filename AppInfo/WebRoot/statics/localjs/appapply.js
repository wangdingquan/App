$(function(){  
	$("#back").on("click",function(){
		window.location.href = "list";
	});
	
	$("#appapplyCode").bind("blur",function(){
		//ajax后台验证--APKName是否已存在
		$.ajax({
			type:"GET",//请求类型
			url:"apkexist.json",//请求的url
			data:{appapplyCode:$("#appapplyCode").val()},//请求参数
			dataType:"json",//ajax接口（请求url）返回的数据类型
			success:function(data){//data：返回数据（json对象）
				if(data.appapplyCode == "empty"){//参数APKName为空，错误提示
					alert("开发者帐号为不能为空！");
				}else if(data.appapplyCode == "exist"){//账号不可用，错误提示
					alert("该开发者帐号已存在，不能使用！");
				}else if(data.appapplyCode == "noexist"){//账号可用，正确提示
					alert("该开发者帐号可以使用！");
				}
			},
			error:function(data){//当访问时候，404，500 等非200的错误状态码
				alert("请求错误！");
			}
		});
	});

});
      
      
      