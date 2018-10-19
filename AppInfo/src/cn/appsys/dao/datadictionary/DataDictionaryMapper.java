package cn.appsys.dao.datadictionary;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.appsys.pojo.DataDictionary;

public interface DataDictionaryMapper {
	
	public List<DataDictionary> getDataDictionaryList(@Param("typeCode")String typeCode)throws Exception;
		
	public List<DataDictionary> getDataDictionaryListInfo(@Param("typeName")String typeName,@Param(value="from")Integer currentPageNo,@Param("pageSize")Integer pageSize)throws Exception;
	
	public int getDataDictionaryCount(@Param("typeName")String typeName)throws Exception;
	
	/*@Select("select college from university where un=#{un}")
    public List<University> collegeInfo(@Param("un") String un);*/
	
	public List<DataDictionary> getTypeName(@Param("typeCode") String typeCode);
}
