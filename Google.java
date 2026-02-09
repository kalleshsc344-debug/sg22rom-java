class Google {
    public static void main(String[] args) {
        enableSecurity("kallesh@gmail.com", true);
    }

    static void enableSecurity(String email, Boolean twoStep) {
        System.out.println("Google Security");
        System.out.println("Email: " + email);
        System.out.println("Two-Step Enabled: " + twoStep);
    }
}
