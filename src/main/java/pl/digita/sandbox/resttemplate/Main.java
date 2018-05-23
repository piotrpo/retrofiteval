package pl.digita.sandbox.resttemplate;

import org.springframework.http.ResponseEntity;
import pl.digita.sandbox.dto.QuestionDTO;
import pl.digita.sandbox.resttemplate.consumer.Consumer;
import pl.digita.sandbox.resttemplate.consumer.IConsumer;
import pl.digita.sandbox.resttemplate.provider.EntityProvider;

import java.util.List;

public class Main {

    private final static IConsumer consumer = new Consumer();

    public static void main(String[] args) {

        final List<QuestionDTO> list = consumer.getQuestions();
        System.out.println("===================GET LIST=====================================");
        System.out.println(list);

        final QuestionDTO questionDTO = EntityProvider.createQuestions();
        final ResponseEntity response = consumer.postQuestion(questionDTO);
        System.out.println("===================SAVE=====================================");
        System.out.println("POST STATUS -> "+ response.getStatusCode());
        System.out.println("SAVED ENTITY -> " + response.getBody());
    }


}
