
void main() {
    IO.println("Are you male (true or false)");
    boolean ismale = Boolean.parseBoolean(IO.readln());

    IO.println("Enter your wieght (KG):");
    int w = Integer.parseInt(IO.readln());

    IO.println("Enter your height (CM):");
    int h = Integer.parseInt(IO.readln());

    IO.println("Enter your age:");
    int a = Integer.parseInt(IO.readln());

    double bmr;
    if (ismale) {
        bmr = 66 + (13.7 * w) + (5 * h) - (6.8 * a);
    } else
        bmr = 655 + (9.6 * w) + (1.8 * h) - (4.7 * a);
    IO.println("Your Bmr is: " + bmr);
}