package com.example;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        SessionFactory factory =
                new Configuration()
                        .configure("hibernate.cfg.xml")
                        .addAnnotatedClass(student.class)
                        .addAnnotatedClass(book.class)
                        .addAnnotatedClass(issue.class)
                        .buildSessionFactory();

        Session session = factory.openSession();
     
        while (true) {

            System.out.println("\nChoose:");
            System.out.println("1. Book");
            System.out.println("2. Student");
            System.out.println("3. Issue Book");
            System.out.println("4. Exit");

            int n=sc.nextInt();
            
            session.beginTransaction();
            switch (n) {

                case 1:
                    book Book = new book("Java", "BB biswal","02-09-1997");
                    session.save(Book);
                    System.out.println("Book saved");
                    break;

                case 2:
                    student Student = new student("Rahul", 21);
                    session.save(Student);
                    System.out.println("Student saved");
                    break;

                case 3:
                     issue Issue = new issue(1,"java","12-03-2026");
                    session.save(Issue);
                    System.out.println("Book issued");
                    break;

                case 4:
                    session.close();
                    factory.close();
                    System.out.println("Exited");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice try again!");
            }

            session.getTransaction().commit();
           
       
        }
        
    }
}