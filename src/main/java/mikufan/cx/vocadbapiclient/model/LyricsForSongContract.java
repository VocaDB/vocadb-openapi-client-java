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
import mikufan.cx.vocadbapiclient.model.TranslationType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * LyricsForSongContract
 */
@JsonPropertyOrder({
  LyricsForSongContract.JSON_PROPERTY_CULTURE_CODES,
  LyricsForSongContract.JSON_PROPERTY_ID,
  LyricsForSongContract.JSON_PROPERTY_SOURCE,
  LyricsForSongContract.JSON_PROPERTY_TRANSLATION_TYPE,
  LyricsForSongContract.JSON_PROPERTY_URL,
  LyricsForSongContract.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-26T07:29:58.607748373Z[Etc/UTC]")
public class LyricsForSongContract {
  public static final String JSON_PROPERTY_CULTURE_CODES = "cultureCodes";
  private List<String> cultureCodes;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source = "";

  public static final String JSON_PROPERTY_TRANSLATION_TYPE = "translationType";
  private TranslationType translationType;

  public static final String JSON_PROPERTY_URL = "url";
  private String url = "";

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public LyricsForSongContract() {
  }

  public LyricsForSongContract cultureCodes(List<String> cultureCodes) {
    
    this.cultureCodes = cultureCodes;
    return this;
  }

  public LyricsForSongContract addCultureCodesItem(String cultureCodesItem) {
    if (this.cultureCodes == null) {
      this.cultureCodes = new ArrayList<>();
    }
    this.cultureCodes.add(cultureCodesItem);
    return this;
  }

   /**
   * Get cultureCodes
   * @return cultureCodes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CULTURE_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCultureCodes() {
    return cultureCodes;
  }


  @JsonProperty(JSON_PROPERTY_CULTURE_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCultureCodes(List<String> cultureCodes) {
    this.cultureCodes = cultureCodes;
  }


  public LyricsForSongContract id(Integer id) {
    
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


  public LyricsForSongContract source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(String source) {
    this.source = source;
  }


  public LyricsForSongContract translationType(TranslationType translationType) {
    
    this.translationType = translationType;
    return this;
  }

   /**
   * Get translationType
   * @return translationType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSLATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TranslationType getTranslationType() {
    return translationType;
  }


  @JsonProperty(JSON_PROPERTY_TRANSLATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranslationType(TranslationType translationType) {
    this.translationType = translationType;
  }


  public LyricsForSongContract url(String url) {
    
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


  public LyricsForSongContract value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LyricsForSongContract lyricsForSongContract = (LyricsForSongContract) o;
    return Objects.equals(this.cultureCodes, lyricsForSongContract.cultureCodes) &&
        Objects.equals(this.id, lyricsForSongContract.id) &&
        Objects.equals(this.source, lyricsForSongContract.source) &&
        Objects.equals(this.translationType, lyricsForSongContract.translationType) &&
        Objects.equals(this.url, lyricsForSongContract.url) &&
        Objects.equals(this.value, lyricsForSongContract.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cultureCodes, id, source, translationType, url, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LyricsForSongContract {\n");
    sb.append("    cultureCodes: ").append(toIndentedString(cultureCodes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    translationType: ").append(toIndentedString(translationType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

