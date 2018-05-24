package pl.digita.sandbox.resttemplate.consumer;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IConsumer<T> {

    List<T> get();

    ResponseEntity<T> post(T entity);

    //rest of the CRUD here...
}
