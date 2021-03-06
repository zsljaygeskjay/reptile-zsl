package com.ehais.hrlucene.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;

import com.ehais.hrlucene.model.HaiHrPosition;
import com.ehais.hrlucene.model.HaiHrPositionExample;
import com.ehais.hrlucene.model.HaiHrPositionWithBLOBs;

public interface HaiHrPositionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_hr_position
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    @ResultMap(value = "BaseResultMap")
    List<HaiHrPosition> hai_hr_position_list(@Param("store_id") Integer store_id, @Param("start") Integer start, @Param("len") Integer len);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_hr_position
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    @ResultMap(value = "BaseResultMap")
    List<HaiHrPosition> hai_hr_position_list_by_example(HaiHrPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_hr_position
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    @ResultMap(value = "ResultMapWithBLOBs")
    HaiHrPosition get_hai_hr_position_info(@Param("store_id") Integer store_id, @Param("position_id") Long position_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_hr_position
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    int countByExample(HaiHrPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_hr_position
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    int deleteByExample(HaiHrPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_hr_position
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    int deleteByPrimaryKey(Long positionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_hr_position
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    int insert(HaiHrPositionWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_hr_position
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    int insertSelective(HaiHrPositionWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_hr_position
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    List<HaiHrPositionWithBLOBs> selectByExampleWithBLOBs(HaiHrPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_hr_position
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    List<HaiHrPosition> selectByExample(HaiHrPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_hr_position
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    HaiHrPositionWithBLOBs selectByPrimaryKey(Long positionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_hr_position
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    int updateByExampleSelective(@Param("record") HaiHrPositionWithBLOBs record, @Param("example") HaiHrPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_hr_position
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") HaiHrPositionWithBLOBs record, @Param("example") HaiHrPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_hr_position
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    int updateByExample(@Param("record") HaiHrPosition record, @Param("example") HaiHrPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_hr_position
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    int updateByPrimaryKeySelective(HaiHrPositionWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_hr_position
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(HaiHrPositionWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_hr_position
     *
     * @mbggenerated Sat Nov 19 19:43:25 CST 2016
     */
    int updateByPrimaryKey(HaiHrPosition record);
}