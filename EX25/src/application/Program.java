package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		Post post1, post2;
		Comment comment;

		post1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44", formatter), "Traveling to New Zealand",
				"I'm going to visit this worderful country!", 12);
		comment = new Comment("Have a nice trip");
		post1.addComment(comment);
		comment = new Comment("Wow that's awesome!");
		post1.addComment(comment);
		System.out.println(post1);

		post2 = new Post(LocalDateTime.parse("28/07/2018 23:14:19", formatter), "Good night guys", "See you tomorrow",
				5);
		comment = new Comment("Good night");
		post2.addComment(comment);
		comment = new Comment("May the Force be with you");
		post2.addComment(comment);
		System.out.println(post2);
	}

}
