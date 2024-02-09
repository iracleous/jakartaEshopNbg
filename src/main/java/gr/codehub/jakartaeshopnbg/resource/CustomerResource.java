package gr.codehub.jakartaeshopnbg.resource;

import gr.codehub.jakartaeshopnbg.dto.SelectBoxDto;
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
    public Customer getCustomer(@PathParam(value="customerId") long customerId){
        return customerService.readT(customerId);
    }

    //    GET localhost:8080/customer
    @GET
    @Path("")
    @Consumes("Application/json")
    @Produces("Application/json")
    public List<Customer> getCustomer(){
        return customerService.readT();
    }

    //    POST localhost:8080/customer
    @POST
    @Consumes("Application/json")
    @Produces("Application/json")
    public Customer createCustomer(Customer customer){
        return customerService.createT(customer);
    }
    //
//    PUT localhost:8080/customer/{customerId}
    @PUT
    @Path("/{customerId}")
    @Consumes("Application/json")
    @Produces("Application/json")
    public Customer updateCustomer(@PathParam(value="customerId") long customerId, Customer customer){
        return customerService.updateT(customerId, customer);
    }
//    DELETE localhost:8080/customer/{customerId}

    @DELETE
    @Path("/{customerId}")
    @Consumes("Application/json")
    @Produces("Application/json")
    public boolean deleteCustomer(@PathParam(value="customerId") long customerId){
        return customerService.deleteT( customerId);
    }


    @GET
    @Path("/customers/{starting}")
    @Produces("Application/json")
    @Consumes("Application/json")
    public List<SelectBoxDto> getCustomers(@PathParam(value="starting")  String starting){
        return customerService.getCustomers(starting);
    }


}
