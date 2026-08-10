void main() {
    IO.println("Enter your first number ");
    int num1 = Integer.parseInt(IO.readln());

    IO.println("Enter your second number: ");
    int num2 = Integer.parseInt(IO.readln());

    IO.println("Your first number is: " + num1);
    IO.println("Your second number is: " + num2);

    if (num2 > num1) {
        IO.println("The second number is more than the first number... I ain't doing allat bye");
    } else
        IO.println("Mambo");
}