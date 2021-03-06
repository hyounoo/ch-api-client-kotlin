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
 * @param certificate 
 * @param normalizedCertificate 
 * @param activeFrom 
 * @param activeTo 
 */

data class DoctorCertificate (
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("doctorId")
    val doctorId: java.util.UUID? = null,
    @SerializedName("doctor")
    val doctor: Doctor? = null,
    @SerializedName("certificate")
    val certificate: kotlin.String? = null,
    @SerializedName("normalizedCertificate")
    val normalizedCertificate: kotlin.String? = null,
    @SerializedName("activeFrom")
    val activeFrom: java.time.LocalDateTime? = null,
    @SerializedName("activeTo")
    val activeTo: java.time.LocalDateTime? = null
)

