void main() {
    IO.print("Enter your weight: ");
    double num1 = Double.parseDouble(IO.readln());

    IO.print("Enter your height: ");
    double num2 = Double.parseDouble(IO.readln());

    double bmi = (Math.round((num1 / (num2 * num2)) * 100.0) / 100.0);

    IO.println("Weight = %.2f kg, Height = %.2f m, BMI = %.2f".formatted(num1, num2, bmi));
}