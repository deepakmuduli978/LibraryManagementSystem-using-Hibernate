package com.example;



import javax.persistence.*;


@Entity
@Table(name="Issue")
public class issue {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Iid;

    private int Bid;
    private String BName;
    private String Dop;

    public issue(){}

    public issue(int Bid,String BName,String Dop ){
        this.Bid=Bid;
        this.BName=BName;
        this.Dop=Dop;
    }
    public int getBid(){
        return Bid;
    }
    public int getIid(){
        return Iid;
    }
    public String getName(){
        return BName;
    }
    public String getDate(){
        return Dop;
    }
    public void setBid(int Bid){
        this.Bid=Bid;
    }
    public void setName(String BName) {
       this.BName = BName;
   }
    public void setDate(String Dop){
        this.Dop = Dop;
    }   
}


    

