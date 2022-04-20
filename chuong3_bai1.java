package chuong_3;
import java.util.Scanner;
public class chuong3_bai1 {
	String SACH;
	int so_luong;

	 void nhap(){
	Scanner ip= new Scanner(System.in);
	System.out.println(" Nhap vao ten sach cua ban ");
	SACH = ip.nextLine();
	System.out.println(" Nhap vao so luong sach ");
	so_luong = ip.nextInt();
	 }  
	 void xuat(){
	 System.out.println(" Thong tin sach vua nhap");
	  System.out.println("\nSo luong sach"+so_luong+"\nten sach"+SACH);
	 }
	 public static void main(String[] args){
	 SACH a = new SACH();
	 a.nhap();
	 a.xuat();
	 }
}
