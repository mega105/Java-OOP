import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x=8; int y = s.nextInt();
        if(y>x){
            System.out.println(y+x*2);
        }else{
            System.out.println(y*y/x);
        }
    }
}