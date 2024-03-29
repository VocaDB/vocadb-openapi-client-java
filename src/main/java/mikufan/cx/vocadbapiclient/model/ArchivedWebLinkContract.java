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
import mikufan.cx.vocadbapiclient.model.WebLinkCategory;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ArchivedWebLinkContract
 */
@JsonPropertyOrder({
  ArchivedWebLinkContract.JSON_PROPERTY_CATEGORY,
  ArchivedWebLinkContract.JSON_PROPERTY_DESCRIPTION,
  ArchivedWebLinkContract.JSON_PROPERTY_DISABLED,
  ArchivedWebLinkContract.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-26T07:29:58.607748373Z[Etc/UTC]")
public class ArchivedWebLinkContract {
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private WebLinkCategory category;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public ArchivedWebLinkContract() {
  }

  public ArchivedWebLinkContract category(WebLinkCategory category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebLinkCategory getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(WebLinkCategory category) {
    this.category = category;
  }


  public ArchivedWebLinkContract description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public ArchivedWebLinkContract disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisabled() {
    return disabled;
  }


  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public ArchivedWebLinkContract url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchivedWebLinkContract archivedWebLinkContract = (ArchivedWebLinkContract) o;
    return Objects.equals(this.category, archivedWebLinkContract.category) &&
        Objects.equals(this.description, archivedWebLinkContract.description) &&
        Objects.equals(this.disabled, archivedWebLinkContract.disabled) &&
        Objects.equals(this.url, archivedWebLinkContract.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, description, disabled, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchivedWebLinkContract {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

