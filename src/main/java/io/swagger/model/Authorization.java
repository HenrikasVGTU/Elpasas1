package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Authorization
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-02T16:04:50.980Z")

public class Authorization   {
  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("token")
  private String token = null;

  public Authorization userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "31234567890", value = "")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Authorization token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(example = "Basic ZllvSFpwcnJCR01XZXExZk9IYUFIWTZmWE53bTA1TDJLaXdZRFI2azZrWDYyclhTY3REOEhVbHZVRzZGcEVlOA==", value = "")


  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Authorization authorization = (Authorization) o;
    return Objects.equals(this.userId, authorization.userId) &&
        Objects.equals(this.token, authorization.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Authorization {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

