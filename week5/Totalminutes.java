void main() {
    int hours = Integer.parseInt(IO.readln("Enter your hours: "));
    int minutes = Integer.parseInt(IO.readln("Enter your minutes: "));

    int totalMinutes = hours * 60 + minutes;

    IO.println("Total minutes = " + totalMinutes);
}