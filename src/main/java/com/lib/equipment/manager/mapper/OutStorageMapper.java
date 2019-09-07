package com.lib.equipment.manager.mapper;

import com.lib.equipment.manager.model.OutStorage;
import com.lib.equipment.manager.model.OutStorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OutStorageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_storage
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    long countByExample(OutStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_storage
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    int deleteByExample(OutStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_storage
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_storage
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    int insert(OutStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_storage
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    int insertSelective(OutStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_storage
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    List<OutStorage> selectByExampleWithRowbounds(OutStorageExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_storage
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    List<OutStorage> selectByExample(OutStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_storage
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    OutStorage selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_storage
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    int updateByExampleSelective(@Param("record") OutStorage record, @Param("example") OutStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_storage
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    int updateByExample(@Param("record") OutStorage record, @Param("example") OutStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_storage
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    int updateByPrimaryKeySelective(OutStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_storage
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    int updateByPrimaryKey(OutStorage record);
}