void main() {
    IO.println("Enter your number: ");
    int num = Integer.parseInt(IO.readln());

    if (num > 0) {
        IO.println("Positive number");
    } else
        IO.println("Negative number");

    IO.println("End");
}