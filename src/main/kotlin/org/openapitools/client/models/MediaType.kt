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
* Values: photo,video,youtube,document
*/

enum class MediaType(val value: kotlin.String){


    @SerializedName(value = "Photo")
    photo("Photo"),


    @SerializedName(value = "Video")
    video("Video"),


    @SerializedName(value = "Youtube")
    youtube("Youtube"),


    @SerializedName(value = "Document")
    document("Document");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}

