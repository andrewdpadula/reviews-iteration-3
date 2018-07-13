package org.wecancodeit.reviewsiteration3;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue
	private Long id;
	private String reviewTitle;
	private String imageUrl;
	private int score;
	@Lob
	private String reviewContent;
	@ManyToOne
	private Category category;

	public Review() {
	}

	public Review(String reviewTitle, String imageUrl, int score, Category category, String reviewContent) {
		this.reviewTitle = reviewTitle;
		this.imageUrl = imageUrl;
		this.score = score;
		this.category = category;
		this.reviewContent = reviewContent;
	}

	public Category getCategory() {
		return category;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public int getScore() {
		return score;
	}

	public Long getId() {
		return id;
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", reviewTitle=" + reviewTitle + ", imageUrl=" + imageUrl + ", score=" + score
				+ ", reviewContent=" + reviewContent + ", category=" + category + "]";
	}




}
