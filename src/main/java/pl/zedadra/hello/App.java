package pl.zedadra.hello;

public class App {
    public static void main(String[] args) {
        var name = "Salah";

        int a = 2;
        int b = 3;

        var result = a + b;

        if (result != 5){
            throw new IllegalStateException("assetion error");
        }
    }
}