package cn.appsys.service.developer;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import cn.appsys.dao.devuser.DevUserMapper;
import cn.appsys.pojo.DevUser;

@Service
public class DevUserServiceImpl implements DevUserService {
	@Resource
	private DevUserMapper mapper;
	@Override
	public DevUser login(String devCode, String devPassword) throws Exception {
		// TODO Auto-generated method stub
		DevUser user = null;
		user = mapper.getLoginUser(devCode);
		//匹配密码
		if(null != user){
			if(!user.getDevPassword().equals(devPassword))
				user = null;
		}
		return user;
	}
	@Override
	public int AddDevUser(DevUser devUser) throws Exception {
		// TODO Auto-generated method stub
		return mapper.AddDevUser(devUser);
	}
	@Override
	public List<DevUser> getDevUserInfoList(String devName,
			Integer currentPageNo, Integer pageSize) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getDevUserInfoList(devName,(currentPageNo-1)*pageSize, pageSize);
	}
	@Override
	public int getDevUserCount(String devName) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getDevUserCount(devName);
	}
	@Override
	public DevUser getDevUserInfoById(Integer id) {
		// TODO Auto-generated method stub
		return mapper.getDevUserInfoById(id);
	}
	@Override
	public int modify(DevUser devUser) {
		// TODO Auto-generated method stub
		return mapper.modify(devUser);
	}
	@Override
	public int delDevUserInfo(Integer id) {
		// TODO Auto-generated method stub
		return mapper.delDevUserInfo(id);
	}
	@Override
	public int add(DevUser devUser) {
		// TODO Auto-generated method stub
		return mapper.add(devUser);
	}
	@Override
	public DevUser getDevUserName(String devCode) {
		// TODO Auto-generated method stub
		return mapper.getDevUserName(devCode);
	}


}
