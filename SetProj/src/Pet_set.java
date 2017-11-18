/**
 * 猫类
 */
public class Pet_set {
    private String name;
    private int age;
    private String species;

    public Pet_set(){

    }

    public Pet_set(String name,int age,String species){
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "[姓名："+name+",age："+age+"，品种："+species+"]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((species == null) ? 0 : species.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        // 判断两个对象是否相等，如果相等，返回true
        if(this == obj)
            return true;

        // 判断待判断的对象是否属于Pet_set类，如果属于，强转为Pet_set
        if(obj.getClass() == Pet_set.class){
            Pet_set pet_set = (Pet_set)obj;
            return pet_set.getName().equals(name) && pet_set.getAge()==age && pet_set.getSpecies().equals(species);
        }

        return false;
    }
}
