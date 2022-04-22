package com;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

//@Transactional(rollbackFor = Exception.class)
@Service(value="testService")
public class TestServiceImpl extends BaseServiceImpl implements TestService{

    //@Transactional(rollbackFor = Exception.class)
//    @Override
//    public void test2() throws SQLException{
//        super.test2();
//    }
}
