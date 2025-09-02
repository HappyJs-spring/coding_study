import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int value = sc.nextInt();
    
        System.out.println(value % 2 == 0 ? value + " is even" : value + " is odd");
    }
}