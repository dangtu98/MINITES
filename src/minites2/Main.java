package minites2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số lượng người");
        int size = scanner.nextInt();
        Student [] students = new Student[size];
        studentListArray(scanner,students);

        while (choice !=0){
            System.out.println("menu lựa chọn");
            System.out.println("1.Hiện thị tất cả sinh viên");
            System.out.println("2.Thêm người vào danh sách ");
            System.out.println("3.Tìm vị trí 1 người trong danh sách");
            System.out.println("4.Xóa 1 người trong danh sách");
            System.out.println("5.Sửa thông tin người theo mã");
            System.out.println("6.Sắp sếp danh sách điểm trung bình");
            System.out.println("7.Hiện thị tổng điểm");
            System.out.println("-----------------------------------------");
            System.out.println("Chọn Menu");
            choice = scanner.nextInt();
            switch (choice){
                case 1 :


                   break;
                case 2 :


                    break;
                case 3 :


                    break;
                case 4 :


                    break;
                case 5 :


                    break;
                case 6 :


                    break;
                case 7 :


                    break;

            }
        }
    }

    public static Student studentList(Scanner scanner){
        System.out.println("nhập vào id");
        int id = scanner.nextInt();
        System.out.println("nhập vào tên");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("nhập vào tuổi");
        int age = scanner.nextInt();
        System.out.println("nhập vào điểm trung bình");
        double medium = scanner.nextDouble();
        return new  Student(id , name , age , medium );
    }
    private static  void studentListArray(Scanner scanner , Student[] students ){
         for(int i = 0 ; i < students.length ; i++){
             System.out.println("số người thứ " + (i+1));
              students[i] = studentList(scanner);
         }
    }
}
