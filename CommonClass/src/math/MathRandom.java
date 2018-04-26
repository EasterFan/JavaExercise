package math;

import java.util.Random;

/**
 * Math 的random 随机数方法
 * 或使用 Random 方法 -- 省去强转,更方便一些
 */
public class MathRandom {
    public static void main(String[] args) {

        Random r = new Random();

        for(int i = 0;i<10;i++){
            // 生成[0,10)的随机数
            int s = r.nextInt(10);
            System.out.println(s);
        }

        for(int i = 0;i<10;i++){
            // 生成 0 - 1 的随机数
            Double d = Math.random();
            // 生成 1 - 10 的随机数
            int ss = (int)(Math.random()*10 + 1);
            System.out.println(ss);
        }
    }
}
