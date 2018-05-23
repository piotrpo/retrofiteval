package pl.digita.sandbox.resttemplate.consumer;

import pl.digita.sandbox.dto.ChoiceDTO;
import pl.digita.sandbox.dto.QuestionDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        final IConsumer consumer = new Consumer();
        List<QuestionDTO> resutl = consumer.getQuestions();
        System.out.println(resutl);


        QuestionDTO questionDTO = new QuestionDTO();

        questionDTO.setQuestion(
                "asdasdasdadsdasdasdasdasdasdasd?");

        questionDTO.setChoiceDTOS(Arrays.asList(new ChoiceDTO("Tak"), new ChoiceDTO("Nie")));

        consumer.postQuestion(questionDTO);
    }
}
