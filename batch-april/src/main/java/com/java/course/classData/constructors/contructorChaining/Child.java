package com.java.course.classData.constructors.contructorChaining;

class Child extends Parent {




    {
        System.out.println("child instance block");
    } //instance block Child()



    public Child() {
        super();
        System.out.println("Child 0-arg cons");
    }

     Child(int a){
    this(10,20);
    System.out.println("Child 1-arg cons");}


    Child(int a,int b) {
         System.out.println("Child 2-arg cons");
}
    public static void main(String[] args) {
        Child c = new Child();
        //Child c1 = new Child(100);
        }
};
