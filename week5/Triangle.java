void main() {
    IO.print("Enter the base of the triangle: ");
    double bt = Double.parseDouble(IO.readln());

    IO.print("Enter the height of the triangle: ");
    double ht = Double.parseDouble(IO.readln());

    double at = (1.0 / 2.0) * bt * ht;
    IO.println("Area of the triangle: " + at + " square unit");

    IO.println("-----------------------------------------------");

    IO.print("Enter the length of the rectangle: ");
    double lr = Double.parseDouble(IO.readln());

    IO.print("Enter the width of the rectangle: ");
    double wr = Double.parseDouble(IO.readln());

    double ar = lr * wr;
    IO.println("Area of the triangle: " + ar + " square unit");
}