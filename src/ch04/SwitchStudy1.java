package ch04;

import java.util.Scanner;

public class SwitchStudy1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("사용하는 브라우저를 입력해주세요 : ");
        String browser = scan.nextLine();
        browser = browser.toLowerCase()
                .replaceAll(" ", "");

        switch (browser) {
            case "edge":
                System.out.println("Edge를 사용하고 계시네요");
                break;
            case "chrome":
            case "fireFox":
            case "safari":
            case "opera":
                System.out.println("저희 서비스가 지원하는 브라우저 입니다.");
                break;

            default:
                System.out.println("지원하는 브라우저가 아닙니다.");
                break;
        }
        //switch
        //Edge > "Edge를 사용하고 계시네요"

        //Chrome, Firefox, Safari, Opera 입력했다면 >
        // "저희 서비스가 지원하는 브라우저 입니다."

        //이외 내용을 입력했다면 > "지원하는 브라우저가 아닙니다."
    }
}
