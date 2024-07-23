import java.util.*;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        List<String> list = Arrays.asList(a.split(""));
        Stream<String> stream = list.stream();
            stream.forEach(
                i ->{
                    if (Character.isLowerCase(i.charAt(0))) {
                        System.out.print(i.toUpperCase());
                      } else {
                        System.out.print(i.toLowerCase());
                      }
                }
            );
       
        
    }
}