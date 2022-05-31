package SpringTesting;

import SpringTesting.Config.ApplicationConfig;
import SpringTesting.Repo.ProductRepo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Cart cart = context.getBean(Cart.class);
        ProductRepo repository = context.getBean(ProductRepo.class);
        Scanner sc = new Scanner(System.in);


        while (true) {
            printMainMenu();
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println(repository.getProductList());
            } else if(choice == 2){
                System.out.print("Type product id to add in cart : ");
                int productId = sc.nextInt();
                cart.addProductById(repository, productId);
            } else if(choice == 3){
                System.out.print("Type product id to remove in cart : ");
                int productId = sc.nextInt();
                cart.removeProductInCartById(repository, productId);
            } else if(choice == 4){
                System.out.println("Cart : " + cart.getProductInCart());
            }
            if (choice == 5) {
                break;
            }
        }
    }
    public static void printMainMenu() {
        System.out.println("Menu");
        System.out.println("1. Show All Products");
        System.out.println("2. Add Product to cart");
        System.out.println("3. Remove product from cart");
        System.out.println("4. Show your cart");
        System.out.println("5. Exit");
    }

}