import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * 使用HashMap对商品信息进行管理
 * 其中key为商品编号,value为商品对象
 * 对HashMap中的商品信息进行增、删、改、查操作
 *
 * 容错处理：
 * 1.商品编号唯一，用户输入相同编号提示
 * 2.price为double类型，用户输入字符的异常处理
 *
 */
public class MapGoodsTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // 定义HashMap对象,key为id，value为MapGoods类
        Map<String,MapGoods> goodsMap = new HashMap<>();

        // 1.添加商品
        System.out.println("请输入三条商品记录");
        int i = 0;
        while(i < 3){
            System.out.println("请输入第" +(i+1) + "条商品信息");
            System.out.println("请输入商品编号：");
            String goodId = console.next();
            // 编号唯一的判断
            if(goodsMap.containsKey(goodId)){
                System.out.println("该商品已经存在！请重新输入！");
                continue;
            }
            System.out.println("请输入商品名称：");
            String goodName = console.next();
            System.out.println("请输入商品价格：");

            Double goodPrice = 0.0;
            try {
                 goodPrice = console.nextDouble();
                 if(goodPrice <= 0.0){
                     System.out.println("商品价格格式不正确，请输入正数");
                     console.next();
                     continue;
                 }
            }catch (java.util.InputMismatchException e){
                System.out.println("商品价格格式不正确，请输入数值型数据");
                // 接收这个错误数据，否则会传到下个循环的商品编号中
                console.next();
                continue;
            }
            // new一个MapGoods对象，并存到Map中
            MapGoods goods = new MapGoods(goodId,goodName,goodPrice);
            goodsMap.put(goodId,goods);
            i++;
        }

        // 2. 显示所有商品信息
        Iterator<MapGoods> goodsIt = goodsMap.values().iterator();
        while (goodsIt.hasNext()){
            System.out.println(goodsIt.next());
        }

        // 3. 通过编号查找商品信息
        System.out.println("**************************");
        System.out.println("输入你要查找的商品编号");
        String search = console.next();
        if(goodsMap.containsKey(search)){
            System.out.println("已找到商品:"+goodsMap.get(search).toString());
        }else {
            System.out.println("没有找到商品");
        }

        // 4. 删除--通过编号删除商品信息
        System.out.println("**************************");
        System.out.println("输入你要删除的商品编号");
        String del = console.next();
        if(goodsMap.containsKey(del)){
            System.out.println("删除商品:"+goodsMap.remove(del));

            Iterator<MapGoods> goodsIt2 = goodsMap.values().iterator();
            while (goodsIt2.hasNext()){
                System.out.println(goodsIt2.next());
            }
        }else {
            System.out.println("没有此商品记录，删除失败");
        }

    }
}
