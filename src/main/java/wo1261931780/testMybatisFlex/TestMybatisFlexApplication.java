package wo1261931780.testMybatisFlex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author junw
 */
@SpringBootApplication
@MapperScan("wo1261931780.testMybatisFlex.Mapper")
public class TestMybatisFlexApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestMybatisFlexApplication.class, args);
	}

}
