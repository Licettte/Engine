package main.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Data
@Entity
@Table(name = "posts")
public class Posts {

  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @NotNull
  @Column(name = "is_active", nullable = false)
  private byte isActive;
  @Column(name = "moderation_status", nullable = false)
  @Enumerated(EnumType.STRING)
  private ModerationStatus moderationStatus;
  @Column(name = "moderator_id")
  private int moderatorId;
  @NotNull
  private LocalDateTime time;
  @NotNull
  private String title;
  @NotNull
  private String text;
  @Column(name = "view_count", nullable = false)
  private int viewCount;
  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
  @JoinColumn(name = "user_id")
  private Users users;
  @OneToMany(mappedBy = "post", cascade = CascadeType.PERSIST)
  private List<PostVote> postVotes;
  @ManyToMany
  @JoinTable(name = "tag2post",
      joinColumns = {@JoinColumn(name = "post_id")},
      inverseJoinColumns = {@JoinColumn(name = "tag_id")})
  private List<Tags> tags;
  @OneToMany(mappedBy = "post")
  private List<PostComments> comments;

  public List<Tags> getTags() {
    return tags;
  }

  public void setTags(List<Tags> tags) {
    this.tags = tags;
  }

  public Posts() {
  }

  public List<PostComments> getComments() {
    return comments;
  }

  public void setComments(List<PostComments> comments) {
    this.comments = comments;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public byte getIsActive() {
    return isActive;
  }

  public void setIsActive(byte isActive) {
    this.isActive = isActive;
  }

  public ModerationStatus getModerationStatus() {
    return moderationStatus;
  }

  public void setModerationStatus(ModerationStatus moderationStatus) {
    this.moderationStatus = moderationStatus;
  }

  public int getModeratorId() {
    return moderatorId;
  }

  public void setModeratorId(int moderatorId) {
    this.moderatorId = moderatorId;
  }

  public LocalDateTime getTime() {
    return time;
  }

  public void setTime(LocalDateTime time) {
    this.time = time;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public int getViewCount() {
    return viewCount;
  }

  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }

  public Users getUsers() {
    return users;
  }

  public void setUsers(Users users) {
    this.users = users;
  }

  public List<PostVote> getPostVotes() {
    return postVotes;
  }

  public void setPostVotes(List<PostVote> postVotes) {
    this.postVotes = postVotes;
  }
}
