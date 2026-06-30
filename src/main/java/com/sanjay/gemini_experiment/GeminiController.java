package com.sanjay.gemini_experiment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@RestController
public class GeminiController {
    @Value("${gemini.api.key}")
    private String apiKey;

    @GetMapping("/ask")
    public ResponseEntity<String> ask(@RequestParam String question){
        RestTemplate restTemplate = new RestTemplate();

        Map<String, String> textArea = Map.of("text", question);
        Map<String, Object> partsArea = Map.of("parts", List.of(textArea));
        Map<String, Object> requestBody = Map.of("contents", List.of(partsArea));

        String url = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.5-flash:generateContent?key=" + apiKey;
        return restTemplate.postForEntity(url, requestBody, String.class);
    }
}
