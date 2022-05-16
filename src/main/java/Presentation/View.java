package Presentation;
import javax.swing.*;
import java.awt.*;

/**
 * În această clasă este implementată interfața utilizatorului. Clasa extinde JFrame. Clasa are mai multe metode,
 * fiecare efectuând deschiderea unei noi ferestre, în funcție de operație pe care dorim să o efectuăm.
 */


public class View {

    private JFrame frame = new JFrame("Order Management System");
    private JFrame frame2;
    private JLabel msg1 = new JLabel("Select option:");
    private JButton exit = new JButton("Exit");
    private JButton home = new JButton("Home");
    private JButton clientOp = new JButton("Client operations");
    private JButton produsOp = new JButton("Produs operations");
    private JButton orderOp = new JButton("Order operations");
    //client op:
    private JTextField clientSearchElement = new JTextField("", 20);
    private JTextField clientDeleteElement = new JTextField("", 20);
    private JTextField clientUpdateElement = new JTextField("", 20);
    private JLabel l1 = new JLabel("Name");
    private JLabel l2 = new JLabel("E-mail");
    private JLabel l3 = new JLabel("ID");
    private JLabel l4 = new JLabel("ID");
    private JLabel l5 = new JLabel("Name");
    private JLabel l6 = new JLabel("Quantity");
    private JLabel l7 = new JLabel("Price");
    private JTextField clientData1 = new JTextField("", 20);
    private JTextField clientData2 = new JTextField("", 20);
    private JTextField clientData3 = new JTextField("", 20);
    //Client buttons
    private JButton findAllClients = new JButton("View all");
    private JButton findClientById = new JButton("Find by ID");
    private JButton findClientByName = new JButton("Find by name");
    private JButton findClientByEmail = new JButton("Find by email");
    private JButton deleteClientByID = new JButton("Delete by ID");
    private JButton deleteClientByName = new JButton("Delete by name");
    private JButton deleteClientByEmail = new JButton("Delete by email");
    private JButton insertClient = new JButton("Insert client");
    private JButton updateClient = new JButton("Update Client");
    private JButton insertClient2 = new JButton("Insert");
    private JButton updateByID = new JButton("Update by ID");
    private JButton updateByName = new JButton("Update by name");
    private JButton updateByEmail = new JButton("Update by email");
    private JButton update2 = new JButton("Update");
    private JButton updateByName2 = new JButton("Update");
    private JButton updateByEmail2 = new JButton("Update");

    private JTextField data = new JTextField("", 20);
    private JTextField IDTextField = new JTextField("", 20);
    private JTextField nameTextField = new JTextField("", 20);
    private JTextField emailTextField = new JTextField("", 20);
    //Order buttons
    private JButton findAllOrders = new JButton("View all");
    private JButton findOrderById = new JButton("Find by ID");
    private JButton findOrderByClientId = new JButton("Find by client ID");
    private JButton findOrderByProdusId = new JButton("Find by product ID");

    private JButton deleteOrderByID = new JButton("Delete by ID");
    private JButton deleteOrderByClientID = new JButton("Delete by client ID");
    private JButton deleteOrderByProductID = new JButton("Delete by product ID");
    private JButton deleteOrderByPrice = new JButton("Delete by price");
    private JButton insertOrder = new JButton("Insert order");
    private JButton insertOrder2 = new JButton("Insert order");
    private JButton updateOrder = new JButton("Update order");
    private JButton updateOrderByID = new JButton("Update by ID");
    private JButton updateOrderByID2 = new JButton("Update by ID");
    private JButton updateOrderByClientID = new JButton("Update by ClientID");
    private JButton updateOrderByProductID = new JButton("Update by product ID");
    private JButton updateOrderByQuantity = new JButton("Update by quantity");
    private JButton updateOrderByPrice = new JButton("Update by price");

    private JTextField orderSearchElement = new JTextField("", 20);
    private JTextField orderDeleteElement = new JTextField("", 20);
    private JTextField orderData = new JTextField("", 20);
    private JTextField clientIDTF = new JTextField("", 20);
    private JTextField productIDTF = new JTextField("", 20);
    private JTextField quantityTF = new JTextField("", 20);
    private JTextField priceTF = new JTextField("", 20);


