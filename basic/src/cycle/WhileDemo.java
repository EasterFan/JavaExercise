package cycle;

/**
 * 分两行循环输出26个字母
 *
 */


public class WhileDemo {
    public static void main(String[] args) {

        char n = 'a';
        int count = 1;   // 索引


        do {

            System.out.print(n);

            if (count == 13){
                System.out.println();
            }


            count++;
            n++;
        }while (n <= 'z');

    }
}
