package com.lib.equipment.manager.mapper;

import com.lib.equipment.manager.model.Material;
import com.lib.equipment.manager.model.MaterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MaterialMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    long countByExample(MaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    int deleteByExample(MaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    int insert(Material record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    int insertSelective(Material record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    List<Material> selectByExampleWithRowbounds(MaterialExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    List<Material> selectByExample(MaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    Material selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    int updateByExampleSelective(@Param("record") Material record, @Param("example") MaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    int updateByExample(@Param("record") Material record, @Param("example") MaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    int updateByPrimaryKeySelective(Material record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material
     *
     * @mbg.generated Sat Sep 07 09:15:14 CST 2019
     */
    int updateByPrimaryKey(Material record);
}