import java.util.Scanner;

public class TongCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soDong, soCot;
        System.out.println("Nhập vào số dòng của mảng: ");
        soDong = scanner.nextInt();

        System.out.println("Nhập vào số cột của mảng: ");
        soCot = scanner.nextInt();

        int[][] arr = new int[soDong][soCot];
        System.out.println("nhap cac phan tu");

        for (int i = 0; i < soDong;i++){
            for (int j = 0; j< soCot; j++)
                arr[i][j]= scanner.nextInt();
        }
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println("\n");
        }

        System.out.println("nhap so cot can tinh");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i< arr.length;i++) {
            sum += arr[i][num];
        }
        System.out.println(sum);
    }
}
