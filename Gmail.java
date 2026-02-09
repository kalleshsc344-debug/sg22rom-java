class Gmail {
    public static void main(String[] args) {
        sendMail("friend@gmail.com", "Java Assignment");
    }

    static void sendMail(String toEmail, String subject) {
        System.out.println("Gmail Send Mail");
        System.out.println("To: " + toEmail);
        System.out.println("Subject: " + subject);
    }
}
