class Swiggy {
    public static void main(String[] args) {
        orderFood("Biryani House", 850.50f);
    }

    static void orderFood(String restaurant, Float billAmount) {
        System.out.println("Swiggy Order");
        System.out.println("Restaurant: " + restaurant);
        System.out.println("Bill Amount: " + billAmount);
    }
}
