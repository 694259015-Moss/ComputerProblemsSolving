void main() {
    IO.println("Enter your age: ");
    int age = Integer.parseInt(IO.readln());
    if (age >= 60) {
        IO.println("เเก่ ");
    } else if (age >= 29) {
        IO.println("โต");
    } else if (age >= 19) {
        IO.println("จัดปายวายรุ่น");
    } else if (age >= 9) {
        IO.println("เด็ก");
    } else if (age > 120) {
        IO.println("เเก่ไปน้องชายพี่");
    }
}