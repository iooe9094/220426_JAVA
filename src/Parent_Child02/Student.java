package Parent_Child02;

public class Student extends Parent {

    public void setStudent() {
        age = 30;
        name = "홍길동";
        height = 175;
        setWeight(75);

        System.out.println("age: " + age +
                           " name: " + name +
                           " height: " + height +
                           " weight: " + weight);
    }

    
}
