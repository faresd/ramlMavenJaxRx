
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
import com.mycompany.app.model.Product;
import com.mycompany.app.model.Products;
import com.mycompany.app.resource.support.PATCH;

@Path("products")
public interface ProductsResource {


    /**
     * 
     * @param region
     *     Filter by region
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
    ProductsResource.GetProductsResponse getProducts(
        @HeaderParam("Authorization")
        String authorization,
        @QueryParam("region")
        String region,
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
    ProductsResource.PostProductsResponse postProducts(
        @HeaderParam("Authorization")
        String authorization, Product entity)
        throws Exception
    ;

    /**
     * 
     * @param authorization
     *     The auth token for this request
     * @param productId
     *     
     */
    @GET
    @Path("{productId}")
    @Produces({
        "application/json"
    })
    ProductsResource.GetProductsByProductIdResponse getProductsByProductId(
        @PathParam("productId")
        @NotNull
        String productId,
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
     * @param productId
     *     
     */
    @PUT
    @Path("{productId}")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    ProductsResource.PutProductsByProductIdResponse putProductsByProductId(
        @PathParam("productId")
        @NotNull
        String productId,
        @HeaderParam("Authorization")
        String authorization, Product entity)
        throws Exception
    ;

    /**
     * 
     * @param entity
     *     
     * @param authorization
     *     The auth token for this request
     * @param productId
     *     
     */
    @PATCH
    @Path("{productId}")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    ProductsResource.PatchProductsByProductIdResponse patchProductsByProductId(
        @PathParam("productId")
        @NotNull
        String productId,
        @HeaderParam("Authorization")
        String authorization, Product entity)
        throws Exception
    ;

    /**
     * 
     * @param authorization
     *     The auth token for this request
     * @param productId
     *     
     */
    @DELETE
    @Path("{productId}")
    ProductsResource.DeleteProductsByProductIdResponse deleteProductsByProductId(
        @PathParam("productId")
        @NotNull
        String productId,
        @HeaderParam("Authorization")
        String authorization)
        throws Exception
    ;

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
     * @param productId
     *     
     */
    @GET
    @Path("{productId}/presentations")
    @Produces({
        "application/json"
    })
    ProductsResource.GetProductsByProductIdPresentationsResponse getProductsByProductIdPresentations(
        @PathParam("productId")
        @NotNull
        String productId,
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
     * @param productId
     *     
     */
    @POST
    @Path("{productId}/presentations")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    ProductsResource.PostProductsByProductIdPresentationsResponse postProductsByProductIdPresentations(
        @PathParam("productId")
        @NotNull
        String productId,
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
     * @param productId
     *     
     */
    @GET
    @Path("{productId}/presentations/{presentationId}")
    @Produces({
        "application/json"
    })
    ProductsResource.GetProductsByProductIdPresentationsByPresentationIdResponse getProductsByProductIdPresentationsByPresentationId(
        @PathParam("presentationId")
        @NotNull
        String presentationId,
        @PathParam("productId")
        @NotNull
        String productId,
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
     * @param productId
     *     
     */
    @PUT
    @Path("{productId}/presentations/{presentationId}")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    ProductsResource.PutProductsByProductIdPresentationsByPresentationIdResponse putProductsByProductIdPresentationsByPresentationId(
        @PathParam("presentationId")
        @NotNull
        String presentationId,
        @PathParam("productId")
        @NotNull
        String productId,
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
     * @param productId
     *     
     */
    @PATCH
    @Path("{productId}/presentations/{presentationId}")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    ProductsResource.PatchProductsByProductIdPresentationsByPresentationIdResponse patchProductsByProductIdPresentationsByPresentationId(
        @PathParam("presentationId")
        @NotNull
        String presentationId,
        @PathParam("productId")
        @NotNull
        String productId,
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
     * @param productId
     *     
     */
    @DELETE
    @Path("{productId}/presentations/{presentationId}")
    ProductsResource.DeleteProductsByProductIdPresentationsByPresentationIdResponse deleteProductsByProductIdPresentationsByPresentationId(
        @PathParam("presentationId")
        @NotNull
        String presentationId,
        @PathParam("productId")
        @NotNull
        String productId,
        @HeaderParam("Authorization")
        String authorization)
        throws Exception
    ;

    public class DeleteProductsByProductIdPresentationsByPresentationIdResponse
        extends com.mycompany.app.resource.support.ResponseWrapper
    {


        private DeleteProductsByProductIdPresentationsByPresentationIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * OK
         * 
         */
        public static ProductsResource.DeleteProductsByProductIdPresentationsByPresentationIdResponse withOK() {
            Response.ResponseBuilder responseBuilder = Response.status(200);
            return new ProductsResource.DeleteProductsByProductIdPresentationsByPresentationIdResponse(responseBuilder.build());
        }

        /**
         * Unauthorized
         * 
         */
        public static ProductsResource.DeleteProductsByProductIdPresentationsByPresentationIdResponse withUnauthorized() {
            Response.ResponseBuilder responseBuilder = Response.status(401);
            return new ProductsResource.DeleteProductsByProductIdPresentationsByPresentationIdResponse(responseBuilder.build());
        }

    }

    public class DeleteProductsByProductIdResponse
        extends com.mycompany.app.resource.support.ResponseWrapper
    {


        private DeleteProductsByProductIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * OK
         * 
         */
        public static ProductsResource.DeleteProductsByProductIdResponse withOK() {
            Response.ResponseBuilder responseBuilder = Response.status(200);
            return new ProductsResource.DeleteProductsByProductIdResponse(responseBuilder.build());
        }

        /**
         * Unauthorized
         * 
         */
        public static ProductsResource.DeleteProductsByProductIdResponse withUnauthorized() {
            Response.ResponseBuilder responseBuilder = Response.status(401);
            return new ProductsResource.DeleteProductsByProductIdResponse(responseBuilder.build());
        }

    }

    public class GetProductsByProductIdPresentationsByPresentationIdResponse
        extends com.mycompany.app.resource.support.ResponseWrapper
    {


        private GetProductsByProductIdPresentationsByPresentationIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * OK
         * 
         * @param entity
         *     
         */
        public static ProductsResource.GetProductsByProductIdPresentationsByPresentationIdResponse withJsonOK(Presentation entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ProductsResource.GetProductsByProductIdPresentationsByPresentationIdResponse(responseBuilder.build());
        }

        /**
         * Unauthorized
         * 
         */
        public static ProductsResource.GetProductsByProductIdPresentationsByPresentationIdResponse withUnauthorized() {
            Response.ResponseBuilder responseBuilder = Response.status(401);
            return new ProductsResource.GetProductsByProductIdPresentationsByPresentationIdResponse(responseBuilder.build());
        }

    }

    public class GetProductsByProductIdPresentationsResponse
        extends com.mycompany.app.resource.support.ResponseWrapper
    {


        private GetProductsByProductIdPresentationsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Unauthorized
         * 
         */
        public static ProductsResource.GetProductsByProductIdPresentationsResponse withUnauthorized() {
            Response.ResponseBuilder responseBuilder = Response.status(401);
            return new ProductsResource.GetProductsByProductIdPresentationsResponse(responseBuilder.build());
        }

        /**
         * OK
         * 
         * @param entity
         *     
         */
        public static ProductsResource.GetProductsByProductIdPresentationsResponse withJsonOK(Presentations entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ProductsResource.GetProductsByProductIdPresentationsResponse(responseBuilder.build());
        }

    }

    public class GetProductsByProductIdResponse
        extends com.mycompany.app.resource.support.ResponseWrapper
    {


        private GetProductsByProductIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * OK
         * 
         * @param entity
         *     
         */
        public static ProductsResource.GetProductsByProductIdResponse withJsonOK(Product entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ProductsResource.GetProductsByProductIdResponse(responseBuilder.build());
        }

        /**
         * Unauthorized
         * 
         */
        public static ProductsResource.GetProductsByProductIdResponse withUnauthorized() {
            Response.ResponseBuilder responseBuilder = Response.status(401);
            return new ProductsResource.GetProductsByProductIdResponse(responseBuilder.build());
        }

    }

    public class GetProductsResponse
        extends com.mycompany.app.resource.support.ResponseWrapper
    {


        private GetProductsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Unauthorized
         * 
         */
        public static ProductsResource.GetProductsResponse withUnauthorized() {
            Response.ResponseBuilder responseBuilder = Response.status(401);
            return new ProductsResource.GetProductsResponse(responseBuilder.build());
        }

        /**
         * OK
         * 
         * @param entity
         *     
         */
        public static ProductsResource.GetProductsResponse withJsonOK(Products entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ProductsResource.GetProductsResponse(responseBuilder.build());
        }

    }

    public class PatchProductsByProductIdPresentationsByPresentationIdResponse
        extends com.mycompany.app.resource.support.ResponseWrapper
    {


        private PatchProductsByProductIdPresentationsByPresentationIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * OK
         * 
         * @param entity
         *     
         */
        public static ProductsResource.PatchProductsByProductIdPresentationsByPresentationIdResponse withJsonOK(Presentation entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ProductsResource.PatchProductsByProductIdPresentationsByPresentationIdResponse(responseBuilder.build());
        }

        /**
         * Unauthorized
         * 
         */
        public static ProductsResource.PatchProductsByProductIdPresentationsByPresentationIdResponse withUnauthorized() {
            Response.ResponseBuilder responseBuilder = Response.status(401);
            return new ProductsResource.PatchProductsByProductIdPresentationsByPresentationIdResponse(responseBuilder.build());
        }

    }

    public class PatchProductsByProductIdResponse
        extends com.mycompany.app.resource.support.ResponseWrapper
    {


        private PatchProductsByProductIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * OK
         * 
         * @param entity
         *     
         */
        public static ProductsResource.PatchProductsByProductIdResponse withJsonOK(Product entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ProductsResource.PatchProductsByProductIdResponse(responseBuilder.build());
        }

        /**
         * Unauthorized
         * 
         */
        public static ProductsResource.PatchProductsByProductIdResponse withUnauthorized() {
            Response.ResponseBuilder responseBuilder = Response.status(401);
            return new ProductsResource.PatchProductsByProductIdResponse(responseBuilder.build());
        }

    }

    public class PostProductsByProductIdPresentationsResponse
        extends com.mycompany.app.resource.support.ResponseWrapper
    {


        private PostProductsByProductIdPresentationsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Created
         * 
         * @param entity
         *     
         */
        public static ProductsResource.PostProductsByProductIdPresentationsResponse withJsonCreated(Presentation entity) {
            Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ProductsResource.PostProductsByProductIdPresentationsResponse(responseBuilder.build());
        }

        /**
         * Unauthorized
         * 
         */
        public static ProductsResource.PostProductsByProductIdPresentationsResponse withUnauthorized() {
            Response.ResponseBuilder responseBuilder = Response.status(401);
            return new ProductsResource.PostProductsByProductIdPresentationsResponse(responseBuilder.build());
        }

    }

    public class PostProductsResponse
        extends com.mycompany.app.resource.support.ResponseWrapper
    {


        private PostProductsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Created
         * 
         * @param entity
         *     
         */
        public static ProductsResource.PostProductsResponse withJsonCreated(Product entity) {
            Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ProductsResource.PostProductsResponse(responseBuilder.build());
        }

        /**
         * Unauthorized
         * 
         */
        public static ProductsResource.PostProductsResponse withUnauthorized() {
            Response.ResponseBuilder responseBuilder = Response.status(401);
            return new ProductsResource.PostProductsResponse(responseBuilder.build());
        }

    }

    public class PutProductsByProductIdPresentationsByPresentationIdResponse
        extends com.mycompany.app.resource.support.ResponseWrapper
    {


        private PutProductsByProductIdPresentationsByPresentationIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * OK
         * 
         * @param entity
         *     
         */
        public static ProductsResource.PutProductsByProductIdPresentationsByPresentationIdResponse withJsonOK(Presentation entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ProductsResource.PutProductsByProductIdPresentationsByPresentationIdResponse(responseBuilder.build());
        }

        /**
         * Unauthorized
         * 
         */
        public static ProductsResource.PutProductsByProductIdPresentationsByPresentationIdResponse withUnauthorized() {
            Response.ResponseBuilder responseBuilder = Response.status(401);
            return new ProductsResource.PutProductsByProductIdPresentationsByPresentationIdResponse(responseBuilder.build());
        }

    }

    public class PutProductsByProductIdResponse
        extends com.mycompany.app.resource.support.ResponseWrapper
    {


        private PutProductsByProductIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * OK
         * 
         * @param entity
         *     
         */
        public static ProductsResource.PutProductsByProductIdResponse withJsonOK(Product entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ProductsResource.PutProductsByProductIdResponse(responseBuilder.build());
        }

        /**
         * Unauthorized
         * 
         */
        public static ProductsResource.PutProductsByProductIdResponse withUnauthorized() {
            Response.ResponseBuilder responseBuilder = Response.status(401);
            return new ProductsResource.PutProductsByProductIdResponse(responseBuilder.build());
        }

    }

}
