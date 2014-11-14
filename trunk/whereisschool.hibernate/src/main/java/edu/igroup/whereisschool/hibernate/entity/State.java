package edu.igroup.whereisschool.hibernate.entity;


import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the states database table.
 * 
 */
@Entity
@Table(name="states")
public class State implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int stateid;

	@Column(length=45)
	private String statename;

    public State() {
    }

	public int getStateid() {
		return this.stateid;
	}

	public void setStateid(int stateid) {
		this.stateid = stateid;
	}

	public String getStatename() {
		return this.statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

}