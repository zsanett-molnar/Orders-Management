package Presentation;
import Model.Client;
import Model.Orders;
import Model.Produs;
import bll.ClientBLL;
import bll.OrdersBLL;
import bll.ProdusBLL;
import generateBill.generateBill;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Aceasta clasa implementeaza functionalitatile butoanelor din GUI.
 */

public class Controller implements ActionListener {
    private View v;

    public Controller(View v) {
        this.v = v;
    }


    /**
     metodă specifică interfeței ActionListener, ce trebuie implementată în mod obligatoriu.
     În această metodă se verifică cu câte un if, care buton s-a apăsat, și în funcție de butonul apăsat, se execută acțiunile necesare
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == v.getClientOp()) {
            v.clienOpFrame();
        }
        if(source == v.getProdusOp()) {
            v.ProdusOpFrame();
        }
        if(source == v.getOrderOp()) {
            v.OrderOpFrame();
        }
        if(source == v.getHome()) {
            v.getFrame2().dispose();
            View newView = new View();
        }

        if(source == v.getFindAllClients()) {
            ClientBLL bll = new ClientBLL();
            List<Client> result = bll.findAll();
            Reflection.getRows(result);

        }

        if(source == v.getFindClientById()) {
            ClientBLL bll = new ClientBLL();
            int id = Integer.parseInt(v.getValue1());
            Client c = bll.findClientById(id);
            List<Client> result = new ArrayList<>();
            result.add(c);
            Reflection.getRows(result);

        }

        if(source == v.getFindClientByName()) {
            ClientBLL bll = new ClientBLL();
            String name = v.getValue1();
            List<Client> result = bll.findByName(name);
            Reflection.getRows(result);
        }

        if(source == v.getFindClientByEmail()) {
            ClientBLL bll = new ClientBLL();
            String name = v.getValue1();
            List<Client> result = bll.findByEmail(name);
            Reflection.getRows(result);

        }

        if(source == v.getDeleteClientByID()) {
            ClientBLL bll = new ClientBLL();
            int id = Integer.parseInt(v.getClientDeleteElement());
            bll.deleteByID(id);
        }

        if(source == v.getDeleteClientByName()) {
            ClientBLL bll = new ClientBLL();
            String name = v.getClientDeleteElement();
            bll.deleteByName(name);
        }

        if(source == v.getDeleteClientByEmail()) {
            ClientBLL bll = new ClientBLL();
            String email = v.getClientDeleteElement();
            bll.deleteByMail(email);
        }

        if(source == v.getFindAllProducts()) {
            ProdusBLL bll = new ProdusBLL();
            List<Produs> result = bll.findAll();
            Reflection.getRows(result);

            }
        if(source == v.getFindProdusById()) {
            ProdusBLL bll = new ProdusBLL();
            int id = Integer.parseInt(v.getProdusSearchElement());
            Produs p = bll.findProdusById(id);
            List<Produs> result = new ArrayList<>();
            result.add(p);
            Reflection.getRows(result);
        }

        if(source == v.getFindProdusByName()) {
            ProdusBLL bll = new ProdusBLL();
            String name = v.getProdusSearchElement();
            Produs p = bll.findByName(name);
            List<Produs> result = new ArrayList<>();
            result.add(p);
            Reflection.getRows(result);
        }

        if(source == v.getFindProdusByPrice()) {
            ProdusBLL bll = new ProdusBLL();
            Double price = Double.parseDouble(v.getProdusSearchElement());
            List <Produs> p = bll.findByPrice(price);
            Reflection.getRows(p);
        }

        if(source == v.getFindProdusByQuantity()) {
            ProdusBLL bll = new ProdusBLL();
            Integer quantity = Integer.parseInt(v.getProdusSearchElement());
            List <Produs> p = bll.findByQuantity(quantity);
            Reflection.getRows(p);
        }

        if(source == v.getDeleteProdusByName()) {
            ProdusBLL bll = new ProdusBLL();
            String name = v.getProdusDeleteValue();
            bll.deleteByName(name);
        }

        if(source == v.getDeleteProdusByID()) {
            ProdusBLL bll = new ProdusBLL();
            int id = Integer.parseInt(v.getProdusDeleteValue());
            bll.deleteByID(id);
        }

        if(source == v.getDeleteProdusByPrice()) {
            ProdusBLL bll = new ProdusBLL();
            double price = Double.parseDouble(v.getProdusDeleteValue());
            bll.deleteByPrice(price);
        }

        if(source == v.getDeleteProdusByQuantity()) {
            ProdusBLL bll = new ProdusBLL();
            int quantity = Integer.parseInt(v.getProdusDeleteValue());
            bll.deleteByQuantity(quantity);
        }

        if(source == v.getUpdateProdus()) {
            v.updateProductFrame();
        }

        if(source == v.getFindAllOrders()) {
            OrdersBLL bll = new OrdersBLL();
            List<Orders> result = bll.findAll();
            Reflection.getRows(result);
        }

        if(source == v.getFindOrderById()) {
            OrdersBLL bll = new OrdersBLL();
            Integer id = Integer.parseInt(v.getOrderSearchValue());
            Orders o = bll.findOrderById(id);
            List <Orders> result = new ArrayList<>();
            result.add(o);
            Reflection.getRows(result);
        }

        if(source == v.getFindOrderByClientId()) {
            OrdersBLL bll = new OrdersBLL();
            Integer id = Integer.parseInt(v.getOrderSearchValue());
            List <Orders> result = new ArrayList<>();
            result = bll.findOrderByClientId(id);
            Reflection.getRows(result);
        }

        if(source == v.getFindOrderByProdusId()) {
            OrdersBLL bll = new OrdersBLL();
            Integer id = Integer.parseInt(v.getOrderSearchValue());
            List <Orders> result = new ArrayList<>();
            result = bll.findOrderByProductId(id);
            Reflection.getRows(result);
        }

        if(source == v.getDeleteOrderByID())  {
            OrdersBLL bll = new OrdersBLL();
            int id = Integer.parseInt(v.getOrdersDeleteElement());
            System.out.println(id);
            bll.deleteByID(id);
        }

        if(source == v.getDeleteOrderByClientID())  {
            OrdersBLL bll = new OrdersBLL();
            int id = Integer.parseInt(v.getOrdersDeleteElement());
            bll.deleteByClientID(id);
        }

        if(source==v.getInsertClient()) {
            v.insertClientFrame();
        }

        if(source == v.getInsertClient2()) {
            ClientBLL bll = new ClientBLL();
            String name = v.getName();
            String email = v.getEmail();
            bll.insert(name,email);

        }

        if(source == v.getInsertPodus()) {
            v.insertProductFrame();
        }

        if(source == v.getInsertPodus2()) {
            ProdusBLL bll = new ProdusBLL();
            String name = v.getProdusValue2();
            int quantity = Integer.parseInt(v.getProdusValue3());
            double price = Double.parseDouble(v.getProdusValue4());
            bll.insert(name,quantity, price);
        }

        if(source == v.getUpdateClient()) {
            v.updateClientFrame();
        }

        if(source == v.getUpdateByID()) {
            v.updateClientByIDFrame();
            ClientBLL bll = new ClientBLL();
            int id = Integer.parseInt(v.getData());
            Client c = bll.findClientById(id);
            v.setID(c.getID());
            v.setClientName(c.getName());
            v.setEmail(c.getEmail());
        }

        if(source == v.getUpdateByID2()) {
            ClientBLL bll = new ClientBLL();
            int id = Integer.parseInt(v.getData());
            String name = v.getNewName();
            String email = v.getNewEmail();
            System.out.println(email);
            bll.updateByID(id,name,email);

        }

        if(source == v.getUpdateByEmail()) {
            v.updateClientByEmailFrame();
            ClientBLL bll = new ClientBLL();
            String email = v.getData();
            Client c = bll.findByEmail(email).get(0);
            v.setID(c.getID());
            v.setClientName(c.getName());
            v.setEmail(c.getEmail());
        }

        if(source == v.getUpdateByEmail2()) {
            ClientBLL bll = new ClientBLL();
            String data = v.getData();
            String name = v.getNewName();
            String email = v.getNewEmail();
            bll.updateByEmail(data,name,email);
        }

        if(source == v.getUpdateByName()) {
            v.updateClientByNameFrame();
            ClientBLL bll = new ClientBLL();
            String name = v.getData();
            Client c = bll.findByName(name).get(0);
            v.setID(c.getID());
            v.setClientName(c.getName());
            v.setEmail(c.getEmail());
        }

        if(source == v.getUpdateByName2()) {
            ClientBLL bll = new ClientBLL();
            String data = v.getData();
            String name = v.getNewName();
            String email = v.getNewEmail();
            bll.updateByName(data,name,email);
        }

        if(source == v.getUpdateProductByID()) {
            v.UpdateProductByIDFrame();
            ProdusBLL bll = new ProdusBLL();
            Integer id = Integer.parseInt(v.getData());
            Produs p = bll.findProdusById(id);
            v.setProdcutID(String.valueOf(p.getID()));
            v.setProductName(p.getName());
            v.setProductQuantity(String.valueOf(p.getQuantity()));
            v.setProductPrice(String.valueOf(p.getPrice()));
        }

        if(source == v.getUpdateProductByName()) {
            v.UpdateProductByNameFrame();
            ProdusBLL bll = new ProdusBLL();
            String name = v.getData();
            Produs p = bll.findByName(name);
            v.setProdcutID(String.valueOf(p.getID()));
            v.setProductName(p.getName());
            v.setProductQuantity(String.valueOf(p.getQuantity()));
            v.setProductPrice(String.valueOf(p.getPrice()));
        }

        if(source == v.getUpdateProductByID2()) {
            ProdusBLL bll = new ProdusBLL();
            Integer data = Integer.parseInt(v.getData());
            String name = v.getNewProductName();
            Integer quantity = Integer.parseInt(v.getNewQuantity());
            Double price = Double.parseDouble(v.getNewProductPrice());
            bll.updateByID(data,name,quantity, price);
        }

        if(source == v.getUpdateProductByName2()) {
            ProdusBLL bll = new ProdusBLL();
            String data = v.getData();
            String name = v.getNewProductName();
            Integer quantity = Integer.parseInt(v.getNewQuantity());
            Double price = Double.parseDouble(v.getNewProductPrice());
            bll.updateByName(data, name, quantity, price);
        }

        if(source == v.getUpdateProductByQuantity()) {
            v.UpdateProductByQuantityFrame();
            ProdusBLL bll = new ProdusBLL();
            Integer quantity = Integer.parseInt(v.getData());
            Produs p = bll.findByQuantity(quantity).get(0);
            v.setProdcutID(String.valueOf(p.getID()));
            v.setProductName(p.getName());
            v.setProductQuantity(String.valueOf(p.getQuantity()));
            v.setProductPrice(String.valueOf(p.getPrice()));
        }

        if(source == v.getUpdateProductByQuantity2()) {
            ProdusBLL bll = new ProdusBLL();
            Integer data = Integer.parseInt(v.getData());
            String name = v.getNewProductName();
            Integer quantity = Integer.parseInt(v.getNewQuantity());
            Double price = Double.parseDouble(v.getNewProductPrice());
            bll.updateByQuantity(data, name, quantity, price);
        }

        if(source == v.getUpdateProductByPrice()) {
            v.UpdateProductByPriceFrame();
            ProdusBLL bll = new ProdusBLL();
            Double price = Double.parseDouble(v.getData());
            Produs p = bll.findByPrice(price).get(0);
            v.setProdcutID(String.valueOf(p.getID()));
            v.setProductName(p.getName());
            v.setProductQuantity(String.valueOf(p.getQuantity()));
            v.setProductPrice(String.valueOf(p.getPrice()));
        }

        if(source == v.getUpdateProductByPrice2()) {
            ProdusBLL bll = new ProdusBLL();
            Double data = Double.parseDouble(v.getData());
            String name = v.getNewProductName();
            Integer quantity = Integer.parseInt(v.getNewQuantity());
            Double price = Double.parseDouble(v.getNewProductPrice());
            bll.updateByPrice(data, name, quantity, price);
        }

        if(source == v.getUpdateOrder()) {
            v.UpdateOrder();
        }

        if(source == v.getUpdateOrderByID()) {
            v.UpdateOrderByID();
            OrdersBLL bll = new OrdersBLL();
            Integer id = Integer.parseInt(v.getOrderData());
            Orders o = bll.findOrderByClientId(id).get(0);
            v.setOrdersProductID(String.valueOf(o.getIdProdus()));
            v.setClientID(String.valueOf(o.getIdClient()));
            v.setPriceOfOrder(String.valueOf(o.getPrice()));
            v.setOrderQuantity(String.valueOf(o.getQuantity()));
        }

        if(source == v.getUpdateOrderByID2()) {
            OrdersBLL bll = new OrdersBLL();
            Integer id = Integer.parseInt(v.getOrderData());
            Integer idClient = Integer.parseInt(v.getClientID());
            Integer idProdus = Integer.parseInt(v.getOrdersProductID());
            Integer quantity = Integer.parseInt(v.getOrderQuantity());
            Double price = Double.parseDouble(v.getOrderPrice());
            bll.updateByID(id, idClient, idProdus, price, quantity);
        }

        if(source == v.getInsertOrder()) {
            v.insertOrder();
        }

        if(source == v.getInsertOrder2()) {
            OrdersBLL bll = new OrdersBLL();
            Integer idClient = Integer.parseInt(v.getClientID());
            Integer idProdus = Integer.parseInt(v.getOrdersProductID());
            Integer quantity = Integer.parseInt(v.getOrderQuantity());
            boolean x = bll.insertOrder(idClient, idProdus, quantity);
            if(x==false) {
                v.displayErrorMessage();
            }

        }

    }
}
