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
 * PersonalIdentityCard
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-02T16:04:50.980Z")

public class PersonalIdentityCard   {
  @JsonProperty("surname")
  private String surname = null;

  @JsonProperty("givenName")
  private String givenName = null;

  @JsonProperty("nationality")
  private String nationality = null;

  @JsonProperty("sex")
  private String sex = null;

  @JsonProperty("dateOfBirth")
  private String dateOfBirth = null;

  @JsonProperty("personalNo")
  private Integer personalNo = null;

  @JsonProperty("cardNo")
  private Integer cardNo = null;

  @JsonProperty("dateOfExpiry")
  private String dateOfExpiry = null;

  @JsonProperty("dateOfIssue")
  private String dateOfIssue = null;

  @JsonProperty("authority")
  private String authority = null;

  @JsonProperty("footer")
  private String footer = null;

  public PersonalIdentityCard surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   * @return surname
  **/
  @ApiModelProperty(example = "Bružaitė", value = "")


  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public PersonalIdentityCard givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Get givenName
   * @return givenName
  **/
  @ApiModelProperty(example = "Vigilija", value = "")


  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public PersonalIdentityCard nationality(String nationality) {
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

  public PersonalIdentityCard sex(String sex) {
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

  public PersonalIdentityCard dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @ApiModelProperty(example = "11 03 1978", value = "")


  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public PersonalIdentityCard personalNo(Integer personalNo) {
    this.personalNo = personalNo;
    return this;
  }

  /**
   * Get personalNo
   * @return personalNo
  **/
  @ApiModelProperty(example = "47803111025", value = "")


  public Integer getPersonalNo() {
    return personalNo;
  }

  public void setPersonalNo(Integer personalNo) {
    this.personalNo = personalNo;
  }

  public PersonalIdentityCard cardNo(Integer cardNo) {
    this.cardNo = cardNo;
    return this;
  }

  /**
   * Get cardNo
   * @return cardNo
  **/
  @ApiModelProperty(example = "56499778", value = "")


  public Integer getCardNo() {
    return cardNo;
  }

  public void setCardNo(Integer cardNo) {
    this.cardNo = cardNo;
  }

  public PersonalIdentityCard dateOfExpiry(String dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
    return this;
  }

  /**
   * Get dateOfExpiry
   * @return dateOfExpiry
  **/
  @ApiModelProperty(example = "04 07 2022", value = "")


  public String getDateOfExpiry() {
    return dateOfExpiry;
  }

  public void setDateOfExpiry(String dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
  }

  public PersonalIdentityCard dateOfIssue(String dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
    return this;
  }

  /**
   * Get dateOfIssue
   * @return dateOfIssue
  **/
  @ApiModelProperty(example = "04 07 2012", value = "")


  public String getDateOfIssue() {
    return dateOfIssue;
  }

  public void setDateOfIssue(String dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
  }

  public PersonalIdentityCard authority(String authority) {
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

  public PersonalIdentityCard footer(String footer) {
    this.footer = footer;
    return this;
  }

  /**
   * Get footer
   * @return footer
  **/
  @ApiModelProperty(example = "I<LTU56499778<047803111025<<<<7803118F2207043LTU<<<<<<<<<<<8BRUZAITE<<VIGILIJA<<<<<<<<<<<<", value = "")

@Size(min=90,max=90) 
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
    PersonalIdentityCard personalIdentityCard = (PersonalIdentityCard) o;
    return Objects.equals(this.surname, personalIdentityCard.surname) &&
        Objects.equals(this.givenName, personalIdentityCard.givenName) &&
        Objects.equals(this.nationality, personalIdentityCard.nationality) &&
        Objects.equals(this.sex, personalIdentityCard.sex) &&
        Objects.equals(this.dateOfBirth, personalIdentityCard.dateOfBirth) &&
        Objects.equals(this.personalNo, personalIdentityCard.personalNo) &&
        Objects.equals(this.cardNo, personalIdentityCard.cardNo) &&
        Objects.equals(this.dateOfExpiry, personalIdentityCard.dateOfExpiry) &&
        Objects.equals(this.dateOfIssue, personalIdentityCard.dateOfIssue) &&
        Objects.equals(this.authority, personalIdentityCard.authority) &&
        Objects.equals(this.footer, personalIdentityCard.footer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surname, givenName, nationality, sex, dateOfBirth, personalNo, cardNo, dateOfExpiry, dateOfIssue, authority, footer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalIdentityCard {\n");
    
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    personalNo: ").append(toIndentedString(personalNo)).append("\n");
    sb.append("    cardNo: ").append(toIndentedString(cardNo)).append("\n");
    sb.append("    dateOfExpiry: ").append(toIndentedString(dateOfExpiry)).append("\n");
    sb.append("    dateOfIssue: ").append(toIndentedString(dateOfIssue)).append("\n");
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

