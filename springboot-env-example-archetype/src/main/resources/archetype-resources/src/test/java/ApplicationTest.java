#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Value("${symbol_dollar}{server.port}")
    private String port;

    @Value("${symbol_dollar}{spring.profiles.active}")
    private String profile;

    @Test
    public void port() {
        System.out.println(port);
    }

    @Test
    public void profile() {
        System.out.println(profile);
    }
}
