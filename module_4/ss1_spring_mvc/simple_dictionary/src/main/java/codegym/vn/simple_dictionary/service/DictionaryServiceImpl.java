package codegym.vn.simple_dictionary.service;

import codegym.vn.simple_dictionary.repository.IDictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceImpl implements IDictionaryService{
    @Autowired
    private IDictionaryRepository dictionaryRepository;
    @Override
    public String searchEnglish(String english) {
        return dictionaryRepository.searchEnglish(english);
    }
}
