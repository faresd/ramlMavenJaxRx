package com.mycompany.app;

import com.mycompany.app.model.Presentation;
import com.mycompany.app.model.Product;
import com.mycompany.app.resource.PresentationsResource;
import com.mycompany.app.resource.ProductsResource;

import javax.validation.constraints.NotNull;
import javax.ws.rs.HeaderParam;

/**
 * Created by work on 1/18/16.
 */
public class ProductResourceImpl implements ProductsResource {
    @Override
    public GetProductsResponse getProducts(String authorization, String region, Integer start, Integer pages) throws Exception {

        if (!"s3cr3t".equals(authorization))
        {
            return GetProductsResponse.withUnauthorized();
        }
        return null;
    }

    @Override
    public PostProductsResponse postProducts(String authorization, Product entity) throws Exception {
        return null;
    }

    @Override
    public GetProductsByProductIdResponse getProductsByProductId(@NotNull String productId, String authorization) throws Exception {
        return null;
    }

    @Override
    public PutProductsByProductIdResponse putProductsByProductId(@NotNull String productId, String authorization, Product entity) throws Exception {
        return null;
    }

    @Override
    public PatchProductsByProductIdResponse patchProductsByProductId(@NotNull String productId, String authorization, Product entity) throws Exception {
        return null;
    }

    @Override
    public DeleteProductsByProductIdResponse deleteProductsByProductId(@NotNull String productId, String authorization) throws Exception {
        return null;
    }

    @Override
    public GetProductsByProductIdPresentationsResponse getProductsByProductIdPresentations(@NotNull String productId, String authorization, String title, Integer start, Integer pages) throws Exception {
        return null;
    }

    @Override
    public PostProductsByProductIdPresentationsResponse postProductsByProductIdPresentations(@NotNull String productId, String authorization, Presentation entity) throws Exception {
        return null;
    }

    @Override
    public GetProductsByProductIdPresentationsByPresentationIdResponse getProductsByProductIdPresentationsByPresentationId(@NotNull String presentationId, @NotNull String productId, String authorization) throws Exception {
        return null;
    }

    @Override
    public PutProductsByProductIdPresentationsByPresentationIdResponse putProductsByProductIdPresentationsByPresentationId(@NotNull String presentationId, @NotNull String productId, String authorization, Presentation entity) throws Exception {
        return null;
    }

    @Override
    public PatchProductsByProductIdPresentationsByPresentationIdResponse patchProductsByProductIdPresentationsByPresentationId(@NotNull String presentationId, @NotNull String productId, String authorization, Presentation entity) throws Exception {
        return null;
    }

    @Override
    public DeleteProductsByProductIdPresentationsByPresentationIdResponse deleteProductsByProductIdPresentationsByPresentationId(@NotNull String presentationId, @NotNull String productId, String authorization) throws Exception {
        return null;
    }
}
