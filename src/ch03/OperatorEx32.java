package ch03;

public class OperatorEx32 {
    public static void main(String[] args) {
        String gender = "w";

        String genderTitle = "w".equals(gender) ? "여성" : "남성";
        System.out.println(genderTitle);

        int x = 110, y = -15;
        int absX = x > 0 ? x : -x;//삼항식 true : false
        int absY = y > 0 ? y : -y;
        System.out.println(Math.abs(-100));

        System.out.println("absX : " + absX);
        System.out.println("absY : " + absY);
    }
}
