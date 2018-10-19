package cn.appsys.service.developer;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.DevUser;

public interface DevUserService {
	/**
	 * 用户登录
	 * @param devCode
	 * @param devPassword
	 * @return
	 */
	public DevUser login(String devCode,String devPassword) throws Exception;
	
	/**
	 * 开发者账户申请
	 * @param devUser
	 * @return
	 * @throws Exception
	 */
	public int AddDevUser(DevUser devUser)throws Exception;
	
	public List<DevUser> getDevUserInfoList(@Param("devName")String devName,
			@Param("from")Integer currentPageNo,@Param("pageSize")Integer pageSize)throws Exception;
	
	public int getDevUserCount(String devName)throws Exception;
	
	public  DevUser getDevUserInfoById(Integer id);
	
	public int modify(DevUser devUser);
	
	public int delDevUserInfo(Integer id);
	
	public int add(DevUser devUser);
	
	public DevUser getDevUserName(String devCode);
}
