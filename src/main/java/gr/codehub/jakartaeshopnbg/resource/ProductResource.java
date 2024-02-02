package gr.codehub.jakartaeshopnbg.resource;

import gr.codehub.jakartaeshopnbg.model.Product;
import gr.codehub.jakartaeshopnbg.service.ProductService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;

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
    public Product getProduct(@PathParam(value="productId") long productId){
         return productService.readT(productId);
    }

    //    GET localhost:8080/product
    @GET
    @Path("")
    @Consumes("Application/json")
    @Produces("Application/json")
    public List<Product> getProduct(){

        return productService.readT();
    }

//    POST localhost:8080/product
    @POST
    @Consumes("Application/json")
    @Produces("Application/json")
    public Product createProduct(Product product){
        return productService.createT(product);
    }
//
//    PUT localhost:8080/product/{productId}
@PUT
@Path("/{productId}")
@Consumes("Application/json")
@Produces("Application/json")
public Product updateProduct(@PathParam(value="productId") long productId, Product product){
    return productService.updateT(productId, product);
}
//    DELETE localhost:8080/product/{productId}

    @DELETE
    @Path("/{productId}")
    @Consumes("Application/json")
    @Produces("Application/json")
    public boolean deleteProduct(@PathParam(value="productId") long productId){
        return productService.deleteT( productId);
    }

}
