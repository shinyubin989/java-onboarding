package onboarding;

import java.util.*;

public class Problem6 {
    private static HashMap<String, String> map;
    private static HashMap<String, Integer> duplicationCountMap;
    private static List<String> output;

    public static List<String> solution(List<List<String>> forms) {
        init();
        putFormsToMap(forms);
        return output;
    }

    private static void init() {
        map = new HashMap<>();
        duplicationCountMap = new HashMap<>();
        output = new ArrayList<>();
    }

    private static void putFormsToMap(List<List<String>> forms) {
        for (List<String> list : forms) {
            map.put(list.get(1), list.get(0));
        }
    }

}
