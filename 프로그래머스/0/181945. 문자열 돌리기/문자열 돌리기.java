import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] temp = a.split("");
        for(String b : temp){
            System.out.println(b);
        }
    }
}