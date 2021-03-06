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

import org.openapitools.client.models.AuditableEntity
import org.openapitools.client.models.MediaViewModel

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param id 
 * @param name 
 * @param slug 
 * @param description 
 * @param hospitalsCount 
 * @param doctorsCount 
 * @param specialitiesCount 
 * @param packagesCount 
 * @param articlesCount 
 * @param medias 
 * @param auditableEntity 
 */

data class CountryItemViewModel (
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("name")
    val name: kotlin.String? = null,
    @SerializedName("slug")
    val slug: kotlin.String? = null,
    @SerializedName("description")
    val description: kotlin.String? = null,
    @SerializedName("hospitalsCount")
    val hospitalsCount: kotlin.Int? = null,
    @SerializedName("doctorsCount")
    val doctorsCount: kotlin.Int? = null,
    @SerializedName("specialitiesCount")
    val specialitiesCount: kotlin.Int? = null,
    @SerializedName("packagesCount")
    val packagesCount: kotlin.Int? = null,
    @SerializedName("articlesCount")
    val articlesCount: kotlin.Int? = null,
    @SerializedName("medias")
    val medias: kotlin.collections.List<MediaViewModel>? = null,
    @SerializedName("auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

