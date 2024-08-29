package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DataService {
    private List<Send> sendlist;
    
    public DataService() {
        sendlist = Arrays.asList(
            new Send (1, "Иванов", 3, true),
            new Send (2, "Петров", 4, true),
            new Send (3, "Сидоров", 5, true)
        );
    }
    
    public List<Send> getAllData() {
        return sendlist;
    }

    public Send getData(String text) {
        return sendlist.stream()
                .filter(s -> s.getText().equalsIgnoreCase(text))
                .findFirst()
                .orElse(null);
    }    

    public String getData() {
        String result = "";
        for (int i = 0; i < sendlist.size(); i++) {
            result = result + sendlist.get(i).getText() + " " + sendlist.get(i).getRate() + "\n";
        }
        return result;
    }
}