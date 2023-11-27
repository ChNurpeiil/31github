package w12;

public class T3P3_SocialMediaPost {
    private String postContent;
    private int numberOfLikes;
    private int numberOfComment;

    public T3P3_SocialMediaPost(String postContent){
       this.postContent = postContent;
       this.numberOfLikes = 0;
       this.numberOfComment= 0;

    }
    public void likePost(){
        this.numberOfLikes++;
        System.out.println("Post is liked");
    }
    public void addComment(String comment){
        this.numberOfComment++;
        System.out.println("New comment: \""+ comment +"\"");
    }
    public void displayPostDetails(){
        System.out.println("Post Content: \"" + this.postContent + "\"");
        System.out.println("Number of Likes: " + this.numberOfLikes);
        System.out.println("Number of Comments: " + this.numberOfComment);
    }

    public static void main(String[] args) {
        T3P3_SocialMediaPost post = new T3P3_SocialMediaPost("This is a sample post.");

        post.displayPostDetails();

        post.likePost();
        post.addComment("Great post!");
        post.displayPostDetails();
    }
}