    //Produs buttons
    private JTextField produsSearchElement = new JTextField("", 20);
    private JTextField produsDeleteElement = new JTextField("", 20);
    private JTextField produsUpdateElement = new JTextField("", 20);

    private JTextField produsIDTF = new JTextField("", 20);
    private JTextField produsNameTF = new JTextField("", 20);
    private JTextField produsPriceTF = new JTextField("", 20);
    private JTextField produsQuantityTF = new JTextField("", 20);

    private JButton findAllProducts = new JButton("View all");
    private JButton findProdusById = new JButton("Find by ID");
    private JButton findProdusByName = new JButton("Find by name");
    private JButton findProdusByQuantity = new JButton("Find by quantity");
    private JButton findProdusByPrice = new JButton("Find by price");
    private JButton deleteProdusByID = new JButton("Delete by ID");
    private JButton deleteProdusByName = new JButton("Delete by name");
    private JButton deleteProdusByQuantity = new JButton("Delete by quantity");
    private JButton deleteProdusByPrice = new JButton("Delete by price");
    private JButton insertPodus = new JButton("Insert product");
    private JButton insertPodus2 = new JButton("Insert product");
    private JButton updateProdus = new JButton("Update product");
    private JButton updateProductByID = new JButton("Update by ID");
    private JButton updateProductByName = new JButton("Update by name");
    private JButton updateProductByPrice = new JButton("Update by price");
    private JButton updateProductByQuantity = new JButton("Update by quantity");

    private JButton updateProductByID2 = new JButton("Update");
    private JButton updateProductByName2 = new JButton("Update");
    private JButton updateProductByPrice2 = new JButton("Update");
    private JButton updateProductByQuantity2 = new JButton("Update");

    private JTextField produsData1 = new JTextField("", 20);
    private JTextField produsData2 = new JTextField("", 20);
    private JTextField produsData3 = new JTextField("", 20);
    private JTextField produsData4 = new JTextField("", 20);

    public JTextField getClientSearchElement() {
        return clientSearchElement;
    }

    public JTextField getClientUpdateElement() {
        return clientUpdateElement;
    }

    public JTextField getClientData3() {
        return clientData3;
    }

    public JButton getInsertPodus2() {
        return insertPodus2;
    }

    public JButton getExit() {
        return exit;
    }

    public JButton getHome() {
        return home;
    }

    public JButton getClientOp() {
        return clientOp;
    }

    public JButton getProdusOp() {
        return produsOp;
    }

    public JFrame getFrame() {
        return frame;
    }

    public JButton getOrderOp() {
        return orderOp;
    }

    public JButton getFindClientById() {
        return findClientById;
    }

    public JButton getFindClientByName() {
        return findClientByName;
    }

    public JButton getFindClientByEmail() {
        return findClientByEmail;
    }

    public JButton getDeleteClientByID() {
        return deleteClientByID;
    }

    public JButton getDeleteClientByName() {
        return deleteClientByName;
    }

    public JButton getDeleteClientByEmail() {
        return deleteClientByEmail;
    }

    public JButton getFindAllProducts() {
        return findAllProducts;
    }

    public JButton getFindProdusById() {
        return findProdusById;
    }

    public JButton getFindProdusByName() {
        return findProdusByName;
    }

    public JButton getFindProdusByQuantity() {
        return findProdusByQuantity;
    }

    public JButton getFindProdusByPrice() {
        return findProdusByPrice;
    }

    public JButton getDeleteProdusByID() {
        return deleteProdusByID;
    }

    public JButton getDeleteProdusByName() {
        return deleteProdusByName;
    }

    public JButton getDeleteProdusByQuantity() {
        return deleteProdusByQuantity;
    }

    public JButton getDeleteProdusByPrice() {
        return deleteProdusByPrice;
    }


    public JButton getUpdateByID() {
        return updateByID;
    }

    public JButton getUpdateByName() {
        return updateByName;
    }

    public JButton getUpdateByEmail() {
        return updateByEmail;
    }

    public JButton getUpdateByID2() {
        return update2;
    }

    public JTextField getProdusDeleteElement() {
        return produsDeleteElement;
    }

    public JTextField getProdusUpdateElement() {
        return produsUpdateElement;
    }

    public JButton getInsertClient() {
        return insertClient;
    }

