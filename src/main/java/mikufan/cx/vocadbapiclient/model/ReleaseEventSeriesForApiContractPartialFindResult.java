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


package mikufan.cx.vocadbapiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mikufan.cx.vocadbapiclient.model.ReleaseEventSeriesForApiContract;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ReleaseEventSeriesForApiContractPartialFindResult
 */
@JsonPropertyOrder({
  ReleaseEventSeriesForApiContractPartialFindResult.JSON_PROPERTY_ITEMS,
  ReleaseEventSeriesForApiContractPartialFindResult.JSON_PROPERTY_TERM,
  ReleaseEventSeriesForApiContractPartialFindResult.JSON_PROPERTY_TOTAL_COUNT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-26T07:29:58.607748373Z[Etc/UTC]")
public class ReleaseEventSeriesForApiContractPartialFindResult {
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<ReleaseEventSeriesForApiContract> items;

  public static final String JSON_PROPERTY_TERM = "term";
  private String term;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
  private Integer totalCount;

  public ReleaseEventSeriesForApiContractPartialFindResult() {
  }

  public ReleaseEventSeriesForApiContractPartialFindResult items(List<ReleaseEventSeriesForApiContract> items) {
    
    this.items = items;
    return this;
  }

  public ReleaseEventSeriesForApiContractPartialFindResult addItemsItem(ReleaseEventSeriesForApiContract itemsItem) {
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReleaseEventSeriesForApiContract> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<ReleaseEventSeriesForApiContract> items) {
    this.items = items;
  }


  public ReleaseEventSeriesForApiContractPartialFindResult term(String term) {
    
    this.term = term;
    return this;
  }

   /**
   * Get term
   * @return term
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTerm() {
    return term;
  }


  @JsonProperty(JSON_PROPERTY_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerm(String term) {
    this.term = term;
  }


  public ReleaseEventSeriesForApiContractPartialFindResult totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalCount() {
    return totalCount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    ReleaseEventSeriesForApiContractPartialFindResult releaseEventSeriesForApiContractPartialFindResult = (ReleaseEventSeriesForApiContractPartialFindResult) o;
    return Objects.equals(this.items, releaseEventSeriesForApiContractPartialFindResult.items) &&
        Objects.equals(this.term, releaseEventSeriesForApiContractPartialFindResult.term) &&
        Objects.equals(this.totalCount, releaseEventSeriesForApiContractPartialFindResult.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, term, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseEventSeriesForApiContractPartialFindResult {\n");
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

