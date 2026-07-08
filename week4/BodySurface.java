void main() {
    IO.print("Enter Wide: ");
    double wide = Double.parseDouble(IO.readln());

    IO.print("Enter length: ");
    double length = Double.parseDouble(IO.readln());

    double BSF = (wide * length) / 360.0;

    IO.println("wide = %.2f , length = %.2f , BSF = %.2f".formatted(wide, length, BSF));
}