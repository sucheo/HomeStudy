import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "성수천";
        System.out.println("나이를 입력하세요");

        String a = sc.nextLine(); 
        int age = Integer.parseInt(a);

        System.out.println("제나이는 " + age + "살 이고 이름은 " + name +"입니다.");


    }
}
