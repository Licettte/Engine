package main.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
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

  }
