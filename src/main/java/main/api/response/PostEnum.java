package main.api.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.stream.Stream;


public enum PostEnum {
  NEW("NEW"), ACCEPTED("ACCEPTED"), DECLINED("DECLINED");

  private String code;

  PostEnum(String code) {
    this.code = code;
  }

  @JsonCreator

  public static PostEnum decode(final String code) {
    return Stream.of(PostEnum.values()).filter(targetEnum -> targetEnum.code.equals(code)).findFirst().orElse(null);
  }
  @JsonValue
  public String getCode() {
    return code;
  }
}