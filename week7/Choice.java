void main() {
    IO.println("Enter your number: ");
    int num = Integer.parseInt(IO.readln());
    if (num <= 1) {
        IO.println("Enter the base of the triangle: ");
        double tri = Double.parseDouble(IO.readln());

        IO.println("Enter the height of the triangle: ");
        double hei = Double.parseDouble(IO.readln());

        double area = (tri * hei) / 2.0;

        IO.println("Area of the triangle: " + area);
    } else
        IO.println("Enter your weight in kilograms: ");
    double kg = Double.parseDouble(IO.readln());

    IO.println("Enter your height in meters: ");
    double he = Double.parseDouble(IO.readln());

    double bmi = kg / (he * he);
    IO.println("Your BMI for weight " + kg + " kg " + he + " meters " + " bmi: " + bmi);
}