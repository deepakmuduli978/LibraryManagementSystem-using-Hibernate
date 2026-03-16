package com.example;

import javax.persistence.*;

@Entity
@Table(name="student")
public class student {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;

   private String name;
   private int age;

   public student() {}

   public student(String name, int age) {
       this.name = name;
       this.age = age;
   }

   public int getId() {
       return id;
   }

   public String getName() {
       return name;
   }

   public int getAge() {
       return age;
   }

   public void setName(String name) {
       this.name = name;
   }

   public void setAge(int age) {
       this.age = age;
   }
}
