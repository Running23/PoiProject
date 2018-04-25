package com.poiproject.mappers;

import com.poiproject.model.StudentAllData;
import com.poiproject.model.StudentAllDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentAllDataMapper {
    int countByExample(StudentAllDataExample example);

    int deleteByExample(StudentAllDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StudentAllData record);

    int insertSelective(StudentAllData record);

    List<StudentAllData> selectByExample(StudentAllDataExample example);

    StudentAllData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StudentAllData record, @Param("example") StudentAllDataExample example);

    int updateByExample(@Param("record") StudentAllData record, @Param("example") StudentAllDataExample example);

    int updateByPrimaryKeySelective(StudentAllData record);

    int updateByPrimaryKey(StudentAllData record);
}