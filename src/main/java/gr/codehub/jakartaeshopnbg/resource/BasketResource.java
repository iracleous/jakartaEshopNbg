package gr.codehub.jakartaeshopnbg.resource;


import gr.codehub.jakartaeshopnbg.dto.BasketDto;
import gr.codehub.jakartaeshopnbg.dto.BasketProductDto;
import gr.codehub.jakartaeshopnbg.model.Basket;
import gr.codehub.jakartaeshopnbg.service.BasketService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;

import java.util.List;

@Path("/basket")
public class BasketResource {
    @Inject
    private BasketService basketService ;

    //    GET localhost:8080/basket/{basketId}
    @GET
    @Path("/{basketId}")
    @Consumes("Application/json")
    @Produces("Application/json")
    public Basket getBasket(@PathParam(value="basketId") int basketId){
        return basketService.readBasket(basketId);
    }

    //    GET localhost:8080/basket
    @GET
    @Path("")
    @Consumes("Application/json")
    @Produces("Application/json")
    public List<Basket> getBasket(){
        return basketService.readBasket();
    }

    //    POST localhost:8080/basket
    @POST
    @Consumes("Application/json")
    @Produces("Application/json")
    public Basket createBasket(BasketDto basket){
        return basketService.createBasket(basket);
    }
    //
//    PUT localhost:8080/basket/{basketId}
    @PUT
    @Path("/{basketId}")
    @Consumes("Application/json")
    @Produces("Application/json")
    public Basket updateBasket(@PathParam(value="basketId") int basketId, BasketDto basket){
        return basketService.updateBasket(basketId, basket);
    }
//    DELETE localhost:8080/basket/{basketId}

    @DELETE
    @Path("/{basketId}")
    @Consumes("Application/json")
    @Produces("Application/json")
    public boolean deleteBasket(@PathParam(value="basketId") int basketId){
        return basketService.deleteBasket( basketId);
    }



    @POST
    @Path("/addProduct")
    @Consumes("Application/json")
    @Produces("Application/json")
    public Basket addProductToBasket(BasketProductDto basketProductDto){
        return basketService.addProductToBasket(basketProductDto);
    }

}
