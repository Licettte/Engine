package main.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Embeddable
public class Key implements Serializable {

  @ManyToOne
  @JoinColumn(name = "post_id")
  private Posts postId;
  @ManyToOne
  @JoinColumn(name = "tag_id")
  private Tags tagsId;

  public Key() {
  }

  public Posts getPost() {
    return postId;
  }

  public void setPost(Posts post) {
    this.postId = post;
  }

  public Tags getTag() {
    return tagsId;
  }

  public void setTag(Tags tags) {
    this.tagsId = tags;
  }
}
