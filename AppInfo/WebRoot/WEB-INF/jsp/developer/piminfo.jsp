<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="common/header.jsp"%>
<div class="clearfix"></div>
<div class="row">
  <div class="col-md-12 col-sm-12 col-xs-12">
    <div class="x_panel">
    <div class="x_title">
				<h2>
					个人信息维护 <i class="fa fa-user"></i>
				</h2>
				<div class="clearfix"></div>
			</div>
      <div class="x_content">
           <div class="clearfix"></div>
        <form class="form-horizontal form-label-left" action="/AppInfo/dev/flatform/app/pim" method="GET" enctype="multipart/form-data">
          <input type="hidden" name="id" value="${devUserSession.id}">
        		<div class="item form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12"
							for="name">开发者账户<span class="required">*</span> </label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input class="form-control col-md-7 col-xs-12"
								value="${devUserSession.devCode}" type="text" name="devCode" readonly="readonly">
						</div>
					</div>
					<div class="item form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12"
							for="name">开发者名称 <span class="required">*</span> </label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input type="text" class="form-control col-md-7 col-xs-12"
								value="${devUserSession.devName}"  name="devName" readonly="readonly">
						</div>
					</div>

					<div class="item form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12"
							for="name">开发者密码<span class="required">*</span> </label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input class="form-control col-md-7 col-xs-12"
								value="${devUserSession.devPassword}" type="text"  name="devPassword">
						</div>
					</div>
					<div class="item form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12"
							for="name">开发者邮箱 <span class="required">*</span> </label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input class="form-control col-md-7 col-xs-12" value="${devUserSession.devEmail}" type="text"  name="devEmail">
						</div>
					</div>
					<div class="item form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12"
							for="number">开发者简介 <span class="required">*</span> </label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input type="text" value="${devUserSession.devInfo}"
								class="form-control col-md-7 col-xs-12"  name="devInfo" >
						</div>
					</div>

					<div class="item form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12"
							for="number">创建者 <span class="required">*</span> </label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input type="text" value="${devUserSession.createdBy}"
								class="form-control col-md-7 col-xs-12"  name="createdBy">
						</div>
					</div>

					<div class="item form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12"
							for="number">创建时间<span class="required">*</span> </label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input type="text" value="<fmt:formatDate value="${devUserSession.creationDate}"
													pattern="yyyy-MM-dd" />"
								class="form-control col-md-7 col-xs-12"  name="creationDate">
						</div>
					</div>
          <div class="ln_solid"></div>
          <div class="form-group">
            <div class="col-md-6 col-md-offset-3">
              <button type="button" class="btn btn-primary" id="back">返回</button>
              <button id="send" type="submit" class="btn btn-success">修改</button>
              <br/><br/>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>
</div>
<%@include file="common/footer.jsp"%>
<script src="${pageContext.request.contextPath }/statics/localjs/appapplyview.js"></script>