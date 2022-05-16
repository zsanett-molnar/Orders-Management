package bll;


import Model.Client;
import Model.Produs;
import bll.validators.Validator;
import dao.ClientDAO;
import dao.ProdusDAO;
import bll.validators.QuantityValidator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Metodele acestei clase se folosesc de obiectul ProdusDAO prin care se apeleaza metodele din clasa respectiva.
 * Clasa are ca și câmpuri o listă de validatori, și un obiect de ProdusDAO.
 * Clasa are metodele menționate și în ProdusDAO. În plus, metodele din ProdusBLL verifică cu
 * validatorii produsele care au fost inserate/modificate
 */


public class ProdusBLL {

    private List<Validator<Produs>> validators;
    private ProdusDAO produsDAO;

    public ProdusBLL() {
        validators = new ArrayList<Validator<Produs>>();
        validators.add(new QuantityValidator());
        produsDAO = new ProdusDAO();
    }

    public Produs findProdusById(int id) {
        Produs produs = produsDAO.findById(id);
        if (produs == null) {
            throw new NoSuchElementException("The product with id =" + id + " was not found!");
        }
        return produs;
    }

    public List<Produs> findAll(){
        //ProdusDAO dao = new ProdusDAO();
        List<Produs> result = produsDAO.findAll();
        return result;
    }

    public Produs findByName(String name) {
        Produs p = produsDAO.findByName(name);
        if (p == null) {
            throw new NoSuchElementException("The product with name =" + name + " was not found!");
        }
        return p;
    }

    public List<Produs> findByPrice(Double price) {
        List<Produs> p = produsDAO.findByPrice(price);
        if (p == null) {
            throw new NoSuchElementException("The product with price =" + price + " was not found!");
        }
        return p;
    }

    public List<Produs> findByQuantity(Integer quantity) {
        List<Produs> p = produsDAO.findByQuantity(quantity);
        if (p == null) {
            throw new NoSuchElementException("The product with quantity =" + quantity + " was not found!");
        }
        return p;
    }

    public void deleteByName(String name) {
        ProdusDAO dao = new ProdusDAO();
        dao.deleteByName("name", name);
    }

    public void deleteByID(Integer id) {
        ProdusDAO dao = new ProdusDAO();
        dao.delete("ID", id);
    }

    public void deleteByPrice(Double price) {
        ProdusDAO dao = new ProdusDAO();
        dao.deleteByPrice("price", price);
    }

    public void deleteByQuantity(int quantity) {
        ProdusDAO dao = new ProdusDAO();
        dao.delete("quantity", quantity);
    }

    public void insert(String name, int quantity, double price) {
        Produs produs = new Produs(name, quantity, price);
        for (Validator<Produs> v : validators) {
            v.validate(produs);
        }
        produsDAO.insert(name,quantity,price);
    }

    public void updateByID(Integer value, String name, Integer quantity, Double price) {
        Produs p = new Produs(name, quantity, price);
        for (Validator<Produs> v : validators) {
            v.validate(p);
        }
        produsDAO.updateByIDOrQuantity("ID", value, name,quantity, price);
    }

    public void updateByQuantity(Integer value, String name, Integer quantity, Double price) {
        Produs p = new Produs(name, quantity, price);
        for (Validator<Produs> v : validators) {
            v.validate(p);
        }
        produsDAO.updateByIDOrQuantity("quantity", value, name,quantity, price);
    }

    public void updateByName(String value, String name, Integer quantity, Double price) {
        Produs p = new Produs(name, quantity, price);
        for (Validator<Produs> v : validators) {
            v.validate(p);
        }
        produsDAO.updateByName("name", value, name,quantity, price);
    }

    public void updateByPrice(Double value, String name, Integer quantity, Double price) {
        Produs p = new Produs(name, quantity, price);
        for (Validator<Produs> v : validators) {
            v.validate(p);
        }
        produsDAO.updateByPrice("price", value, name,quantity, price);
    }

}
