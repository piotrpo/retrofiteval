package pl.digita.sandbox.retrofiteval;

import pl.digita.sandbox.dto.QuestionDTO;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface IAnApi {
  @GET("questions")
  Call<List<QuestionDTO>> getQuestions();

  @POST("questions")
  Call<QuestionDTO> createQuestion(@Body QuestionDTO questionDTO);
}