    public JButton getUpdateClient() {
        return updateClient;
    }

    public JTextField getOrderSearchElement() {
        return orderSearchElement;
    }

    public JTextField getOrderDeleteElement() {
        return orderDeleteElement;
    }


    public JButton getFindAllOrders() {
        return findAllOrders;
    }

    public JButton getFindOrderById() {
        return findOrderById;
    }

    public JButton getFindOrderByClientId() {
        return findOrderByClientId;
    }

    public JButton getFindOrderByProdusId() {
        return findOrderByProdusId;
    }

    public JButton getDeleteOrderByID() {
        return deleteOrderByID;
    }

    public JButton getDeleteOrderByClientID() {
        return deleteOrderByClientID;
    }

    public JButton getDeleteOrderByProductID() {
        return deleteOrderByProductID;
    }

    public JButton getDeleteOrderByPrice() {
        return deleteOrderByPrice;
    }

    public JButton getInsertOrder() {
        return insertOrder;
    }

    public JButton getUpdateOrder() {
        return updateOrder;
    }

    public JButton getInsertPodus() {
        return insertPodus;
    }

    public JButton getUpdateProdus() {
        return updateProdus;
    }

    public JFrame getFrame2() {
        return frame2;
    }

    public JLabel getMsg1() {
        return msg1;
    }


    public JButton getFindAllClients() {
        return findAllClients;
    }

    public JLabel getL1() {
        return l1;
    }

    public JLabel getL2() {
        return l2;
    }

    public JTextField getClientData1() {
        return clientData1;
    }

    public JTextField getClientData2() {
        return clientData2;
    }

    public JButton getInsertClient2() {
        return insertClient2;
    }

    public Controller getController() {
        return controller;
    }

    public JButton getUpdateByName2() {
        return updateByName2;
    }

    public JButton getUpdateByEmail2() {
        return updateByEmail2;
    }

    public JButton getUpdateProductByID() {
        return updateProductByID;
    }

    public JButton getUpdateProductByName() {
        return updateProductByName;
    }

    public JButton getUpdateProductByPrice() {
        return updateProductByPrice;
    }

    public JButton getUpdateProductByQuantity() {
        return updateProductByQuantity;
    }

    public JButton getUpdateProductByID2() {
        return updateProductByID2;
    }

    public JButton getUpdateProductByName2() {
        return updateProductByName2;
    }

    public JButton getUpdateProductByPrice2() {
        return updateProductByPrice2;
    }

    public JButton getUpdateProductByQuantity2() {
        return updateProductByQuantity2;
    }

    public JButton getUpdateOrderByClientID() {
        return updateOrderByClientID;
    }

    public JButton getUpdateOrderByProductID() {
        return updateOrderByProductID;
    }

    public JLabel getL3() {
        return l3;
    }

    public JButton getInsertOrder2() {
        return insertOrder2;
    }

    public JButton getUpdateOrderByID() {
        return updateOrderByID;
    }

    public JButton getUpdateOrderByID2() {
        return updateOrderByID2;
    }

    public JButton getUpdateOrderByQuantity() {
        return updateOrderByQuantity;
    }

    Controller controller = new Controller(this);

