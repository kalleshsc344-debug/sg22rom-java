class Paytm {
    public static void main(String[] args) {
        walletTopUp("kallesh_paytm", 500.0f);
    }

    static void walletTopUp(String userName, Float amount) {
        System.out.println("Paytm Wallet Top-up");
        System.out.println("User: " + userName);
        System.out.println("Amount: " + amount);
    }
}
