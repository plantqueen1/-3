package Dao;

public class User {
    public int id1;
    public String name;
    public int money;

    public User() {
    }

    public User(int id1, String name, int money) {
        this.id1 = id1;
        this.name = name;
        this.money = money;
    }

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "id1=" + id1 +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
