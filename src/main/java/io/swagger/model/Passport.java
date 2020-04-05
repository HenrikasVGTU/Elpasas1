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
 * Passport
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-02T16:04:50.980Z")

public class Passport   {
  @JsonProperty("passportNo")
  private Integer passportNo = null;

  @JsonProperty("surname")
  private String surname = null;

  @JsonProperty("givenName")
  private String givenName = null;

  @JsonProperty("nationality")
  private String nationality = null;

  @JsonProperty("dateOfBirth")
  private String dateOfBirth = null;

  @JsonProperty("sex")
  private String sex = null;

  @JsonProperty("dateOfIssue")
  private String dateOfIssue = null;

  @JsonProperty("dateOfExpiry")
  private String dateOfExpiry = null;

  @JsonProperty("personalNo")
  private Integer personalNo = null;

  @JsonProperty("placeOfBirth")
  private String placeOfBirth = null;

  @JsonProperty("authority")
  private String authority = null;

  @JsonProperty("footer")
  private String footer = null;

  public Passport passportNo(Integer passportNo) {
    this.passportNo = passportNo;
    return this;
  }

  /**
   * Get passportNo
   * @return passportNo
  **/
  @ApiModelProperty(example = "14951794", value = "")


  public Integer getPassportNo() {
    return passportNo;
  }

  public void setPassportNo(Integer passportNo) {
    this.passportNo = passportNo;
  }

  public Passport surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   * @return surname
  **/
  @ApiModelProperty(example = "Basanavičienė", value = "")


  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Passport givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Get givenName
   * @return givenName
  **/
  @ApiModelProperty(example = "Birutė", value = "")


  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public Passport nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Get nationality
   * @return nationality
  **/
  @ApiModelProperty(example = "Lietuvos Respublikos", value = "")


  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public Passport dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @ApiModelProperty(example = "11 03 1990", value = "")


  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Passport sex(String sex) {
    this.sex = sex;
    return this;
  }

  /**
   * Get sex
   * @return sex
  **/
  @ApiModelProperty(example = "MOT/F", value = "")


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public Passport dateOfIssue(String dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
    return this;
  }

  /**
   * Get dateOfIssue
   * @return dateOfIssue
  **/
  @ApiModelProperty(example = "02 01 2019", value = "")


  public String getDateOfIssue() {
    return dateOfIssue;
  }

  public void setDateOfIssue(String dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
  }

  public Passport dateOfExpiry(String dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
    return this;
  }

  /**
   * Get dateOfExpiry
   * @return dateOfExpiry
  **/
  @ApiModelProperty(example = "02 01 2029", value = "")


  public String getDateOfExpiry() {
    return dateOfExpiry;
  }

  public void setDateOfExpiry(String dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
  }

  public Passport personalNo(Integer personalNo) {
    this.personalNo = personalNo;
    return this;
  }

  /**
   * Get personalNo
   * @return personalNo
  **/
  @ApiModelProperty(example = "49003111045", value = "")


  public Integer getPersonalNo() {
    return personalNo;
  }

  public void setPersonalNo(Integer personalNo) {
    this.personalNo = personalNo;
  }

  public Passport placeOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
    return this;
  }

  /**
   * Get placeOfBirth
   * @return placeOfBirth
  **/
  @ApiModelProperty(example = "Lietuva", value = "")


  public String getPlaceOfBirth() {
    return placeOfBirth;
  }

  public void setPlaceOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }

  public Passport authority(String authority) {
    this.authority = authority;
    return this;
  }

  /**
   * Get authority
   * @return authority
  **/
  @ApiModelProperty(example = "Vilnius (19)", value = "")


  public String getAuthority() {
    return authority;
  }

  public void setAuthority(String authority) {
    this.authority = authority;
  }

  public Passport footer(String footer) {
    this.footer = footer;
    return this;
  }

  /**
   * Get footer
   * @return footer
  **/
  @ApiModelProperty(example = "P<LTUBASANAVICIENE<<BIRUTE<<<<<<<<<<<<<<<<<<14951794<0LTU90031187290102049003111045<<<86", value = "")

@Size(min=88,max=88) 
  public String getFooter() {
    return footer;
  }

  public void setFooter(String footer) {
    this.footer = footer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Passport passport = (Passport) o;
    return Objects.equals(this.passportNo, passport.passportNo) &&
        Objects.equals(this.surname, passport.surname) &&
        Objects.equals(this.givenName, passport.givenName) &&
        Objects.equals(this.nationality, passport.nationality) &&
        Objects.equals(this.dateOfBirth, passport.dateOfBirth) &&
        Objects.equals(this.sex, passport.sex) &&
        Objects.equals(this.dateOfIssue, passport.dateOfIssue) &&
        Objects.equals(this.dateOfExpiry, passport.dateOfExpiry) &&
        Objects.equals(this.personalNo, passport.personalNo) &&
        Objects.equals(this.placeOfBirth, passport.placeOfBirth) &&
        Objects.equals(this.authority, passport.authority) &&
        Objects.equals(this.footer, passport.footer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passportNo, surname, givenName, nationality, dateOfBirth, sex, dateOfIssue, dateOfExpiry, personalNo, placeOfBirth, authority, footer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Passport {\n");
    
    sb.append("    passportNo: ").append(toIndentedString(passportNo)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    dateOfIssue: ").append(toIndentedString(dateOfIssue)).append("\n");
    sb.append("    dateOfExpiry: ").append(toIndentedString(dateOfExpiry)).append("\n");
    sb.append("    personalNo: ").append(toIndentedString(personalNo)).append("\n");
    sb.append("    placeOfBirth: ").append(toIndentedString(placeOfBirth)).append("\n");
    sb.append("    authority: ").append(toIndentedString(authority)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
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

