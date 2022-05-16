package Model;
/**
 * Această clasă este utilizată pentru a stoca datele referitoare la o comandă, date existente în baza de date.
 * Atributele clasei sunt: ID, idClient, idProdus, price, quantity. Clasa conține constructori, gettere și settere.
 */


public class Orders {
    private Integer ID;
    private Integer idClient;
    private Integer idProdus;
    private Double price;
    private Integer quantity;

    public Orders() {
    }

    public Orders(Integer idClient, Integer idProdus, Double price, Integer quantity) {
        this.idClient = idClient;
        this.idProdus = idProdus;
        this.price = price;
        this.quantity = quantity;
    }

    public Orders(Integer idClient, Integer idProdus, Integer quantity) {
        this.idClient=idClient;
        this.idProdus=idProdus;
        this.quantity=quantity;
    }



    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public Integer getIdProdus() {
        return idProdus;
    }

    public void setIdProdus(Integer idProdus) {
        this.idProdus = idProdus;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
