package edu.igroup.whereisschool.hibernate.entity;


import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the school database table.
 * 
 */
@Entity
@Table(name="school")
public class School implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="school_id", unique=true, nullable=false)
	private String schoolId;

	@Column(length=500)
	private String address;

	@Column(name="city_id", length=45)
	private String cityId;

	@Column(length=5)
	private String rating;

	@Column(name="school_name", length=500)
	private String schoolName;

	@Column(length=45)
	private String schooltype;

	@Column(length=45)
	private String zipcode;

    public School() {
    }

	public String getSchoolId() {
		return this.schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCityId() {
		return this.cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getSchoolName() {
		return this.schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchooltype() {
		return this.schooltype;
	}

	public void setSchooltype(String schooltype) {
		this.schooltype = schooltype;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}