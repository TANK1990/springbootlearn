package com.atguigu.dao;

import com.atguigu.entity.Coach;

public interface CoachMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach
     *
     * @mbggenerated Wed Mar 27 10:46:41 CST 2019
     */
    int deleteByPrimaryKey(Integer chId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach
     *
     * @mbggenerated Wed Mar 27 10:46:41 CST 2019
     */
    int insert(Coach record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach
     *
     * @mbggenerated Wed Mar 27 10:46:41 CST 2019
     */
    int insertSelective(Coach record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach
     *
     * @mbggenerated Wed Mar 27 10:46:41 CST 2019
     */
    Coach selectByPrimaryKey(Integer chId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach
     *
     * @mbggenerated Wed Mar 27 10:46:41 CST 2019
     */
    int updateByPrimaryKeySelective(Coach record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach
     *
     * @mbggenerated Wed Mar 27 10:46:41 CST 2019
     */
    int updateByPrimaryKey(Coach record);
}