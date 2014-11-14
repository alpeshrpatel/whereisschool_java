package edu.igroup.whereisschool.hibernate.entity;


import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the school_ratings database table.
 * 
 */
@Entity
@Table(name="school_ratings")
public class SchoolRating implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="review_rating_id", unique=true, nullable=false)
	private int reviewRatingId;

	@Column(name="date_entered", nullable=false)
	private Timestamp dateEntered;

	@Column(nullable=false)
	private byte helpful;

	@Column(name="review_id", nullable=false)
	private int reviewId;

	@Column(name="review_rating_comments", length=1000)
	private String reviewRatingComments;

    public SchoolRating() {
    }

	public int getReviewRatingId() {
		return this.reviewRatingId;
	}

	public void setReviewRatingId(int reviewRatingId) {
		this.reviewRatingId = reviewRatingId;
	}

	public Timestamp getDateEntered() {
		return this.dateEntered;
	}

	public void setDateEntered(Timestamp dateEntered) {
		this.dateEntered = dateEntered;
	}

	public byte getHelpful() {
		return this.helpful;
	}

	public void setHelpful(byte helpful) {
		this.helpful = helpful;
	}

	public int getReviewId() {
		return this.reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getReviewRatingComments() {
		return this.reviewRatingComments;
	}

	public void setReviewRatingComments(String reviewRatingComments) {
		this.reviewRatingComments = reviewRatingComments;
	}

}