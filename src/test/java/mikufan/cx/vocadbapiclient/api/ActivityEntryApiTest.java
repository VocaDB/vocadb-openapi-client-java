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

import mikufan.cx.vocadbapiclient.model.ActivityEntryForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.ActivityEntryOptionalFields;
import mikufan.cx.vocadbapiclient.model.ActivityEntrySortRule;
import mikufan.cx.vocadbapiclient.model.ContentLanguagePreference;
import mikufan.cx.vocadbapiclient.model.EntryEditEvent;
import mikufan.cx.vocadbapiclient.model.EntryOptionalFields;
import mikufan.cx.vocadbapiclient.model.EntryType;
import java.time.LocalDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ActivityEntryApi
 */
@Ignore
public class ActivityEntryApiTest {

    private final ActivityEntryApi api = new ActivityEntryApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiActivityEntriesGetTest() {
        LocalDateTime before = null;
        LocalDateTime since = null;
        Integer userId = null;
        EntryEditEvent editEvent = null;
        EntryType entryType = null;
        Integer maxResults = null;
        Boolean getTotalCount = null;
        ActivityEntryOptionalFields fields = null;
        EntryOptionalFields entryFields = null;
        ContentLanguagePreference lang = null;
        ActivityEntrySortRule sortRule = null;

        ActivityEntryForApiContractPartialFindResult response = api.apiActivityEntriesGet(before, since, userId, editEvent, entryType, maxResults, getTotalCount, fields, entryFields, lang, sortRule);

        // TODO: test validations
    }
    
}