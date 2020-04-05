package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Category
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-02T16:04:50.980Z")

public class Category   {
  /**
   * Gets or Sets _9Name
   */
  public enum 9NameEnum {
    AM("AM"),
    
    A1("A1"),
    
    B1("B1"),
    
    B("B"),
    
    D1("D1"),
    
    D("D"),
    
    BE("BE"),
    
    D1E("D1E"),
    
    DE("DE");

    private String value;

    9NameEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static 9NameEnum fromValue(String text) {
      for (9NameEnum b : 9NameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("9_name")
  private 9NameEnum _9Name = null;

  @JsonProperty("10_dateOfIssue")
  private String _10DateOfIssue = null;

  @JsonProperty("11_dateOfExpiry")
  private String _11DateOfExpiry = "null";

  @JsonProperty("12_code")
  private String _12Code = "null";

  public Category _9Name(9NameEnum _9Name) {
    this._9Name = _9Name;
    return this;
  }

  /**
   * Get _9Name
   * @return _9Name
  **/
  @ApiModelProperty(value = "")


  public 9NameEnum get9Name() {
    return _9Name;
  }

  public void set9Name(9NameEnum _9Name) {
    this._9Name = _9Name;
  }

  public Category _10DateOfIssue(String _10DateOfIssue) {
    this._10DateOfIssue = _10DateOfIssue;
    return this;
  }

  /**
   * Get _10DateOfIssue
   * @return _10DateOfIssue
  **/
  @ApiModelProperty(example = "19.01.13", value = "")


  public String get10DateOfIssue() {
    return _10DateOfIssue;
  }

  public void set10DateOfIssue(String _10DateOfIssue) {
    this._10DateOfIssue = _10DateOfIssue;
  }

  public Category _11DateOfExpiry(String _11DateOfExpiry) {
    this._11DateOfExpiry = _11DateOfExpiry;
    return this;
  }

  /**
   * Get _11DateOfExpiry
   * @return _11DateOfExpiry
  **/
  @ApiModelProperty(example = "24.11.21", value = "")


  public String get11DateOfExpiry() {
    return _11DateOfExpiry;
  }

  public void set11DateOfExpiry(String _11DateOfExpiry) {
    this._11DateOfExpiry = _11DateOfExpiry;
  }

  public Category _12Code(String _12Code) {
    this._12Code = _12Code;
    return this;
  }

  /**
   * Get _12Code
   * @return _12Code
  **/
  @ApiModelProperty(example = "95.(24.11.21)", value = "")


  public String get12Code() {
    return _12Code;
  }

  public void set12Code(String _12Code) {
    this._12Code = _12Code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return Objects.equals(this._9Name, category._9Name) &&
        Objects.equals(this._10DateOfIssue, category._10DateOfIssue) &&
        Objects.equals(this._11DateOfExpiry, category._11DateOfExpiry) &&
        Objects.equals(this._12Code, category._12Code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_9Name, _10DateOfIssue, _11DateOfExpiry, _12Code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    
    sb.append("    _9Name: ").append(toIndentedString(_9Name)).append("\n");
    sb.append("    _10DateOfIssue: ").append(toIndentedString(_10DateOfIssue)).append("\n");
    sb.append("    _11DateOfExpiry: ").append(toIndentedString(_11DateOfExpiry)).append("\n");
    sb.append("    _12Code: ").append(toIndentedString(_12Code)).append("\n");
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

