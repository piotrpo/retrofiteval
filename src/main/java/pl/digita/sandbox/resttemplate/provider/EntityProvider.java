package pl.digita.sandbox.resttemplate.provider;

import pl.digita.sandbox.dto.ChoiceDTO;
import pl.digita.sandbox.dto.QuestionDTO;

import java.util.Arrays;

public class EntityProvider {

    public static QuestionDTO createQuestions() {
        QuestionDTO questionDTO = new QuestionDTO();
        questionDTO.setQuestion("rest template qestion");
        questionDTO.setChoiceDTOS(Arrays.asList(new ChoiceDTO("Choice 1"), new ChoiceDTO("Choice 2"), new ChoiceDTO("Choice 3") ));
        return questionDTO;
    }
}
