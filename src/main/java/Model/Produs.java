package Model;

/**
 * Această clasă este utilizată pentru a stoca datele referitoare la un produs, date existente în baza de date.
 * Atributele clasei sunt: ID, name, quantity, price. Clasa conține contructori, gettere și settere
 */


public class Produs {
    private Integer ID;
    private String name;
    private Integer quantity;
    private Double price;

    public Produs() {
    }

    public Produs( String name, Integer quantity, Double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
