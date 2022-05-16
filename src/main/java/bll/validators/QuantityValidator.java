package bll.validators;

import Model.Produs;

/**
 * Această clasă verifică dacă cantitatea unui produs este mai mare decât 0.
 * Dacă nu este, aruncă o excepție. Are o singură metodă de validate (metoda interfetei Validator) care efectuează verificarea
 */

public class QuantityValidator implements Validator<Produs>{

    public void validate(Produs p) {
        if (p.getQuantity() <= 0) {
            throw new IllegalArgumentException("Quantity is not valid");
        }
    }
}
