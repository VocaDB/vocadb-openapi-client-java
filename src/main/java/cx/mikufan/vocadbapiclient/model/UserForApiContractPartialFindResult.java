/*
 * VocaDbWeb
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package cx.mikufan.vocadbapiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import cx.mikufan.vocadbapiclient.model.UserForApiContract;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * UserForApiContractPartialFindResult
 */
@JsonPropertyOrder({
  UserForApiContractPartialFindResult.JSON_PROPERTY_ITEMS,
  UserForApiContractPartialFindResult.JSON_PROPERTY_TERM,
  UserForApiContractPartialFindResult.JSON_PROPERTY_TOTAL_COUNT
})
@JsonTypeName("UserForApiContractPartialFindResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-20T13:35:02.772911500-04:00[America/New_York]")
public class UserForApiContractPartialFindResult {
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<UserForApiContract> items = null;

  public static final String JSON_PROPERTY_TERM = "term";
  private String term;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
  private Integer totalCount;


  public UserForApiContractPartialFindResult items(List<UserForApiContract> items) {
    
    this.items = items;
    return this;
  }

  public UserForApiContractPartialFindResult addItemsItem(UserForApiContract itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UserForApiContract> getItems() {
    return items;
  }


  public void setItems(List<UserForApiContract> items) {
    this.items = items;
  }


  public UserForApiContractPartialFindResult term(String term) {
    
    this.term = term;
    return this;
  }

   /**
   * Get term
   * @return term
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTerm() {
    return term;
  }


  public void setTerm(String term) {
    this.term = term;
  }


  public UserForApiContractPartialFindResult totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserForApiContractPartialFindResult userForApiContractPartialFindResult = (UserForApiContractPartialFindResult) o;
    return Objects.equals(this.items, userForApiContractPartialFindResult.items) &&
        Objects.equals(this.term, userForApiContractPartialFindResult.term) &&
        Objects.equals(this.totalCount, userForApiContractPartialFindResult.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, term, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserForApiContractPartialFindResult {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
