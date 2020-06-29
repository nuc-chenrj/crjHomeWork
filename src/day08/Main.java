package day08;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("----------学员管理系统----------");
        System.out.println("1.添加学生信息");
        System.out.println("2.查询所有学生信息,将学生信息放入集合中");
        System.out.println("3.删除指定学生信息");
        System.out.println("4.修改指定学生学生信息");
        System.out.println("5.退出");
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("输入你的选项:");
            int op=sc.nextInt();
            if(op==5)break;
            else{
                Connection conn=DBUtils.getConnectionByDataSource();
                System.out.println(conn);
                if(op==1){
                    System.out.println("分别输入学号,姓名,年龄");
                    int id=sc.nextInt();
                    String name=sc.next();
                    int age=sc.nextInt();
//                    System.out.println(id+name);
                    String sql_insert="insert into student values(?,?,?)";
                    PreparedStatement ps=conn.prepareStatement(sql_insert);
                    ps.setInt(1,id);
                    ps.setString(2,name);
                    ps.setInt(3,age);
                    int rs=ps.executeUpdate();
                    if(rs>0){
                        System.out.println("添加成功");
                    }else{
                        System.out.println("添加失败");
                    }
                } else if(op==2){
                    ArrayList<Student> arrayList=new ArrayList<>();
                    Statement statement= conn.createStatement();
                    String sql="select * from student";
                    ResultSet rs=statement.executeQuery(sql);
                    while(rs.next()){
                        Student student=new Student();
                        student.setId(rs.getInt(1));
                        student.setName(rs.getString(2));
                        student.setAge(rs.getInt(3));
                        arrayList.add(student);
                        System.out.println(student.toString());
                    }
                    System.out.println("集合打印");
                    System.out.println(arrayList.toString());
                }else if(op==3){
                    System.out.println("输入要删除学生的学号");
                    int id=sc.nextInt();
                    String sql_select="delete from student where id=?";
                    PreparedStatement ps=conn.prepareStatement(sql_select);
                    ps.setInt(1,id);
                    int rs=ps.executeUpdate();
                    if(rs>0){
                        System.out.println("删除成功");
                    }else{
                        System.out.println("删除失败");
                    }
                }else{
                    System.out.println("输入要修改学生的学号和年龄");
                    int id=sc.nextInt();
                    int age=sc.nextInt();
                    String sql_update="update student set age=? where id=?";
                    PreparedStatement ps=conn.prepareStatement(sql_update);
                    ps.setInt(1,age);
                    ps.setInt(2,id);
                    int rs=ps.executeUpdate();
                    if(rs>0){
                        System.out.println("修改成功");
                    }else{
                        System.out.println("修改失败");
                    }
                }
            }
        }

    }
}
