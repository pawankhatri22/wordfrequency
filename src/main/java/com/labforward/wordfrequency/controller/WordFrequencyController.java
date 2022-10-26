package com.labforward.wordfrequency.controller;

import com.labforward.wordfrequency.dto.WordFrequencyDto;
import com.labforward.wordfrequency.service.WordFrequencyService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notebook")
@CrossOrigin(origins="*")
public class WordFrequencyController {
    @Autowired
    WordFrequencyService wordFrequencyService;

    /**
     * Rest Api to find frequency and similar words for given input. it uses current notebook of labforward
     * @param word
     * @return Response Entity with WordFrequencyDto with frequency and similiar word list.
     * status:
     *  200 ok if current word exists in current notebook
     *  500 due to any exception
     */
    @GetMapping("")
    public ResponseEntity<?> findWordFrequency(@RequestParam("word") String word){
        try {
            return new ResponseEntity<WordFrequencyDto>(wordFrequencyService.findWordFrequency(word), HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity<>(exception.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
