package com;

import java.sql.Connection;
import java.sql.SQLException;

public interface BaseService {
    public int insert(Connection con, int id, String name) throws SQLException;
    public void test1() throws SQLException;
    public void test2() throws SQLException;
}
