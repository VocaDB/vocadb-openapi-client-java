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
import mikufan.cx.vocadbapiclient.model.DiscussionFolderContract;
import mikufan.cx.vocadbapiclient.model.DiscussionFolderOptionalFields;
import mikufan.cx.vocadbapiclient.model.DiscussionTopicContract;
import mikufan.cx.vocadbapiclient.model.DiscussionTopicContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.DiscussionTopicOptionalFields;
import mikufan.cx.vocadbapiclient.model.DiscussionTopicSortRule;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DiscussionApi
 */
@Ignore
public class DiscussionApiTest {

    private final DiscussionApi api = new DiscussionApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiDiscussionsCommentsCommentIdDeleteTest() {
        Integer commentId = null;

        api.apiDiscussionsCommentsCommentIdDelete(commentId);

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
    public void apiDiscussionsCommentsCommentIdPostTest() {
        Integer commentId = null;
        CommentForApiContract commentForApiContract = null;

        api.apiDiscussionsCommentsCommentIdPost(commentId, commentForApiContract);

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
    public void apiDiscussionsFoldersFolderIdTopicsGetTest() {
        Integer folderId = null;
        DiscussionTopicOptionalFields fields = null;

        List<DiscussionTopicContract> response = api.apiDiscussionsFoldersFolderIdTopicsGet(folderId, fields);

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
    public void apiDiscussionsFoldersFolderIdTopicsPostTest() {
        Integer folderId = null;
        DiscussionTopicContract discussionTopicContract = null;

        DiscussionTopicContract response = api.apiDiscussionsFoldersFolderIdTopicsPost(folderId, discussionTopicContract);

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
    public void apiDiscussionsFoldersGetTest() {
        DiscussionFolderOptionalFields fields = null;

        List<DiscussionFolderContract> response = api.apiDiscussionsFoldersGet(fields);

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
    public void apiDiscussionsFoldersPostTest() {
        DiscussionFolderContract discussionFolderContract = null;

        DiscussionFolderContract response = api.apiDiscussionsFoldersPost(discussionFolderContract);

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
    public void apiDiscussionsTopicsGetTest() {
        Integer folderId = null;
        Integer start = null;
        Integer maxResults = null;
        Boolean getTotalCount = null;
        DiscussionTopicSortRule sort = null;
        DiscussionTopicOptionalFields fields = null;

        DiscussionTopicContractPartialFindResult response = api.apiDiscussionsTopicsGet(folderId, start, maxResults, getTotalCount, sort, fields);

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
    public void apiDiscussionsTopicsTopicIdCommentsPostTest() {
        Integer topicId = null;
        CommentForApiContract commentForApiContract = null;

        CommentForApiContract response = api.apiDiscussionsTopicsTopicIdCommentsPost(topicId, commentForApiContract);

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
    public void apiDiscussionsTopicsTopicIdDeleteTest() {
        Integer topicId = null;

        api.apiDiscussionsTopicsTopicIdDelete(topicId);

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
    public void apiDiscussionsTopicsTopicIdGetTest() {
        Integer topicId = null;
        DiscussionTopicOptionalFields fields = null;

        DiscussionTopicContract response = api.apiDiscussionsTopicsTopicIdGet(topicId, fields);

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
    public void apiDiscussionsTopicsTopicIdPostTest() {
        Integer topicId = null;
        DiscussionTopicContract discussionTopicContract = null;

        api.apiDiscussionsTopicsTopicIdPost(topicId, discussionTopicContract);

        // TODO: test validations
    }
    
}