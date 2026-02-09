class YouTube {
    public static void main(String[] args) {
        createChannel("TechWithKallesh", "kallesh@gmail.com");
    }

    static void createChannel(String channelName, String emailId) {
        System.out.println("YouTube Channel Creation");
        System.out.println("Channel: " + channelName);
        System.out.println("Email: " + emailId);
    }
}
