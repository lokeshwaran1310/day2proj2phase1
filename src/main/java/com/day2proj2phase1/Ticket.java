package com.day2proj2phase1;

public class Ticket {
    private int tickid;
    private String title;
    private String desc;
    private String status;
    private User user;
    public Ticket(int ticid,String title,String desc,User user){
        this.tickid=ticid;
        this.title=title;
        this.desc=desc;
        this.status="open";
        this.user=user;
    }

    public int getTickid() {
        return tickid;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getStatus() {
        return status;
    }

    public User getUser() {
        return user;
    }
    public void ticketdisplay(){
        System.out.println("TICKET INFORMATION");
        System.out.println("Ticket ID:"+this.tickid+"\n"+"Ticket Title:"+this.title+"\n"+"Ticket Description:"+this.desc+"\n"+"Ticket Status:"+this.status+"\n");
        user.userdisplay();
    }
    public void closetic(){
        this.status="Closed";
        }
}
