package main.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

@Data
public class SettingsResponse {
//будет заполняться из бд
  @JsonProperty("MULTIUSER_MODE")
  private boolean multiuserMode;
  @JsonProperty("POST_PREMODERATION")
  private boolean postPremoderation;
  @JsonProperty("STATISTICS_IS_PUBLIC")
  private boolean statisticsIsPublic;



}
