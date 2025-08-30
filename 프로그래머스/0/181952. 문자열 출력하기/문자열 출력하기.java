import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력 받을 준비
        
        // 다음 토큰(token)을 읽어오는 메서드
        // "토큰": 공백(스페이스, 탭, 줄바꿈 등)으로 구분된 문자열 단위
        String str = sc.next(); // 실제로 입력 읽기
        System.out.println(str);
    }
}