package com.easter.test;


import com.easter.model.Student;
import com.easter.model.Subject;

public class schooltest {
    public static void main(String args[]){
        // 测试subject
        Subject mis = new Subject("信息管理与信息系统","I005",4);

        String intro = mis.info();
        System.out.print(intro);
        System.out.print("\n====================\n");

        // 测试学生类
        Student easter = new Student("easter",1234,"男",22,mis);
        Student south = new Student("south",1235,"女",23,mis);
        Student wester = new Student("wester",1236,"男",21,mis);


        String eInfo = easter.stuInfo("信息管理与信息系统",4);
        String sInfo = south.stuInfo(mis);
        String wInfo = wester.stuInfo();



        System.out.print(eInfo);
        System.out.print("\n====================\n");
        System.out.print(sInfo);
        System.out.print("\n====================\n");
        System.out.print(wInfo);
        System.out.print("\n====================\n");


        // 测试专业学生人数
        mis.addStudent(easter);
        mis.addStudent(south);
        mis.addStudent(wester);
        System.out.print("报名"+mis.getSubname()+"的学生有"+mis.getStuNum()+"人");

    }
}
