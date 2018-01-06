package function;

/**
 * 可变参数列表实现累加和查找功能
 */
public class ArgsChange {

    // 累加
    public void add(int... n){
        int sum = 0;
        for(int i : n){
            sum += i;
        }

        System.out.println("总和" + sum);
    }


    // 查找
    public void search(int n, int... a){

        boolean flag = false;

        for (int a1 : a){
            if(a1 == n){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("找到了" + n);
        }else {
            System.out.println("没找到" + n);
        }

    }


    public static void main(String[] args) {
        ArgsChange ac = new ArgsChange();
        int arr[] = {6,7,8,9,10};

        ac.add(1,2,3,4,5);

        ac.search(3,1,2,3,4,5);
        //可变参数列表和数组兼容, 将数组传递到可变参数列表中
        ac.search(8,arr);

    }
}
