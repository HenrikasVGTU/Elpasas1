package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Category;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DrivingLicence
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-02T16:04:50.980Z")

public class DrivingLicence   {
  @JsonProperty("1_surname")
  private String _1Surname = null;

  @JsonProperty("2_name")
  private String _2Name = null;

  @JsonProperty("3_dateOfBirth")
  private String _3DateOfBirth = null;

  @JsonProperty("4a_dateOfIssue")
  private String _4aDateOfIssue = null;

  @JsonProperty("4b_dateOfExpiry")
  private String _4bDateOfExpiry = null;

  @JsonProperty("4c_issuedBy")
  private String _4cIssuedBy = null;

  @JsonProperty("4d_personalNo")
  private Integer _4dPersonalNo = null;

  @JsonProperty("5_licenceNo")
  private Integer _5LicenceNo = null;

  @JsonProperty("categories")
  @Valid
  private List<Category> categories = null;

  public DrivingLicence _1Surname(String _1Surname) {
    this._1Surname = _1Surname;
    return this;
  }

  /**
   * Get _1Surname
   * @return _1Surname
  **/
  @ApiModelProperty(example = "Pavardenis", value = "")


  public String get1Surname() {
    return _1Surname;
  }

  public void set1Surname(String _1Surname) {
    this._1Surname = _1Surname;
  }

  public DrivingLicence _2Name(String _2Name) {
    this._2Name = _2Name;
    return this;
  }

  /**
   * Get _2Name
   * @return _2Name
  **/
  @ApiModelProperty(example = "Vardenis", value = "")


  public String get2Name() {
    return _2Name;
  }

  public void set2Name(String _2Name) {
    this._2Name = _2Name;
  }

  public DrivingLicence _3DateOfBirth(String _3DateOfBirth) {
    this._3DateOfBirth = _3DateOfBirth;
    return this;
  }

  /**
   * Get _3DateOfBirth
   * @return _3DateOfBirth
  **/
  @ApiModelProperty(example = "01 01 1985", value = "")


  public String get3DateOfBirth() {
    return _3DateOfBirth;
  }

  public void set3DateOfBirth(String _3DateOfBirth) {
    this._3DateOfBirth = _3DateOfBirth;
  }

  public DrivingLicence _4aDateOfIssue(String _4aDateOfIssue) {
    this._4aDateOfIssue = _4aDateOfIssue;
    return this;
  }

  /**
   * Get _4aDateOfIssue
   * @return _4aDateOfIssue
  **/
  @ApiModelProperty(example = "24 11 2016", value = "")


  public String get4aDateOfIssue() {
    return _4aDateOfIssue;
  }

  public void set4aDateOfIssue(String _4aDateOfIssue) {
    this._4aDateOfIssue = _4aDateOfIssue;
  }

  public DrivingLicence _4bDateOfExpiry(String _4bDateOfExpiry) {
    this._4bDateOfExpiry = _4bDateOfExpiry;
    return this;
  }

  /**
   * Get _4bDateOfExpiry
   * @return _4bDateOfExpiry
  **/
  @ApiModelProperty(example = "24 11 2026", value = "")


  public String get4bDateOfExpiry() {
    return _4bDateOfExpiry;
  }

  public void set4bDateOfExpiry(String _4bDateOfExpiry) {
    this._4bDateOfExpiry = _4bDateOfExpiry;
  }

  public DrivingLicence _4cIssuedBy(String _4cIssuedBy) {
    this._4cIssuedBy = _4cIssuedBy;
    return this;
  }

  /**
   * Get _4cIssuedBy
   * @return _4cIssuedBy
  **/
  @ApiModelProperty(example = "VĮ Regitra", value = "")


  public String get4cIssuedBy() {
    return _4cIssuedBy;
  }

  public void set4cIssuedBy(String _4cIssuedBy) {
    this._4cIssuedBy = _4cIssuedBy;
  }

  public DrivingLicence _4dPersonalNo(Integer _4dPersonalNo) {
    this._4dPersonalNo = _4dPersonalNo;
    return this;
  }

  /**
   * Get _4dPersonalNo
   * @return _4dPersonalNo
  **/
  @ApiModelProperty(example = "31234567890", value = "")


  public Integer get4dPersonalNo() {
    return _4dPersonalNo;
  }

  public void set4dPersonalNo(Integer _4dPersonalNo) {
    this._4dPersonalNo = _4dPersonalNo;
  }

  public DrivingLicence _5LicenceNo(Integer _5LicenceNo) {
    this._5LicenceNo = _5LicenceNo;
    return this;
  }

  /**
   * Get _5LicenceNo
   * @return _5LicenceNo
  **/
  @ApiModelProperty(example = "35983081", value = "")


  public Integer get5LicenceNo() {
    return _5LicenceNo;
  }

  public void set5LicenceNo(Integer _5LicenceNo) {
    this._5LicenceNo = _5LicenceNo;
  }

  public DrivingLicence categories(List<Category> categories) {
    this.categories = categories;
    return this;
  }

  public DrivingLicence addCategoriesItem(Category categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<Category>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Category> getCategories() {
    return categories;
  }

  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrivingLicence drivingLicence = (DrivingLicence) o;
    return Objects.equals(this._1Surname, drivingLicence._1Surname) &&
        Objects.equals(this._2Name, drivingLicence._2Name) &&
        Objects.equals(this._3DateOfBirth, drivingLicence._3DateOfBirth) &&
        Objects.equals(this._4aDateOfIssue, drivingLicence._4aDateOfIssue) &&
        Objects.equals(this._4bDateOfExpiry, drivingLicence._4bDateOfExpiry) &&
        Objects.equals(this._4cIssuedBy, drivingLicence._4cIssuedBy) &&
        Objects.equals(this._4dPersonalNo, drivingLicence._4dPersonalNo) &&
        Objects.equals(this._5LicenceNo, drivingLicence._5LicenceNo) &&
        Objects.equals(this.categories, drivingLicence.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_1Surname, _2Name, _3DateOfBirth, _4aDateOfIssue, _4bDateOfExpiry, _4cIssuedBy, _4dPersonalNo, _5LicenceNo, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrivingLicence {\n");
    
    sb.append("    _1Surname: ").append(toIndentedString(_1Surname)).append("\n");
    sb.append("    _2Name: ").append(toIndentedString(_2Name)).append("\n");
    sb.append("    _3DateOfBirth: ").append(toIndentedString(_3DateOfBirth)).append("\n");
    sb.append("    _4aDateOfIssue: ").append(toIndentedString(_4aDateOfIssue)).append("\n");
    sb.append("    _4bDateOfExpiry: ").append(toIndentedString(_4bDateOfExpiry)).append("\n");
    sb.append("    _4cIssuedBy: ").append(toIndentedString(_4cIssuedBy)).append("\n");
    sb.append("    _4dPersonalNo: ").append(toIndentedString(_4dPersonalNo)).append("\n");
    sb.append("    _5LicenceNo: ").append(toIndentedString(_5LicenceNo)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

