package main.model;

import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "post_comments")
public class PostComments {
  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @NotNull
  private LocalDateTime regTime;
  @NotNull
  private String text;
  @Column(name = "parent_id")
  private int parentId;
  @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
  private Posts post;
  @ManyToOne(fetch = FetchType.LAZY)
  private Users users;

  public PostComments() {
  }

}
