public class onlineShopping {

    public static double calculateTotalPrice(int quantity, double pricePerItem){
        return quantity * pricePerItem;
    }

    public static double calculateTotalPrice(int quantity, double pricePerItem, double discountPercent){
        double totalPrice = quantity * pricePerItem;
        double discount = totalPrice * discountPercent/100;
        return totalPrice - discount;
    }
    public static void main(String[] args){
        double actualPrice = calculateTotalPrice(5, 200);
        double discountPrice = calculateTotalPrice(5, 200, 10);
        System.out.println("The actual price: "+actualPrice);
        System.out.println("Discount Price: "+discountPrice);
    }
}
