package post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private String moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> comments = new ArrayList<>();

    public Post(String moment, String title, String content, Integer likes){
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }
    public void addComment(Comment comment){
        comments.add(comment);
    }
    public String getTitle() {
        return title;
    }
    public String getMoment() {
        return moment;
    }
    public String getContent() {
        return content;
    }
    public Integer getLikes() {
        return likes;
    }

    public List<Comment> getComments() {
        return comments;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes + " Likes - ");
        sb.append(moment + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");
        for (Comment comment : comments){
            sb.append(comment.getText() + "\n");
        }
        return sb.toString();
    }
}
