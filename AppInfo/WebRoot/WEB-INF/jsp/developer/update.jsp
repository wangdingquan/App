<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="common/header.jsp"%>
<div class="clearfix"></div>
<form class="form-horizontal form-label-left" action="/AppInfo/dev/flatform/app/appapplymodify" method="post">
<div class="row">
	<div class="col-md-12 col-sm-12 col-xs-12">
	
		<div class="x_panel">
			<div class="x_title">
				<h2>
					查看APP开发者信息 <i class="fa fa-user"></i><small>${devUserSession.devName}</small>
				</h2>
				<div class="clearfix"></div>
			</div>
			<div class="x_title">
				<h2>APP基础信息</h2>
				<div class="clearfix"></div> 
			</div>
			<div class="x_content1">
				
					<input type="hidden" name="id" value="${devInfo.id}">
					<div class="item form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12"
							for="name">开发者账户<span class="required">*</span> </label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input class="form-control col-md-7 col-xs-12" name="devCode"
								value="${devInfo.devCode}" type="text">
						</div>
					</div>
					<div class="item form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12" 
							for="name">开发者名称 <span class="required">*</span> </label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input type="text" class="form-control col-md-7 col-xs-12" name="devName"
								value="${devInfo.devName}">
						</div>
					</div>

					<div class="item form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12"
							for="name">开发者密码<span class="required">*</span> </label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input class="form-control col-md-7 col-xs-12" name="devPassword"
								value="${devInfo.devPassword}" type="text">
						</div>
					</div>
					<div class="item form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12"
							for="name">开发者邮箱 <span class="required">*</span> </label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input class="form-control col-md-7 col-xs-12"  name="devEmail" value="${devInfo.devEmail}" type="text">
						</div>
					</div>
					<div class="item form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12"
							for="number">开发者简介 <span class="required">*</span> </label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input type="text"  name="devInfo" value="${devInfo.devInfo}"
								class="form-control col-md-7 col-xs-12">
						</div>
					</div>

					<div class="item form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12"
							for="number">创建者 <span class="required">*</span> </label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input type="text" value="${devInfo.createdBy}"  name="createdBy"
								class="form-control col-md-7 col-xs-12">
						</div>
					</div>

					<div class="item form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12"
							for="number">创建时间<span class="required">*</span> </label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input type="text" value="<fmt:formatDate value="${devInfo.creationDate}"
													pattern="yyyy-MM-dd" />" name="creationDate"
								class="form-control col-md-7 col-xs-12">
						</div>
					</div>
			</div>
		</div>
		
	</div>
	<div class="form-group">
		<div class="col-md-6 col-md-offset-3">
		    <button id="send" type="submit" class="btn btn-success">保存</button>
			<button type="button" class="btn btn-primary" id="back">返回</button>
		</div>
	</div>
	<div class="clearfix"></div>
	<br />
	<br />
</div>
</form>
<%@include file="common/footer.jsp"%>
<script src="${pageContext.request.contextPath }/statics/localjs/appapplyview.js"></script>