package com.lib.equipment.manager.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

public class Material {
    private Long id;
    @NotNull(message = "不能为空")
    private String name;
    @NotNull(message = "不能为空")
    private String specification;
    @NotNull(message = "不能为空")
    @DecimalMin("0.001")
    private Float price;
    @Digits(integer = 4, fraction = 2)
    private Float rate;
    private String remark;

    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material.id
     *
     * @param id the value for material.id
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material.name
     *
     * @return the value of material.name
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material.name
     *
     * @param name the value for material.name
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material.specification
     *
     * @return the value of material.specification
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material.specification
     *
     * @param specification the value for material.specification
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material.price
     *
     * @return the value of material.price
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    public Float getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material.price
     *
     * @param price the value for material.price
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material.rate
     *
     * @return the value of material.rate
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    public Float getRate() {
        return rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material.rate
     *
     * @param rate the value for material.rate
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    public void setRate(Float rate) {
        this.rate = rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material.remark
     *
     * @return the value of material.remark
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material.remark
     *
     * @param remark the value for material.remark
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}