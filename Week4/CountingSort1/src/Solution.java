import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mảng đếm từ 0 đến 99 (gồm 100 phần tử, mặc định khởi tạo là 0)
        int[] count = new int[100];

        // Đọc số lượng phần tử N
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            // Đọc N số nguyên và tăng tần suất xuất hiện
            for (int i = 0; i < n; i++) {
                int value = scanner.nextInt();
                if (value >= 0 && value < 100) {
                    count[value]++;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print(count[i] + (i < 99 ? " " : ""));
        }


        scanner.close();
    }
}