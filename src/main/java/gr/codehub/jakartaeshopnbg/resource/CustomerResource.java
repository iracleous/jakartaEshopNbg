package gr.codehub.jakartaeshopnbg.resource;

import gr.codehub.jakartaeshopnbg.model.Customer;
import gr.codehub.jakartaeshopnbg.service.CustomerService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;

import java.util.List;

@Path("/customer")
public class CustomerResource {
    @Inject
    private CustomerService customerService ;

    //    GET localhost:8080/customer/{customerId}
    @GET
    @Path("/{customerId}")
    @Consumes("Application/json")
    @Produces("Application/json")
    public Customer getCustomer(@PathParam(value="customerId") int customerId){
        return customerService.readCustomer(customerId);
    }

    //    GET localhost:8080/customer
    @GET
    @Path("")
    @Consumes("Application/json")
    @Produces("Application/json")
    public List<Customer> getCustomer(){
        return customerService.readCustomer();
    }

    //    POST localhost:8080/customer
    @POST
    @Consumes("Application/json")
    @Produces("Application/json")
    public Customer createCustomer(Customer customer){
        return customerService.createCustomer(customer);
    }
    //
//    PUT localhost:8080/customer/{customerId}
    @PUT
    @Path("/{customerId}")
    @Consumes("Application/json")
    @Produces("Application/json")
    public Customer updateCustomer(@PathParam(value="customerId") int customerId, Customer customer){
        return customerService.updateCustomer(customerId, customer);
    }
//    DELETE localhost:8080/customer/{customerId}

    @DELETE
    @Path("/{customerId}")
    @Consumes("Application/json")
    @Produces("Application/json")
    public boolean deleteCustomer(@PathParam(value="customerId") int customerId){
        return customerService.deleteCustomer( customerId);
    }

}
