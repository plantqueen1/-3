import Dao.User;
import pojo.InterUser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserTest {
    @Test
    public void getSelect(){
        SqlSession session = MybatisUser.session();
        InterUser mapper = session.getMapper(InterUser.class);
        List<User> select = mapper.getSelect();
        for (User user : select) {
            System.out.println(user);
        }
        session.close();
    }
    @Test
    public void selectId(){
        SqlSession session = MybatisUser.session();
        InterUser mapper = session.getMapper(InterUser.class);
       Map<String,Object>map1=new HashMap<String,Object>();
       map1.put("id",2);
        User user = mapper.selectId(map1);
        System.out.println(user);
        session.close();
    }
    @Test
    public void UpdateUser(){
        SqlSession session = MybatisUser.session();
        InterUser mapper = session.getMapper(InterUser.class);
        Map<String,Object>map1=new HashMap<String,Object>();
        map1.put("id",6);
        map1.put("name","水神");
        map1.put("money",34676587);
        int i = mapper.UpdateUser(map1);
        if (i>0){
            System.out.println("修改成功");
        }
        session.commit();
        session.close();
    }
    @Test
    public void insertAdd(){
        SqlSession session = MybatisUser.session();
        InterUser mapper = session.getMapper(InterUser.class);
        Map<String,Object>map1=new HashMap<String,Object>();
        map1.put("id",8);
        map1.put("name","火神");
        map1.put("money",387546856);
        int i = mapper.insertAdd(map1);
        if (i>0){
            System.out.println("插入成功");
        }
        session.commit();
        session.close();
    }
    @Test
    public void DeleteUser(){
        SqlSession session = MybatisUser.session();
        InterUser mapper = session.getMapper(InterUser.class);
        Map<String,Object>map1=new HashMap<String,Object>();
        map1.put("id",8);
        int i = mapper.DeleteUser(map1);
        if (i>0){
            System.out.println("删除成功");
        }
        session.commit();
        session.close();
    }
    @Test
    public void dimSelect(){
        SqlSession session = MybatisUser.session();
        InterUser mapper = session.getMapper(InterUser.class);
        Map<String,Object>map1=new HashMap<String,Object>();
        map1.put("map","杨__");
        List<User> users = mapper.dimSelect(map1);
        for (User user : users) {
            System.out.println(user);
        }
        session.close();
    }
}
