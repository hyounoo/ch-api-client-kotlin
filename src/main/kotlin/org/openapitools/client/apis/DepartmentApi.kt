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

import org.openapitools.client.models.CreateDepartmentCommand
import org.openapitools.client.models.Department
import org.openapitools.client.models.DepartmentViewModel
import org.openapitools.client.models.DepartmentsViewModel
import org.openapitools.client.models.UpdateDepartmentCommand

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

class DepartmentApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("org.openapitools.client.baseUrl", "http://localhost")
        }
    }

    /**
    * Get all department.
    * Sample request:        GET /api/v1/hospitals/departments
    * @param id  (optional)
    * @param hospitalId  (optional)
    * @param hospitalName  (optional)
    * @param name  (optional)
    * @param additionalInfo  (optional)
    * @param page  (optional)
    * @param limit  (optional)
    * @param lastRetrieved  (optional)
    * @param current  (optional)
    * @return DepartmentsViewModel
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1HospitalsDepartmentsGet(id: java.util.UUID?, hospitalId: java.util.UUID?, hospitalName: kotlin.String?, name: kotlin.String?, additionalInfo: kotlin.String?, page: kotlin.Int?, limit: kotlin.Int?, lastRetrieved: java.time.LocalDateTime?, current: kotlin.Boolean?) : DepartmentsViewModel {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (id != null) {
                    put("Id", listOf(id.toString()))
                }
                if (hospitalId != null) {
                    put("HospitalId", listOf(hospitalId.toString()))
                }
                if (hospitalName != null) {
                    put("HospitalName", listOf(hospitalName.toString()))
                }
                if (name != null) {
                    put("Name", listOf(name.toString()))
                }
                if (additionalInfo != null) {
                    put("AdditionalInfo", listOf(additionalInfo.toString()))
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
            "/api/v1/hospitals/departments",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<DepartmentsViewModel>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as DepartmentsViewModel
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
    * Delete department.
    * Sample request:        DELETE /api/v1/hospitals/1/departments/1
    * @param hospitalId  
    * @param departmentId  
    * @return kotlin.Boolean
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1HospitalsHospitalIdDepartmentsDepartmentIdDelete(hospitalId: java.util.UUID, departmentId: java.util.UUID) : kotlin.Boolean {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/api/v1/hospitals/{hospitalId}/departments/{departmentId}".replace("{"+"hospitalId"+"}", "$hospitalId").replace("{"+"departmentId"+"}", "$departmentId"),
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
    * Get department.
    * Sample request:        GET /api/v1/hospitals/1/departments/1
    * @param hospitalId  
    * @param departmentId  
    * @return DepartmentViewModel
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1HospitalsHospitalIdDepartmentsDepartmentIdGet(hospitalId: java.util.UUID, departmentId: java.util.UUID) : DepartmentViewModel {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/v1/hospitals/{hospitalId}/departments/{departmentId}".replace("{"+"hospitalId"+"}", "$hospitalId").replace("{"+"departmentId"+"}", "$departmentId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<DepartmentViewModel>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as DepartmentViewModel
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
    * Create department.
    * Sample request:        POST /api/v1/hospitals/1/departments/1
    * @param hospitalId  
    * @param departmentId  
    * @param createDepartmentCommand  (optional)
    * @return Department
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1HospitalsHospitalIdDepartmentsDepartmentIdPost(hospitalId: java.util.UUID, departmentId: kotlin.String, createDepartmentCommand: CreateDepartmentCommand?) : Department {
        val localVariableBody: kotlin.Any? = createDepartmentCommand
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/api/v1/hospitals/{hospitalId}/departments/{departmentId}".replace("{"+"hospitalId"+"}", "$hospitalId").replace("{"+"departmentId"+"}", "$departmentId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Department>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Department
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
    * Update department.
    * Sample request:
    * @param hospitalId  
    * @param departmentId  
    * @param updateDepartmentCommand  (optional)
    * @return kotlin.Boolean
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1HospitalsHospitalIdDepartmentsDepartmentIdPut(hospitalId: java.util.UUID, departmentId: java.util.UUID, updateDepartmentCommand: UpdateDepartmentCommand?) : kotlin.Boolean {
        val localVariableBody: kotlin.Any? = updateDepartmentCommand
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/api/v1/hospitals/{hospitalId}/departments/{departmentId}".replace("{"+"hospitalId"+"}", "$hospitalId").replace("{"+"departmentId"+"}", "$departmentId"),
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

}
