package bll;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import bll.validators.EmailValidator;
import bll.validators.Validator;
import dao.ClientDAO;
import Model.Client;

/**
 * Metodele acestei clase se folosesc de obiectul ClientDAO prin care se apeleaza metodele din clasa respectiva.
 * Clasa are ca și câmpuri o listă de validatori, și un obiect de ClientDAO.
 * Clasa are metodele menționate și în clientDAO. În plus, metodele din ClientBLL verifică cu validatorii
 * clienții care au fost inserați/modificați.
 */


public class ClientBLL {

    private List<Validator<Client>> validators;
    private ClientDAO clientDAO;

    public ClientBLL() {
        validators = new ArrayList<Validator<Client>>();
        validators.add(new EmailValidator());

        clientDAO = new ClientDAO();
    }

    public Client findClientById(int id) {
        Client client = clientDAO.findById(id);
        if (client == null) {
            throw new NoSuchElementException("The client with id =" + id + " was not found!");
        }
        return client;
    }


    public List<Client> findAll(){
        ClientDAO dao = new ClientDAO();
        List<Client> result = dao.findAll();
        return result;

    }

    public List<Client> findByName(String name) {
        ClientDAO dao = new ClientDAO();
        List<Client> result = dao.findByName(name);
        if (result == null) {
            throw new NoSuchElementException("The student with name =" + name + " was not found!");
        }
        return result;
    }

    public List<Client> findByEmail(String email) {
        ClientDAO dao = new ClientDAO();
        Client c = dao.findByEmail(email);
        List<Client> result = new ArrayList<>();
        result.add(c);
        return result;
    }

    public void deleteByID(int id) {
        ClientDAO dao = new ClientDAO();
        dao.delete("ID", id);
    }

    public void deleteByName(String name) {
        ClientDAO dao = new ClientDAO();
        dao.deleteByNameOrMail("name", name);
    }

    public void deleteByMail(String email) {
        ClientDAO dao = new ClientDAO();
        dao.deleteByNameOrMail("email", email);
    }

    public void insert(String name, String email) {
        Client client = new Client(name, email);
        for (Validator<Client> v : validators) {
            v.validate(client);
        }
        clientDAO.insert(name,email);
    }

    public void updateByID(int value, String name, String email) {
        Client client = new Client(name, email);
        for (Validator<Client> v : validators) {
            v.validate(client);
        }
        clientDAO.updateByID("ID", value, name,email);
    }

    public void updateByName(String value, String name, String email) {
        Client client = new Client(name, email);
        for (Validator<Client> v : validators) {
            v.validate(client);
        }
        clientDAO.updateByNameOrEmail("name", value, name,email);
    }

    public void updateByEmail(String value, String name, String email) {
        Client client = new Client(name, email);
        for (Validator<Client> v : validators) {
            v.validate(client);
        }
        clientDAO.updateByNameOrEmail("email", value, name,email);
    }




}
