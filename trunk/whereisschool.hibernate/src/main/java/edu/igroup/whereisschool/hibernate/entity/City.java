package edu.igroup.whereisschool.hibernate.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the cities database table.
 * 
 */
@Entity
@Table(name="cities")
public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="city_id", unique=true, nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long cityId;

	@Column(name="city_name", nullable=false, length=100)
	private String cityName;

	@Column(nullable=false, length=100)
	private String stateid;

    public City() {
    }

	public Long getCityId() {
		return this.cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateid() {
		return this.stateid;
	}

	public void setStateid(String stateid) {
		this.stateid = stateid;
	}

}