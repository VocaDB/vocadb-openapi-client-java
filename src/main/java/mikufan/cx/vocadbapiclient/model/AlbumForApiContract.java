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
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mikufan.cx.vocadbapiclient.model.AlbumDiscPropertiesContract;
import mikufan.cx.vocadbapiclient.model.AlbumIdentifierContract;
import mikufan.cx.vocadbapiclient.model.ArtistForAlbumForApiContract;
import mikufan.cx.vocadbapiclient.model.ContentLanguageSelection;
import mikufan.cx.vocadbapiclient.model.DiscType;
import mikufan.cx.vocadbapiclient.model.EntryStatus;
import mikufan.cx.vocadbapiclient.model.EntryThumbForApiContract;
import mikufan.cx.vocadbapiclient.model.LocalizedStringContract;
import mikufan.cx.vocadbapiclient.model.OptionalDateTimeContract;
import mikufan.cx.vocadbapiclient.model.PVContract;
import mikufan.cx.vocadbapiclient.model.ReleaseEventForApiContract;
import mikufan.cx.vocadbapiclient.model.SongInAlbumForApiContract;
import mikufan.cx.vocadbapiclient.model.TagUsageForApiContract;
import mikufan.cx.vocadbapiclient.model.WebLinkForApiContract;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AlbumForApiContract
 */
