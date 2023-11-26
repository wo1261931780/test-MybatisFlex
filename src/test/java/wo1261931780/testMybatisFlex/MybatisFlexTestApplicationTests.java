package wo1261931780.testMybatisFlex;


import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.update.UpdateWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import wo1261931780.testMybatisFlex.domain.TbAccount;
import wo1261931780.testMybatisFlex.mapper.TbAccountMapper;

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
	private TbAccountMapper accountMapper;

	@Test
	void contextLoads() {
		QueryWrapper queryWrapper = QueryWrapper.create()
				.select().like(TbAccount.COL_ID, 1L);
				// .where(TBACCOUNT.AGE);// 找不到常量
		// MyBatis-Flex 使用了 APT（Annotation Processing Tool）技术，
		// 在项目编译的时候，会自动根据 Entity 类定义的字段帮你生成 "ACCOUNT" 类以及 Entity 对应的 Mapper 类，
		// 通过开发工具构建项目（如下图），或者执行 maven 编译命令: mvn clean package 都可以自动生成。这个原理和 lombok 一致。
		// 参考网址：https://mybatis-flex.com/zh/others/apt.html
		TbAccount account = accountMapper.selectOneByQuery(queryWrapper);
		log.info(String.valueOf(account));
	}
	@Test
	void testInsert(){
		TbAccount account = new TbAccount();
		account.setUserName("liujiajun");
		account.setAge(18);
		// account.setBirthday(null);
		TbAccount entity = UpdateWrapper.of(account).setRaw(TbAccount::getBirthday, "now()").toEntity();
		accountMapper.insert(entity);
	}
	@Test
	void deleteOne(){
		// QueryWrapper queryWrapper = QueryWrapper.create();
		// queryWrapper.where(TbAccount.COL_ID.ge(1L));
		// accountMapper.deleteByQuery(queryWrapper);
		accountMapper.deleteById(1L);
	}

}
