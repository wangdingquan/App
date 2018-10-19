package cn.appsys.service.backend;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.appsys.pojo.AppInfo;
import cn.appsys.pojo.AppVersion;

public interface AppService {
	
	/**
	 * 根据条件查询出待审核的APP列表并分页显示
	 * @param querySoftwareName
	 * @param queryCategoryLevel1
	 * @param queryCategoryLevel2
	 * @param queryCategoryLevel3
	 * @param queryFlatformId
	 * @param currentPageNo
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	public List<AppInfo> getAppInfoList(@Param(value="softwareName")String querySoftwareName,
										@Param(value="categoryLevel1")Integer queryCategoryLevel1,
										@Param(value="categoryLevel2")Integer queryCategoryLevel2,
										@Param(value="categoryLevel3")Integer queryCategoryLevel3,
										@Param(value="flatformId")Integer queryFlatformId,
										@Param(value="from")Integer currentPageNo,
										@Param(value="pageSize")Integer pageSize)throws Exception;
	/**
	 * 查询出待审核（status=1）的APP数量
	 * @param querySoftwareName
	 * @param queryCategoryLevel1
	 * @param queryCategoryLevel2
	 * @param queryCategoryLevel3
	 * @param queryFlatformId
	 * @return
	 * @throws Exception
	 */
	public int getAppInfoCount(@Param(value="softwareName")String querySoftwareName,
							   @Param(value="categoryLevel1")Integer queryCategoryLevel1,
							   @Param(value="categoryLevel2")Integer queryCategoryLevel2,
							   @Param(value="categoryLevel3")Integer queryCategoryLevel3,
							   @Param(value="flatformId")Integer queryFlatformId)throws Exception;
	
	/**
	 * 根据ID查看app基本信息
	 * @param id 
	 * @param APKName
	 * @return
	 * @throws Exception
	 */
	public AppInfo getAppInfo(Integer id) throws Exception;
	
	public AppVersion getAppVersionById(@Param("id")Integer id)throws Exception;
	
	
	
}
