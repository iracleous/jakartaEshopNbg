package gr.codehub.jakartaeshopnbg.servlet;

import gr.codehub.jakartaeshopnbg.model.Product;
import gr.codehub.jakartaeshopnbg.model.ProductCategory;
import gr.codehub.jakartaeshopnbg.service.GenericService;
import gr.codehub.jakartaeshopnbg.service.ProductService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/doCreate")
public class CreateProductServlet extends HttpServlet {
@Inject
   private ProductService productService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        double price = 0;
        try {
           price = Double.parseDouble(request.getParameter("price"));
        }
        catch(Exception e){}
        String category = request.getParameter("category");

        Product product = new Product(ProductCategory.valueOf(category), price, name);
        productService.createT(product);
        response.getWriter().append("<html><body>");
        response.getWriter().append("product with id = " +product.getId() +" has been saved");
        response.getWriter().append("<br> <a href='.'> Return to index </a>");
    }
}
