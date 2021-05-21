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
import cx.mikufan.vocadbapiclient.model.EntryForApiContract;
import cx.mikufan.vocadbapiclient.model.UserForApiContract;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CommentForApiContract
 */
@JsonPropertyOrder({
  CommentForApiContract.JSON_PROPERTY_AUTHOR,
  CommentForApiContract.JSON_PROPERTY_AUTHOR_NAME,
  CommentForApiContract.JSON_PROPERTY_CREATED,
  CommentForApiContract.JSON_PROPERTY_ENTRY,
  CommentForApiContract.JSON_PROPERTY_ID,
  CommentForApiContract.JSON_PROPERTY_MESSAGE
})
@JsonTypeName("CommentForApiContract")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-20T13:35:02.772911500-04:00[America/New_York]")
public class CommentForApiContract {
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private UserForApiContract author;

  public static final String JSON_PROPERTY_AUTHOR_NAME = "authorName";
  private String authorName;

  public static final String JSON_PROPERTY_CREATED = "created";
  private LocalDateTime created;

  public static final String JSON_PROPERTY_ENTRY = "entry";
  private EntryForApiContract entry;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;


  public CommentForApiContract author(UserForApiContract author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserForApiContract getAuthor() {
    return author;
  }


  public void setAuthor(UserForApiContract author) {
    this.author = author;
  }


  public CommentForApiContract authorName(String authorName) {
    
    this.authorName = authorName;
    return this;
  }

   /**
   * Get authorName
   * @return authorName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthorName() {
    return authorName;
  }


  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }


  public CommentForApiContract created(LocalDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDateTime getCreated() {
    return created;
  }


  public void setCreated(LocalDateTime created) {
    this.created = created;
  }


  public CommentForApiContract entry(EntryForApiContract entry) {
    
    this.entry = entry;
    return this;
  }

   /**
   * Get entry
   * @return entry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EntryForApiContract getEntry() {
    return entry;
  }


  public void setEntry(EntryForApiContract entry) {
    this.entry = entry;
  }


  public CommentForApiContract id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public CommentForApiContract message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentForApiContract commentForApiContract = (CommentForApiContract) o;
    return Objects.equals(this.author, commentForApiContract.author) &&
        Objects.equals(this.authorName, commentForApiContract.authorName) &&
        Objects.equals(this.created, commentForApiContract.created) &&
        Objects.equals(this.entry, commentForApiContract.entry) &&
        Objects.equals(this.id, commentForApiContract.id) &&
        Objects.equals(this.message, commentForApiContract.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, authorName, created, entry, id, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentForApiContract {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    entry: ").append(toIndentedString(entry)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
