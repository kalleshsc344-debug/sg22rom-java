class Zomato {
    public static void main(String[] args) {
        submitReview("Biryani House", 5);
    }

    static void submitReview(String restaurant, Integer rating) {
        System.out.println("Zomato Review");
        System.out.println("Restaurant: " + restaurant);
        System.out.println("Rating: " + rating);
    }
}
