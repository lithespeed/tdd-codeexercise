package main.com.bankapp;

import java.util.List;

public class AccountDao {

    private DBConnection dbConnection;

    public List<Double> getTransactions() {
        // open db connection
        // read data from SQlServer
        // close connection
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    public Account getUserAccount(String userName) throws DBException {
        DBConnection connection = getDBConnection();
        if (connection.getConnection() == null) {
            throw new DBException();
        } else {
            System.out.println("Do nothing");
        }
        return new Account();
    }

    public void setDBConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    private DBConnection getDBConnection() {
        return this.dbConnection;
    }}
