package org.wecancodeit.reviewsiteration3;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {

//	Review findByName(String review);

}
