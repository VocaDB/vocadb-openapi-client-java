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

import mikufan.cx.vocadbapiclient.model.EntryType;
import mikufan.cx.vocadbapiclient.model.TagForApiContract;
import mikufan.cx.vocadbapiclient.model.TagOptionalFields;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EntryTypesApi
 */
@Ignore
public class EntryTypesApiTest {

    private final EntryTypesApi api = new EntryTypesApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiEntryTypesEntryTypeSubTypeTagGetTest() {
        EntryType entryType = null;
        String subType = null;
        TagOptionalFields fields = null;

        TagForApiContract response = api.apiEntryTypesEntryTypeSubTypeTagGet(entryType, subType, fields);

        // TODO: test validations
    }
    
}