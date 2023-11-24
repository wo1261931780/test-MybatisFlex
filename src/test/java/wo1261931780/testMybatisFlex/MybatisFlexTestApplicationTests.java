package wo1261931780.testMybatisFlex;


import com.mybatisflex.core.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import wo1261931780.testMybatisFlex.dto.Account;
import wo1261931780.testMybatisFlex.mapper.AccountMapper;

import static wo1261931780.testMybatisFlex.dto.table.AccountTableDef.ACCOUNT;

/**
 * Created by Intellij IDEA.
 * Project:test-MybatisFlex
 * Package:wo1261931780.testMybatisFlex
 *
 * @author liujiajun_junw
 * @Date 2023-11-12-45  星期四
 * @Description
 */
@SpringBootTest
@Slf4j
class MybatisFlexTestApplicationTests {

	@Autowired
	private AccountMapper accountMapper;

	@Test
	void contextLoads() {
		QueryWrapper queryWrapper = QueryWrapper.create()
				.select()
				.where(ACCOUNT.AGE.eq(18));// 找不到常量
		// MyBatis-Flex 使用了 APT（Annotation Processing Tool）技术，
		// 在项目编译的时候，会自动根据 Entity 类定义的字段帮你生成 "ACCOUNT" 类以及 Entity 对应的 Mapper 类，
		// 通过开发工具构建项目（如下图），或者执行 maven 编译命令: mvn clean package 都可以自动生成。这个原理和 lombok 一致。
		// 参考网址：https://mybatis-flex.com/zh/others/apt.html
		Account account = accountMapper.selectOneByQuery(queryWrapper);
		log.info(String.valueOf(account));
	}

}
