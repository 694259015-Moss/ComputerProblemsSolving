void main() {
    IO.print("Enter your farenheit: ");
    double farenheit = Double.parseDouble(IO.readln());

    double celsius = (5.0 / 9.0) * (farenheit - 32);
    IO.println("celsius = %.2f , farenheit = %.2f , celsius = %.2f".formatted(celsius, farenheit, celsius));

}