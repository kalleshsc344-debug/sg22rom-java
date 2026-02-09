class Netflix {
    public static void main(String[] args) {
        choosePlan("kallesh_netflix", "Standard");
    }

    static void choosePlan(String userName, String plan) {
        System.out.println("Netflix Plan Selection");
        System.out.println("Username: " + userName);
        System.out.println("Plan: " + plan);
    }
}
