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

import mikufan.cx.vocadbapiclient.model.ContentLanguagePreference;
import mikufan.cx.vocadbapiclient.model.NameMatchMode;
import mikufan.cx.vocadbapiclient.model.ReleaseEventSeriesForApiContract;
import mikufan.cx.vocadbapiclient.model.ReleaseEventSeriesForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.ReleaseEventSeriesForEditForApiContract;
import mikufan.cx.vocadbapiclient.model.ReleaseEventSeriesOptionalFields;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReleaseEventSeriesApi
 */
@Ignore
public class ReleaseEventSeriesApiTest {

    private final ReleaseEventSeriesApi api = new ReleaseEventSeriesApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiReleaseEventSeriesGetTest() {
        String query = null;
        ReleaseEventSeriesOptionalFields fields = null;
        Integer start = null;
        Integer maxResults = null;
        Boolean getTotalCount = null;
        NameMatchMode nameMatchMode = null;
        ContentLanguagePreference lang = null;

        ReleaseEventSeriesForApiContractPartialFindResult response = api.apiReleaseEventSeriesGet(query, fields, start, maxResults, getTotalCount, nameMatchMode, lang);

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
    public void apiReleaseEventSeriesIdDeleteTest() {
        Integer id = null;
        String notes = null;
        Boolean hardDelete = null;

        api.apiReleaseEventSeriesIdDelete(id, notes, hardDelete);

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
    public void apiReleaseEventSeriesIdForEditGetTest() {
        Integer id = null;

        ReleaseEventSeriesForEditForApiContract response = api.apiReleaseEventSeriesIdForEditGet(id);

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
    public void apiReleaseEventSeriesIdGetTest() {
        Integer id = null;
        ReleaseEventSeriesOptionalFields fields = null;
        ContentLanguagePreference lang = null;

        ReleaseEventSeriesForApiContract response = api.apiReleaseEventSeriesIdGet(id, fields, lang);

        // TODO: test validations
    }
    
}