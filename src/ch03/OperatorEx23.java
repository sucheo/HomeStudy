package ch03;

public class OperatorEx23 {
    public static void main(String[] args) {
        String n1 = "Hello";
        String n2 = "Hello";
        String n3 = new String("Hello");
        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));

        System.out.println(n1 == n3);
        System.out.println(n1.equals(n3));
    }
}
