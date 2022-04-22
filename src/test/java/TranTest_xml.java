import com.BaseService;
import com.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/applicationContext_xml.xml")
public class TranTest_xml {
    @Autowired
    private DataSource ds;

    @Resource(name="testService")
    TestService testService;

    @Resource(name="baseService")
    BaseService baseService;

    @Test
    public void test() throws Exception{
        try{
            baseService.test2();
            System.out.println("testService.test 완료");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