@JsonPropertyOrder({
  AlbumForApiContract.JSON_PROPERTY_ADDITIONAL_NAMES,
  AlbumForApiContract.JSON_PROPERTY_ARTISTS,
  AlbumForApiContract.JSON_PROPERTY_ARTIST_STRING,
  AlbumForApiContract.JSON_PROPERTY_BARCODE,
  AlbumForApiContract.JSON_PROPERTY_CATALOG_NUMBER,
  AlbumForApiContract.JSON_PROPERTY_CREATE_DATE,
  AlbumForApiContract.JSON_PROPERTY_DEFAULT_NAME,
  AlbumForApiContract.JSON_PROPERTY_DEFAULT_NAME_LANGUAGE,
  AlbumForApiContract.JSON_PROPERTY_DELETED,
  AlbumForApiContract.JSON_PROPERTY_DESCRIPTION,
  AlbumForApiContract.JSON_PROPERTY_DISCS,
  AlbumForApiContract.JSON_PROPERTY_DISC_TYPE,
  AlbumForApiContract.JSON_PROPERTY_ID,
  AlbumForApiContract.JSON_PROPERTY_IDENTIFIERS,
  AlbumForApiContract.JSON_PROPERTY_MAIN_PICTURE,
  AlbumForApiContract.JSON_PROPERTY_MERGED_TO,
  AlbumForApiContract.JSON_PROPERTY_NAME,
  AlbumForApiContract.JSON_PROPERTY_NAMES,
  AlbumForApiContract.JSON_PROPERTY_PVS,
  AlbumForApiContract.JSON_PROPERTY_RATING_AVERAGE,
  AlbumForApiContract.JSON_PROPERTY_RATING_COUNT,
  AlbumForApiContract.JSON_PROPERTY_RELEASE_DATE,
  AlbumForApiContract.JSON_PROPERTY_RELEASE_EVENT,
  AlbumForApiContract.JSON_PROPERTY_RELEASE_EVENTS,
  AlbumForApiContract.JSON_PROPERTY_STATUS,
  AlbumForApiContract.JSON_PROPERTY_TAGS,
  AlbumForApiContract.JSON_PROPERTY_TRACKS,
  AlbumForApiContract.JSON_PROPERTY_VERSION,
  AlbumForApiContract.JSON_PROPERTY_WEB_LINKS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-26T07:29:58.607748373Z[Etc/UTC]")
public class AlbumForApiContract {
  public static final String JSON_PROPERTY_ADDITIONAL_NAMES = "additionalNames";
  private String additionalNames;

  public static final String JSON_PROPERTY_ARTISTS = "artists";
  private List<ArtistForAlbumForApiContract> artists;

  public static final String JSON_PROPERTY_ARTIST_STRING = "artistString";
  private String artistString;

  public static final String JSON_PROPERTY_BARCODE = "barcode";
  private String barcode;

  public static final String JSON_PROPERTY_CATALOG_NUMBER = "catalogNumber";
  private String catalogNumber;

  public static final String JSON_PROPERTY_CREATE_DATE = "createDate";
  private LocalDateTime createDate;

  public static final String JSON_PROPERTY_DEFAULT_NAME = "defaultName";
  private String defaultName;

  public static final String JSON_PROPERTY_DEFAULT_NAME_LANGUAGE = "defaultNameLanguage";
  private ContentLanguageSelection defaultNameLanguage;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISCS = "discs";
  private List<AlbumDiscPropertiesContract> discs;

  public static final String JSON_PROPERTY_DISC_TYPE = "discType";
  private DiscType discType;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_IDENTIFIERS = "identifiers";
  private List<AlbumIdentifierContract> identifiers;

  public static final String JSON_PROPERTY_MAIN_PICTURE = "mainPicture";
  private EntryThumbForApiContract mainPicture;

  public static final String JSON_PROPERTY_MERGED_TO = "mergedTo";
  private Integer mergedTo;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NAMES = "names";
  private List<LocalizedStringContract> names;

  public static final String JSON_PROPERTY_PVS = "pvs";
  private List<PVContract> pvs;

  public static final String JSON_PROPERTY_RATING_AVERAGE = "ratingAverage";
  private Double ratingAverage;

  public static final String JSON_PROPERTY_RATING_COUNT = "ratingCount";
  private Integer ratingCount;

  public static final String JSON_PROPERTY_RELEASE_DATE = "releaseDate";
  private OptionalDateTimeContract releaseDate;

  public static final String JSON_PROPERTY_RELEASE_EVENT = "releaseEvent";
  private ReleaseEventForApiContract releaseEvent;

  public static final String JSON_PROPERTY_RELEASE_EVENTS = "releaseEvents";
  private List<ReleaseEventForApiContract> releaseEvents;

  public static final String JSON_PROPERTY_STATUS = "status";
  private EntryStatus status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<TagUsageForApiContract> tags;

  public static final String JSON_PROPERTY_TRACKS = "tracks";
  private List<SongInAlbumForApiContract> tracks;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_WEB_LINKS = "webLinks";
  private List<WebLinkForApiContract> webLinks;

  public AlbumForApiContract() {
  }

  public AlbumForApiContract additionalNames(String additionalNames) {
    
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


  public AlbumForApiContract artists(List<ArtistForAlbumForApiContract> artists) {
    
    this.artists = artists;
    return this;
  }

  public AlbumForApiContract addArtistsItem(ArtistForAlbumForApiContract artistsItem) {
    if (this.artists == null) {
      this.artists = new ArrayList<>();
    }
    this.artists.add(artistsItem);
    return this;
  }

   /**
   * Get artists
   * @return artists
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARTISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ArtistForAlbumForApiContract> getArtists() {
    return artists;
  }


  @JsonProperty(JSON_PROPERTY_ARTISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArtists(List<ArtistForAlbumForApiContract> artists) {
    this.artists = artists;
  }


  public AlbumForApiContract artistString(String artistString) {
    
    this.artistString = artistString;
    return this;
  }

   /**
   * Get artistString
   * @return artistString
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARTIST_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getArtistString() {
    return artistString;
  }


  @JsonProperty(JSON_PROPERTY_ARTIST_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArtistString(String artistString) {
    this.artistString = artistString;
  }


  public AlbumForApiContract barcode(String barcode) {
    
    this.barcode = barcode;
    return this;
  }

   /**
   * Get barcode
   * @return barcode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BARCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBarcode() {
    return barcode;
  }


  @JsonProperty(JSON_PROPERTY_BARCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }


  public AlbumForApiContract catalogNumber(String catalogNumber) {
    
    this.catalogNumber = catalogNumber;
    return this;
  }

   /**
   * Get catalogNumber
   * @return catalogNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATALOG_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCatalogNumber() {
    return catalogNumber;
  }


  @JsonProperty(JSON_PROPERTY_CATALOG_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCatalogNumber(String catalogNumber) {
    this.catalogNumber = catalogNumber;
  }


  public AlbumForApiContract createDate(LocalDateTime createDate) {
    
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDateTime getCreateDate() {
    return createDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateDate(LocalDateTime createDate) {
    this.createDate = createDate;
  }


  public AlbumForApiContract defaultName(String defaultName) {
    
    this.defaultName = defaultName;
    return this;
  }

   /**
   * Get defaultName
   * @return defaultName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultName() {
    return defaultName;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultName(String defaultName) {
    this.defaultName = defaultName;
  }


  public AlbumForApiContract defaultNameLanguage(ContentLanguageSelection defaultNameLanguage) {
    
    this.defaultNameLanguage = defaultNameLanguage;
    return this;
  }

   /**
   * Get defaultNameLanguage
   * @return defaultNameLanguage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_NAME_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContentLanguageSelection getDefaultNameLanguage() {
    return defaultNameLanguage;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_NAME_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultNameLanguage(ContentLanguageSelection defaultNameLanguage) {
    this.defaultNameLanguage = defaultNameLanguage;
  }


  public AlbumForApiContract deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeleted() {
    return deleted;
  }


  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public AlbumForApiContract description(String description) {
    
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


  public AlbumForApiContract discs(List<AlbumDiscPropertiesContract> discs) {
    
    this.discs = discs;
    return this;
  }

  public AlbumForApiContract addDiscsItem(AlbumDiscPropertiesContract discsItem) {
    if (this.discs == null) {
      this.discs = new ArrayList<>();
    }
    this.discs.add(discsItem);
    return this;
  }

   /**
   * Get discs
   * @return discs
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISCS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AlbumDiscPropertiesContract> getDiscs() {
    return discs;
  }


  @JsonProperty(JSON_PROPERTY_DISCS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscs(List<AlbumDiscPropertiesContract> discs) {
    this.discs = discs;
  }


  public AlbumForApiContract discType(DiscType discType) {
    
    this.discType = discType;
    return this;
  }

   /**
   * Get discType
   * @return discType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISC_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DiscType getDiscType() {
    return discType;
  }


  @JsonProperty(JSON_PROPERTY_DISC_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscType(DiscType discType) {
    this.discType = discType;
  }


  public AlbumForApiContract id(Integer id) {
    
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


  public AlbumForApiContract identifiers(List<AlbumIdentifierContract> identifiers) {
    
    this.identifiers = identifiers;
    return this;
  }

  public AlbumForApiContract addIdentifiersItem(AlbumIdentifierContract identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new ArrayList<>();
    }
    this.identifiers.add(identifiersItem);
    return this;
  }

   /**
   * Get identifiers
   * @return identifiers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDENTIFIERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AlbumIdentifierContract> getIdentifiers() {
    return identifiers;
  }


  @JsonProperty(JSON_PROPERTY_IDENTIFIERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentifiers(List<AlbumIdentifierContract> identifiers) {
    this.identifiers = identifiers;
  }


  public AlbumForApiContract mainPicture(EntryThumbForApiContract mainPicture) {
    
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


  public AlbumForApiContract mergedTo(Integer mergedTo) {
    
    this.mergedTo = mergedTo;
    return this;
  }

   /**
   * Get mergedTo
   * @return mergedTo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERGED_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMergedTo() {
    return mergedTo;
  }


  @JsonProperty(JSON_PROPERTY_MERGED_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMergedTo(Integer mergedTo) {
    this.mergedTo = mergedTo;
  }


  public AlbumForApiContract name(String name) {
    
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


  public AlbumForApiContract names(List<LocalizedStringContract> names) {
    
    this.names = names;
    return this;
  }

  public AlbumForApiContract addNamesItem(LocalizedStringContract namesItem) {
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


  public AlbumForApiContract pvs(List<PVContract> pvs) {
    
    this.pvs = pvs;
    return this;
  }

  public AlbumForApiContract addPvsItem(PVContract pvsItem) {
    if (this.pvs == null) {
      this.pvs = new ArrayList<>();
    }
    this.pvs.add(pvsItem);
    return this;
  }

   /**
   * Get pvs
   * @return pvs
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PVS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PVContract> getPvs() {
    return pvs;
  }


  @JsonProperty(JSON_PROPERTY_PVS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPvs(List<PVContract> pvs) {
    this.pvs = pvs;
  }


  public AlbumForApiContract ratingAverage(Double ratingAverage) {
    
    this.ratingAverage = ratingAverage;
    return this;
  }

   /**
   * Get ratingAverage
   * @return ratingAverage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATING_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getRatingAverage() {
    return ratingAverage;
  }


  @JsonProperty(JSON_PROPERTY_RATING_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatingAverage(Double ratingAverage) {
    this.ratingAverage = ratingAverage;
  }


  public AlbumForApiContract ratingCount(Integer ratingCount) {
    
    this.ratingCount = ratingCount;
    return this;
  }

   /**
   * Get ratingCount
   * @return ratingCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATING_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRatingCount() {
    return ratingCount;
  }


  @JsonProperty(JSON_PROPERTY_RATING_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatingCount(Integer ratingCount) {
    this.ratingCount = ratingCount;
  }


  public AlbumForApiContract releaseDate(OptionalDateTimeContract releaseDate) {
    
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * Get releaseDate
   * @return releaseDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptionalDateTimeContract getReleaseDate() {
    return releaseDate;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseDate(OptionalDateTimeContract releaseDate) {
    this.releaseDate = releaseDate;
  }


  public AlbumForApiContract releaseEvent(ReleaseEventForApiContract releaseEvent) {
    
    this.releaseEvent = releaseEvent;
    return this;
  }

   /**
   * Get releaseEvent
   * @return releaseEvent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReleaseEventForApiContract getReleaseEvent() {
    return releaseEvent;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseEvent(ReleaseEventForApiContract releaseEvent) {
    this.releaseEvent = releaseEvent;
  }


  public AlbumForApiContract releaseEvents(List<ReleaseEventForApiContract> releaseEvents) {
    
    this.releaseEvents = releaseEvents;
    return this;
  }

  public AlbumForApiContract addReleaseEventsItem(ReleaseEventForApiContract releaseEventsItem) {
    if (this.releaseEvents == null) {
      this.releaseEvents = new ArrayList<>();
    }
    this.releaseEvents.add(releaseEventsItem);
    return this;
  }

   /**
   * Get releaseEvents
   * @return releaseEvents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReleaseEventForApiContract> getReleaseEvents() {
    return releaseEvents;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseEvents(List<ReleaseEventForApiContract> releaseEvents) {
    this.releaseEvents = releaseEvents;
  }


  public AlbumForApiContract status(EntryStatus status) {
    
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


  public AlbumForApiContract tags(List<TagUsageForApiContract> tags) {
    
    this.tags = tags;
    return this;
  }

  public AlbumForApiContract addTagsItem(TagUsageForApiContract tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TagUsageForApiContract> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<TagUsageForApiContract> tags) {
    this.tags = tags;
  }


  public AlbumForApiContract tracks(List<SongInAlbumForApiContract> tracks) {
    
    this.tracks = tracks;
    return this;
  }

  public AlbumForApiContract addTracksItem(SongInAlbumForApiContract tracksItem) {
    if (this.tracks == null) {
      this.tracks = new ArrayList<>();
    }
    this.tracks.add(tracksItem);
    return this;
  }

   /**
   * Get tracks
   * @return tracks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SongInAlbumForApiContract> getTracks() {
    return tracks;
  }


  @JsonProperty(JSON_PROPERTY_TRACKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTracks(List<SongInAlbumForApiContract> tracks) {
    this.tracks = tracks;
  }


  public AlbumForApiContract version(Integer version) {
    
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


  public AlbumForApiContract webLinks(List<WebLinkForApiContract> webLinks) {
    
    this.webLinks = webLinks;
    return this;
  }

  public AlbumForApiContract addWebLinksItem(WebLinkForApiContract webLinksItem) {
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
    AlbumForApiContract albumForApiContract = (AlbumForApiContract) o;
    return Objects.equals(this.additionalNames, albumForApiContract.additionalNames) &&
        Objects.equals(this.artists, albumForApiContract.artists) &&
        Objects.equals(this.artistString, albumForApiContract.artistString) &&
        Objects.equals(this.barcode, albumForApiContract.barcode) &&
        Objects.equals(this.catalogNumber, albumForApiContract.catalogNumber) &&
        Objects.equals(this.createDate, albumForApiContract.createDate) &&
        Objects.equals(this.defaultName, albumForApiContract.defaultName) &&
        Objects.equals(this.defaultNameLanguage, albumForApiContract.defaultNameLanguage) &&
        Objects.equals(this.deleted, albumForApiContract.deleted) &&
        Objects.equals(this.description, albumForApiContract.description) &&
        Objects.equals(this.discs, albumForApiContract.discs) &&
        Objects.equals(this.discType, albumForApiContract.discType) &&
        Objects.equals(this.id, albumForApiContract.id) &&
        Objects.equals(this.identifiers, albumForApiContract.identifiers) &&
        Objects.equals(this.mainPicture, albumForApiContract.mainPicture) &&
        Objects.equals(this.mergedTo, albumForApiContract.mergedTo) &&
        Objects.equals(this.name, albumForApiContract.name) &&
        Objects.equals(this.names, albumForApiContract.names) &&
        Objects.equals(this.pvs, albumForApiContract.pvs) &&
        Objects.equals(this.ratingAverage, albumForApiContract.ratingAverage) &&
        Objects.equals(this.ratingCount, albumForApiContract.ratingCount) &&
        Objects.equals(this.releaseDate, albumForApiContract.releaseDate) &&
        Objects.equals(this.releaseEvent, albumForApiContract.releaseEvent) &&
        Objects.equals(this.releaseEvents, albumForApiContract.releaseEvents) &&
        Objects.equals(this.status, albumForApiContract.status) &&
        Objects.equals(this.tags, albumForApiContract.tags) &&
        Objects.equals(this.tracks, albumForApiContract.tracks) &&
        Objects.equals(this.version, albumForApiContract.version) &&
        Objects.equals(this.webLinks, albumForApiContract.webLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalNames, artists, artistString, barcode, catalogNumber, createDate, defaultName, defaultNameLanguage, deleted, description, discs, discType, id, identifiers, mainPicture, mergedTo, name, names, pvs, ratingAverage, ratingCount, releaseDate, releaseEvent, releaseEvents, status, tags, tracks, version, webLinks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlbumForApiContract {\n");
    sb.append("    additionalNames: ").append(toIndentedString(additionalNames)).append("\n");
    sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
    sb.append("    artistString: ").append(toIndentedString(artistString)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    catalogNumber: ").append(toIndentedString(catalogNumber)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    defaultName: ").append(toIndentedString(defaultName)).append("\n");
    sb.append("    defaultNameLanguage: ").append(toIndentedString(defaultNameLanguage)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    discs: ").append(toIndentedString(discs)).append("\n");
    sb.append("    discType: ").append(toIndentedString(discType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    mainPicture: ").append(toIndentedString(mainPicture)).append("\n");
    sb.append("    mergedTo: ").append(toIndentedString(mergedTo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    pvs: ").append(toIndentedString(pvs)).append("\n");
    sb.append("    ratingAverage: ").append(toIndentedString(ratingAverage)).append("\n");
    sb.append("    ratingCount: ").append(toIndentedString(ratingCount)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    releaseEvent: ").append(toIndentedString(releaseEvent)).append("\n");
    sb.append("    releaseEvents: ").append(toIndentedString(releaseEvents)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    tracks: ").append(toIndentedString(tracks)).append("\n");
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

