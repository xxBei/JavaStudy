import java.util.Scanner;

public class scannerDy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
        System.out.println("请输入第一个数据：");
        int b = sc.nextInt();
        // 判断两个数值是否相等，相等返回true,不等返回false
        // boolean flag = (a==b)?true:false;
        boolean flag = (a==b);
        System.out.println("flag:"+flag);
    }
}