    public View() {

        clientOp.addActionListener(controller);
        produsOp.addActionListener(controller);
        orderOp.addActionListener(controller);
        home.addActionListener(controller);
        findClientById.addActionListener(controller);
        findClientByName.addActionListener(controller);
        findClientByEmail.addActionListener(controller);
        findAllClients.addActionListener(controller);
        findAllProducts.addActionListener(controller);
        findProdusById.addActionListener(controller);
        findProdusByName.addActionListener(controller);
        findProdusByQuantity.addActionListener(controller);
        findProdusByPrice.addActionListener(controller);
        deleteProdusByName.addActionListener(controller);
        deleteProdusByID.addActionListener(controller);
        deleteProdusByPrice.addActionListener(controller);
        deleteProdusByQuantity.addActionListener(controller);
        deleteClientByID.addActionListener(controller);
        deleteClientByName.addActionListener(controller);
        deleteClientByEmail.addActionListener(controller);
        findAllOrders.addActionListener(controller);
        findOrderByClientId.addActionListener(controller);
        findOrderById.addActionListener(controller);
        findOrderByProdusId.addActionListener(controller);
        deleteOrderByID.addActionListener(controller);
        deleteOrderByClientID.addActionListener(controller);
        deleteOrderByPrice.addActionListener(controller);
        updateOrder.addActionListener(controller);
        updateOrderByID.addActionListener(controller);
        updateOrderByID2.addActionListener(controller);
        updateOrderByClientID.addActionListener(controller);
        updateOrderByProductID.addActionListener(controller);
        updateOrderByQuantity.addActionListener(controller);
        updateOrderByPrice.addActionListener(controller);
        insertClient.addActionListener(controller);
        insertClient2.addActionListener(controller);
        insertPodus.addActionListener(controller);
        insertPodus2.addActionListener(controller);
        updateClient.addActionListener(controller);
        updateByID.addActionListener(controller);
        updateByName.addActionListener(controller);
        updateByEmail.addActionListener(controller);
        update2.addActionListener(controller);
        updateByName2.addActionListener(controller);
        updateByEmail2.addActionListener(controller);
        updateProductByID.addActionListener(controller);
        updateProductByName.addActionListener(controller);
        updateProductByPrice.addActionListener(controller);
        updateProductByQuantity.addActionListener(controller);
        updateProductByID2.addActionListener(controller);
        updateProductByName2.addActionListener(controller);
        updateProductByPrice2.addActionListener(controller);
        updateProductByQuantity2.addActionListener(controller);
        updateProdus.addActionListener(controller);
        insertOrder.addActionListener(controller);
        insertOrder2.addActionListener(controller);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        JPanel p = new JPanel();

        JPanel panel0 = new JPanel();
        msg1.setFont(new Font("Serif", Font.BOLD, 20));
        panel0.add(msg1);
        panel0.setBackground(Color.gray);

        JPanel panel1 = new JPanel();
        panel1.add(clientOp);
        panel1.setBackground(Color.gray);

        JPanel panel2 = new JPanel();
        panel2.add(produsOp);
        panel2.setBackground(Color.gray);

        JPanel panel3 = new JPanel();
        panel3.add(orderOp);
        panel3.setBackground(Color.gray);


        p.add(panel0);
        p.add(panel1);
        p.add(panel3);
        p.add(panel2);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        frame.setVisible(true);
        frame.setContentPane(p);

    }

   public void clienOpFrame() {

        frame.dispose();
        frame2 = new JFrame("Client operations");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(600, 500);

        JPanel p = new JPanel();

        JPanel panel1 = new JPanel();
        panel1.add(clientSearchElement);
        panel1.add(findClientById);
        panel1.add(findClientByName);
        panel1.add(findClientByEmail);

        JPanel panel2 = new JPanel();

        panel2.add(clientDeleteElement);
        panel2.add(deleteClientByID);
        panel2.add(deleteClientByName);
        panel2.add(deleteClientByEmail);

        JPanel panel3 = new JPanel();
        panel3.add(insertClient);
        panel3.add(updateClient);


        JPanel panel4 = new JPanel();
        panel4.add(home);

       JPanel panel5 = new JPanel();
       panel5.add(findAllClients);

        p.add(panel5);
        p.add(panel1);
        p.add(panel2);
        p.add(panel3);
        p.add(panel4);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        frame2.setVisible(true);
        frame2.setContentPane(p);
   }

    public void ProdusOpFrame() {

        frame.dispose();
        frame2 = new JFrame("Product operations");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(900, 500);

        JPanel p = new JPanel();

        JPanel panel1 = new JPanel();
        panel1.add(produsSearchElement);
        panel1.add(findProdusById);
        panel1.add(findProdusByName);
        panel1.add(findProdusByQuantity);
        panel1.add(findProdusByPrice);


        JPanel panel2 = new JPanel();
        panel2.add(produsDeleteElement);
        panel2.add(deleteProdusByID);
        panel2.add(deleteProdusByName);
        panel2.add(deleteProdusByPrice);
        panel2.add(deleteProdusByQuantity);


        JPanel panel3 = new JPanel();
        panel3.add(insertPodus);
        panel3.add(updateProdus);


        JPanel panel4 = new JPanel();
        panel4.add(home);

        JPanel panel5 = new JPanel();
        panel5.add(findAllProducts);

        p.add(panel5);
        p.add(panel1);
        p.add(panel2);
        p.add(panel3);
        p.add(panel4);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        frame2.setVisible(true);
        frame2.setContentPane(p);
    }


