public class Email {
    private String sender;
    private String receiver;
    private String messag;
    private String bugname;

 public Email(String sender,String receiver,String messag,String bugname){
this.sender = sender;
this.receiver = receiver;
this.messag = messag;
this.bugname =  bugname;

}

public String getsender(){return sender;}
public String getreceiver(){return receiver;}
public String getmessag(){return messag;}
public String getbugname(){return bugname;}

public void setsender(String sender){this.sender = sender;}
public void setreceiver(String receiver){this.receiver = receiver; }
public void setmessag(String messag){this.messag = messag; }
public void setbugname(String bugname){this.bugname = bugname; }


public String toFileString(){
     
    return sender + "," + receiver + "," + messag + "," + bugname;
}
















}
