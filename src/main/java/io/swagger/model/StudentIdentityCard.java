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
 * StudentIdentityCard
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-02T16:04:50.980Z")

public class StudentIdentityCard   {
  @JsonProperty("studentId")
  private String studentId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("surname")
  private String surname = null;

  @JsonProperty("personalNo")
  private Integer personalNo = null;

  @JsonProperty("studiesAt")
  private String studiesAt = null;

  @JsonProperty("validFrom")
  private String validFrom = null;

  @JsonProperty("validUntil")
  private String validUntil = null;

  @JsonProperty("spd")
  private Integer spd = null;

  @JsonProperty("barcode")
  private String barcode = null;

  public StudentIdentityCard studentId(String studentId) {
    this.studentId = studentId;
    return this;
  }

  /**
   * Get studentId
   * @return studentId
  **/
  @ApiModelProperty(example = "53675", value = "")


  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  public StudentIdentityCard name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Unė", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StudentIdentityCard surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   * @return surname
  **/
  @ApiModelProperty(example = "Universitaitė", value = "")


  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public StudentIdentityCard personalNo(Integer personalNo) {
    this.personalNo = personalNo;
    return this;
  }

  /**
   * Get personalNo
   * @return personalNo
  **/
  @ApiModelProperty(example = "48703030001", value = "")


  public Integer getPersonalNo() {
    return personalNo;
  }

  public void setPersonalNo(Integer personalNo) {
    this.personalNo = personalNo;
  }

  public StudentIdentityCard studiesAt(String studiesAt) {
    this.studiesAt = studiesAt;
    return this;
  }

  /**
   * Get studiesAt
   * @return studiesAt
  **/
  @ApiModelProperty(example = "Socialinių mokslų f.", value = "")


  public String getStudiesAt() {
    return studiesAt;
  }

  public void setStudiesAt(String studiesAt) {
    this.studiesAt = studiesAt;
  }

  public StudentIdentityCard validFrom(String validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * Get validFrom
   * @return validFrom
  **/
  @ApiModelProperty(example = "2017-09-01", value = "")


  public String getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(String validFrom) {
    this.validFrom = validFrom;
  }

  public StudentIdentityCard validUntil(String validUntil) {
    this.validUntil = validUntil;
    return this;
  }

  /**
   * Get validUntil
   * @return validUntil
  **/
  @ApiModelProperty(example = "2021-06-30", value = "")


  public String getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(String validUntil) {
    this.validUntil = validUntil;
  }

  public StudentIdentityCard spd(Integer spd) {
    this.spd = spd;
    return this;
  }

  /**
   * Get spd
   * @return spd
  **/
  @ApiModelProperty(example = "701303", value = "")


  public Integer getSpd() {
    return spd;
  }

  public void setSpd(Integer spd) {
    this.spd = spd;
  }

  public StudentIdentityCard barcode(String barcode) {
    this.barcode = barcode;
    return this;
  }

  /**
   * Get barcode
   * @return barcode
  **/
  @ApiModelProperty(example = "94403905000000014", value = "")


  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentIdentityCard studentIdentityCard = (StudentIdentityCard) o;
    return Objects.equals(this.studentId, studentIdentityCard.studentId) &&
        Objects.equals(this.name, studentIdentityCard.name) &&
        Objects.equals(this.surname, studentIdentityCard.surname) &&
        Objects.equals(this.personalNo, studentIdentityCard.personalNo) &&
        Objects.equals(this.studiesAt, studentIdentityCard.studiesAt) &&
        Objects.equals(this.validFrom, studentIdentityCard.validFrom) &&
        Objects.equals(this.validUntil, studentIdentityCard.validUntil) &&
        Objects.equals(this.spd, studentIdentityCard.spd) &&
        Objects.equals(this.barcode, studentIdentityCard.barcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(studentId, name, surname, personalNo, studiesAt, validFrom, validUntil, spd, barcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentIdentityCard {\n");
    
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    personalNo: ").append(toIndentedString(personalNo)).append("\n");
    sb.append("    studiesAt: ").append(toIndentedString(studiesAt)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    spd: ").append(toIndentedString(spd)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
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

