package wo1261931780.testMybatisFlex;

/**
 * Created by Intellij IDEA.
 * Project:test-MybatisFlex
 * Package:wo1261931780.testMybatisFlex
 *
 * @author liujiajun_junw
 * @Date 2023-11-12-45  星期四
 * @Description
 */
import com.mybatisflex.core.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import wo1261931780.testMybatisFlex.DTO.Account;
import wo1261931780.testMybatisFlex.Mapper.AccountMapper;

import static wo1261931780.testMybatisFlex.DTO.table.AccountTableDef.ACCOUNT;


@SpringBootTest
class MybatisFlexTestApplicationTests {

	@Autowired
	private AccountMapper accountMapper;

	@Test
	void contextLoads() {
		QueryWrapper queryWrapper = QueryWrapper.create()
				.select()
				.where(ACCOUNT.AGE.eq(18));// 找不到常量
		Account account = accountMapper.selectOneByQuery(queryWrapper);
		System.out.println(account);
	}

}
