package function;

/**
 * 引用数据类型,传递参数后,普通函数的修改会影响主函数中引用数据类型的值
 */

public class ArrChangeArge {

    // 显示数组
    public void show(int arr[]){
        for(int i : arr){
            System.out.print(i+"   ");
        }
    }

    // 更新数组
    public void update(int arr[]){
        arr[0] = 11;

        System.out.println("\n普通方法:更新后的数组");
        show(arr);
    }


    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};

        ArrChangeArge ac = new ArrChangeArge();

        // 打印原始数组
        System.out.println("主方法: 原始数组");
        ac.show(arr);

        // 数组的参数传值
        ac.update(arr);

        // 打印更新后数组比对
        System.out.println("\n主方法: 更新后数组");
        ac.show(arr);

    }
}
