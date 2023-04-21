package com.edu.dragon.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="cours_info")
public class CoursInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;

    
    @Column(name = "cours_name",length = 255) //课程名称
    private String coursName;
    
    @Column //省略默认列名就是属性名
    private String stage;
    
    @Column 
    private String grade;
    
    @Column(name = "cours_time",length = 10) //上课时间
    private String coursTime;
    
    @Column //教师
    private String teacher;
    
    @Column //地点
    private String addr;

    @CreatedDate
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "create_time",length = 20)
    private Date createTime;
    
    @LastModifiedDate
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "update_time",length = 20)
    private Date updateTime;
    
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

	public String getCoursName() {
		return coursName;
	}

	public void setCoursName(String coursName) {
		this.coursName = coursName;
	}

	public String getCoursTime() {
		return coursTime;
	}

	public void setCoursTime(String coursTime) {
		this.coursTime = coursTime;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(String deleteStatus) {
		this.deleteStatus = deleteStatus;
	}
}
