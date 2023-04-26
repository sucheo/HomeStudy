package ch03;

public class OperatorEx24 {
    public static void main(String[] args) {
        boolean r1 = false && (10 / 0 > 0) && false; //false
        System.out.println(r1);

        boolean r2 = true || (10 / 0 > 0) || true;
        System.out.println(r2);



    }
}
