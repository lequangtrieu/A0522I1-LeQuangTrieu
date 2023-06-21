package codegym.vn.simple_dictionary.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DictionaryRepositoryImpl implements IDictionaryRepository{
    private static Map<String, String> map;

    static {
        map = new HashMap<>();
        map.put("dog", "chó");
        map.put("cat", "mèo");
        map.put("hen", "gà");
    }

    @Override
    public String searchEnglish(String english) {
        if (map.containsKey(english)) {
            return map.get(english);
        }
        return "no exist in dictionary";
    }
}
