package com.labforward.wordfrequency.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WordFrequencyDto {

    private int frequency;
    private List<String> similarWords;
}
