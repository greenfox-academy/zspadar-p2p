package com.greenfox.model;

/**
 * Created by zsuzsanna.padar on 2017. 05. 22..
 */
public class StatusError implements Status {
  private String status;
  private String message;

  public StatusError(String[] fields) {
    this.status = "error";
    this.message = String.format("Missing field(s): %s", String.join(", ", fields));
  }

  public String getStatus() {
    return status;
  }

  public String getMessage() {
    return message;
  }
}
