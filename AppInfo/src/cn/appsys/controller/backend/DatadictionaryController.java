package cn.appsys.controller.backend;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.appsys.controller.developer.AppController;
import cn.appsys.pojo.DataDictionary;
import cn.appsys.service.backend.AppService;
import cn.appsys.service.developer.AppCategoryService;
import cn.appsys.service.developer.AppInfoService;
import cn.appsys.service.developer.AppVersionService;
import cn.appsys.service.developer.DataDictionaryService;
import cn.appsys.tools.Constants;
import cn.appsys.tools.PageSupport;

@Controller
@RequestMapping(value = "/manager/backend/app")
public class DatadictionaryController {

	private Logger logger = Logger.getLogger(AppController.class);
	@Resource
	private AppInfoService appInfoService;
	@Resource
	private DataDictionaryService dataDictionaryService;
	@Resource
	private AppCategoryService appCategoryService;
	@Resource
	private AppVersionService appVersionService;
	@Resource
	private AppService appService;

	@RequestMapping(value = "/data")
	public String getAppInfoList(
			Model model,
			HttpSession session,
			@RequestParam(value = "typeName", required = false) String typeName,
			@RequestParam(value = "pageIndex", required = false) String pageIndex) {

		logger.info("getDataDictionaryListInfo -- > typeName: " + typeName);
		logger.info("getDataDictionaryListInfo -- > pageIndex: " + pageIndex);
		List<DataDictionary> getDataDictionaryListInfo = null;
		// 页面容量
		int pageSize = Constants.pageSize;
		// 当前页码
		Integer currentPageNo = 1;

		if (pageIndex != null) {
			try {
				currentPageNo = Integer.valueOf(pageIndex);
			} catch (NumberFormatException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		// 总数量（表）
		int totalCount = 0;
		try {
			totalCount = dataDictionaryService.getDataDictionaryCount(typeName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 总页数
		PageSupport pages = new PageSupport();
		pages.setCurrentPageNo(currentPageNo);
		pages.setPageSize(pageSize);
		pages.setTotalCount(totalCount);
		int totalPageCount = pages.getTotalPageCount();
		// 控制首页和尾页
		if (currentPageNo < 1) {
			currentPageNo = 1;
		} else if (currentPageNo > totalPageCount) {
			currentPageNo = totalPageCount;
		}
		try {
			getDataDictionaryListInfo = dataDictionaryService
					.getDataDictionaryListInfo(typeName, currentPageNo,
							pageSize);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("getDataDictionaryListInfo",
				getDataDictionaryListInfo);
		model.addAttribute("pages", pages);
		model.addAttribute("typeName", typeName);

		return "backend/datadictionary";
	}

	public List<DataDictionary> getDataDictionaryList(String typeCode) {
		List<DataDictionary> dataDictionaryList = null;
		try {
			dataDictionaryList = dataDictionaryService
					.getDataDictionaryList(typeCode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataDictionaryList;
	}
	
	@RequestMapping(value = "/selectTypeName", method =RequestMethod.POST)
    @ResponseBody
    public List<DataDictionary> selectTypeName(HttpServletRequest request){
        String typeCode=request.getParameter("typeCode");
        System.out.println(typeCode);
        List<DataDictionary> universityListInfo = null;
		try {
			universityListInfo = dataDictionaryService.getDataDictionaryList(typeCode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return universityListInfo;
    }
}
