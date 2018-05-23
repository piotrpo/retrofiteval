package pl.digita.sandbox.dto;

public class ChoiceDTO {
  private String choice;
  private int votes;
  private String url;

  public ChoiceDTO() {
  }

  public ChoiceDTO(String choice) {
    this.choice = choice;
  }

  public String getChoice() {
    return choice;
  }

  public void setChoice(String choice) {
    this.choice = choice;
  }

  public int getVotes() {
    return votes;
  }

  public void setVotes(int votes) {
    this.votes = votes;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
