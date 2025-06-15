package pl.zedadra.ecommerce.sales;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.zedadra.ecommerce.sales.cart.HashMapCartStorage;
import pl.zedadra.ecommerce.sales.offering.OfferCalculator;
import pl.zedadra.ecommerce.sales.payment.PaymentDetails;
import pl.zedadra.ecommerce.sales.payment.RegisterPaymentRequest;
import pl.zedadra.ecommerce.sales.reservation.ReservationRepository;

@Configuration
public class SalesConfiguration {

    @Bean
    SalesFacade createMySalesFacade() {
        return new SalesFacade(new HashMapCartStorage(),
                new OfferCalculator(),
                (RegisterPaymentRequest request) -> {
                    return new PaymentDetails("http://payment");
                },
                new ReservationRepository());
    }
}