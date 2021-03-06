package org.ehais.weixin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.ehais.weixin.model.WpAuthGroup;
import org.ehais.weixin.model.WpAuthGroupExample;
import org.ehais.weixin.model.WpAuthGroupWithBLOBs;

public interface WpAuthGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_auth_group
     *
     * @mbggenerated Wed Apr 06 16:53:05 CST 2016
     */
    @ResultMap(value = "BaseResultMap")
    List<WpAuthGroup> wp_auth_group_list(@Param("store_id") Integer store_id, @Param("start") Integer start, @Param("len") Integer len);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_auth_group
     *
     * @mbggenerated Wed Apr 06 16:53:05 CST 2016
     */
    @ResultMap(value = "BaseResultMap")
    List<WpAuthGroup> wp_auth_group_list_by_example(WpAuthGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_auth_group
     *
     * @mbggenerated Wed Apr 06 16:53:05 CST 2016
     */
    int countByExample(WpAuthGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_auth_group
     *
     * @mbggenerated Wed Apr 06 16:53:05 CST 2016
     */
    int deleteByExample(WpAuthGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_auth_group
     *
     * @mbggenerated Wed Apr 06 16:53:05 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_auth_group
     *
     * @mbggenerated Wed Apr 06 16:53:05 CST 2016
     */
    int insert(WpAuthGroupWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_auth_group
     *
     * @mbggenerated Wed Apr 06 16:53:05 CST 2016
     */
    int insertSelective(WpAuthGroupWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_auth_group
     *
     * @mbggenerated Wed Apr 06 16:53:05 CST 2016
     */
    List<WpAuthGroupWithBLOBs> selectByExampleWithBLOBs(WpAuthGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_auth_group
     *
     * @mbggenerated Wed Apr 06 16:53:05 CST 2016
     */
    List<WpAuthGroup> selectByExample(WpAuthGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_auth_group
     *
     * @mbggenerated Wed Apr 06 16:53:05 CST 2016
     */
    WpAuthGroupWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_auth_group
     *
     * @mbggenerated Wed Apr 06 16:53:05 CST 2016
     */
    int updateByExampleSelective(@Param("record") WpAuthGroupWithBLOBs record, @Param("example") WpAuthGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_auth_group
     *
     * @mbggenerated Wed Apr 06 16:53:05 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") WpAuthGroupWithBLOBs record, @Param("example") WpAuthGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_auth_group
     *
     * @mbggenerated Wed Apr 06 16:53:05 CST 2016
     */
    int updateByExample(@Param("record") WpAuthGroup record, @Param("example") WpAuthGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_auth_group
     *
     * @mbggenerated Wed Apr 06 16:53:05 CST 2016
     */
    int updateByPrimaryKeySelective(WpAuthGroupWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_auth_group
     *
     * @mbggenerated Wed Apr 06 16:53:05 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(WpAuthGroupWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_auth_group
     *
     * @mbggenerated Wed Apr 06 16:53:05 CST 2016
     */
    int updateByPrimaryKey(WpAuthGroup record);
}