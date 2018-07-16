package org.wecancodeit.reviewsiteration3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Comment {
	@Id
	@GeneratedValue
	private Long id;
	private String commenterName;
	@Lob
	private String commentContent;
	@ManyToOne
	private Review review;

	public Comment(String commenterName, String commentContent, Review review) {
		this.commenterName = commenterName;
		this.commentContent = commentContent;
		this.review = review;
	}

	public Long getId() {
		return id;
	}

	public String getCommenterName() {
		return commenterName;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public Review getReview() {
		return review;
	}

	public Comment() {
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", commenterName=" + commenterName + ", commentContent=" + commentContent
				+ ", review=" + review + "]";
	}
	
}