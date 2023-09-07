package com.Orange_Love_Freedom.qingxi_academic_affairs;
import java.util.Scanner;
public class signup {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        String Verification_code = scanner.nextLine();
        scanner.close();
    }
    public String username (){
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        scanner.close();
        return username;
    }
    public String password (){
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        scanner.close();
        return password;
    }
    public String Verification_code(){
        Scanner scanner = new Scanner(System.in);
        String Verification_code = scanner.nextLine();
        scanner.close();
        return Verification_code;
    }
}
