package gr.codehub.jakartaeshopnbg.resource;

import gr.codehub.jakartaeshopnbg.model.Product;
import gr.codehub.jakartaeshopnbg.service.ProductService;
import gr.codehub.jakartaeshopnbg.service.ProductServiceImpl;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Path("/product")
public class ProductResource {
    @Inject
    private ProductService productService ;

    //    GET localhost:8080/product/{productId}
    @GET
    @Path("/{productId}")
    @Consumes("Application/json")
    @Produces("Application/json")
    public Product getProduct(@PathParam(value="productId") int productId){
         return productService.readProduct(productId);
    }

    //    GET localhost:8080/product
    @GET
    @Path("")
    @Consumes("Application/json")
    @Produces("Application/json")
    public List<Product> getProduct(){

        return productService.readProduct();
    }

//    POST localhost:8080/product
    @POST
    @Consumes("Application/json")
    @Produces("Application/json")
    public Product createProduct(Product product){
        return productService.createProduct(product);
    }
//
//    PUT localhost:8080/product/{productId}
@PUT
@Path("/{productId}")
@Consumes("Application/json")
@Produces("Application/json")
public Product updateProduct(@PathParam(value="productId") int productId, Product product){
    return productService.updateProduct(productId, product);
}
//    DELETE localhost:8080/product/{productId}

    @DELETE
    @Path("/{productId}")
    @Consumes("Application/json")
    @Produces("Application/json")
    public boolean deleteProduct(@PathParam(value="productId") int productId){
        return productService.deleteProduct( productId);
    }

}
