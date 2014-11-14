package edu.igroup.whereisschool.hibernate.entity;


import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the school_reviews database table.
 * 
 */
@Entity
@Table(name="school_reviews")
public class SchoolReview implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="review_id", unique=true, nullable=false)
	private int reviewId;

	@Column(nullable=false)
	private byte rating;

    @Lob()
	@Column(nullable=false)
	private String review;

	@Column(name="review_date", nullable=false)
	private Timestamp reviewDate;

	@Column(name="reviewer_email", nullable=false, length=60)
	private String reviewerEmail;

	@Column(name="reviewer_name", nullable=false, length=60)
	private String reviewerName;

	@Column(name="school_id", nullable=false)
	private int schoolId;

    public SchoolReview() {
    }

	public int getReviewId() {
		return this.reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public byte getRating() {
		return this.rating;
	}

	public void setRating(byte rating) {
		this.rating = rating;
	}

	public String getReview() {
		return this.review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Timestamp getReviewDate() {
		return this.reviewDate;
	}

	public void setReviewDate(Timestamp reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getReviewerEmail() {
		return this.reviewerEmail;
	}

	public void setReviewerEmail(String reviewerEmail) {
		this.reviewerEmail = reviewerEmail;
	}

	public String getReviewerName() {
		return this.reviewerName;
	}

	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}

	public int getSchoolId() {
		return this.schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

}