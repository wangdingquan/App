package cn.appsys.dao.devuser;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import cn.appsys.pojo.DevUser;

public interface DevUserMapper {
	/**
	 * 通过userCode获取User
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public DevUser getLoginUser(@Param("devCode")String devCode)throws Exception;
	
	/**
	 * 开发者账户申请
	 * @param devUser
	 * @return
	 */
	public int AddDevUser(DevUser devUser)throws Exception;
	
	
	public List<DevUser> getDevUserInfoList(@Param("devName")String devName,
			@Param(value="from")Integer currentPageNo,@Param("pageSize")Integer pageSize)throws Exception;
	
	public int getDevUserCount(@Param("devName")String devName)throws Exception;
	
	public  DevUser getDevUserInfoById(Integer id);
	
	public int modify(DevUser devUser);
	
	public int delDevUserInfo(Integer id);
	
	public int add(DevUser devUser);
	
	public DevUser getDevUserName(String devCode);
	
}
