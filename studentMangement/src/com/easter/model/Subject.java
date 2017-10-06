package com.easter.model;

/**
 * 专业类
 */
public class Subject {
    //成员属性，学科名称，学科编号，学科年限，学生数组，学生人数
    private String subname;
    private String subnum;
    private int schoolyear;
    private Student[] mystudent;
    private int stuNum;

    // 无参构造函数
    public Subject(){

    }

    // 有参构造函数--使用方法传参可以添加逻辑处理
    public Subject(String subname,String subnum,int schoolyear){
        this.setSubname(subname);
        this.setSubnum(subnum);
        this.setSchoolyear(schoolyear);
    }

    public Subject(String subname,String subnum,int schoolyear,Student[] mystudent,int stuNum){
        this.setSubname(subname);
        this.setSubnum(subnum);
        this.setSchoolyear(schoolyear);
        this.setMystudent(mystudent);
        this.setStuNum(stuNum);
    }


    // 属性的对外接口
    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public String getSubnum() {
        return subnum;
    }

    public void setSubnum(String subnum) {
        this.subnum = subnum;
    }

    public int getSchoolyear() {
        return schoolyear;
    }

    // 业务逻辑：学年为正整数
    public void setSchoolyear(int schoolyear) {
        if(schoolyear<=0)
            return;
        this.schoolyear = schoolyear;
    }

    // 业务逻辑：学生数组若没有初始化，先初始化为200
    public Student[] getMystudent() {
        if(this.mystudent==null)
            this.mystudent = new Student[200];
        return mystudent;
    }

    public void setMystudent(Student[] mystudent) {
        this.mystudent = mystudent;
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    /**
     * 专业介绍的方法
     * @return 专业名称/编号/年限
     */
    public String info(){
        String str = "专业信息如下：\n专业名称："+this.getSubname()+"\n专业编号："+this.getSubnum()
                +"\n专业学年："+this.getSchoolyear();
        return str;
    }

    /**
     * 1.把学生加入到数组中
     * 2.把数组长度赋给stuNum
     * @param mystudent
     */
    public void addStudent(Student mystudent){
        int i;
        for(i=0;i<this.getMystudent().length;i++){
            // 1.把学生加入到数组中
            if(this.getMystudent()[i]==null){
                this.getMystudent()[i] = mystudent;
                // 2. 把数组长度赋给stuNum
                this.setStuNum(i+1);
                return;
            }
        }

    }


}