    public void OrderOpFrame() {

        frame.dispose();
        frame2 = new JFrame("Order operations");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(700, 500);

        JPanel p = new JPanel();

        JPanel panel1 = new JPanel();
        panel1.add(orderSearchElement);
        panel1.add(findOrderById);
        panel1.add(findOrderByClientId);
        panel1.add(findOrderByProdusId);


        JPanel panel2 = new JPanel();
        panel2.add(orderDeleteElement);
        panel2.add(deleteOrderByID);
        panel2.add(deleteOrderByClientID);

        JPanel panel3 = new JPanel();
        panel3.add(insertOrder);
        panel3.add(updateOrder);


        JPanel panel4 = new JPanel();
        panel4.add(home);

        JPanel panel5 = new JPanel();
        panel5.add(findAllOrders);


        p.add(panel5);
        p.add(panel1);
        p.add(panel2);
        p.add(panel3);
        p.add(panel4);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        frame2.setVisible(true);
        frame2.setContentPane(p);
    }

    public void insertClientFrame() {

        JFrame frame3 = new JFrame("Insert Client");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(700, 500);

        JPanel p = new JPanel();


        JPanel panel1 = new JPanel();
        panel1.add(l1);
        panel1.add(clientData1);


        JPanel panel2 = new JPanel();
        panel2.add(l2);
        panel2.add(clientData2);

        JPanel panel3 = new JPanel();
        panel3.add(insertClient2);


        JPanel panel4 = new JPanel();
        panel4.add(home);

        JPanel panel5 = new JPanel();

        p.add(panel5);
        p.add(panel1);
        p.add(panel2);
        p.add(panel3);
        p.add(panel4);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        frame3.setVisible(true);
        frame3.setContentPane(p);
    }

    public void insertProductFrame() {

        JFrame frame3 = new JFrame("Insert Product");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(700, 500);

        JPanel p = new JPanel();


        JPanel panel1 = new JPanel();
        panel1.add(l5);
        panel1.add(produsData2);

        JPanel panel3 = new JPanel();
        panel3.add(l6);
        panel3.add(produsData3);

        JPanel panel2 = new JPanel();
        panel2.add(l7);
        panel2.add(produsData4);

        JPanel panel4 = new JPanel();
        panel4.add(insertPodus2);

        JPanel panel5 = new JPanel();
        panel5.add(home);

        p.add(panel1);
        p.add(panel2);
        p.add(panel3);
        p.add(panel4);
        p.add(panel5);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        frame3.setVisible(true);
        frame3.setContentPane(p);
    }

    public void updateClientFrame() {

        JFrame frame3 = new JFrame("Update Client");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(600, 400);

        JPanel p = new JPanel();

        JPanel panel1 = new JPanel();
        JLabel l = new JLabel("Data");
        panel1.add(l);
        panel1.add(data);

        JPanel panel2 = new JPanel();
        panel2.add(updateByID);

        JPanel panel3 = new JPanel();
        panel3.add(updateByName);

        JPanel panel4 = new JPanel();
        panel4.add(updateByEmail);

        p.add(panel1);
        p.add(panel2);
        p.add(panel3);
        p.add(panel4);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        frame3.setVisible(true);
        frame3.setContentPane(p);
    }

    public void updateClientByIDFrame() {

        JFrame frame3 = new JFrame("Modify Client");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(300, 400);
        JLabel l1 = new JLabel("ID:");
        JLabel l2 = new JLabel("Name:");
        JLabel l3 = new JLabel("Email:");

        JPanel p = new JPanel();

        JPanel panel1 = new JPanel();
        panel1.add(l1);
        panel1.add(IDTextField);

        JPanel panel2 = new JPanel();
        panel2.add(l2);
        panel2.add(nameTextField);

        JPanel panel3 = new JPanel();
        panel3.add(l3);
        panel3.add(emailTextField);

        JPanel panel4 = new JPanel();
        panel4.add(update2);
        panel4.add(home);

        p.add(panel1);
        p.add(panel2);
        p.add(panel3);
        p.add(panel4);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        frame3.setVisible(true);
        frame3.setContentPane(p);
    }

