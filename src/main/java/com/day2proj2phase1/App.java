package com.day2proj2phase1;


public class App 
{
    public static void main( String[] args )
    {
        User u1=new User(101,"Lokesh","lokesh@gmail.com");
        User u2=new User(102,"Hari","hari@gmail.com");
        Ticket t1=new Ticket(1,"issue 1","i have an issue in X",u1);
         Ticket t2=new Ticket(2,"issue 2","i have an issue in Y",u2);
         Ticket t3=new Ticket(3,"issue 3","i have an issue in z",u2);
         t1.closetic();
         t1.ticketdisplay();
         t2.ticketdisplay();
           t3.closetic();
         t3.ticketdisplay();


    }
}
