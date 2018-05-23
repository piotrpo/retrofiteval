package pl.digita.sandbox.resttemplate.consumer;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IConsumer<T> {

    List<T> getQuestions();

    ResponseEntity<T> postQuestion(T entity);
}
