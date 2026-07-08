void main() {
    IO.print("Enter your distance: ");
    int distance = Integer.parseInt(IO.readln());

    IO.print("Enter Fuel Efficiency (lit/km): ");
    int Effi = Integer.parseInt(IO.readln());

    IO.print("Enter fuel price per litter: ");
    int price = Integer.parseInt(IO.readln());

    double used = 5.0;
    double cost = 60.0;
    int fuel = distance / Effi;
    double costed = used * price;

    IO.println("Your Fuel is Used " + fuel);
    IO.println("Your Total Costed " + costed);
}