package dwolf.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Post {
    private int id;
    private Date createdDate;
    private String content;
    private int likes;
    private List<String> comments;


    public Post(int id, Date createdDate, String content, int likes, List<String> comments) {
        this.id = id;
        this.createdDate = createdDate;
        this.content = content;
        this.likes = likes;
        this.comments = comments;
    }
    public static void main(String[] args) {
        Post post = new Post(
                1,
                new Date(),
                "I learned how to use jackson!",
                10,
                Arrays.asList("Well done!", "Great job!")
        );

        ObjectMapper objectMapper = new ObjectMapper();

        String postAsString = objectMapper.writeValueAsString(post);

        System.out.println(postAsString);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }
}