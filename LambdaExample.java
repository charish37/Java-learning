

//before java8 using classes for implementing method interfaces(which has only one abstract methods and any default or static methods)
//class Square implements Shape{
//    @Override
//    public void draw(){
//        System.out.println("Square is drawn");
//    }
//}


public class LambdaExample {
    public static void main(String[] args){
        Shape rectangle = () -> System.out.println("rectangle drawn");

        print(rectangle);
    }
    public static void print(Shape shape){
        shape.draw();
    }
}
