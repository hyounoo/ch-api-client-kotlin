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

import org.openapitools.client.models.CreateQuestionCommentCommand
import org.openapitools.client.models.QuestionCommentViewModel
import org.openapitools.client.models.QuestionCommentsViewModel
import org.openapitools.client.models.UpdateQuestionCommentCommand

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

class QuestionCommentsApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("org.openapitools.client.baseUrl", "http://localhost")
        }
    }

    /**
    * Get all questionComment.
    * Sample request:        GET /api/v1/questionComment
    * @param questionId  
    * @param id  (optional)
    * @param userId  (optional)
    * @param questionId2  (optional)
    * @param page  (optional)
    * @param limit  (optional)
    * @param lastRetrieved  (optional)
    * @param current  (optional)
    * @return QuestionCommentsViewModel
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1QuestionsQuestionIdQuestioncommentsGet(questionId: java.util.UUID, id: java.util.UUID?, userId: java.util.UUID?, questionId2: java.util.UUID?, page: kotlin.Int?, limit: kotlin.Int?, lastRetrieved: java.time.LocalDateTime?, current: kotlin.Boolean?) : QuestionCommentsViewModel {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (id != null) {
                    put("Id", listOf(id.toString()))
                }
                if (userId != null) {
                    put("UserId", listOf(userId.toString()))
                }
                if (questionId2 != null) {
                    put("QuestionId", listOf(questionId2.toString()))
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
            "/api/v1/questions/{questionId}/questioncomments".replace("{"+"questionId"+"}", "$questionId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<QuestionCommentsViewModel>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as QuestionCommentsViewModel
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
    * Create an questionComment.
    * Sample request:        POST /api/v1/questions/1/questionComment      {          \&quot;description\&quot;: \&quot;This is a questionComment.\&quot;,          \&quot;body\&quot;: \&quot;questionComment body here\&quot;,          \&quot;status\&quot;: \&quot;Draft\&quot;,          \&quot;hospitalId\&quot;: 1,          \&quot;medias\&quot;: [            {              \&quot;mediaType\&quot;: \&quot;Photo\&quot;,              \&quot;url\&quot;: \&quot;string\&quot;,              \&quot;thumbnailUrl\&quot;: \&quot;string\&quot;,              \&quot;description\&quot;: \&quot;string\&quot;,              \&quot;order\&quot;: 0            }          ]      }
    * @param questionId  
    * @param createQuestionCommentCommand  (optional)
    * @return java.util.UUID
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1QuestionsQuestionIdQuestioncommentsPost(questionId: java.util.UUID, createQuestionCommentCommand: CreateQuestionCommentCommand?) : java.util.UUID {
        val localVariableBody: kotlin.Any? = createQuestionCommentCommand
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/api/v1/questions/{questionId}/questioncomments".replace("{"+"questionId"+"}", "$questionId"),
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
    * Delete questionComment.
    * Sample request:        DELETE /api/v1/questions/1/questionComments/1
    * @param questionId  
    * @param questionCommentId  
    * @return kotlin.Boolean
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdDelete(questionId: java.util.UUID, questionCommentId: java.util.UUID) : kotlin.Boolean {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/api/v1/questions/{questionId}/questioncomments/{questionCommentId}".replace("{"+"questionId"+"}", "$questionId").replace("{"+"questionCommentId"+"}", "$questionCommentId"),
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
    * Get questionComment.
    * Sample request:        GET /api/v1/questionComment/1
    * @param questionId  
    * @param questionCommentId  
    * @return QuestionCommentViewModel
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdGet(questionId: java.util.UUID, questionCommentId: java.util.UUID) : QuestionCommentViewModel {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/v1/questions/{questionId}/questioncomments/{questionCommentId}".replace("{"+"questionId"+"}", "$questionId").replace("{"+"questionCommentId"+"}", "$questionCommentId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<QuestionCommentViewModel>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as QuestionCommentViewModel
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
    * Update questionComment.
    * Sample request:        PUT /api/v1/questions/1/questionComments/1      {          \&quot;QuestionTitle\&quot;: \&quot;Question title\&quot;,          \&quot;body\&quot;: \&quot;updated questionComment body here\&quot;      }
    * @param questionId  
    * @param questionCommentId  
    * @param updateQuestionCommentCommand  (optional)
    * @return kotlin.Boolean
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1QuestionsQuestionIdQuestioncommentsQuestionCommentIdPut(questionId: java.util.UUID, questionCommentId: java.util.UUID, updateQuestionCommentCommand: UpdateQuestionCommentCommand?) : kotlin.Boolean {
        val localVariableBody: kotlin.Any? = updateQuestionCommentCommand
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/api/v1/questions/{questionId}/questioncomments/{questionCommentId}".replace("{"+"questionId"+"}", "$questionId").replace("{"+"questionCommentId"+"}", "$questionCommentId"),
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
