/**
 * 一个场景: 老师 课程延期异常, 电脑 蓝屏异常, 冒烟异常
 */

/**
 * 电脑蓝屏异常
 */
class BlueScreenException extends Exception{
    BlueScreenException(String msg){
        super(msg);
    }
}

/**
 * 电脑冒烟异常
 */
class SmokeException extends Exception{
    SmokeException(String msg){
        super(msg);
    }
}

/**
 * 老师课程延期异常
 */
class TeacherPlanDelayException extends Exception{
    TeacherPlanDelayException(String msg){
        super(msg);
    }
}

/**
 * 老师类
 */
class Teacher{
    private String name;
    private Computer computer;

    Teacher(String name){
        this.name = name;
        // 每个老师生来就有一台电脑
        this.computer = new Computer();
    }

    /**
     * 不要直接抛出冒烟异常, 老师调用speak方法后,也无法处理电脑冒烟异常
     * 老师应该抛出自己定义的异常 -- 使老师在调用 speak 时能够处理该异常
     * @throws TeacherPlanDelayException
     */
    void speak() throws TeacherPlanDelayException{

        try {
            computer.run();
        } catch (BlueScreenException e) {
            computer.reset();
        } catch (SmokeException e) {

            // 电脑冒烟,先让学生自习
            selfRead();
            // 老师课程无法按时完成, 抛出异常和原因
            throw new TeacherPlanDelayException("老师课程延期>>"+e.getMessage());
        }

        System.out.println("老师讲课");
    }

    void selfRead(){
        System.out.println("让学生自习");
    }
}

/**
 * 电脑类
 */
class Computer{
    private int state = 3;

    void run() throws BlueScreenException,SmokeException{
        if(state == 1) {
            System.out.println("电脑运行");
        }else if(state == 2){
            throw new BlueScreenException("电脑蓝屏了");
        }else if(state == 3){
            throw new SmokeException("电脑冒烟了");
        }
    }

    void reset(){
        System.out.println("电脑重启");
        state = 1;
    }
}


/**
 * 测试用例
 */
public class _08_TeacherExceptionTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("teacher");

        try {
            teacher.speak();
        } catch (TeacherPlanDelayException e) {
            // 了解异常原因
            System.out.println("老师延期的原因:"+e.getMessage());

            // 解决方法
            System.out.println("解决方法: "+"换老师或者学生放假");
        }
    }
}
