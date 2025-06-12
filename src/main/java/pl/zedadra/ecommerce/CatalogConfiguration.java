package pl.zedadra.ecommerce;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import pl.zedadra.productcatalog.ProductCatalog;
import pl.zedadra.productcatalog.ProductStorage;
import pl.zedadra.productcatalog.SqlProductStorage;

@Configuration
public class CatalogConfiguration {

    @Bean
    ProductCatalog createMyProductCatalog(ProductStorage storage) {
        var catalog = new ProductCatalog(storage);

        catalog.createProduct("nice one", "nic edesc");
        catalog.createProduct("nice one2", "nic edesc");
        catalog.createProduct("nice one3", "nic edesc");

        return catalog;
    }

    @Bean
    ProductStorage createMyStorage(JdbcTemplate jdbcTemplate) {
        return new SqlProductStorage(jdbcTemplate);
    }
}