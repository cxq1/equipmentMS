package com.lib.equipment.manager.mapper;

import com.lib.equipment.manager.model.InStorage;
import com.lib.equipment.manager.model.InStorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface InStorageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_storage
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    long countByExample(InStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_storage
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    int deleteByExample(InStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_storage
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_storage
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    int insert(InStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_storage
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    int insertSelective(InStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_storage
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    List<InStorage> selectByExampleWithRowbounds(InStorageExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_storage
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    List<InStorage> selectByExample(InStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_storage
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    InStorage selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_storage
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    int updateByExampleSelective(@Param("record") InStorage record, @Param("example") InStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_storage
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    int updateByExample(@Param("record") InStorage record, @Param("example") InStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_storage
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    int updateByPrimaryKeySelective(InStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_storage
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    int updateByPrimaryKey(InStorage record);
}