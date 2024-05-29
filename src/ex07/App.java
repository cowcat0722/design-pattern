package ex07;

import ex07.lib.DB;
import ex07.lib.Driver;

public class App {
    public static void main(String[] args) {
        DBFactory factory = DBFactory.getInstance();
        DB oracleDB = factory.createDB(Driver.ORACLE); // DB, MaraiDB
        oracleDB.execute("select");
    }
}