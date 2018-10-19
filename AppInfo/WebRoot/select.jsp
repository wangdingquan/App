<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath }/statics/css/bootstrap.min.css" rel="stylesheet">
<script	src="${pageContext.request.contextPath }/statics/js/jquery.min.js"></script>
<script	src="${pageContext.request.contextPath }/statics/js/bootstrap.min.js"></script>
</head>
<body>
						<div class="form-group">
							<label class="control-label col-md-1 col-sm-1 col-xs-3">一级分类</label>
							<div class="col-md-2 col-sm-2 col-xs-3">
								<select id="queryCategoryLevel1" name="queryCategoryLevel1" class="form-control">
									   <option value="">--请选择--</option>
									   		<option 
									   		value="1">全部应用</option>
									   		<option 
									   		value="2">全部游戏</option>
        						</select>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-1 col-sm-1 col-xs-3">二级分类</label>
							<div class="col-md-2 col-sm-2 col-xs-3">
							<input type="hidden" name="categorylevel2list" id="categorylevel2list"/>
        						<select name="queryCategoryLevel2" id="queryCategoryLevel2" class="form-control">
        							
        						</select>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-1 col-sm-1 col-xs-3">三级分类</label>
							<div class="col-md-2 col-sm-2 col-xs-3">
        						<select name="queryCategoryLevel3" id="queryCategoryLevel3" class="form-control">
        							
        						</select>
							</div>
						</div>
</body>
</html>
<script type="text/javascript">
</script>
<script src="${pageContext.request.contextPath }/statics/localjs/appinfolist.js"></script>