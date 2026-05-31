package OOPs;

class Human{
    // Every time we make instance variable keep it private, it should only be accessed through mehtod
    private int age; // This variable can only be accessible only in same class 
    private String name; // Instance variable

    public void setAge(int a){ //setters
        age = a;
    }
    public int getAge(){ // getter
        return age;
    }

    public void setName(String name){
        this.name = name; // This represent the current object
    }
    public String getName(){
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args){
        Human obj = new Human();
        obj.setName("Rashmi");
        obj.setAge(11);

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
