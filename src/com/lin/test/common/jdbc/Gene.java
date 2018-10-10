package com.lin.test.common.jdbc;

import com.lin.test.common.entity.UserVidBind;
import com.lin.test.common.utils.JdbcConnectionUtils;
import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.jdbc.PreparedStatement;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-09-20 15:17
 **/
public class Gene {
    private static int insert(UserVidBind student) {
        ConnectionImpl conn = JdbcConnectionUtils.getConn();
        int i = 0;
        String sql = "insert into user_vs_bind (user_id,vs_id) values(?,?)";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, student.getUserId().toString());
            pstmt.setString(2, student.getVidId());
            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    private static int update(UserVidBind student) {
        ConnectionImpl conn = JdbcConnectionUtils.getConn();
        int i = 0;
        String sql = "update user_vs_bind set vs_id = ? where user_id = ?";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, student.getVidId());
            pstmt.setString(2, student.getUserId().toString());
            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    private static List<UserVidBind> getAll() {
        List<UserVidBind> result = new ArrayList<>(5000);
        ConnectionImpl conn = JdbcConnectionUtils.getConn();
        String sql = "select * from user_vs_bind";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                UserVidBind userVidBind = new UserVidBind();
                userVidBind.setUserId(Long.parseLong(rs.getString("user_id")));
                userVidBind.setVidId(rs.getString("vs_id"));
                result.add(userVidBind);
                System.out.print(userVidBind.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        List<UserVidBind> all = getAll();
        int num = 1;
        for (UserVidBind userVidBind : all) {
            System.out.println(">>>>>>>>>>>>>>>>>" + num++);
            String userVidId =  userVidBind.getVidId();
            if(StringUtils.isEmpty(userVidId)) {
                UserVidBind vidBind = new UserVidBind();
                vidBind.setUserId(vidBind.getUserId());
                int count = 0;
                while (++count <= 3) {
                    userVidId = getNineRandomNum();
                    vidBind.setVidId(userVidId);
                    int update = update(userVidBind);
                    if(1 == update) {
                        break;
                    }
                }
                if (count > 3) {
                    System.out.println( " >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  " + vidBind.getUserId());
                }
            }
        }


    }

    public static String getNineRandomNum() {
        Integer size = Integer.parseInt(RandomStringUtils.random(1, "89"));
        String first = RandomStringUtils.random(1, "123456789");
        return first + RandomStringUtils.random(size, "0123456789");
    }

}
