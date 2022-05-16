package bll;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import Model.Client;
import Model.Produs;
import bll.validators.Validator;
import dao.ClientDAO;
import dao.OrderDAO;
import Model.Orders;
import generateBill.generateBill;

/**
 * Metodele acestei clase se folosesc de obiectul OrderDAO prin care se apeleaza metodele din clasa respectiva.
 * Clasa are ca și câmpuri o listă de validatori, și un obiect de OrderDAO.
 */


public class OrdersBLL {

    private List<Validator<Orders>> validators;
    private OrderDAO orderDAO;

    public OrdersBLL() {
        validators = new ArrayList<Validator<Orders>>();

        orderDAO = new OrderDAO();
    }

    public Orders findOrderById(int id) {
        Orders order = orderDAO.findById(id);
        if (order == null) {
            throw new NoSuchElementException("The client with id =" + id + " was not found!");
        }
        return order;
    }

    public List<Orders> findAll(){
        OrderDAO dao = new OrderDAO();
        List<Orders> result = dao.findAll();
        return result;
    }

    public List<Orders> findOrderByClientId(int id) {
        List<Orders> result = new ArrayList<>();
        result = orderDAO.findByClientID(id);
        if (result == null) {
            throw new NoSuchElementException("The client with id =" + id + " was not found!");
        }
        return result;
    }

    public List<Orders> findOrderByProductId(int id) {
        List<Orders> result = new ArrayList<>();
        result = orderDAO.findByProductID(id);
        if (result == null) {
            throw new NoSuchElementException("The client with id =" + id + " was not found!");
        }
        return result;
    }

    public void deleteByID(int id) {
        OrderDAO dao = new OrderDAO();
        dao.delete("ID", id);
    }

    public void deleteByClientID(int id) {
        OrderDAO dao = new OrderDAO();
        dao.delete("idClient", id);
    }

    public void updateByID(Integer value, Integer idClient, Integer idProdus, Double price, Integer quantity) {
        Orders o = new Orders(idClient, idProdus, price, quantity);
        for (Validator<Orders> v : validators) {
            v.validate(o);
        }
        orderDAO.updateByID("ID", value, idClient, idProdus, price, quantity);
    }

    public boolean insertOrder(Integer idClient, Integer idProduct, Integer quantity) {
        ProdusBLL bllProdus = new ProdusBLL();
        Produs p = bllProdus.findProdusById(idProduct);
        if(quantity > p.getQuantity()){
            return false;
        }
        else {
            Double price = p.getPrice() * quantity;
            generateBill bill = new generateBill();
            bill.writeInFile(idClient,idProduct, price, quantity);
            Integer newQuantity = p.getQuantity() - quantity;
            if(newQuantity>0) {
                bllProdus.updateByID(p.getID(), p.getName(), newQuantity, p.getPrice());
            }
            if (newQuantity == 0) {
                bllProdus.deleteByID(p.getID());
            }
            Orders o = new Orders(idClient, idProduct, quantity);
            for (Validator<Orders> v : validators) {
                v.validate(o);
            }
            orderDAO.insertOrder(idClient, idProduct, quantity, price);
            return true;
        }



    }


}
