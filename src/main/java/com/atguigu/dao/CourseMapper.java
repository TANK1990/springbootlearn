package com.atguigu.dao;

import com.atguigu.entity.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseMapper {
    int deleteByPrimaryKey(String courseId);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(String courseId);

    List<Course> selectByClubId(@Param("clubId") String clubId, @Param("try_flag") String try_flag);
    List<Course> selectByCoachId(@Param("coachId") String coachId, @Param("try_flag") String try_flag);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

    String selectMaxCourseId();
}