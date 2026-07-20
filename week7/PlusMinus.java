void main() {
    IO.println("Enter your number: ");
    int num = Integer.parseInt(IO.readln());

    IO.println("Enter your number: ");
    int num2 = Integer.parseInt(IO.readln());

    int total = num - num2;
    int t = num2 + num;

    if (num > num2) {
        IO.println("Your total number is: " + total);
    } else
        IO.println("Your total number is: " + t);
}