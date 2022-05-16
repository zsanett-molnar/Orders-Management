package dao;
import Model.Client;
import dao.AbstractDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import Connection.ConnectionFactory;

/**
 Această clasă conține operațiile de baza specifice unui client (findByName, findByEmail, deleteByNameOrMail, insert, updateByID, updateByNameOrMail).
 Pe lângă aceste metode, se regăsesc și metodele care creează interogările de SELECT, INSERT și UPDATE.
 */


public class ClientDAO extends AbstractDAO<Client> {

    /**
     Această metodă returnează o listă de clienți care au numele dat ca și argument.
     Prima dată se realizează conexiunea la baza de date, se creează un statement de SELECT,
     și dacă rezultatul nu e null, acesta se returnează.
     */

    public List<Client> findByName(String name) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String query = createSelectQuery("name");
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            statement.setString(1, name);
            resultSet = statement.executeQuery();

            return createObjects(resultSet);
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, getType().getName() + "DAO:findById " + e.getMessage());
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return null;
    }

    /**
     *Această metodă returnează clientul care are emailul dat ca și argument.
     *  Prima dată se realizează conexiunea la baza de date, se creează un statement de SELECT,
     * și dacă rezultatul nu e null, acesta se returnează
     */

    public Client findByEmail(String email) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String query = createSelectQuery("email");
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            statement.setString(1, email);
            resultSet = statement.executeQuery();

            return createObjects(resultSet).get(0);
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, getType().getName() + "DAO:findById " + e.getMessage());
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return null;
    }

    /**
     Această metodă se folosește atât la ștergerea clienților după nume, cât și la ștergerea după email.
     Metoda realizează ștergerea unui client, care are un câmp (field) cu valoarea primită ca și argument (value).
     */

    public void deleteByNameOrMail(String field, String value) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String query = createDeleteQuery(field);
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            statement.setString(1, value);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
    }

    private String createInsertQuery() {
        String sb = "INSERT INTO client (name, email) VALUES (?, ?)";
        return sb;
    }

    /**
     Această metodă inserează un client în baza de date, cu numele și mailul primit ca și argument.
     ID-ul nu trebuie introdus de către utilizator, deoarece acela se auto-incrementează în baza de date.
     În metodă, prima dată se realizează conexiunea la baza de date, se creează un statement de INSERT cu
     metoda createInsertStatement(), și dacă clientul inserat nu e null, acesta se returnează
     */

    public Client insert(String name, String email) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String query = createInsertQuery();
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            statement.setString(1, name);
            statement.setString(2, email);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return null;
    }

    private String createUpdateQuery(String field) {
        String sb = "UPDATE client SET name=?, email=? WHERE " + field + "=?";
        return sb;
    }

    /**
     Această metodă modifică un client, care are câmpul field cu valoarea value în baza de date.
     Acest client primește valorile din argument. ID-ul nu trebuie introdus de către utilizator,
     deoarece acela se auto-incrementează în baza de date. În metodă, prima dată se realizează conexiunea la baza de date,
     se creează un statement de UPDATE cu metoda createInsertStatement(), și dacă clientul inserat nu e null, acesta se returnează.
     */

    public Client updateByID(String field, Integer value, String name, String email) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String query = createUpdateQuery(field);
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            statement.setString(1, name);
            statement.setString(2, email);
            statement.setInt(3, value);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return null;
    }

    public Client updateByNameOrEmail(String field, String value, String name, String email) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String query = createUpdateQuery(field);
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            statement.setString(1, name);
            statement.setString(2, email);
            statement.setString(3, value);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return null;
    }



}
