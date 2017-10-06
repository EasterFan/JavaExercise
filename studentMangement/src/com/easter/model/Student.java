package com.easter.model;

public class Student {
    private String sname;
    private int sno;
    private String sex;
    private int age;
    private Subject subject;

    public Student(){

    }

    public Student(String name,int sno,String sex,int age,Subject subject){
        this.setSname(name);
        this.setSno(sno);
        this.setSex(sex);
        this.setAge(age);
        this.setSubject(subject);
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSex() {
        return sex;
    }


	// 业务逻辑：性别如果非男非女，设置为错
    public void setSex(String sex) {
        if(sex.equals("男") || sex.equals("女"))
            this.sex = sex;
        else
            this.sex = "错";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0 || age > 100)
            this.age = 0;
        else
            this.age = age;
    }

    /**
     * 方法三中获取的专业对象，获取前先判断有没有实例化，先实例化再返回
     * @return
     */
    public Subject getSubject() {
        if(this.subject == null)
            this.subject = new Subject();
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    /**
     * 方法一：传入两个参数，输出学生所有信息
     * @param SubjectName
     * @param SubjectYear
     * @return
     */
    public String stuInfo(String SubjectName,int SubjectYear){
        String str = "学生信息如下：\n姓名："+this.getSname()+"\n学号："+this.getSno()+"\n性别："+this.getSex()
                +"\n年龄："+this.getAge()+"\n专业名称："+SubjectName+"\n专业学年："+SubjectYear;
        return str;
    }


    /**
     * 方法二：将对象作为参数，输出学生所有信息
     * @param subject
     * @return
     */
    public String stuInfo(Subject subject){
        String str = "学生信息如下：\n姓名："+this.getSname()+"\n学号："+this.getSno()+"\n性别："+this.getSex()+"\n年龄："
                +this.getAge()+"\n专业名称："+subject.getSubname()+"\n专业学年："+subject.getSchoolyear();
        return str;
    }

    /**
     * 方法三：将对象作为成员变量，输出学生所有信息
     * @return
     */
    public String stuInfo(){
        String str = "学生信息如下：\n姓名："+this.getSname()+"\n学号："+this.getSno()+"\n性别："+this.getSex()
                +"\n年龄："+this.getAge()+"\n专业名称："+this.getSubject().getSubname()+"\n专业学年："
                +this.getSubject().getSchoolyear();
        return str;
    }

}
