package pl.digita.sandbox.retrofiteval;

import pl.digita.sandbox.dto.ChoiceDTO;
import pl.digita.sandbox.dto.QuestionDTO;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

class ApiClient {

  private IAnApi api;

  {
    Retrofit retrofit =
        new Retrofit.Builder()
            .baseUrl("http://polls.apiblueprint.org/")
            .addConverterFactory(JacksonConverterFactory.create())
            .build();
    api = retrofit.create(IAnApi.class);
  }

  void requestQuestions() {
    Call<List<QuestionDTO>> questions = api.getQuestions();

    questions.enqueue(
        new Callback<List<QuestionDTO>>() {
          @Override
          public void onResponse(Call<List<QuestionDTO>> call, Response<List<QuestionDTO>> response) {

            int size = 0;
            if (response.body() != null) {
              size = response.body().size();
            }

            System.out.println("There is " + size + " questions");
          }

          @Override
          public void onFailure(Call<List<QuestionDTO>> call, Throwable t) {
            System.out.println("Something went wrong " + call.request().url().toString());

            t.printStackTrace();
          }
        });
  }

  void postQuestion() {
    QuestionDTO questionDTO = new QuestionDTO();

    questionDTO.setQuestion(
        "Czy jeśli stanę nogami na szynach a "
            + "rękoma chwycę się drutów, to pojadę tak jak tramwaj?");

    questionDTO.setChoiceDTOS(Arrays.asList(new ChoiceDTO("Tak"), new ChoiceDTO("Nie")));

    try {
      Response<QuestionDTO> resp = api.createQuestion(questionDTO).execute();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
