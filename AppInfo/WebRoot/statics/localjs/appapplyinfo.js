$(".addVersion").on("click",function(){
	var obj = $(this);
	window.location.href="appapplyadd?id="+obj.attr("devInfoid");
});

$(".modifyAppInfo").on("click",function(){
	var obj = $(this);
	var appinfoid = obj.attr("devInfoid");
    window.location.href="appapplymodify?id="+ obj.attr("devInfoid");
});


$(".viewApp").on("click",function(){
	var obj = $(this);
	window.location.href="appapplyview?id="+ obj.attr("devInfoid");
});

$(".deleteUser").on("click",function(){ 
	var obj = $(this); 
	if(confirm("你确定要删除用户【"+obj.attr("devName")+"】及其所有信息吗？")){
		$.ajax({  
			type:"GET",
			url:"deluser.json",   
			data:{id:obj.attr("devInfoid")}, 
			dataType:"json",  
			success:function(data){
				if(data == "true"){//删除成功：移除删除行 
					alert("删除成功");   
					obj.parents("tr").remove();   
				}else if(data == "false"){//删除失败
					alert("对不起，删除删除用户【"+obj.attr("devName")+"】失败");
				}else if(data == "notexist"){ 
					alert("对不起，用户【"+obj.attr("devName")+"】不存在");
				} 
			},
			error:function(data){ 
				alert("对不起，删除失败");
			} 
		});
	}
});

	
