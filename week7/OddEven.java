void main() {
    IO.println("Enter your number: ");
    int num = Integer.parseInt(IO.readln());

    if (num % 2 == 0) {
        IO.println("Even number");
    } else
        IO.println("Odd number");

    IO.println("End");
}