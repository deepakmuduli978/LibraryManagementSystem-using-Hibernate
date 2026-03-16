package com.example;


import javax.persistence.*;
@Entity
@Table(name="Book")
public class book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Bid;

    private String BName;
    private String Author;
    private String Dop;

    public book(){}

    public book(String BName, String Author,String Dop ){
        this.BName=BName;
        this.Author=Author;
        this.Dop=Dop;
    }
    public int getId(){
        return Bid;
    }
    public String getName(){
        return BName;
    }
    public String getAuthor(){
        return Author;
    }
    public String getDate(){
        return Dop;
    }
    public void setAge(int Bid) {
       this.Bid=Bid;
       
   }
    public void setName(String BName) {
       this.BName = BName;
   }
     public void setAuthor(String Author){
        this.Author = Author;
    }
    public void setDate(String Dop){
        this.Dop = Dop;
    }   
}

