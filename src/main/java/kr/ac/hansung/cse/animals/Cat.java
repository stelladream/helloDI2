package kr.ac.hansung.cse.animals;

public class Cat implements AnimalType {

    String myName;

    public void setMyName(String myName) {
        this.myName = myName;
    }
    public void sound() {
        System.out.println("Cat name =" + myName + ": " + "Meow!");
    }
}
