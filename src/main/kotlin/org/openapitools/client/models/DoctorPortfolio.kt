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

import org.openapitools.client.models.Doctor

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param id 
 * @param doctorId 
 * @param doctor 
 * @param name 
 * @param normalizedName 
 * @param description 
 * @param photoBefore 
 * @param photoBeforeThumbnail 
 * @param photoAfter 
 * @param photoAfterThumbnail 
 */

data class DoctorPortfolio (
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("doctorId")
    val doctorId: java.util.UUID? = null,
    @SerializedName("doctor")
    val doctor: Doctor? = null,
    @SerializedName("name")
    val name: kotlin.String? = null,
    @SerializedName("normalizedName")
    val normalizedName: kotlin.String? = null,
    @SerializedName("description")
    val description: kotlin.String? = null,
    @SerializedName("photoBefore")
    val photoBefore: kotlin.String? = null,
    @SerializedName("photoBeforeThumbnail")
    val photoBeforeThumbnail: kotlin.String? = null,
    @SerializedName("photoAfter")
    val photoAfter: kotlin.String? = null,
    @SerializedName("photoAfterThumbnail")
    val photoAfterThumbnail: kotlin.String? = null
)

