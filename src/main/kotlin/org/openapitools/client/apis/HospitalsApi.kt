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
package org.openapitools.client.apis

import org.openapitools.client.models.CreateHospitalCommand
import org.openapitools.client.models.HospitalViewModel
import org.openapitools.client.models.HospitalsViewModel
import org.openapitools.client.models.MarketingType
import org.openapitools.client.models.UpdateHospitalCommand

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class HospitalsApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("org.openapitools.client.baseUrl", "http://localhost")
        }
    }

    /**
    * 
    * 
    * @param id  (optional)
    * @param name  (optional)
    * @param description  (optional)
    * @param countryId  (optional)
    * @param created  (optional)
    * @param marketingType  (optional)
    * @param specialtyTypeId  (optional)
    * @param specialtyId  (optional)
    * @param serviceId  (optional)
    * @param exceptHospitalId  (optional)
    * @param showHidden  (optional)
    * @param page  (optional)
    * @param limit  (optional)
    * @param lastRetrieved  (optional)
    * @param current  (optional)
    * @return HospitalsViewModel
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1HospitalsCurrentGet(id: java.util.UUID?, name: kotlin.String?, description: kotlin.String?, countryId: java.util.UUID?, created: java.time.LocalDateTime?, marketingType: MarketingType?, specialtyTypeId: java.util.UUID?, specialtyId: java.util.UUID?, serviceId: java.util.UUID?, exceptHospitalId: java.util.UUID?, showHidden: kotlin.Boolean?, page: kotlin.Int?, limit: kotlin.Int?, lastRetrieved: java.time.LocalDateTime?, current: kotlin.Boolean?) : HospitalsViewModel {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (id != null) {
                    put("Id", listOf(id.toString()))
                }
                if (name != null) {
                    put("Name", listOf(name.toString()))
                }
                if (description != null) {
                    put("Description", listOf(description.toString()))
                }
                if (countryId != null) {
                    put("CountryId", listOf(countryId.toString()))
                }
                if (created != null) {
                    put("Created", listOf(parseDateToQueryString(created)))
                }
                if (marketingType != null) {
                    put("MarketingType", listOf(marketingType.toString()))
                }
                if (specialtyTypeId != null) {
                    put("SpecialtyTypeId", listOf(specialtyTypeId.toString()))
                }
                if (specialtyId != null) {
                    put("SpecialtyId", listOf(specialtyId.toString()))
                }
                if (serviceId != null) {
                    put("ServiceId", listOf(serviceId.toString()))
                }
                if (exceptHospitalId != null) {
                    put("ExceptHospitalId", listOf(exceptHospitalId.toString()))
                }
                if (showHidden != null) {
                    put("ShowHidden", listOf(showHidden.toString()))
                }
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (limit != null) {
                    put("limit", listOf(limit.toString()))
                }
                if (lastRetrieved != null) {
                    put("lastRetrieved", listOf(parseDateToQueryString(lastRetrieved)))
                }
                if (current != null) {
                    put("Current", listOf(current.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/v1/hospitals/current",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<HospitalsViewModel>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as HospitalsViewModel
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Get all hospitals.
    * Sample request:        GET /api/v1/hospitals      {          \&quot;pageQueryFilter\&quot;: {              \&quot;page\&quot;: 1,              \&quot;limit\&quot;: 20,              \&quot;lastRetrived\&quot;: \&quot;2020-02-05T08:40\&quot;          },          \&quot;searchString\&quot;: \&quot;Samsung\&quot;      }
    * @param id  (optional)
    * @param name  (optional)
    * @param description  (optional)
    * @param countryId  (optional)
    * @param created  (optional)
    * @param marketingType  (optional)
    * @param specialtyTypeId  (optional)
    * @param specialtyId  (optional)
    * @param serviceId  (optional)
    * @param exceptHospitalId  (optional)
    * @param showHidden  (optional)
    * @param page  (optional)
    * @param limit  (optional)
    * @param lastRetrieved  (optional)
    * @param current  (optional)
    * @return HospitalsViewModel
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1HospitalsGet(id: java.util.UUID?, name: kotlin.String?, description: kotlin.String?, countryId: java.util.UUID?, created: java.time.LocalDateTime?, marketingType: MarketingType?, specialtyTypeId: java.util.UUID?, specialtyId: java.util.UUID?, serviceId: java.util.UUID?, exceptHospitalId: java.util.UUID?, showHidden: kotlin.Boolean?, page: kotlin.Int?, limit: kotlin.Int?, lastRetrieved: java.time.LocalDateTime?, current: kotlin.Boolean?) : HospitalsViewModel {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (id != null) {
                    put("Id", listOf(id.toString()))
                }
                if (name != null) {
                    put("Name", listOf(name.toString()))
                }
                if (description != null) {
                    put("Description", listOf(description.toString()))
                }
                if (countryId != null) {
                    put("CountryId", listOf(countryId.toString()))
                }
                if (created != null) {
                    put("Created", listOf(parseDateToQueryString(created)))
                }
                if (marketingType != null) {
                    put("MarketingType", listOf(marketingType.toString()))
                }
                if (specialtyTypeId != null) {
                    put("SpecialtyTypeId", listOf(specialtyTypeId.toString()))
                }
                if (specialtyId != null) {
                    put("SpecialtyId", listOf(specialtyId.toString()))
                }
                if (serviceId != null) {
                    put("ServiceId", listOf(serviceId.toString()))
                }
                if (exceptHospitalId != null) {
                    put("ExceptHospitalId", listOf(exceptHospitalId.toString()))
                }
                if (showHidden != null) {
                    put("ShowHidden", listOf(showHidden.toString()))
                }
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (limit != null) {
                    put("limit", listOf(limit.toString()))
                }
                if (lastRetrieved != null) {
                    put("lastRetrieved", listOf(parseDateToQueryString(lastRetrieved)))
                }
                if (current != null) {
                    put("Current", listOf(current.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/v1/hospitals",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<HospitalsViewModel>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as HospitalsViewModel
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Delete hospital.
    * Sample request:        DELETE /api/v1/hospitals/1
    * @param hospitalId  
    * @return kotlin.Boolean
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1HospitalsHospitalIdDelete(hospitalId: java.util.UUID) : kotlin.Boolean {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/api/v1/hospitals/{hospitalId}".replace("{"+"hospitalId"+"}", "$hospitalId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Boolean>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Boolean
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Get hospita.
    * Sample request:        GET /api/v1/hospitals/1
    * @param hospitalId  
    * @return HospitalViewModel
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1HospitalsHospitalIdGet(hospitalId: java.util.UUID) : HospitalViewModel {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/v1/hospitals/{hospitalId}".replace("{"+"hospitalId"+"}", "$hospitalId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<HospitalViewModel>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as HospitalViewModel
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Update hospital.
    * Sameple request:        PUT /api/v1/hospitals      {          \&quot;overview\&quot;: \&quot;Overview of Samsung Medical Center\&quot;,          \&quot;bedsCount\&quot;: 2436,          \&quot;operationsPerYear\&quot;: 44,          \&quot;foundationYear\&quot;: 2012,          \&quot;departmentsCount\&quot;: 200,          \&quot;medicalStaffCount\&quot;: 1200,      }
    * @param hospitalId  
    * @param updateHospitalCommand  (optional)
    * @return kotlin.Boolean
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1HospitalsHospitalIdPut(hospitalId: java.util.UUID, updateHospitalCommand: UpdateHospitalCommand?) : kotlin.Boolean {
        val localVariableBody: kotlin.Any? = updateHospitalCommand
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/api/v1/hospitals/{hospitalId}".replace("{"+"hospitalId"+"}", "$hospitalId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Boolean>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Boolean
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Create a hospital.
    * Sample request:        POST /api/v1/hospitals      {          \&quot;name\&quot;: \&quot;Samsung Medical Center\&quot;,          \&quot;description\&quot;: \&quot;Comprehensive Cancer Center in Seoul, South Korea is nationally ranked in 1 adult specialty.\&quot;,          \&quot;logo\&quot;: \&quot;http://www.samsunghospital.com/home/main/index.do\&quot;,          \&quot;overview\&quot;: \&quot;Overview of Samsung Medical Center\&quot;,          \&quot;bedsCount\&quot;: 1436,          \&quot;operationsPerYear\&quot;: 34,          \&quot;foundationYear\&quot;: 2012,          \&quot;departmentsCount\&quot;: 20,          \&quot;medicalStaffCount\&quot;: 600,          \&quot;countryId\&quot;: 1,          \&quot;awards\&quot;: [            {              \&quot;name\&quot;: \&quot;Award1\&quot;,              \&quot;image\&quot;: \&quot;string\&quot;,              \&quot;date\&quot;: \&quot;2020-02-05T09:29:19.240Z\&quot;            },            {              \&quot;name\&quot;: \&quot;Award2\&quot;,              \&quot;image\&quot;: \&quot;string\&quot;,              \&quot;date\&quot;: \&quot;2020-02-05T09:29:19.240Z\&quot;            }          ],          \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: \&quot;Photo\&quot;,              \&quot;url\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/imagecontainer/SamsungMedicalCenter.jpg\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;https://cloudhospitalblob.blob.core.windows.net/thumbnailcontainer/SamsungMedicalCenter.jpg\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            },            {              \&quot;mediaType\&quot;: \&quot;Video\&quot;,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 1            }          ],          \&quot;location\&quot;: {            \&quot;latitude\&quot;: 37.4881568,            \&quot;longitude\&quot;: 127.0855952,            \&quot;country\&quot;: \&quot;Korea\&quot;,            \&quot;state\&quot;: \&quot;string\&quot;,            \&quot;county\&quot;: \&quot;Gangnamgu\&quot;,            \&quot;city\&quot;: \&quot;Seoul\&quot;,            \&quot;zipCode\&quot;: \&quot;12345\&quot;,            \&quot;address\&quot;: \&quot;Il-won ro 81\&quot;          }      }
    * @param createHospitalCommand  (optional)
    * @return java.util.UUID
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1HospitalsPost(createHospitalCommand: CreateHospitalCommand?) : java.util.UUID {
        val localVariableBody: kotlin.Any? = createHospitalCommand
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/api/v1/hospitals",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<java.util.UUID>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as java.util.UUID
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Get hospital by slug.
    * 
    * @param slug  
    * @return HospitalViewModel
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1HospitalsSlugsSlugGet(slug: kotlin.String) : HospitalViewModel {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/v1/hospitals/slugs/{slug}".replace("{"+"slug"+"}", "$slug"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<HospitalViewModel>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as HospitalViewModel
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

}