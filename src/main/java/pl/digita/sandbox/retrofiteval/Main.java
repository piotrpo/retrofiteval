package pl.digita.sandbox.retrofiteval;

public class Main {
  public static void main(String[] args) {
    ApiClient apiClient = new ApiClient();
    apiClient.requestQuestions();
    apiClient.postQuestion();
  }
}
