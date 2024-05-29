package ex07;

import ex07.lib.DB;
import ex07.lib.Driver;
import ex07.lib.MariaDB;
import ex07.lib.OracleDB;

public class DBFactory {

    // 싱글톤으로 구현
    private static DBFactory instance = new DBFactory();

    private DBFactory() {
    }

    public static DBFactory getInstance() {
        return instance;
    }

    // 책임 : new를 대신해준다.
    // 단점 : 새로운 DB가 들어오면 else if 문을 계속 생성해줘야한다. -> OCP를 위반한다.
    public DB createDB(Driver driver) { // protocol -> maria, oracle, mysql, mssql
        if (driver.getProtocol().equals("maria")) {
            MariaDB mariaDB = new MariaDB();
            mariaDB.setUrl("jdbc:mariadb://127.0.0.1:3306");
            return mariaDB;
        } else if (driver.getProtocol().equals("oracle")) {
            OracleDB oracleDB = new OracleDB();
            oracleDB.setUrl("jdbc:oracle:thin://127.0.0.1:8080");
            return oracleDB;
        } else {
            throw new NullPointerException("db driver not found exception");
        }
    }
}
