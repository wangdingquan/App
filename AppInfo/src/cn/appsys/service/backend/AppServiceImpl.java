package cn.appsys.service.backend;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import cn.appsys.dao.appinfo.AppInfoMapper;
import cn.appsys.dao.appversion.AppVersionMapper;
import cn.appsys.pojo.AppInfo;
import cn.appsys.pojo.AppVersion;

@Service
public class AppServiceImpl implements AppService {
	@Resource
	private AppInfoMapper mapper;
	
	@Resource
	private  AppVersionMapper appversionmapper;
	
/*	@Override
	public AppInfo getAppInfo(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getAppInfo(id, null);
	}*/

	@Override
	public List<AppInfo> getAppInfoList(String querySoftwareName,
									Integer queryCategoryLevel1,
									Integer queryCategoryLevel2, Integer queryCategoryLevel3,
									Integer queryFlatformId,Integer currentPageNo,
									Integer pageSize) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getAppInfoList(querySoftwareName, 1, queryCategoryLevel1, queryCategoryLevel2, 
				                 queryCategoryLevel3, queryFlatformId, null, (currentPageNo-1)*pageSize, pageSize);
	}

	@Override
	public int getAppInfoCount(String querySoftwareName,
							Integer queryCategoryLevel1, 
							Integer queryCategoryLevel2,
							Integer queryCategoryLevel3, 
							Integer queryFlatformId)
							throws Exception {
		// TODO Auto-generated method stub
		return mapper.getAppInfoCount(querySoftwareName, 1, queryCategoryLevel1, queryCategoryLevel2, 
									queryCategoryLevel3, queryFlatformId, null);
	}

	@Override
	public AppInfo getAppInfo(Integer id) throws Exception {
		return mapper.getAppInfo(id, null);
	}

	@Override
	public AppVersion getAppVersionById(Integer id) throws Exception {
		return appversionmapper.getAppVersionById(id);
	}






	

}
