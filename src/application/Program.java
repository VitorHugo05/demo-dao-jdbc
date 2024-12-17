package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department department = new Department(1, "Books");
        Seller seller = new Seller(department, 3000.00, new Date(), "bob@gmail.com", "Bob", 21);
        System.out.println(seller);
    }
}
