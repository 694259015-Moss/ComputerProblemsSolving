void main() {
    IO.print("Enter your score: ");
    int num1 = Integer.parseInt(IO.readln());

    IO.print("Enter your score: ");
    int num2 = Integer.parseInt(IO.readln());

    IO.print("Enter your score: ");
    int num3 = Integer.parseInt(IO.readln());

    IO.print("Enter your bonus score: ");
    int num4 = Integer.parseInt(IO.readln());

    int score = num1 + num2 + num3;
    IO.print("Your score is: " + score);

    int totalscore = score + num4;
    IO.print(" Your total score is: " + totalscore);

    double avrg = totalscore / 3.0;
    IO.print(" Your average score is: " + avrg);
}