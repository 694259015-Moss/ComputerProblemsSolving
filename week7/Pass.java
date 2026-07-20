void main() {
    IO.println("Enter your midterm score: ");
    int mid = Integer.parseInt(IO.readln());

    IO.println("Enter your final score: ");
    int fin = Integer.parseInt(IO.readln());

    int total = mid + fin;

    if (total >= 50) {
        IO.println("Your total score is " + total + " The result is Pass!!");
    } else
        IO.println("Your total score is " + total + "The result is Failed!!");
}