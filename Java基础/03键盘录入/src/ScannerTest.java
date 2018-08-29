import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int i = sc.nextInt();
        System.out.println("请输入第二个数据：");
        int j = sc.nextInt();
        // 求和两个数值
        int sum = i+j;
        System.out.println("两个数据相加为："+sum);
    }
}
