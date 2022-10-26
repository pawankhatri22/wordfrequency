package com.labforward.wordfrequency.service;


import com.labforward.wordfrequency.dto.WordFrequencyDto;
import com.labforward.wordfrequency.notebook.NoteBook;
import com.labforward.wordfrequency.util.LevenshteinDistance;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WordFrequencyService {


    public WordFrequencyDto findWordFrequency(String word) {
        int frequency = 0;
        List<String> similarWords = new ArrayList<>();

        WordFrequencyDto wordFrequencyDto = new WordFrequencyDto();
        //split string of Note Book Entries into array of words.
        String wordEntries[] = NoteBook.NOTE_BOOK_ENTRIES.split(" ");
        for(String wordEntry: wordEntries){
            //find frequency of same word in note book
            if(wordEntry.equals(word)){
                frequency++;
            }else{
                //find smiliar words
                if(LevenshteinDistance.findLevenshteinDistance(word, wordEntry) == 1){
                    similarWords.add(wordEntry);
                }

            }
        }

        wordFrequencyDto.setFrequency(frequency);
        wordFrequencyDto.setSimilarWords(similarWords);

        return wordFrequencyDto;
    }
}
