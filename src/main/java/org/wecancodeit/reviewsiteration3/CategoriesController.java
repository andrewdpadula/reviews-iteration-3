/*package org.wecancodeit.reviewsiteration3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoriesController {

	@Autowired
	CategoryRepository categoryRepo;
	
	@Autowired
	ReviewRepository reviewRepo;

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
}
*/