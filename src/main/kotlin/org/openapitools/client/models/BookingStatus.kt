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
* Values: new,rejected,approved,paid,canceled,refundRequested,refunded
*/

enum class BookingStatus(val value: kotlin.String){


    @SerializedName(value = "New")
    new("New"),


    @SerializedName(value = "Rejected")
    rejected("Rejected"),


    @SerializedName(value = "Approved")
    approved("Approved"),


    @SerializedName(value = "Paid")
    paid("Paid"),


    @SerializedName(value = "Canceled")
    canceled("Canceled"),


    @SerializedName(value = "RefundRequested")
    refundRequested("RefundRequested"),


    @SerializedName(value = "Refunded")
    refunded("Refunded");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}

