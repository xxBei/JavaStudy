import java.util.Scanner;

public class scannerDemo {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整型值：");
        // 接收数据
        int i = sc.nextInt();
        System.out.println("i的值为:"+i);

    }
}
