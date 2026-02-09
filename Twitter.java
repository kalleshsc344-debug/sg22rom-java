class Twitter {
    public static void main(String[] args) {
        postTweet("@kallesh_sc", "Java is awesome");
    }

    static void postTweet(String handle, String tweet) {
        System.out.println("Twitter Post");
        System.out.println("Handle: " + handle);
        System.out.println("Tweet: " + tweet);
    }
}
