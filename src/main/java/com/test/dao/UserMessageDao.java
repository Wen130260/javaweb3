package com.test.dao;

import com.test.entity.UserMessage;
import com.test.util.DbUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
* 实现对USER_MESSAGE表进行操作的方法
 *
 * @author 李占文
 * */
public class UserMessageDao {
    /**
     * 查询USER_MESSAGE表中USER_NAME列包含指定数据的用户信息
     * @param userName 查询的用户姓名
     * @return 查询成功返回java.util.List类型的对象,否则发返回null
     * @throws Exception  用户查询异常
     * @author  李占文
     */
    public List<UserMessage> selectByUserName(String userName){
        //创建一个Select语句
        String sql = "select * from user_message where user_name like ? order by user_id desc";
        try(
                //加载数据库驱动并获得Connection对象
                Connection conn = DbUtil.getConnection();
                //获得PreparedStatement对象,并设置对象将要运行的Select对象
                PreparedStatement pstmt = conn.prepareStatement(sql);


                ){
            //替换Select语句中的问号
            pstmt.setString(1,"%" + userName + "%");
            //使用PreparedStatement对象执行Select语句,并将查询的结果存入到ResultSet中
            ResultSet set = pstmt.executeQuery();
            //创建List集合,用于保存ResultSet中的多行数据
            List<UserMessage> list = new ArrayList<UserMessage>();
            //声明UserMessage的变量
            UserMessage userMessage = null;
            //使用循环遍历ResultSet
            while(set.next()){
                //创建UserMessage的对象
                userMessage = new UserMessage();
                //将ResultSet当前行指定列的数据,设置UserMessage对象对应的属性中
                userMessage.setUserId(set.getInt("user_id"));
                userMessage.setUserName(set.getString("user_name"));
                userMessage.setUserGender(set.getString("user_gender"));
                userMessage.setUserEmail(set.getString("user_email"));
                userMessage.setUserPassword(set.getString("user_password"));
                userMessage.setUserRegDate(set.getDate("user_regdate"));
                list.add(userMessage);
            }

            //循环结束后,返回List集合
            return list;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        List<UserMessage> list = new UserMessageDao().selectByUserName("张");
        System.out.println(list);
    }
}