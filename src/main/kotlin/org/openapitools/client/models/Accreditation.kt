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

import org.openapitools.client.models.HospitalAccreditation

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param id 
 * @param name 
 * @param normalizedName 
 * @param logo 
 * @param country 
 * @param accreditations 
 */

data class Accreditation (
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("name")
    val name: kotlin.String? = null,
    @SerializedName("normalizedName")
    val normalizedName: kotlin.String? = null,
    @SerializedName("logo")
    val logo: kotlin.String? = null,
    @SerializedName("country")
    val country: kotlin.String? = null,
    @SerializedName("accreditations")
    val accreditations: kotlin.collections.List<HospitalAccreditation>? = null
)

