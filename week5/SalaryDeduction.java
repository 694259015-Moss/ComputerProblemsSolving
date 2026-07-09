void main() {
    IO.print("Enter your salary: ");
    double salary = Double.parseDouble(IO.readln());

    IO.print("Enter your deduction (%): ");
    double deduction = Double.parseDouble(IO.readln());

    double money = (deduction / 100.0) * (salary);
    double totalmoney = (salary - money);

    IO.println("Your Net Salary is: " + totalmoney);
    IO.println("Your deduction is: " + money);
}