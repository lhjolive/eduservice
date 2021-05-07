package com.edu.dragon.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cours_info")
public class CoursInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;

    @Column //省略默认列名就是属性名
    private String stage;
    
    @Column 
    private String grade;
    
    @Column(name = "grade_detail",length = 10) 
    private String gradeDetail;
    
    @Column(name = "cours_type",length = 10)
    private String coursType;
    
    @Column(name = "create_time",length = 20)
    private String createTime;
    
    @Column(name = "update_time",length = 20)
    private String updateTime;
    
    @Column(name = "delete_status",length = 1)
    private String deleteStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getGradeDetail() {
		return gradeDetail;
	}

	public void setGradeDetail(String gradeDetail) {
		this.gradeDetail = gradeDetail;
	}

	public String getCoursType() {
		return coursType;
	}

	public void setCoursType(String coursType) {
		this.coursType = coursType;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(String deleteStatus) {
		this.deleteStatus = deleteStatus;
	}
}
