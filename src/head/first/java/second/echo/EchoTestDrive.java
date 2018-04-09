package head.first.java.second.echo;

public class EchoTestDrive {
    public static void main(String[] args) {
        Echo e1 = new Echo();

        int x = 0;
        while(x < 4){
            e1.hello();
        }
    }
}
