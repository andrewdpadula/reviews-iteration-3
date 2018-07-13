package org.wecancodeit.reviewsiteration3;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class ReviewPopulator implements CommandLineRunner {
	@Resource
	private ReviewRepository reviewRepo;
	@Resource
	private CategoryRepository categoryRepo;
	@Resource
	private TagRepository tagRepo;

	public ReviewPopulator() {

	}

	@Override
	public void run(String... args) throws Exception {
		Category food = categoryRepo.save(new Category("Food"));
		Category pets = categoryRepo.save(new Category("Pets"));
		Category travel = categoryRepo.save(new Category("Travel"));
		Category lifestyle = categoryRepo.save(new Category("Lifestyle"));
		Review eatingVegetables = reviewRepo.save(new Review("Eating Vegetables", "/img/vegetables.jpg", 3, food,
				"Vegetables are food for herbivorous animals such as hamsters, giraffes, and hippies. They have a window of about 48 hours in which they are ripe and relatively tasty; before this window they are bitter and hard, and after it they are squishy and rotten. Fortunately they are cheap and easy to cook. Eating them daily results in good health and longevity."));
		Review raisingAParakeet = reviewRepo.save(new Review("Raising a parakeet", "/img/parakeet.jpg", 2, pets,
				"Parakeets are cool birds that produce uncool messes. Though they live in cages, their excrement will frequently make its way onto your walls and floor. Parakeets enjoy biting people who try to touch them, eating seeds, laying eggs, and making noise when you are trying to sleep."));
		Review visitingNashville = reviewRepo.save(new Review("Visiting Nashville", "/img/nashville.jpg", 4, travel,
				"Nashville is a beautiful city full of history and dorky tourists. It is famed for its hot chicken, country music, scenic views, and historic landmarks. Check out the fried balogna sandwiches at Robert's Western World. If you like Johnny Cash, you should visit the Johnny Cash Museum; otherwise, you shouldn't."));
		Review havingAMustache = reviewRepo.save(new Review("Having a mustache", "/img/mustache.jpg", 5, lifestyle,
				"A mustache, also called a flavor saver, is a must for any sophisticated gentleman. Despite its ability to turn even the most bland face into a work of art, the mustache has unfortunate connotations for some people. If you are a rugged individualist looking to stand out from the rabble, the mustache just might be right for you."));
		Tag positiveReview = tagRepo.save(new Tag("Positive Review", visitingNashville, havingAMustache));
		Tag negativeReview = tagRepo.save(new Tag("Negative Review", eatingVegetables, raisingAParakeet));
	}
}
