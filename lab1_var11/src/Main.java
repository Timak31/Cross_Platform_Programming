public class Main {
    public static void main(String[] args) {
        Student student = new Student(11111, "CH-31", 19, true, 168, 58, "українець", "християнин", "31.03.1998", "МЮ", 123456);
        Worker worker = new Worker("апрувер", "Mindy Supports", 18, true, 175, 58.5, "укрпїнець", "християнин", "5.06.1999", "ВК", 654321);
        System.out.println(student.toString());
        System.out.println();
        System.out.println(worker.toString());
    }
}
