<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="common/header.jsp"%>
<div class="clearfix"></div>
<div class="row">
	<div class="col-md-12">
		<div class="x_panel">
			<div class="x_title">
				<h2>
					开发者账户申请 <i class="fa fa-user"></i><small>${userSession.userName}
						- 您可以通过搜索或者其他的筛选项对APP的信息进行维护操作。^_^</small>
				</h2>
				<div class="clearfix"></div>
			</div>
			<div class="x_content">
				<form method="post" action="apply">
					<input type="hidden" name="pageIndex" value="1" />
					<ul>
						<li>
							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									style="width:120px;">开发者账户名称</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input name="devName" type="text"
										class="form-control col-md-7 col-xs-12" value="${devName}">
								</div>
							</div></li>
						<li><button type="submit" class="btn btn-primary">查
								&nbsp;&nbsp;&nbsp;&nbsp;询</button>
						</li>
					</ul>
				</form>
			</div>
		</div>
	</div>
	<div class="col-md-12 col-sm-12 col-xs-12">
		<div class="x_panel">
			<div class="x_content">
				<p class="text-muted font-13 m-b-30"></p>
				<div id="datatable-responsive_wrapper"
					class="dataTables_wrapper form-inline dt-bootstrap no-footer">
					<div class="row">
						<div class="col-sm-12">
							<table id="datatable-responsive"
								class="table table-striped table-bordered dt-responsive nowrap dataTable no-footer dtr-inline collapsed"
								cellspacing="0" width="150%" role="grid"
								aria-describedby="datatable-responsive_info"
								style="width: 100%;">
								<thead>
									<tr role="row">
										<th class="sorting_asc" tabindex=""
											aria-controls="datatable-responsive" rowspan="1" colspan="1"
											style="width: 70px;"
											aria-label="First name: activate to sort column descending"
											aria-sort="ascending">开发者账户</th>
										<th class="sorting" tabindex="0"
											aria-controls="datatable-responsive" rowspan="1" colspan="1"
											style="width: 90px;"
											aria-label="Last name: activate to sort column ascending">
											开发者名称</th>
										<th class="sorting" tabindex="0"
											aria-controls="datatable-responsive" rowspan="1" colspan="1"
											style="width: 90px;"
											aria-label="Last name: activate to sort column ascending">
											开发者密码</th>
										<th class="sorting" tabindex="0"
											aria-controls="datatable-responsive" rowspan="1" colspan="1"
											style="width: 50px;"
											aria-label="Last name: activate to sort column ascending">
											开发者邮箱</th>
										<th class="sorting" tabindex="0"
											aria-controls="datatable-responsive" rowspan="1" colspan="1"
											style="width: 170px;"
											aria-label="Last name: activate to sort column ascending">
											开发者简介</th>
										<th class="sorting" tabindex="0"
											aria-controls="datatable-responsive" rowspan="1" colspan="1"
											style="width: 90px;"
											aria-label="Last name: activate to sort column ascending">
											创建者</th>
										<th class="sorting" tabindex="0"
											aria-controls="datatable-responsive" rowspan="1" colspan="1"
											style="width: 30px;"
											aria-label="Last name: activate to sort column ascending">
											创建时间</th>
										<th class="sorting" tabindex="0"
											aria-controls="datatable-responsive" rowspan="1" colspan="1"
											style="width: 30px;"
											aria-label="Last name: activate to sort column ascending">
											操作</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="devInfo" items="${devUserInfoList}"
										varStatus="status">
										<tr role="row" class="odd">
											<td tabindex="0" class="sorting_1">${devInfo.devCode}</td>
											<td>${devInfo.devName}</td>
											<td>${devInfo.devPassword}</td>
											<td>${devInfo.devEmail}</td>
											<td>${devInfo.devInfo}</td>
											<td>${devInfo.createdBy}</td>
											<td><fmt:formatDate value="${devInfo.creationDate}"
													pattern="yyyy-MM-dd" />
											</td>
											<td>

												<div class="btn-group">
													<button type="button" class="btn btn-danger">点击操作</button>
													<button type="button"
														class="btn btn-danger dropdown-toggle"
														data-toggle="dropdown" aria-expanded="false">
														<span class="caret"></span> <span class="sr-only">Toggle
															Dropdown</span>
													</button>
													<ul class="dropdown-menu" role="menu">
														<li><a href="/AppInfo/dev/flatform/app/add">新增</a></li>
														<li><a href="/AppInfo/dev/flatform/app/update?id=${devInfo.id}">修改</a>
														</li>
														<li><a
															href="/AppInfo/dev/flatform/app/appapplyview?id=${devInfo.id}">查看</a>
														</li>
														<li><a class="deleteUser"
															devInfoid="${devInfo.id}"devName="${devInfo.devName}"
															data-toggle="tooltip" data-placement="top" title=""
															data-original-title="删除">删除</a>
														</li>
													</ul>
												</div></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
					<div class="row">
						<div class="col-sm-5">
							<div class="dataTables_info" id="datatable-responsive_info"
								role="status" aria-live="polite">共${pages.totalCount }条记录
								${pages.currentPageNo }/${pages.totalPageCount }页</div>
						</div>
						<div class="col-sm-7">
							<div class="dataTables_paginate paging_simple_numbers"
								id="datatable-responsive_paginate">
								<ul class="pagination">
									<c:if test="${pages.currentPageNo > 1}">
										<li class="paginate_button previous"><a
											href="javascript:page_nav(document.forms[0],1);"
											aria-controls="datatable-responsive" data-dt-idx="0"
											tabindex="0">首页</a></li>
										<li class="paginate_button "><a
											href="javascript:page_nav(document.forms[0],${pages.currentPageNo-1});"
											aria-controls="datatable-responsive" data-dt-idx="1"
											tabindex="0">上一页</a></li>
									</c:if>
									<c:if test="${pages.currentPageNo < pages.totalPageCount }">
										<li class="paginate_button "><a
											href="javascript:page_nav(document.forms[0],${pages.currentPageNo+1 });"
											aria-controls="datatable-responsive" data-dt-idx="1"
											tabindex="0">下一页</a></li>
										<li class="paginate_button next"><a
											href="javascript:page_nav(document.forms[0],${pages.totalPageCount });"
											aria-controls="datatable-responsive" data-dt-idx="7"
											tabindex="0">最后一页</a></li>
									</c:if>
								</ul>
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>
	<%@include file="common/footer.jsp"%>
	<script
		src="${pageContext.request.contextPath }/statics/localjs/rollpage.js"></script>
	<script
		src="${pageContext.request.contextPath }/statics/localjs/appapplyinfo.js"></script>