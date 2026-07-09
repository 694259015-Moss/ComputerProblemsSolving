void main() {
    IO.print("Enter your intitial saving: ");
    double intsaving = Double.parseDouble(IO.readln());

    IO.print("Enter your monthly saving: ");
    double month = Double.parseDouble(IO.readln());

    IO.print("Enter your month saving: ");
    double msave = Double.parseDouble(IO.readln());

    IO.print("Enter interest percent: ");
    double inter = Double.parseDouble(IO.readln());

    double totalsaving = intsaving + month * msave;
    IO.println("Your saving before interest is: " + totalsaving + " bath");

    double interest = totalsaving * inter / 100;
    IO.println("Your interest is: " + interest + " bath");

    double Final = totalsaving + interest;
    IO.println("Your final saving is: " + Final + " bath");
}