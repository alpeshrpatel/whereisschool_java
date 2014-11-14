package edu.igroup.whereisschool.hibernate.entity;


import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the school_type database table.
 * 
 */
@Entity
@Table(name="school_type")
public class SchoolType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="school_type_id", unique=true, nullable=false)
	private int schoolTypeId;

	@Column(name="school_type_name", length=45)
	private String schoolTypeName;

    public SchoolType() {
    }

	public int getSchoolTypeId() {
		return this.schoolTypeId;
	}

	public void setSchoolTypeId(int schoolTypeId) {
		this.schoolTypeId = schoolTypeId;
	}

	public String getSchoolTypeName() {
		return this.schoolTypeName;
	}

	public void setSchoolTypeName(String schoolTypeName) {
		this.schoolTypeName = schoolTypeName;
	}

}