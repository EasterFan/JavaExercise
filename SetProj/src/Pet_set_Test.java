import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set集存储自定义类
 * 将tom和jerry放入homeset集中
 */
public class Pet_set_Test {
    public static void main(String args[]){
        // 定义对象
        Pet_set Tom = new Pet_set("Tom",12,"cat");
        Pet_set Jerry = new Pet_set("Jerry",12,"mouse");

        Set<Pet_set> homeSet = new HashSet<>();

        // 增
        homeSet.add(Tom);
        homeSet.add(Jerry);

        // 显示
//        Iterator it = homeSet.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }


        // 添加一个相同的tom，自定义类不作处理，能放入set中

        Pet_set Tom1 = new Pet_set("Tom",12,"cat");
        homeSet.add(Tom1);

        Iterator<Pet_set> it = homeSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // 查：查找集合中是否存在
        if(homeSet.contains(Tom)){
            System.out.println("Tom 在集合中");
            System.out.println(Tom);
        }else {
            System.out.println("Tom不在集合中");
        }

        // 查：根据姓名查找
        boolean flag = false;
        Pet_set tomm = null;
        it = homeSet.iterator();

        while (it.hasNext()){
            tomm = it.next();
            if(tomm.getName().equals("Tom")){
                flag = true;
                break;
            }
        }

        if (flag){
            System.out.println("Tom在集合中");
            System.out.println(tomm);
        }else {
            System.out.println("Tom不不在集合中");
        }

        // 删--删除名为tom的信息--增强型for循环

        for(Pet_set pp : homeSet){
            if("Tom".equals(pp.getName())){
                homeSet.remove(pp);
            }

        }
        it = homeSet.iterator();
        while (it.hasNext()){
            Pet_set qq = it.next();
            if ("Tom".equals(qq.getName())){
                homeSet.remove(qq);
                break;
            }
        }
        System.out.println(homeSet+"删除tom");

        // 删除所有
//        homeSet.remove(homeSet);
//        if(homeSet.isEmpty()){
//            System.out.println("全部删除");
//        }else {
//            System.out.println("全部删除失败");
//        }

        // 关于删除多个元素的操作：删除年龄13以下的元素

        Set<Pet_set> delSet = new HashSet<Pet_set>();
        Iterator<Pet_set> itdel = homeSet.iterator();

        while (itdel.hasNext()){
            Pet_set ppdel = itdel.next();
            if(ppdel.getAge()<13){
                delSet.add(ppdel);
            }
        }

        homeSet.removeAll(delSet);
        System.out.println("是否删除"+homeSet.isEmpty());
    }
}
