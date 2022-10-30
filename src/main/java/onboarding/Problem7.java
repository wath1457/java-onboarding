package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
0. friends 를 순회하면서 친구점수 리스트를 만듦(중복x) [name, score] + user_info 클래스 정의
1. friends 리스트를 순회하면서 user와 이미 친구인 사람은 추천목록에서 제외(친구제외 리스트에 추가, 친구 점수 리스트에는 점수를 -1점으로 설정)
2. user와 함께 아는사이(친구제외 리스트에 있는 사람) 과 친구이면 + 10
3. visitors에 들어있는 횟수만큼 + 1
4. 람다식을 이용하여 friends 리스트를 점수 내림차순, 이름 오름차순 정렬 후 answer 리스트에 추가
 */

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = new ArrayList<String>();
        List<List<String>> friends_score = makeFriendsScore(friends);
        return answer;
    }
    public static List<List<String>> makeFriendsScore(List<List<String>> friends) {
        List<String> name_list = new ArrayList<String>();
        List<List<String>>friends_score = new ArrayList<>();
        for (List<String> friend : friends) {
            for (String name : friend) {
                if (!name_list.contains(name))
                    name_list.add(name);
            }
        }
        for (String name : name_list) {

        }
    }
}
