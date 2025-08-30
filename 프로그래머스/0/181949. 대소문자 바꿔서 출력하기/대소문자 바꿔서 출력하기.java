import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();  // Enter까지 입력된 모든 문자 읽기
		
        // String immutable(불변)
        // StringBuilder mutable(가변)
        StringBuilder output = new StringBuilder();

        
        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);

            if (Character.isUpperCase(tmp)) {
                output.append(Character.toLowerCase(tmp));
            } else if (Character.isLowerCase(tmp)) {
                output.append(Character.toUpperCase(tmp));
            } else {
                output.append(tmp);
            }
        }
        
        System.out.println(output.toString());
    }
}