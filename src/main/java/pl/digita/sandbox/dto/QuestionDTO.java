package pl.digita.sandbox.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class QuestionDTO {
  private String question;
  @JsonProperty("published_at")
  private String publishedAt;
  @JsonProperty("choices")
  private List<ChoiceDTO> choiceDTOS;
  private String url;

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public String getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
  }

  public List<ChoiceDTO> getChoiceDTOS() {
    return choiceDTOS;
  }

  public void setChoiceDTOS(List<ChoiceDTO> choiceDTOS) {
    this.choiceDTOS = choiceDTOS;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "QuestionDTO{" +
            "question='" + question + '\'' +
            ", publishedAt='" + publishedAt + '\'' +
            ", choiceDTOS=" + choiceDTOS +
            ", url='" + url + '\'' +
            '}';
  }
}
