void main() {
    IO.println("Enter the price of the product (Per unit) ");
    double pri = Double.parseDouble(IO.readln());

    IO.println("Enter the quanity of the product");
    double quan = Double.parseDouble(IO.readln());

    double total = pri * quan;

    if (quan > 10) {
        double dc = total * 10 / 100;
        double t10 = total - dc;
        IO.println("You get a 10% discount");
        IO.println("Discount is: " + dc);
        IO.println("Total price: " + t10);
    } else
        IO.println("Total price is: " + total);
}