package pl.digita.sandbox.resttemplate.consumer;

import pl.digita.sandbox.dto.QuestionDTO;

import java.util.List;

public interface IConsumer {

    List<QuestionDTO> getQuestions();

    void postQuestion(QuestionDTO question);
}
