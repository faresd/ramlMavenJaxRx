
package com.mycompany.app.resource;

import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import com.mycompany.app.model.Presentation;
import com.mycompany.app.model.Presentations;
import com.mycompany.app.resource.support.PATCH;

@Path("presentations")
public interface PresentationsResource {


    /**
     * 
     * @param title
     *     Filter by title
     * @param start
     *     The first page to return
     * @param pages
     *     The number of pages to return
     * @param authorization
     *     The auth token for this request
     */
    @GET
    @Produces({
        "application/json"
    })
    PresentationsResource.GetPresentationsResponse getPresentations(
        @HeaderParam("Authorization")
        String authorization,
        @QueryParam("title")
        String title,
        @QueryParam("start")
        Integer start,
        @QueryParam("pages")
        Integer pages)
        throws Exception
    ;

    /**
     * 
     * @param entity
     *     
     * @param authorization
     *     The auth token for this request
     */
    @POST
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    PresentationsResource.PostPresentationsResponse postPresentations(
        @HeaderParam("Authorization")
        String authorization, Presentation entity)
        throws Exception
    ;

    /**
     * 
     * @param authorization
     *     The auth token for this request
     * @param presentationId
     *     
     */
    @GET
    @Path("{presentationId}")
    @Produces({
        "application/json"
    })
    PresentationsResource.GetPresentationsByPresentationIdResponse getPresentationsByPresentationId(
        @PathParam("presentationId")
        @NotNull
        String presentationId,
        @HeaderParam("Authorization")
        String authorization)
        throws Exception
    ;

    /**
     * 
     * @param entity
     *     
     * @param authorization
     *     The auth token for this request
     * @param presentationId
     *     
     */
    @PUT
    @Path("{presentationId}")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    PresentationsResource.PutPresentationsByPresentationIdResponse putPresentationsByPresentationId(
        @PathParam("presentationId")
        @NotNull
        String presentationId,
        @HeaderParam("Authorization")
        String authorization, Presentation entity)
        throws Exception
    ;

    /**
     * 
     * @param entity
     *     
     * @param authorization
     *     The auth token for this request
     * @param presentationId
     *     
     */
    @PATCH
    @Path("{presentationId}")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    PresentationsResource.PatchPresentationsByPresentationIdResponse patchPresentationsByPresentationId(
        @PathParam("presentationId")
        @NotNull
        String presentationId,
        @HeaderParam("Authorization")
        String authorization, Presentation entity)
        throws Exception
    ;

    /**
     * 
     * @param authorization
     *     The auth token for this request
     * @param presentationId
     *     
     */
    @DELETE
    @Path("{presentationId}")
    PresentationsResource.DeletePresentationsByPresentationIdResponse deletePresentationsByPresentationId(
        @PathParam("presentationId")
        @NotNull
        String presentationId,
        @HeaderParam("Authorization")
        String authorization)
        throws Exception
    ;

    public class DeletePresentationsByPresentationIdResponse
        extends com.mycompany.app.resource.support.ResponseWrapper
    {


        private DeletePresentationsByPresentationIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * OK
         * 
         */
        public static PresentationsResource.DeletePresentationsByPresentationIdResponse withOK() {
            Response.ResponseBuilder responseBuilder = Response.status(200);
            return new PresentationsResource.DeletePresentationsByPresentationIdResponse(responseBuilder.build());
        }

        /**
         * Unauthorized
         * 
         */
        public static PresentationsResource.DeletePresentationsByPresentationIdResponse withUnauthorized() {
            Response.ResponseBuilder responseBuilder = Response.status(401);
            return new PresentationsResource.DeletePresentationsByPresentationIdResponse(responseBuilder.build());
        }

    }

    public class GetPresentationsByPresentationIdResponse
        extends com.mycompany.app.resource.support.ResponseWrapper
    {


        private GetPresentationsByPresentationIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * OK
         * 
         * @param entity
         *     
         */
        public static PresentationsResource.GetPresentationsByPresentationIdResponse withJsonOK(Presentation entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PresentationsResource.GetPresentationsByPresentationIdResponse(responseBuilder.build());
        }

        /**
         * Unauthorized
         * 
         */
        public static PresentationsResource.GetPresentationsByPresentationIdResponse withUnauthorized() {
            Response.ResponseBuilder responseBuilder = Response.status(401);
            return new PresentationsResource.GetPresentationsByPresentationIdResponse(responseBuilder.build());
        }

    }

    public class GetPresentationsResponse
        extends com.mycompany.app.resource.support.ResponseWrapper
    {


        private GetPresentationsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Unauthorized
         * 
         */
        public static PresentationsResource.GetPresentationsResponse withUnauthorized() {
            Response.ResponseBuilder responseBuilder = Response.status(401);
            return new PresentationsResource.GetPresentationsResponse(responseBuilder.build());
        }

        /**
         * OK
         * 
         * @param entity
         *     
         */
        public static PresentationsResource.GetPresentationsResponse withJsonOK(Presentations entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PresentationsResource.GetPresentationsResponse(responseBuilder.build());
        }

    }

    public class PatchPresentationsByPresentationIdResponse
        extends com.mycompany.app.resource.support.ResponseWrapper
    {


        private PatchPresentationsByPresentationIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * OK
         * 
         * @param entity
         *     
         */
        public static PresentationsResource.PatchPresentationsByPresentationIdResponse withJsonOK(Presentation entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PresentationsResource.PatchPresentationsByPresentationIdResponse(responseBuilder.build());
        }

        /**
         * Unauthorized
         * 
         */
        public static PresentationsResource.PatchPresentationsByPresentationIdResponse withUnauthorized() {
            Response.ResponseBuilder responseBuilder = Response.status(401);
            return new PresentationsResource.PatchPresentationsByPresentationIdResponse(responseBuilder.build());
        }

    }

    public class PostPresentationsResponse
        extends com.mycompany.app.resource.support.ResponseWrapper
    {


        private PostPresentationsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Created
         * 
         * @param entity
         *     
         */
        public static PresentationsResource.PostPresentationsResponse withJsonCreated(Presentation entity) {
            Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PresentationsResource.PostPresentationsResponse(responseBuilder.build());
        }

        /**
         * Unauthorized
         * 
         */
        public static PresentationsResource.PostPresentationsResponse withUnauthorized() {
            Response.ResponseBuilder responseBuilder = Response.status(401);
            return new PresentationsResource.PostPresentationsResponse(responseBuilder.build());
        }

    }

    public class PutPresentationsByPresentationIdResponse
        extends com.mycompany.app.resource.support.ResponseWrapper
    {


        private PutPresentationsByPresentationIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * OK
         * 
         * @param entity
         *     
         */
        public static PresentationsResource.PutPresentationsByPresentationIdResponse withJsonOK(Presentation entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PresentationsResource.PutPresentationsByPresentationIdResponse(responseBuilder.build());
        }

        /**
         * Unauthorized
         * 
         */
        public static PresentationsResource.PutPresentationsByPresentationIdResponse withUnauthorized() {
            Response.ResponseBuilder responseBuilder = Response.status(401);
            return new PresentationsResource.PutPresentationsByPresentationIdResponse(responseBuilder.build());
        }

    }

}
