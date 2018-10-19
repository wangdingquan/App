package cn.appsys.service.developer;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appsys.dao.datadictionary.DataDictionaryMapper;
import cn.appsys.pojo.DataDictionary;

@Service
public class DataDictionaryServiceImpl implements DataDictionaryService {
	
	@Resource
	private DataDictionaryMapper mapper;
	
	@Override
	public List<DataDictionary> getDataDictionaryList(String typeCode)
			throws Exception {
		// TODO Auto-generated method stub
		return mapper.getDataDictionaryList(typeCode);
	}

	@Override
	public List<DataDictionary> getDataDictionaryListInfo(String typeName,
			Integer currentPageNo, Integer pageSize) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getDataDictionaryListInfo(typeName, (currentPageNo-1)*pageSize, pageSize);
	}

	@Override
	public int getDataDictionaryCount(String typeName) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getDataDictionaryCount(typeName);
	}

	@Override
	public List<DataDictionary> getTypeName(String typeCode) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getDataDictionaryList(typeCode);
	}

}
