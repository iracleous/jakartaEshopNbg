package gr.codehub.jakartaeshopnbg.service;

import gr.codehub.jakartaeshopnbg.model.Product;
import gr.codehub.jakartaeshopnbg.repository.ProductRepository;
import gr.codehub.jakartaeshopnbg.resource.ProductResource;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jdk.jfr.Name;

import java.beans.BeanProperty;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
public class ProductServiceImpl extends GenericServiceImpl<Product, Long>  implements ProductService {

}
