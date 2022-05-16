package bll.validators;
import Model.Orders;

/**
 * Această clasă verifică dacă cantitatea produsului unei comenzi este mai mare decât 0.
 * Dacă nu este, aruncă o excepție. Are o singură metodă de validate (metoda interfetei Validator) care efectuează verificarea
 */


public class OrderQuantityValidator implements Validator<Orders>{

    @Override
    public void validate(Orders order) {
        if (order.getQuantity() <= 0) {
            throw new IllegalArgumentException("Quantity is not valid");
        }
    }
}
