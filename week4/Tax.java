void main() {
    IO.print("Enter your salary: ");
    double salary = Double.parseDouble(IO.readln());
    double tax = (10.0 / 100.0) * (salary);
    IO.println("salary = %.2f , tax = %.2f ".formatted(salary, tax));
}