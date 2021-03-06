/**
* Swagger UI - Cloud Hospital Api-INT
* Cloud Hospital application with Swagger, Swashbuckle, and API versioning.
*
* The version of the OpenAPI document: 1
* Contact: hyounoosung@icloudhospital.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.google.gson.annotations.SerializedName

/**
 * 
 * @param hospitalId 
 * @param hospitalName 
 * @param hospitalSlug 
 * @param countryId 
 * @param countryName 
 * @param stateName 
 * @param cityName 
 */

data class HospitalAffiliationViewModel (
    @SerializedName("hospitalId")
    val hospitalId: java.util.UUID? = null,
    @SerializedName("hospitalName")
    val hospitalName: kotlin.String? = null,
    @SerializedName("hospitalSlug")
    val hospitalSlug: kotlin.String? = null,
    @SerializedName("countryId")
    val countryId: java.util.UUID? = null,
    @SerializedName("countryName")
    val countryName: kotlin.String? = null,
    @SerializedName("stateName")
    val stateName: kotlin.String? = null,
    @SerializedName("cityName")
    val cityName: kotlin.String? = null
)

