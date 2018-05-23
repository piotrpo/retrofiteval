package pl.digita.sandbox.resttemplate.consumer;


import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.digita.sandbox.dto.QuestionDTO;

import java.util.Arrays;
import java.util.List;

@Service
public class Consumer implements IConsumer {
    //http://www.baeldung.com/rest-template
    private static final String URL = "http://polls.apiblueprint.org/questions";
    private static final RestTemplate REST_TEMPLATE = new RestTemplate();


    public List<QuestionDTO> getQuestions() {
        final QuestionDTO[] response = REST_TEMPLATE
                .getForObject(URL, QuestionDTO[].class);

        return Arrays.asList(response);
    }


    public ResponseEntity<QuestionDTO> postQuestion(final QuestionDTO question) {
        final HttpEntity<QuestionDTO> body = new HttpEntity<>(question);
        return REST_TEMPLATE.postForEntity(URL, body, QuestionDTO.class);
    }
}
