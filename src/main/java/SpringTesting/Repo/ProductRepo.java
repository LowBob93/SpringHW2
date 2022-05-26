package SpringTesting.Repo;
import SpringTesting.Models.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



    @Repository
    public class ProductRepo{
        private List<Product> productList;

        public  ProductRepo() {
            productList = new ArrayList<>();
            productList.add(new Product(1, "Lemon", 190.00));
            productList.add(new Product(2, "Carrot",84.00 ));
            productList.add(new Product(3, "Onion", 55.00));
            productList.add(new Product(4, "Melon", 90.00));
            productList.add(new Product(5, "Garlic", 120.00));
        }

        public List<Product> getProductList() {
            return productList;
        }

        public Product getProduct(int id) {
            try {
                return productList
                        .stream()
                        .filter(p -> p.getId() == id)
                        .limit(1)
                        .collect(Collectors.toList())
                        .get(0);
            } catch (Exception ignored) {

            }
            return null;
        }
    }

