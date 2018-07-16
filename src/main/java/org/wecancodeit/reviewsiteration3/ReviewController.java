package org.wecancodeit.reviewsiteration3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReviewController {

	@Autowired
	ReviewRepository reviewRepo;

	@Autowired
	CategoryRepository categoryRepo;

	@Autowired
	TagRepository tagRepo;

	@RequestMapping("/")
	public String home() {
		return "redirect:/reviews";
	}

	@RequestMapping("/reviews")
	public String getReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}

	@RequestMapping("/reviews/{id}")
	public String getReview(@PathVariable(name = "id") Long id, Model model) {
		model.addAttribute("review", reviewRepo.findOne(id));
		return "review";
	}

	@RequestMapping("/categories")
	public String getCategories(Model model) {
		model.addAttribute("categories", categoryRepo.findAll());
		return "categories";
	}

	@RequestMapping("/categories/{id}")
	public String getCategory(@PathVariable(name = "id") Long id, Model model) {
		model.addAttribute("category", categoryRepo.findOne(id));
		return "category";
	}

	@RequestMapping("/tags")
	public String getTags(Model model) {
		model.addAttribute("tags", tagRepo.findAll());
		return "tags";
	}

	@RequestMapping("/tags/{id}")
	public String getTag(@PathVariable(name = "id") Long id, Model model) {
		model.addAttribute("tag", tagRepo.findOne(id));
		return "tag";
	}
	
	@RequestMapping(value = "/reviews/{id}", method = RequestMethod.POST)
	public String addComment(String commenterName, String commentContent, String reviewTitle) {
		return "redirect:/reviews/{id}";
	}

	
}