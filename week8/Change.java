void main() {
    IO.println("Enter the price");
    int pri = Integer.parseInt(IO.readln());

    IO.println("Enter amount to buy:");
    int per = Integer.parseInt(IO.readln());

    int pay = pri * per;
    IO.println("Your total price is: " + pay);

    int change = 1000 - pay;

    if (pay < 1000) {
        IO.println("Your change is: " + change);
        int b500 = change / 500;
        change = change % 500;
        IO.println("Your five hundred note: " + b500);

        int b100 = change / 100;
        change = change % 100;
        IO.println("Your hundred note: " + b100);

        int b50 = change / 50;
        change = change % 50;
        IO.println("Your fifty note: " + b50);

        int b20 = change / 20;
        change = change % 20;
        IO.println("Your twenty note: " + b20);

        int c10 = change / 10;
        change = change % 10;
        IO.println("Your ten coin: " + c10);

        int c5 = change / 5;
        change = change % 5;
        IO.println("Your five coin: " + c5);

        int c2 = change / 2;
        change = change % 2;
        IO.println("Your two coin: " + c2);

        int c1 = change / 1;
        change = change % 1;
        IO.println("Your one coin: " + c1);
    } else
        IO.println("Not enough money!!! ");
}