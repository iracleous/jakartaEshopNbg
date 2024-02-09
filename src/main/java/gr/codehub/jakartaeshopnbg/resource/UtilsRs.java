package gr.codehub.jakartaeshopnbg.resource;

import gr.codehub.jakartaeshopnbg.dto.ProductCategoryDto;
import gr.codehub.jakartaeshopnbg.model.Product;
import gr.codehub.jakartaeshopnbg.model.ProductCategory;
import jakarta.ws.rs.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Path("/util")
public class UtilsRs {

    @GET
    @Path("/categories")
    @Consumes("Application/json")
    @Produces("Application/json")
    public List<ProductCategoryDto> getProductCategories(){

         return   Arrays
                 .stream(ProductCategory.values())
                 .map(category-> new ProductCategoryDto(category.name(), category.name()))
                 .collect(Collectors.toList());
    }
}
