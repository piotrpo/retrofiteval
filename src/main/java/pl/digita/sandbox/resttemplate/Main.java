package pl.digita.sandbox.resttemplate;

import org.springframework.http.ResponseEntity;
import pl.digita.sandbox.dto.QuestionDTO;
import pl.digita.sandbox.resttemplate.consumer.AbstractConsumer;
import pl.digita.sandbox.resttemplate.consumer.Consumer;
import pl.digita.sandbox.resttemplate.consumer.IConsumer;
import pl.digita.sandbox.resttemplate.provider.EntityProvider;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private final static IConsumer<QuestionDTO> consumer = new Consumer();

    public static void main(final String[] args) {

        final List<QuestionDTO> list = consumer.get();
        System.out.println("===================GET LIST=====================================");
        System.out.println(list);

        final QuestionDTO questionDTO = EntityProvider.createQuestions();
        final ResponseEntity response = consumer.post(questionDTO);
        System.out.println("===================SAVE=====================================");
        System.out.println("POST STATUS -> " + response.getStatusCode());
        System.out.println("SAVED ENTITY -> " + response.getBody());


        System.out.println("================BUILD PARAMS=========================");

        // URI parameters
        final Map<String, String> pathParams = new HashMap<>();
        pathParams.put("planet", "Mars");
        pathParams.put("moon", "Phobos");

        // Query parameters
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("firstName", "Mark");
        queryParams.put("lastName", "Watney");

        AbstractConsumer.buildURLWithParamsPOC(pathParams,  queryParams);
    }
}
