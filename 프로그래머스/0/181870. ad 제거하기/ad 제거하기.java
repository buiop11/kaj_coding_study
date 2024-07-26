import java.util.*;

class Solution {

    public String[] solution(String[] strArr) {
        
      List<String> temp = Arrays.asList(strArr);
    List<String> temp2 = new ArrayList<String>();
        for(int i=0; i<temp.size(); i++){
            if(temp.get(i).indexOf("ad") == -1){
                temp2.add(temp.get(i));
            }
        }
        
        String[] answer = temp2.toArray(String[]::new);
        
        return answer;
    }
}