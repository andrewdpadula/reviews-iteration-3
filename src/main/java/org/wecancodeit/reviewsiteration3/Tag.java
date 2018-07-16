package org.wecancodeit.reviewsiteration3;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
	@Id
	@GeneratedValue
	private Long id;
	private String name;

	@ManyToMany(mappedBy = "tags")
	private Collection<Review> reviews;


	public Tag() {
	}

	public Tag(String name) {
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
	
	public Collection<Review> getReviews() {
		return reviews;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Tag [id=" + id + ", name=" + name + ", reviews=" + reviews + "]";
	}
	

}
