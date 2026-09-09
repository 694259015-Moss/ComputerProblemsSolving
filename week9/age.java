void main() {
    IO.println("Enter your age: ");
    int age = Integer.parseInt(IO.readln());
    if ((age <= 0) || (age >= 120)) {
        IO.println("อย่าให้มีครั้งที่ 2 ");
    } else if (age <= 9) {
        IO.println("YoungGuu");
    } else if (age <= 19) {
        IO.println("จัดปายวายรุ่น");
    } else if (age <= 59) {
        IO.println("โต");
    } else
        IO.println("วัยรุ่นฟันปลอม");
}