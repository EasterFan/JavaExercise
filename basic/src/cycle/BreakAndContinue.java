package cycle; /**
 * continue 跳过当前循环 -- 1 + 3 + 5 + 7 + 9 =
 */

// 常见写法
/**public class cycle.BreakAndContinue {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=1;i<=10;i+=2){
            sum += i;
        }

        System.out.println(sum);
    }
}*/


// continue写法
public class BreakAndContinue{
    public static void main(String[] args) {

        int sum = 0;

        for(int i=1;i<=10;i++){
            if(i%2 == 0)continue;
            sum += i;

        }

        System.out.println(sum);
    }
}