package cn.appsys.service.developer;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.DataDictionary;

public interface DataDictionaryService {
	
	/**
	 * 根据typeCode查询相应的数据字典列表
	 * @param typeCode
	 * @return
	 * @throws Exception
	 */
	public List<DataDictionary> getDataDictionaryList(String typeCode)throws Exception;
	
    public List<DataDictionary> getDataDictionaryListInfo(@Param("typeName")String typeName,@Param(value="from")Integer currentPageNo,@Param("pageSize")Integer pageSize)throws Exception;
	
	public int getDataDictionaryCount(@Param("typeName")String typeName)throws Exception;
	
	public List<DataDictionary> getTypeName(@Param("typeCode") String typeCode)throws Exception;
}
