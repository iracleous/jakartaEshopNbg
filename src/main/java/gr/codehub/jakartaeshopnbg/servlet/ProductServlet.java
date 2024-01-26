package gr.codehub.jakartaeshopnbg.servlet;

import gr.codehub.jakartaeshopnbg.model.Product;
import gr.codehub.jakartaeshopnbg.repository.ProductRepository;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Optional;

@WebServlet("/simple-servlet")
public class ProductServlet extends HttpServlet {
@Inject
    private ProductRepository productRepository ;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        Optional<Product> product =productRepository.findById(1);

        writer.append("""
        <html>
        <body>
        <h1> This is a heading</h1>
        <p>This is a paragraph</p>
        """);
        if (product.isPresent())
            writer.append(product.get().getName());
        writer.append("""
        </body>
        </html>
        """);

    }
}