    public void updateClientByNameFrame() {

        JFrame frame3 = new JFrame("Modify Client");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(300, 400);
        JLabel l1 = new JLabel("ID:");
        JLabel l2 = new JLabel("Name:");
        JLabel l3 = new JLabel("Email:");

        JPanel p = new JPanel();

        JPanel panel1 = new JPanel();
        panel1.add(l1);
        panel1.add(IDTextField);

        JPanel panel2 = new JPanel();
        panel2.add(l2);
        panel2.add(nameTextField);

        JPanel panel3 = new JPanel();
        panel3.add(l3);
        panel3.add(emailTextField);

        JPanel panel4 = new JPanel();
        panel4.add(updateByName2);
        panel4.add(home);

        p.add(panel1);
        p.add(panel2);
        p.add(panel3);
        p.add(panel4);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        frame3.setVisible(true);
        frame3.setContentPane(p);
    }

    public void updateClientByEmailFrame() {

        JFrame frame3 = new JFrame("Modify Client");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(300, 400);
        JLabel l1 = new JLabel("ID:");
        JLabel l2 = new JLabel("Name:");
        JLabel l3 = new JLabel("Email:");

        JPanel p = new JPanel();

        JPanel panel1 = new JPanel();
        panel1.add(l1);
        panel1.add(IDTextField);

        JPanel panel2 = new JPanel();
        panel2.add(l2);
        panel2.add(nameTextField);

        JPanel panel3 = new JPanel();
        panel3.add(l3);
        panel3.add(emailTextField);

        JPanel panel4 = new JPanel();
        panel4.add(updateByEmail2);
        panel4.add(home);

        p.add(panel1);
        p.add(panel2);
        p.add(panel3);
        p.add(panel4);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        frame3.setVisible(true);
        frame3.setContentPane(p);
    }

    public void updateProductFrame() {

        JFrame frame3 = new JFrame("Update Product");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(600, 400);

        JPanel p = new JPanel();

        JPanel panel1 = new JPanel();
        JLabel l = new JLabel("Data");
        panel1.add(l);
        panel1.add(data);

        JPanel panel2 = new JPanel();
        panel2.add(updateProductByID);

        JPanel panel3 = new JPanel();
        panel3.add(updateProductByName);

        JPanel panel4 = new JPanel();
        panel4.add(updateProductByPrice);

        JPanel panel5 = new JPanel();
        panel5.add(updateProductByQuantity);

        p.add(panel1);
        p.add(panel2);
        p.add(panel3);
        p.add(panel4);
        p.add(panel5);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        frame3.setVisible(true);
        frame3.setContentPane(p);
    }

    public void UpdateProductByIDFrame() {

        JFrame frame3 = new JFrame("Update Product by ID");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(300, 400);
        JLabel l1 = new JLabel("ID:");
        JLabel l2 = new JLabel("Name:");
        JLabel l3 = new JLabel("Quantity:");
        JLabel l4 = new JLabel("Price:");

        JPanel p = new JPanel();

        JPanel panel1 = new JPanel();
        panel1.add(l1);
        panel1.add(produsIDTF);

        JPanel panel2 = new JPanel();
        panel2.add(l2);
        panel2.add(produsNameTF);

        JPanel panel3 = new JPanel();
        panel3.add(l3);
        panel3.add(produsQuantityTF);

        JPanel panel5 = new JPanel();
        panel5.add(l4);
        panel5.add(produsPriceTF);

        JPanel panel4 = new JPanel();
        panel4.add(updateProductByID2);
        panel4.add(home);

        p.add(panel1);
        p.add(panel2);
        p.add(panel3);
        p.add(panel5);
        p.add(panel4);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        frame3.setVisible(true);
        frame3.setContentPane(p);
    }

