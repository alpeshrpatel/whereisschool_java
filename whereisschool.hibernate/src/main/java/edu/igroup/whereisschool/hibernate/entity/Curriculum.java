package edu.igroup.whereisschool.hibernate.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the curriculum database table.
 * 
 */
@Entity
@Table(name="curriculum")
public class Curriculum implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="curriculum_id", unique=true, nullable=false)
	private int curriculumId;

	@Column(name="curriculum_name", length=45)
	private String curriculumName;

    public Curriculum() {
    }

	public int getCurriculumId() {
		return this.curriculumId;
	}

	public void setCurriculumId(int curriculumId) {
		this.curriculumId = curriculumId;
	}

	public String getCurriculumName() {
		return this.curriculumName;
	}

	public void setCurriculumName(String curriculumName) {
		this.curriculumName = curriculumName;
	}

}