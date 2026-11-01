package model.typecontent;

import java.util.List;
import model.AudiovisualContent;
import model.resource.ViewerSession;
import model.utils.Language;

public class LiveStream extends AudiovisualContent {
  private boolean publishSponsor;
  private List<ViewerSession> viewers;

  public LiveStream(
      String title,
      String description,
      String dateRelease,
      int duration,
      Language language,
      List<ViewerSession> viewers,
      boolean publishSponsor,
      String tag) {
    super(title, description, dateRelease, duration, language, tag);
    this.viewers = viewers;
    this.publishSponsor = publishSponsor;
  }

  public boolean getIsPublishSponsor() {
    return this.publishSponsor;
  }

  public void setPublishSponsor(boolean publishSponsor) {
    this.publishSponsor = publishSponsor;
  }

  public void addViewer(ViewerSession viewer) {
    this.viewers.add(viewer);
  }

  public int getViewers() {
    return this.viewers.size();
  }

  public void detailsViewer() {
    for (ViewerSession viewer : viewers) {
      System.out.println(viewer.getSession());
    }
  }

  public void showInfo() {
    System.out.println("\n[+] Live Stream DESCRIPTION:\n");
    System.out.println("- Id: " + this.getId());
    System.out.println("- Title: " + this.getTitle());
    System.out.println("- Description: " + this.getDescription());
    System.out.println("- Date Release: " + this.getDateRelease());
    System.out.println("- Duration: " + this.getDuration());
    System.out.println("- Language: " + this.getLanguage());
    System.out.println("- Sposored : " + this.getIsPublishSponsor());
    System.out.println("- Topic: " + this.getTag());
    System.out.println("- Viewers: " + this.getViewers());
    System.out.println("- Details for each viewers: \n");
    this.detailsViewer();
  }
}
