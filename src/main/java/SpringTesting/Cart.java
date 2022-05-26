package SpringTesting;

import SpringTesting.Models.Product;
import SpringTesting.Repo.ProductRepo;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Cart {
    private List<Product> productCart;

    public Cart() {
        productCart = new ArrayList<>();
    }

    public List<Product> getProductInCart() {
        return productCart;
    }


    public void removeProductInCartById(ProductRepo repo, int id) {
        Product product = repo.getProduct(id);
        if (product != null) {
            if (productCart.contains(product)) {
                productCart.remove(product);
                System.out.println("Product " + product.getName() + " removed from cart");
            } else {
                System.out.println("Product "  + id + "  not found  in cart ");
            }
        } else {
            System.out.println("Product " + id + " not found ");
        }
    }

        public void addProductById(ProductRepo repo, int id) {
            Product product = repo.getProduct(id);
            if (product != null) {
                productCart.add(product);
                System.out.println("Product  " + product.getName() +" Add to cart");
            } else {
                System.out.println("id= " + id + " not found ");
            }
        }




    }