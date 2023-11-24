package wo1261931780.testMybatisFlex.dto;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import lombok.Data;

import java.util.Date;

/**
 * Created by Intellij IDEA.
 * Project:test-MybatisFlex
 * Package:wo1261931780.testMybatisFlex.DTO
 *
 * @author liujiajun_junw
 * @Date 2023-11-12-44  星期四
 * @Description
 */
@Data
@Table("tb_account")
public class Account {

	@Id(keyType = KeyType.Auto)
	private Long id;
	private String userName;
	private Integer age;
	private Date birthday;

}