    public void UpdateProductByNameFrame() {

        JFrame frame3 = new JFrame("Update Product by ID");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(300, 400);
        JLabel l1 = new JLabel("ID:");
        JLabel l2 = new JLabel("Name:");
        JLabel l3 = new JLabel("Quantity:");
        JLabel l4 = new JLabel("Price:");

        JPanel p = new JPanel();

        JPanel panel1 = new JPanel();
        panel1.add(l1);
        panel1.add(produsIDTF);

        JPanel panel2 = new JPanel();
        panel2.add(l2);
        panel2.add(produsNameTF);

        JPanel panel3 = new JPanel();
        panel3.add(l3);
        panel3.add(produsQuantityTF);

        JPanel panel5 = new JPanel();
        panel5.add(l4);
        panel5.add(produsPriceTF);

        JPanel panel4 = new JPanel();
        panel4.add(updateProductByName2);
        panel4.add(home);

        p.add(panel1);
        p.add(panel2);
        p.add(panel3);
        p.add(panel5);
        p.add(panel4);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        frame3.setVisible(true);
        frame3.setContentPane(p);
    }

    public void UpdateProductByQuantityFrame() {

        JFrame frame3 = new JFrame("Update Product by Quantity");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(300, 400);
        JLabel l1 = new JLabel("ID:");
        JLabel l2 = new JLabel("Name:");
        JLabel l3 = new JLabel("Quantity:");
        JLabel l4 = new JLabel("Price:");

        JPanel p = new JPanel();

        JPanel panel1 = new JPanel();
        panel1.add(l1);
        panel1.add(produsIDTF);

        JPanel panel2 = new JPanel();
        panel2.add(l2);
        panel2.add(produsNameTF);

        JPanel panel3 = new JPanel();
        panel3.add(l3);
        panel3.add(produsQuantityTF);

        JPanel panel5 = new JPanel();
        panel5.add(l4);
        panel5.add(produsPriceTF);

        JPanel panel4 = new JPanel();
        panel4.add(updateProductByQuantity2);
        panel4.add(home);

        p.add(panel1);
        p.add(panel2);
        p.add(panel3);
        p.add(panel5);
        p.add(panel4);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        frame3.setVisible(true);
        frame3.setContentPane(p);
    }

    public void UpdateProductByPriceFrame() {

        JFrame frame3 = new JFrame("Update Product by price");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(300, 400);
        JLabel l1 = new JLabel("ID:");
        JLabel l2 = new JLabel("Name:");
        JLabel l3 = new JLabel("Quantity:");
        JLabel l4 = new JLabel("Price:");

        JPanel p = new JPanel();

        JPanel panel1 = new JPanel();
        panel1.add(l1);
        panel1.add(produsIDTF);

        JPanel panel2 = new JPanel();
        panel2.add(l2);
        panel2.add(produsNameTF);

        JPanel panel3 = new JPanel();
        panel3.add(l3);
        panel3.add(produsQuantityTF);

        JPanel panel5 = new JPanel();
        panel5.add(l4);
        panel5.add(produsPriceTF);

        JPanel panel4 = new JPanel();
        panel4.add(updateProductByPrice2);
        panel4.add(home);

        p.add(panel1);
        p.add(panel2);
        p.add(panel3);
        p.add(panel5);
        p.add(panel4);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        frame3.setVisible(true);
        frame3.setContentPane(p);
    }

    public void UpdateOrder() {

        JFrame frame3 = new JFrame("Update order");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(600, 400);
        JLabel l2 = new JLabel("Data");


        JPanel p = new JPanel();

        JPanel panel1 = new JPanel();
        panel1.add(l2);
        panel1.add(orderData);

        JPanel panel2 = new JPanel();
        panel2.add(updateOrderByID);


        p.add(panel1);
        p.add(panel2);

        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        frame3.setVisible(true);
        frame3.setContentPane(p);
    }

    public void UpdateOrderByID() {

        JFrame frame3 = new JFrame("Update order by Client  ID");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(300, 400);
        JLabel l2 = new JLabel("Client ID");
        JLabel l3 = new JLabel("Product ID");
        JLabel l4 = new JLabel("Price:");
        JLabel l5 = new JLabel("Quantity:");

        JPanel p = new JPanel();

        JPanel panel1 = new JPanel();
        panel1.add(l2);
        panel1.add(clientIDTF);

        JPanel panel2 = new JPanel();
        panel2.add(l3);
        panel2.add(productIDTF);

        JPanel panel3 = new JPanel();
        panel3.add(l4);
        panel3.add(priceTF);

        JPanel panel5 = new JPanel();
        panel5.add(l5);
        panel5.add(quantityTF);

        JPanel panel4 = new JPanel();
        panel4.add(updateOrderByID2);
        panel4.add(home);

        p.add(panel1);
        p.add(panel2);
        p.add(panel3);
        p.add(panel5);
        p.add(panel4);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        frame3.setVisible(true);
        frame3.setContentPane(p);
    }

