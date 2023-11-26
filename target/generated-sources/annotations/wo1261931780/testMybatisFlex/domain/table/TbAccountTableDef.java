package wo1261931780.testMybatisFlex.domain.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class TbAccountTableDef extends TableDef {

    /**
     * Created by Intellij IDEA.
Project:test-MybatisFlex
Package:wo1261931780.testMybatisFlex.domain
@author liujiajun_junw
@Date 2023-11-21-00  星期日
@Description
     */
    public static final TbAccountTableDef TB_ACCOUNT = new TbAccountTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn AGE = new QueryColumn(this, "age");

    public final QueryColumn BIRTHDAY = new QueryColumn(this, "birthday");

    public final QueryColumn USER_NAME = new QueryColumn(this, "user_name");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, AGE, BIRTHDAY, USER_NAME};

    public TbAccountTableDef() {
        super("test_technical", "tb_account");
    }

}
