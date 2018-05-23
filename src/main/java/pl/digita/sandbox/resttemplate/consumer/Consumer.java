package pl.digita.sandbox.resttemplate.consumer;


import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.digita.sandbox.dto.QuestionDTO;

import java.util.Arrays;
import java.util.List;

@Service
public class Consumer extends AbstractConsumer implements IConsumer<QuestionDTO> {
    //http://www.baeldung.com/rest-template
    private static final String URL = "http://polls.apiblueprint.org/questions";

    @Override
    public List<QuestionDTO> getQuestions() {
        final QuestionDTO[] response = REST_TEMPLATE.getForObject(URL, QuestionDTO[].class);
        return Arrays.asList(response);
    }

    @Override
    public ResponseEntity<QuestionDTO> postQuestion(final QuestionDTO question) {
        final HttpEntity<QuestionDTO> body = new HttpEntity<>(question);
        return REST_TEMPLATE.postForEntity(URL, body, QuestionDTO.class);
    }
}
