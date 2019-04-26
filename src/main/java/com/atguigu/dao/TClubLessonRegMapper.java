package com.atguigu.dao;

import com.atguigu.entity.TClubLessonReg;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface TClubLessonRegMapper {
    int insert(TClubLessonReg record);

    int insertSelective(TClubLessonReg record);

    List<Map<Object,Object>> selectByClubId(@Param("clubId") String clubId, @Param("reg_date") Date reg_date);
    Map<Object,Object> selectSumByClubId(@Param("clubId") String clubId,@Param("reg_date") Date reg_date);

    int updateByPrimaryKeySelective(TClubLessonReg record);

    int updateByPrimaryKey(TClubLessonReg record);

    TClubLessonReg seletNumByDate(TClubLessonReg record);

    Map<Object,Object> selectByClubIdS(@Param("clubId") String clubId, @Param("reg_date") Date reg_date,@Param("course_type") String course_type);

}