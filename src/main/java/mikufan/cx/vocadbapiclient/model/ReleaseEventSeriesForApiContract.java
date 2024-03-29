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
import mikufan.cx.vocadbapiclient.model.EntryStatus;
import mikufan.cx.vocadbapiclient.model.EntryThumbForApiContract;
import mikufan.cx.vocadbapiclient.model.EventCategory;
import mikufan.cx.vocadbapiclient.model.LocalizedStringContract;
import mikufan.cx.vocadbapiclient.model.ReleaseEventForApiContract;
import mikufan.cx.vocadbapiclient.model.WebLinkForApiContract;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ReleaseEventSeriesForApiContract
 */
@JsonPropertyOrder({
  ReleaseEventSeriesForApiContract.JSON_PROPERTY_ADDITIONAL_NAMES,
  ReleaseEventSeriesForApiContract.JSON_PROPERTY_CATEGORY,
  ReleaseEventSeriesForApiContract.JSON_PROPERTY_DESCRIPTION,
  ReleaseEventSeriesForApiContract.JSON_PROPERTY_EVENTS,
  ReleaseEventSeriesForApiContract.JSON_PROPERTY_ID,
  ReleaseEventSeriesForApiContract.JSON_PROPERTY_MAIN_PICTURE,
  ReleaseEventSeriesForApiContract.JSON_PROPERTY_NAME,
  ReleaseEventSeriesForApiContract.JSON_PROPERTY_NAMES,
  ReleaseEventSeriesForApiContract.JSON_PROPERTY_STATUS,
  ReleaseEventSeriesForApiContract.JSON_PROPERTY_URL_SLUG,
  ReleaseEventSeriesForApiContract.JSON_PROPERTY_VERSION,
  ReleaseEventSeriesForApiContract.JSON_PROPERTY_WEB_LINKS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-26T07:29:58.607748373Z[Etc/UTC]")
public class ReleaseEventSeriesForApiContract {
  public static final String JSON_PROPERTY_ADDITIONAL_NAMES = "additionalNames";
  private String additionalNames;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private EventCategory category;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<ReleaseEventForApiContract> events;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_MAIN_PICTURE = "mainPicture";
  private EntryThumbForApiContract mainPicture;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NAMES = "names";
  private List<LocalizedStringContract> names;

  public static final String JSON_PROPERTY_STATUS = "status";
  private EntryStatus status;

  public static final String JSON_PROPERTY_URL_SLUG = "urlSlug";
  private String urlSlug;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_WEB_LINKS = "webLinks";
  private List<WebLinkForApiContract> webLinks;

  public ReleaseEventSeriesForApiContract() {
  }

  public ReleaseEventSeriesForApiContract additionalNames(String additionalNames) {
    
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


  public ReleaseEventSeriesForApiContract category(EventCategory category) {
    
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

  public EventCategory getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(EventCategory category) {
    this.category = category;
  }


  public ReleaseEventSeriesForApiContract description(String description) {
    
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


  public ReleaseEventSeriesForApiContract events(List<ReleaseEventForApiContract> events) {
    
    this.events = events;
    return this;
  }

  public ReleaseEventSeriesForApiContract addEventsItem(ReleaseEventForApiContract eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReleaseEventForApiContract> getEvents() {
    return events;
  }


  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvents(List<ReleaseEventForApiContract> events) {
    this.events = events;
  }


  public ReleaseEventSeriesForApiContract id(Integer id) {
    
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


  public ReleaseEventSeriesForApiContract mainPicture(EntryThumbForApiContract mainPicture) {
    
    this.mainPicture = mainPicture;
    return this;
  }

   /**
   * Get mainPicture
   * @return mainPicture
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAIN_PICTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EntryThumbForApiContract getMainPicture() {
    return mainPicture;
  }


  @JsonProperty(JSON_PROPERTY_MAIN_PICTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMainPicture(EntryThumbForApiContract mainPicture) {
    this.mainPicture = mainPicture;
  }


  public ReleaseEventSeriesForApiContract name(String name) {
    
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


  public ReleaseEventSeriesForApiContract names(List<LocalizedStringContract> names) {
    
    this.names = names;
    return this;
  }

  public ReleaseEventSeriesForApiContract addNamesItem(LocalizedStringContract namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LocalizedStringContract> getNames() {
    return names;
  }


  @JsonProperty(JSON_PROPERTY_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNames(List<LocalizedStringContract> names) {
    this.names = names;
  }


  public ReleaseEventSeriesForApiContract status(EntryStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EntryStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(EntryStatus status) {
    this.status = status;
  }


  public ReleaseEventSeriesForApiContract urlSlug(String urlSlug) {
    
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


  public ReleaseEventSeriesForApiContract version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(Integer version) {
    this.version = version;
  }


  public ReleaseEventSeriesForApiContract webLinks(List<WebLinkForApiContract> webLinks) {
    
    this.webLinks = webLinks;
    return this;
  }

  public ReleaseEventSeriesForApiContract addWebLinksItem(WebLinkForApiContract webLinksItem) {
    if (this.webLinks == null) {
      this.webLinks = new ArrayList<>();
    }
    this.webLinks.add(webLinksItem);
    return this;
  }

   /**
   * Get webLinks
   * @return webLinks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEB_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WebLinkForApiContract> getWebLinks() {
    return webLinks;
  }


  @JsonProperty(JSON_PROPERTY_WEB_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebLinks(List<WebLinkForApiContract> webLinks) {
    this.webLinks = webLinks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseEventSeriesForApiContract releaseEventSeriesForApiContract = (ReleaseEventSeriesForApiContract) o;
    return Objects.equals(this.additionalNames, releaseEventSeriesForApiContract.additionalNames) &&
        Objects.equals(this.category, releaseEventSeriesForApiContract.category) &&
        Objects.equals(this.description, releaseEventSeriesForApiContract.description) &&
        Objects.equals(this.events, releaseEventSeriesForApiContract.events) &&
        Objects.equals(this.id, releaseEventSeriesForApiContract.id) &&
        Objects.equals(this.mainPicture, releaseEventSeriesForApiContract.mainPicture) &&
        Objects.equals(this.name, releaseEventSeriesForApiContract.name) &&
        Objects.equals(this.names, releaseEventSeriesForApiContract.names) &&
        Objects.equals(this.status, releaseEventSeriesForApiContract.status) &&
        Objects.equals(this.urlSlug, releaseEventSeriesForApiContract.urlSlug) &&
        Objects.equals(this.version, releaseEventSeriesForApiContract.version) &&
        Objects.equals(this.webLinks, releaseEventSeriesForApiContract.webLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalNames, category, description, events, id, mainPicture, name, names, status, urlSlug, version, webLinks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseEventSeriesForApiContract {\n");
    sb.append("    additionalNames: ").append(toIndentedString(additionalNames)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mainPicture: ").append(toIndentedString(mainPicture)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    urlSlug: ").append(toIndentedString(urlSlug)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    webLinks: ").append(toIndentedString(webLinks)).append("\n");
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

