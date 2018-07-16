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
		Category tragedy = categoryRepo.save(new Category("Tragedy"));
		Category comedy = categoryRepo.save(new Category("Comedy"));
		Category history = categoryRepo.save(new Category("History"));
		
		Tag denmark = tagRepo.save(new Tag("Denmark"));
		Tag scotland = tagRepo.save(new Tag("Scotland"));
		Tag italy = tagRepo.save(new Tag("Italy"));
		Tag england = tagRepo.save(new Tag("England"));
		Tag politics = tagRepo.save(new Tag("Politics"));
		Tag assassination = tagRepo.save(new Tag("Assassination"));
		Tag suicide = tagRepo.save(new Tag("Suicide"));
		Tag magic = tagRepo.save(new Tag("Magic"));
		Tag madness = tagRepo.save(new Tag("Madness"));
		Tag romance = tagRepo.save(new Tag("Romance"));
		
		Review hamlet = reviewRepo.save(new Review("Hamlet", "/img/hamlet.jpg", 5, tragedy,
				"The king of Denmark has been murdered by his own brother, Claudius, who now sits on the throne. A ghostly apparition "
				+ "of the dead king visits his son, Prince Hamlet, and orders the boy to avenge his death. Poor, grieving Hamlet can "
				+ "hardly believe what he's seen and wonders if he's lost his mind. Nonetheless, he resolves to obey the ghost's command. "
				+ "He obsessively plots to murder Claudius, mistakenly kills another man in the process, and survives an attempt on his "
				+ "own life. The body count begins to climb. Though Hamlet spends much of the play moping about his predicament and treating "
				+ "his girlfriend badly, he finally completes his mission - but at a terrible cost. What's great about this play is Hamlet "
				+ "himself, a tragic hero of remarkable psychological complexity, a mere teenager with an impossible burden on his shoulders.",
				denmark, politics, assassination, suicide, madness));
		Review macbeth = reviewRepo.save(new Review("Macbeth", "/img/macbeth.jpg", 4, tragedy,
				"Macbeth is a Scottish lord and military commander who serves his king faithfully, until he encounters three witches who "
				+ "foretell that Macbeth is destined to sit on the throne. The lust for power consumes Macbeth as well as his wife, who urges "
				+ "him to take the throne by any means necessary. Macbeth and Lady Macbeth soon welcome the king into their home, and in the "
				+ "night Macbeth gets the king's guards drunk and murders the sleeping king. In the morning, Macbeth pins the blame on the "
				+ "guards, who he then executes, and proclaims himself the new king. But heavy is the head that wears the crown. Lady Macbeth "
				+ "in particular is tormented by guilt over the regicide. Suffering from sleepwalking and hallucinations of blood on her hands, "
				+ "she eventually kills herself. King Macbeth, meanwhile, is doing all he can to maintain power; he becomes increasingly "
				+ "tyrannical, brutal, and paranoid as he attempts to eliminate everyone that opposes his reign. He trusts in the counsel of "
				+ "the three witches, whose prophecies he badly misinterprets, leading to his demise in an almost apocalyptic battle scene.",
				scotland, politics, assassination, suicide, madness, magic));
		Review juliusCaesar = reviewRepo.save(new Review("Julius Caesar", "/img/julius-caesar.jpg", 4, history,
				"Julius Caesar, the greatest general of his time, returns to Rome a hero after a successful military campaign. The people "
				+ "adore him and wish to make him their emperor. But in the words of the great philosopher Kanye West, \"No one man should "
				+ "have all that power.\" A group of Roman statesmen, led by Brutus and Cassius, conspire to protect their Republic from "
				+ "turning into a dictatorship, even if it means they have to kill the beloved Caesar. When they assassinate Caesar, the "
				+ "conspirators are forced to go on the run, until the Roman general Marc Antony hunts them down and brings them to justice. "
				+ "But in the end, Antony takes no joy in killing the assassins; he praises Brutus in particular for putting the good of the "
				+ "Republic above all else. In this way, the play does a fine job of presenting the virtues on both sides: though the "
				+ "conspirators must be judged for their terrible crime, the motive was nonetheless noble.",
				italy, politics, assassination, suicide));
		Review richard3 = reviewRepo.save(new Review("Richard III", "/img/richard-iii.jpg", 4, history,
				"Richard of York longs to be king. Now that the Wars of the Roses have ended with his family victorious, the only things "
				+ "standing between him and the crown are his older brothers and their sons. So, naturally, he kills them. One by one, "
				+ "those heirs to the throne fall prey to Richard's cunning plots and Machiavellian schemes, until nobody is left standing "
				+ "but Richard himself. But unfortunately for the newly crowned Richard III, his misdeeds have not gone unnoticed by the "
				+ "public, and he becomes such an unpopular king that a revolt is inevitable. The qualities that have allowed him to take "
				+ "the throne - his deceitfulness, his brutality, his utter disregard for what others think - will prove to be his undoing. "
				+ "Still, for the audience, there's a guilty pleasure as we watch this slimy political operator pulling all the right strings "
				+ "and executing his dastardly plan to take the crown.",
				england, politics, assassination));
		Review theTempest = reviewRepo.save(new Review("The Tempest", "/img/the-tempest.jpg", 5, comedy,
				"The Italian duke Prospero and his daughter Miranda have lived many years on a deserted island after Prospero's brother Antonio "
				+ "betrayed and exiled him in order to usurp his position. It turns out the island wasn't quite deserted after all, but "
				+ "inhabited by a number of mischievous spirits, whom Prospero - a powerful wizard - has learned to control. When Antonio and "
				+ "a party of companions set sail on their way back home from a wedding in North Africa, Prospero seizes the opportunity to "
				+ "get revenge on his brother, summoning a mighty storm and causing their ship to wreck on his island. Humorous shenanigans "
				+ "ensue. Miranda finds true love with one of the shipwrecked men. Prospero, aided by the magical spirits, has some fun "
				+ "tormenting the traitorous Antonio, but finally forgives him. The two brothers reunite and are reconciled. In the end, "
				+ "Prospero frees the spirits from his command and gives up the books that are the source of his magical powers, and "
				+ "everyone returns home to Italy to live happily ever after. Prospero makes for a great trickster, but it's a little messed "
				+ "up that he basically made the spirits of the island his personal slaves and put so many people in mortal danger by causing "
				+ "the shipwreck, but okay.",
				italy, magic, romance));
	}
}
