package post;

public class Main {

    public static void main(String[] args) {

        Comment comment = new Comment("Have a nice trip");
        Comment comment2 = new Comment("Wow that's awesome");
        Post post = new Post("2018-06-21 13:05:44", "Traveling to New Zeland", "I'm going to visit this wonderful country", 12);
        post.addComment(comment);
        post.addComment(comment2);
        System.out.println(post);

        Comment comment3 = new Comment("Good night");
        Comment comment4 = new Comment("May the force be with you");
        Post post1 = new Post("28/07/2018 23:14:19", "Good night guys", "See you tommorow", 5);
        post1.addComment(comment3);
        post1.addComment(comment4);
        System.out.println(post1);


    }
}
