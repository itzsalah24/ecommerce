package pl.zedadra.ecommerce;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.zedadra.productcatalog.ArrayListProductStorage;
import pl.zedadra.productcatalog.ProductCatalog;

@SpringBootApplication
public class App {
    public static void main(String[] args){
        System.out.println("It works!");
        SpringApplication.run(App.class, args);
    }


}