package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//@Transactional(rollbackFor = Exception.class)
@Service(value="baseService")
public class BaseServiceImpl implements BaseService {
    @Autowired
    private DataSource dataSource;

//    @Transactional(rollbackFor = Exception.class)
    @Override
    public int insert(Connection con, int id, String name) throws SQLException {
        final String SQL= "INSERT INTO TEST_USERS(USER_ID, USER_NM) VALUES (?, ?)"; //sql 쿼리

        PreparedStatement pstml = (PreparedStatement) con.prepareStatement(SQL);
        pstml.setInt(1, id); //1번째 물음표에 remark 삽입
        pstml.setString(2, name); //2번째 물음표에 remark 삽입
        return pstml.executeUpdate(); //쿼리실행 반환 값 삽입한 행의 개수
    }


//    @Transactional(rollbackFor = Exception.class)
    @Override
    public void test1() throws SQLException{
        final String SQL= "INSERT INTO TEST_USERS(USER_ID, USER_NM) VALUES (?, ?)"; //sql 쿼리

        Connection con = DataSourceUtils.getConnection(dataSource);

        PreparedStatement pstml = (PreparedStatement) con.prepareStatement(SQL);

        pstml.setInt(1, 4); //1번째 물음표에 remark 삽입
        pstml.setString(2, "또치"); //2번째 물음표에 remark 삽입
        System.out.println("before executeUpdate --- 1");
        pstml.executeUpdate(); //쿼리실행 반환 값 삽입한 행의 개수
        System.out.println("after executeUpdate --- 1");


        pstml.setInt(1, 4); //1번째 물음표에 remark 삽입
        pstml.setString(2, "또치"); //2번째 물음표에 remark 삽입
        System.out.println("before executeUpdate --- 2");
        pstml.executeUpdate(); //쿼리실행 반환 값 삽입한 행의 개수
        System.out.println("after executeUpdate --- 2");
    }

//    @Transactional(rollbackFor = Exception.class)
    @Override
    public void test2() throws SQLException{
        Connection con = DataSourceUtils.getConnection(dataSource);
        int num = insert(con, 4, "또치");
        System.out.println(num + "개 행 삽입 완료");

        num = insert(con, 4, "또치");
        System.out.println(num + "개 행 삽입 완료");
    }
}
