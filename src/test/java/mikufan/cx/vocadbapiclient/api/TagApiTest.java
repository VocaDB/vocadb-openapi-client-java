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


package mikufan.cx.vocadbapiclient.api;

import mikufan.cx.vocadbapiclient.model.CommentForApiContract;
import mikufan.cx.vocadbapiclient.model.CommentForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.ContentLanguagePreference;
import mikufan.cx.vocadbapiclient.model.EntryType;
import mikufan.cx.vocadbapiclient.model.NameMatchMode;
import mikufan.cx.vocadbapiclient.model.TagBaseContract;
import mikufan.cx.vocadbapiclient.model.TagForApiContract;
import mikufan.cx.vocadbapiclient.model.TagForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.TagOptionalFields;
import mikufan.cx.vocadbapiclient.model.TagReportType;
import mikufan.cx.vocadbapiclient.model.TagSortRule;
import mikufan.cx.vocadbapiclient.model.TagTargetTypes;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TagApi
 */
@Ignore
public class TagApiTest {

    private final TagApi api = new TagApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiTagsByNameNameGetTest() {
        String name = null;
        TagOptionalFields fields = null;
        ContentLanguagePreference lang = null;

        TagForApiContract response = api.apiTagsByNameNameGet(name, fields, lang);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiTagsCategoryNamesGetTest() {
        String query = null;
        NameMatchMode nameMatchMode = null;

        List<String> response = api.apiTagsCategoryNamesGet(query, nameMatchMode);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiTagsCommentsCommentIdDeleteTest() {
        Integer commentId = null;

        api.apiTagsCommentsCommentIdDelete(commentId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiTagsCommentsCommentIdPostTest() {
        Integer commentId = null;
        CommentForApiContract commentForApiContract = null;

        api.apiTagsCommentsCommentIdPost(commentId, commentForApiContract);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiTagsGetTest() {
        String query = null;
        Boolean allowChildren = null;
        String categoryName = null;
        Integer start = null;
        Integer maxResults = null;
        Boolean getTotalCount = null;
        NameMatchMode nameMatchMode = null;
        TagSortRule sort = null;
        Boolean preferAccurateMatches = null;
        TagOptionalFields fields = null;
        ContentLanguagePreference lang = null;
        TagTargetTypes target = null;
        Boolean deleted = null;

        TagForApiContractPartialFindResult response = api.apiTagsGet(query, allowChildren, categoryName, start, maxResults, getTotalCount, nameMatchMode, sort, preferAccurateMatches, fields, lang, target, deleted);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiTagsIdDeleteTest() {
        Integer id = null;
        String notes = null;
        Boolean hardDelete = null;

        api.apiTagsIdDelete(id, notes, hardDelete);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiTagsIdGetTest() {
        Integer id = null;
        TagOptionalFields fields = null;
        ContentLanguagePreference lang = null;

        TagForApiContract response = api.apiTagsIdGet(id, fields, lang);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiTagsNamesGetTest() {
        String query = null;
        Boolean allowAliases = null;
        Integer maxResults = null;

        List<String> response = api.apiTagsNamesGet(query, allowAliases, maxResults);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiTagsPostTest() {
        String name = null;

        TagBaseContract response = api.apiTagsPost(name);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiTagsTagIdChildrenGetTest() {
        Integer tagId = null;
        TagOptionalFields fields = null;
        ContentLanguagePreference lang = null;

        List<TagForApiContract> response = api.apiTagsTagIdChildrenGet(tagId, fields, lang);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiTagsTagIdCommentsGetTest() {
        Integer tagId = null;

        CommentForApiContractPartialFindResult response = api.apiTagsTagIdCommentsGet(tagId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiTagsTagIdCommentsPostTest() {
        Integer tagId = null;
        CommentForApiContract commentForApiContract = null;

        CommentForApiContract response = api.apiTagsTagIdCommentsPost(tagId, commentForApiContract);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiTagsTagIdReportsPostTest() {
        Integer tagId = null;
        TagReportType reportType = null;
        String notes = null;
        Integer versionNumber = null;

        api.apiTagsTagIdReportsPost(tagId, reportType, notes, versionNumber);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiTagsTopGetTest() {
        String categoryName = null;
        EntryType entryType = null;
        Integer maxResults = null;
        ContentLanguagePreference lang = null;

        List<TagBaseContract> response = api.apiTagsTopGet(categoryName, entryType, maxResults, lang);

        // TODO: test validations
    }
    
}