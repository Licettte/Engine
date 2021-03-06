package main.model;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;


@Data
@Entity
@Table(name = "users")
public class Users {

  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "is_moderator", nullable = false)
  private byte isModerator;
  @Column(name = "reg_time", nullable = false)
  private LocalDateTime regTime;
  @NotNull
  private String name;
  @NotNull
  private String email;
  @NotNull
  private String password;
  private String code;
  private String photo;
  @OneToMany(mappedBy = "users", cascade = CascadeType.PERSIST)
  private List<Posts> posts;
  @OneToMany(mappedBy = "users", cascade = CascadeType.PERSIST)
  private List<PostVote> postVotes;
  @OneToMany(mappedBy = "users", cascade = CascadeType.PERSIST, orphanRemoval = true)
  private List<PostComments> comments;

  public Users() {
  }
}
