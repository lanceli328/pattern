package com.lance.pattern.Creational.objectPool;

import java.sql.Connection;
import org.junit.Test;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@seczone.cn
 */
public class Tests {

  @Test
  public void test(){
    // Create the ConnectionPool:
    JDBCConnectionPool pool = new JDBCConnectionPool(
        "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
        "sa", "secret");

    // Get a connection:
    Connection con = pool.checkOut();

    // Return the connection:
    pool.checkIn(con);
  }
}
