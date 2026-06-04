package Discussion10;

class Restaurant {

    double calculateTotalBill(double Price) {
        return Price + (Price * 0.10);
    }

    void estimateDeliveryTime() {
        System.out.println("Delivery Time  40 minutes");
    }
}

class FastFoodRestaurant extends Restaurant {

    double calculateTotalBill(double Price) {
        return Price + (Price * 0.15);
    }

    void estimateDeliveryTime() {
        System.out.println("Delivery Time: 20 minutes");
    }
}

class FineDiningRestaurant extends Restaurant {

    void estimateDeliveryTime() {
        System.out.println("Delivery Time: 60 minutes");
    }
}

public class Problem8b {

    public static void main(String[] args) {

        double Price = 1000;

        FastFoodRestaurant fast = new FastFoodRestaurant();
        FineDiningRestaurant fine = new FineDiningRestaurant();

    
        System.out.println("Fast Food Restaurant bill = " + fast.calculateTotalBill(Price));
        fast.estimateDeliveryTime();

        System.out.println();

        System.out.println("Fine Dining Restaurant bill = " + fine.calculateTotalBill(Price));
        fine.estimateDeliveryTime();
    }
}