    public void displayErrorMessage() {

        JFrame frame3 = new JFrame("Error message");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(100, 100);

        JPanel p = new JPanel();
        JLabel message = new JLabel("Not enough stocks");

        p.add(message);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        frame3.setVisible(true);
        frame3.setContentPane(p);


    }


    public void insertOrder() {

        JFrame frame3 = new JFrame("Insert order");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(300, 400);
        JLabel l2 = new JLabel("Client ID");
        JLabel l3 = new JLabel("Product ID");
        JLabel l4 = new JLabel("Price:");
        JLabel l5 = new JLabel("Quantity:");

        JPanel p = new JPanel();

        JPanel panel1 = new JPanel();
        panel1.add(l2);
        panel1.add(clientIDTF);

        JPanel panel2 = new JPanel();
        panel2.add(l3);
        panel2.add(productIDTF);


        JPanel panel5 = new JPanel();
        panel5.add(l5);
        panel5.add(quantityTF);

        JPanel panel4 = new JPanel();
        panel4.add(insertOrder2);
        panel4.add(home);

        JPanel panel6 = new JPanel();


        p.add(panel1);
        p.add(panel2);
        p.add(panel5);
        p.add(panel4);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        frame3.setVisible(true);
        frame3.setContentPane(p);
    }



    public String getValue1() {
        return clientSearchElement.getText();
   }
    public String getProdusSearchElement() {
        return produsSearchElement.getText();
    }
    public String getClientDeleteElement() {
        return clientDeleteElement.getText();
    }
    public String getOrderSearchValue() {
        return orderSearchElement.getText();
    }
    public String getProdusDeleteValue() {
        return produsDeleteElement.getText();
    }
    public String getOrdersDeleteElement() {
        return orderDeleteElement.getText();
    }

    public String getID() {
        return clientData3.getText();
    }

    public String getName() {
        return clientData1.getText();
    }

    public String getEmail() {
        return clientData2.getText();
    }

    public String getProdusValue1() {
        return produsData1.getText();
    }

    public String getProdusValue2() {
        return produsData2.getText();
    }

    public String getProdusValue3() {
        return produsData3.getText();
    }

    public String getProdusValue4() {
        return produsData4.getText();
    }

    public String getData() {
        return data.getText();
    }

    public Integer getIDUpdate() {
        return Integer.parseInt(IDTextField.getText());
    }

    public void setID(int id) {
        IDTextField.setText(String.valueOf(id));
    }

    public String getNewName() {
        return nameTextField.getText();
    }

    public void setClientName(String name) {
         nameTextField.setText(name);
    }

    public String getNewEmail() {
        return emailTextField.getText();
    }

    public void setEmail(String email) {
        emailTextField.setText(email);
    }

    public void setProdcutID(String id) {
        produsIDTF.setText(id);
    }

    public String getNewID() {
        return produsIDTF.getText();
    }

    public void setProductName(String name) {
        produsNameTF.setText(name);
    }

    public String getNewProductName() {
        return produsNameTF.getText();
    }

    public void setProductQuantity(String quantity) {
        produsQuantityTF.setText(quantity);
    }

    public String getNewQuantity() {
        return produsQuantityTF.getText();
    }

    public void setProductPrice(String price) {
        produsPriceTF.setText(price);
    }

    public String getNewProductPrice() {
        return produsPriceTF.getText();
    }

    public String getOrderData() {
        return orderData.getText();
    }

    public void setClientID(String id) {
        clientIDTF.setText(id);
    }

    public String getClientID() {
        return clientIDTF.getText();
    }

    public void setOrdersProductID(String id) {
        productIDTF.setText(id);
    }

    public String getOrdersProductID() {
        return productIDTF.getText();
    }
    //quantityTF priceTF
    public void setPriceOfOrder(String price) {
        priceTF.setText(price);
    }

    public String getOrderPrice() {
        return priceTF.getText();
    }

    public void setOrderQuantity(String quantity) {
        quantityTF.setText(quantity);
    }

    public String getOrderQuantity() {
        return quantityTF.getText();
    }



}
