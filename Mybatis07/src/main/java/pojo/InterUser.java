package pojo;

import Dao.User;

import java.util.List;
import java.util.Map;

public interface InterUser {
    List<User>getSelect();

    User selectId(Map<String,Object>map);

    int UpdateUser(Map<String,Object>map);

    int insertAdd(Map<String,Object>map);

    int DeleteUser(Map<String,Object>map);

    List<User>dimSelect(Map<String,Object>map);
}
