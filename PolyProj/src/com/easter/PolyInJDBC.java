package com.easter;

/**
 * 演示多态扩展性 -- JDBC DAO 模式
 */

class User{

}

interface UserInfoDao{
    void add(User user);
    void delete(User user);
}

// 假设原来使用 JDBC 连接
class GetUserInfoByJDBC implements UserInfoDao{

    @Override
    public void add(User user) {
        // 1. JDBC 建立连接
        // 2. sql 操作
        // 3. JDBC 断开连接
    }

    @Override
    public void delete(User user) {
        // 1. JDBC 建立连接
        // 2. sql 操作
        // 3. JDBC 断开连接
    }
}

// 后来改用 Hibernate 连接
class GetUserInfoByHibernate implements UserInfoDao{

    @Override
    public void add(User user) {
        // 1. Hibernate 建立连接
        // 2. sql 操作
        // 3. Hibernate 断开连接
    }

    @Override
    public void delete(User user) {
        // 1. Hibernate 建立连接
        // 2. sql 操作
        // 3. Hibernate 断开连接
    }
}


// 多态的写法 -- 通过 Dao 层对两种连接方式解耦
public class PolyInJDBC {
    public static void main(String[] args) {
        // 假设使用 JDBC
        UserInfoDao ui = new GetUserInfoByJDBC();

        // 假设使用 Hibernate
        UserInfoDao ui2 = new GetUserInfoByHibernate();

    }
}


