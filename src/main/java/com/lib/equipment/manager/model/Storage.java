package com.lib.equipment.manager.model;

public class Storage {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column storage.id
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column storage.material_id
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    private Long materialId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column storage.num
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    private Byte num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column storage.place
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    private String place;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column storage.id
     *
     * @return the value of storage.id
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column storage.id
     *
     * @param id the value for storage.id
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column storage.material_id
     *
     * @return the value of storage.material_id
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    public Long getMaterialId() {
        return materialId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column storage.material_id
     *
     * @param materialId the value for storage.material_id
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column storage.num
     *
     * @return the value of storage.num
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    public Byte getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column storage.num
     *
     * @param num the value for storage.num
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    public void setNum(Byte num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column storage.place
     *
     * @return the value of storage.place
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    public String getPlace() {
        return place;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column storage.place
     *
     * @param place the value for storage.place
     *
     * @mbg.generated Thu Sep 19 20:02:21 CST 2019
     */
    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }
}