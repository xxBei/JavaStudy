import java.util.Scanner;

public class scannerMaxTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数据：");
        int c = sc.nextInt();
        int d = Math.max(a,b);
        int maxs = Math.max(d,c);
        System.out.println("最大值为："+maxs);
    }
}
