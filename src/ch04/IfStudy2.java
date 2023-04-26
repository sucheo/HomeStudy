package ch04;

import java.util.Scanner;

public class IfStudy2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int PRICE = 10_000;
        System.out.print("나이를 입력해 주세요: ");
        int age = scan.nextInt();
        int calcPrice = PRICE;

        if(age < 20) {
            calcPrice *= 0.9;
        } else if(age >= 30) {
            calcPrice *= 0.8;
        }
        System.out.printf("%d세의 미용 금액은 %,d입니다.",
                age, calcPrice);
        //20미만이면 10% 할인 금액
        //30이상이면 20% 할인 금액
        //나머지는 10,000원 출력
        //(천단위 콤마)
    }
}
