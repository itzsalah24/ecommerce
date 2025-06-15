package pl.zedadra.ecommerce.sales;

import org.junit.jupiter.api.Test;
import pl.zedadra.ecommerce.sales.cart.HashMapCartStorage;
import pl.zedadra.ecommerce.sales.offering.OfferCalculator;
import pl.zedadra.ecommerce.sales.payment.PaymentDetails;
import pl.zedadra.ecommerce.sales.payment.RegisterPaymentRequest;
import pl.zedadra.ecommerce.sales.reservation.ReservationRepository;

import java.math.BigDecimal;

public class OfferAcceptanceTest {

    @Test
    void itAllowsToAcceptOrder() {
        // Arrange
        SalesFacade sales = thereIsSales();
        String customerId = thereIsCustomer("Kuba");
        String productId = thereIsProduct("Lego-8080", BigDecimal.valueOf(10));


        // Act
        // add product
        // add product
        // accet offer

        sales.addProduct(customerId, productId);
        sales.addProduct(customerId, productId);


        var acceptOffer = new AcceptOfferCommand();

        sales.acceptOffer(customerId, new AcceptOfferCommand());

        // Assert
        // reservation id
        // payment url
        // store that (SystemRecordedReservationWithId)

    }

    private String thereIsProduct(String s, BigDecimal bigDecimal) {
        return s;
    }

    private String thereIsCustomer(String id) {
        return id;
    }

    private SalesFacade thereIsSales() {
        return new SalesFacade(new HashMapCartStorage(),
                new OfferCalculator(),
                (RegisterPaymentRequest request) -> {
                    return new PaymentDetails("http://payment");
                },
                new ReservationRepository());
    }
}