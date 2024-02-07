package gr.codehub.jakartaeshopnbg.servlet;

import gr.codehub.jakartaeshopnbg.model.Customer;
import gr.codehub.jakartaeshopnbg.model.Product;
import gr.codehub.jakartaeshopnbg.model.ProductCategory;
import gr.codehub.jakartaeshopnbg.service.CustomerService;
import gr.codehub.jakartaeshopnbg.service.ProductService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/initialization")
public class DbInitialization extends HttpServlet {

    @Inject
    private CustomerService customerService;
    @Inject
    private ProductService productService;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Customer customer =  Customer
                .builder()
                .name("Nikos")
                .email("nikos@gmail.com")
                .build();

        customerService.createT(customer);

        Product product1 = Product
                .builder()
                .name("chips")
                .price(1.20)
                .category(ProductCategory.SNACK)
                .build();
        Product product2 = Product
                .builder()
                .name("bread")
                .price(0.80)
                .category(ProductCategory.FOOD)
                .build();
        productService.createT(product1);
        productService.createT(product2);

        response.getWriter().append("<html><body>");
        response.getWriter().append("The data items have been saved");
        response.getWriter().append("<br> <a href='.'> Return to index </a>");

    }


}
