package edu.igroup.whereisschool.hibernate.entity;


import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the liked_entity database table.
 * 
 */
@Entity
@Table(name="liked_entity")
public class LikedEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="entity_id", unique=true, nullable=false, length=50)
	private String entityId;

	@Column(name="user_id", length=45)
	private String userId;

    public LikedEntity() {
    }

	public String getEntityId() {
		return this.entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}