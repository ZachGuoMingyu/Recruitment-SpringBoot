package com.briup.apps.zhaopin.bean;

import java.util.Date;

public class Collect {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zp_collect.id
     *
     * @mbg.generated Fri Sep 27 11:17:20 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zp_collect.jobhunter_id
     *
     * @mbg.generated Fri Sep 27 11:17:20 CST 2019
     */
    private Long jobhunterId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zp_collect.employment_id
     *
     * @mbg.generated Fri Sep 27 11:17:20 CST 2019
     */
    private Long employmentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zp_collect.collect_time
     *
     * @mbg.generated Fri Sep 27 11:17:20 CST 2019
     */
    private Date collectTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zp_collect.id
     *
     * @return the value of zp_collect.id
     *
     * @mbg.generated Fri Sep 27 11:17:20 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zp_collect.id
     *
     * @param id the value for zp_collect.id
     *
     * @mbg.generated Fri Sep 27 11:17:20 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zp_collect.jobhunter_id
     *
     * @return the value of zp_collect.jobhunter_id
     *
     * @mbg.generated Fri Sep 27 11:17:20 CST 2019
     */
    public Long getJobhunterId() {
        return jobhunterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zp_collect.jobhunter_id
     *
     * @param jobhunterId the value for zp_collect.jobhunter_id
     *
     * @mbg.generated Fri Sep 27 11:17:20 CST 2019
     */
    public void setJobhunterId(Long jobhunterId) {
        this.jobhunterId = jobhunterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zp_collect.employment_id
     *
     * @return the value of zp_collect.employment_id
     *
     * @mbg.generated Fri Sep 27 11:17:20 CST 2019
     */
    public Long getEmploymentId() {
        return employmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zp_collect.employment_id
     *
     * @param employmentId the value for zp_collect.employment_id
     *
     * @mbg.generated Fri Sep 27 11:17:20 CST 2019
     */
    public void setEmploymentId(Long employmentId) {
        this.employmentId = employmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zp_collect.collect_time
     *
     * @return the value of zp_collect.collect_time
     *
     * @mbg.generated Fri Sep 27 11:17:20 CST 2019
     */
    public Date getCollectTime() {
        return collectTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zp_collect.collect_time
     *
     * @param collectTime the value for zp_collect.collect_time
     *
     * @mbg.generated Fri Sep 27 11:17:20 CST 2019
     */
    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }
}