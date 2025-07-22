package com.day2proj2phase1;

public class User {
    private int userid;
    private String username;
    private String emailid;
    public User(int userid,String username,String emailid){
        this.userid=userid;
        this.username=username;
        this.emailid=emailid;
    }

    public int getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getEmailid() {
        return emailid;
    }
   public void userdisplay(){
    System.out.println("ASSOCIATE USER INFORMATION");
    System.out.println("User ID: "+this.userid+"\n"+"Username: "+this.username+"\n"+"Emailid: "+this.emailid+"\n");

   }

}
