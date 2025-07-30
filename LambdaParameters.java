interface Addable{
    int addition(int a, int b);
}

class AddableImpl implements Addable{

    @Override
    public int addition(int a, int b) {
        return (a+b);
    }
}

public class LambdaParameters {
    public static void main(String[] args){
        Addable add = (a,b) -> ( a + b);
        System.out.println(add.addition(5,3));

        Addable adds = (int a, int b) -> {
            int c = (a+b);
            return c;
        };
    }
}
