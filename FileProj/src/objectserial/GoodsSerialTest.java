package objectserial;

import java.io.*;

/**
 * 对象先写后读
 */

public class GoodsSerialTest {
    public static void main(String[] args) {

        Goods goods = new Goods("12","可乐",3.5);

        try {

            // 写入对象
            FileOutputStream fos = new FileOutputStream("object.md");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // 读对象
            FileInputStream fis = new FileInputStream("object.md");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // 将对象写入object.md之后打开看是乱码，要显示出来，需要读一遍
            oos.writeObject(goods);

            // 立一个flag，先写先读，后写后读
            oos.writeBoolean(true);
            oos.flush();

            //  读对象
            try {
                // readObject返回的是Object，需向下转型
                Goods goods1 = (Goods) ois.readObject();
                System.out.println(goods1);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            // readBoolean在readObject之后
            System.out.println(ois.readBoolean());

            fos.close();
            fis.close();
            oos.close();
            ois.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }  catch (IOException e) {
            e.printStackTrace();
        }

    }
}
