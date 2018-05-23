package pl.digita.sandbox.resttemplate.consumer;

import org.springframework.http.ResponseEntity;
import pl.digita.sandbox.dto.QuestionDTO;

import java.util.List;

public interface IConsumer {

    List<QuestionDTO> getQuestions();

    ResponseEntity<QuestionDTO> postQuestion(QuestionDTO question);
}
