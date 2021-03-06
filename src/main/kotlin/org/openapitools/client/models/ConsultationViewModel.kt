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

import org.openapitools.client.models.ConsultationStatus
import org.openapitools.client.models.ConsultationType
import org.openapitools.client.models.Gender
import org.openapitools.client.models.RejectReason

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param id 
 * @param consultationType 
 * @param patientId 
 * @param patientName 
 * @param hospitalId 
 * @param hospitalName 
 * @param specialtyId 
 * @param specialtyName 
 * @param doctorId 
 * @param doctorName 
 * @param dealId 
 * @param dealName 
 * @param language 
 * @param isAccountHolder 
 * @param firstName 
 * @param lastName 
 * @param email 
 * @param phone 
 * @param dateOfBirth 
 * @param gender 
 * @param comment 
 * @param timeRange 
 * @param approximateDateStart 
 * @param approximateDateEnd 
 * @param confirmedDateStart 
 * @param confirmedDateEnd 
 * @param callerName 
 * @param callerId 
 * @param fee 
 * @param applicationFee 
 * @param timeZone 
 * @param status 
 * @param rejectReason 
 * @param isOpen 
 * @param paymentId 
 */

data class ConsultationViewModel (
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("consultationType")
    val consultationType: ConsultationType? = null,
    @SerializedName("patientId")
    val patientId: java.util.UUID? = null,
    @SerializedName("patientName")
    val patientName: kotlin.String? = null,
    @SerializedName("hospitalId")
    val hospitalId: java.util.UUID? = null,
    @SerializedName("hospitalName")
    val hospitalName: kotlin.String? = null,
    @SerializedName("specialtyId")
    val specialtyId: java.util.UUID? = null,
    @SerializedName("specialtyName")
    val specialtyName: kotlin.String? = null,
    @SerializedName("doctorId")
    val doctorId: java.util.UUID? = null,
    @SerializedName("doctorName")
    val doctorName: kotlin.String? = null,
    @SerializedName("dealId")
    val dealId: java.util.UUID? = null,
    @SerializedName("dealName")
    val dealName: kotlin.String? = null,
    @SerializedName("language")
    val language: kotlin.String? = null,
    @SerializedName("isAccountHolder")
    val isAccountHolder: kotlin.Boolean? = null,
    @SerializedName("firstName")
    val firstName: kotlin.String? = null,
    @SerializedName("lastName")
    val lastName: kotlin.String? = null,
    @SerializedName("email")
    val email: kotlin.String? = null,
    @SerializedName("phone")
    val phone: kotlin.String? = null,
    @SerializedName("dateOfBirth")
    val dateOfBirth: java.time.LocalDateTime? = null,
    @SerializedName("gender")
    val gender: Gender? = null,
    @SerializedName("comment")
    val comment: kotlin.String? = null,
    @SerializedName("timeRange")
    val timeRange: kotlin.String? = null,
    @SerializedName("approximateDateStart")
    val approximateDateStart: java.time.LocalDateTime? = null,
    @SerializedName("approximateDateEnd")
    val approximateDateEnd: java.time.LocalDateTime? = null,
    @SerializedName("confirmedDateStart")
    val confirmedDateStart: java.time.LocalDateTime? = null,
    @SerializedName("confirmedDateEnd")
    val confirmedDateEnd: java.time.LocalDateTime? = null,
    @SerializedName("callerName")
    val callerName: kotlin.String? = null,
    @SerializedName("callerId")
    val callerId: java.util.UUID? = null,
    @SerializedName("fee")
    val fee: kotlin.Double? = null,
    @SerializedName("applicationFee")
    val applicationFee: kotlin.Double? = null,
    @SerializedName("timeZone")
    val timeZone: kotlin.String? = null,
    @SerializedName("status")
    val status: ConsultationStatus? = null,
    @SerializedName("rejectReason")
    val rejectReason: RejectReason? = null,
    @SerializedName("isOpen")
    val isOpen: kotlin.Boolean? = null,
    @SerializedName("paymentId")
    val paymentId: java.util.UUID? = null
)

