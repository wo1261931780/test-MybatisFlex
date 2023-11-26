package wo1261931780.testMybatisFlex.controller;

import jakarta.annotation.Resource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wo1261931780.testMybatisFlex.domain.TbAccount;
import wo1261931780.testMybatisFlex.mapper.TbAccountMapper;

import java.util.Date;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:test-MybatisFlex
 * Package:wo1261931780.testMybatisFlex.controller
 *
 * @author liujiajun_junw
 * @Date 2023-11-21-18  星期日
 * @Description
 */
@RestController
public class demoController {

	@Resource
	private TbAccountMapper tbAccountMapper;


	@GetMapping("/")
	List<TbAccount> index() {
		return tbAccountMapper.selectAll();
	}


	@GetMapping("/save")
	@Transactional(rollbackFor = Exception.class)
	public void save() {
		TbAccount account2 = new TbAccount();
		account2.setUserName("用户");
		account2.setAge(1);
		account2.setBirthday(new Date());
		tbAccountMapper.insert(account2);
	}
}
