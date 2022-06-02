package may_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AcmIcpcTeam {
    public static void main(String[] args) {
        List<String> topic = new ArrayList<>(Arrays.asList("10101","11100","11010","00101"));
        List<Integer> result = new ArrayList<>();
        result.add(0); // 최대 주제
        result.add(0); // 팀의 수
        // 최대 주제와 그 최대 주제를 알고있는 팀의 수
        int n = topic.size();
        int m = topic.get(1).length();
        // 인원수 반복문
        for(int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                // 문자열 반복문
                int topicCnt = 0;
                for(int strLen = 0; strLen < m; strLen++){
                    if(topic.get(i).charAt(strLen) == '1' || topic.get(j).charAt(strLen) == '1'){ // 한개 조가 알고 있는 토픽 개수
                        topicCnt++;
                    }
                }

                if(result.get(0) < topicCnt){  // 토픽 개수가 넘어설때
                    result.set(0, topicCnt);
                    result.set(1, 1);
                }else if(result.get(0) == topicCnt){ // 토픽 개수가 동일할때
                    result.set(1, result.get(1) + 1);
                }
            }
        }
        System.out.println(result);
    }
}
