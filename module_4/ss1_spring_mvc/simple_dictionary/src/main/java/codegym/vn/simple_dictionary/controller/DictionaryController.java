package codegym.vn.simple_dictionary.controller;

import codegym.vn.simple_dictionary.model.Dictionary;
import codegym.vn.simple_dictionary.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    private IDictionaryService dictionaryService;

    @GetMapping("dictionary")
    public String displayTrans() {
        return "home";
    }

    @PostMapping("/dictionary")
    public String displayResult(@RequestParam String dictionary, Model model) {
        String result = dictionaryService.searchEnglish(dictionary);
        Dictionary newDictionary = new Dictionary(dictionary, result);
        model.addAttribute("newDictionary", newDictionary);
        return "home";
    }
}
