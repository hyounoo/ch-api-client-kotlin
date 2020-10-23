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

import org.openapitools.client.models.Platform

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param id 
 * @param token 
 * @param platform 
 * @param appAlert 
 * @param eventAlert 
 * @param noticeAlert 
 */

data class DeviceViewModel (
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("token")
    val token: kotlin.String? = null,
    @SerializedName("platform")
    val platform: Platform? = null,
    @SerializedName("appAlert")
    val appAlert: kotlin.Boolean? = null,
    @SerializedName("eventAlert")
    val eventAlert: kotlin.Boolean? = null,
    @SerializedName("noticeAlert")
    val noticeAlert: kotlin.Boolean? = null
)
