class WhatsApp {
    public static void main(String[] args) {
        verifyOtp(9108633340L, 123456);
    }

    static void verifyOtp(Long mobileNumber, Integer otp) {
        System.out.println("WhatsApp OTP Verification");
        System.out.println("Mobile: " + mobileNumber);
        System.out.println("OTP: " + otp);
    }
}
