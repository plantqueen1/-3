package luo.pojo;

import luo.dao.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapperUserlmpl implements MapperUser {
public SqlSessionTemplate session;

    public void setSession(SqlSessionTemplate session) {
        this.session = session;
    }



    @Override
    public List<User> getSelect() {
        MapperUser mapper = session.getMapper(MapperUser.class);
        return mapper.getSelect();
    }
}
