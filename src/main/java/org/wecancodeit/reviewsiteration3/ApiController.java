package org.wecancodeit.reviewsiteration3;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
	@Autowired
	ReviewRepository reviewRepo;
	@Autowired
	CategoryRepository categoryRepo;
	@Autowired
	TagRepository tagRepo;

	@RequestMapping("/reviews")
	public Collection<Review> getReviews() {
		return (Collection<Review>) reviewRepo.findAll();
	}

	@RequestMapping("/reviews/{id}")
	public Review getReview(@PathVariable(name = "id") Long id) {
		return reviewRepo.findOne(id);
	}

}
