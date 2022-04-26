package Parent_Child02;

public class Staff extends Parent {

    public void setStaff() {
        age = 30;
        name = "이순신";
        height = 180;
        setWeight(87);

        System.out.println("age: " + age +
                           " name: " + name +
                           " height: " + height +
                           " weight: " + weight);
    }
}
