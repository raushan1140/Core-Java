
// package FunctionOverloading;

/**
 * uisngDataTypes
 */
public class uisngDataTypes {
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(sum(4,5));
        System.out.println(sum(4.2f,8.8f));
    }
}