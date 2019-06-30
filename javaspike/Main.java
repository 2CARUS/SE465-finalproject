public class Main {
    public static void main(String[] args) {
        Child child = (Child) new Parent("coolguy");

        System.out.println(child);


        child.setBirthOrder(1);


        System.out.println(child);
    }
}