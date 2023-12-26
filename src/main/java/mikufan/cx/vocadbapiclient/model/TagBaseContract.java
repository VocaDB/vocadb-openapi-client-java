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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TagBaseContract
 */
@JsonPropertyOrder({
  TagBaseContract.JSON_PROPERTY_ADDITIONAL_NAMES,
  TagBaseContract.JSON_PROPERTY_CATEGORY_NAME,
  TagBaseContract.JSON_PROPERTY_ID,
  TagBaseContract.JSON_PROPERTY_NAME,
  TagBaseContract.JSON_PROPERTY_URL_SLUG
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-26T07:29:58.607748373Z[Etc/UTC]")
public class TagBaseContract {
  public static final String JSON_PROPERTY_ADDITIONAL_NAMES = "additionalNames";
  private String additionalNames;

  public static final String JSON_PROPERTY_CATEGORY_NAME = "categoryName";
  private String categoryName;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_URL_SLUG = "urlSlug";
  private String urlSlug;

  public TagBaseContract() {
  }

  public TagBaseContract additionalNames(String additionalNames) {
    
    this.additionalNames = additionalNames;
    return this;
  }

   /**
   * Get additionalNames
   * @return additionalNames
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdditionalNames() {
    return additionalNames;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalNames(String additionalNames) {
    this.additionalNames = additionalNames;
  }


  public TagBaseContract categoryName(String categoryName) {
    
    this.categoryName = categoryName;
    return this;
  }

   /**
   * Get categoryName
   * @return categoryName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCategoryName() {
    return categoryName;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public TagBaseContract id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public TagBaseContract name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public TagBaseContract urlSlug(String urlSlug) {
    
    this.urlSlug = urlSlug;
    return this;
  }

   /**
   * Get urlSlug
   * @return urlSlug
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL_SLUG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrlSlug() {
    return urlSlug;
  }


  @JsonProperty(JSON_PROPERTY_URL_SLUG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlSlug(String urlSlug) {
    this.urlSlug = urlSlug;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagBaseContract tagBaseContract = (TagBaseContract) o;
    return Objects.equals(this.additionalNames, tagBaseContract.additionalNames) &&
        Objects.equals(this.categoryName, tagBaseContract.categoryName) &&
        Objects.equals(this.id, tagBaseContract.id) &&
        Objects.equals(this.name, tagBaseContract.name) &&
        Objects.equals(this.urlSlug, tagBaseContract.urlSlug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalNames, categoryName, id, name, urlSlug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagBaseContract {\n");
    sb.append("    additionalNames: ").append(toIndentedString(additionalNames)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    urlSlug: ").append(toIndentedString(urlSlug)).append("\n");
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

