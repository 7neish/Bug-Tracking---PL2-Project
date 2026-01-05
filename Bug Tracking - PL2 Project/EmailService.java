import java.util.ArrayList;
import java.util.List;

public class EmailService implements email_service_blueprint{
    private  List<Email> emails = new ArrayList<>();
   private FileHandler fileHandler =  new FileHandler();

    public EmailService(){
        emails = fileHandler.loadAllEmails();
    }


public void sendEmailToDev(String testername, String devname , String bugname){

String masseg = "you received a new bug added by: " + testername;
Email email = new Email(testername, devname, masseg, bugname);
emails.add(email);
refreshemails();
}


public void sendEmailTotester(String testername, String devname , String bugname){
String masseg = devname + " complet the bug named" + bugname;
Email email = new Email(devname, testername, masseg, bugname);
emails.add(email);
refreshemails();

}

public boolean ckeckUserEmail(String rname){

    for(Email email : emails){
        if(email.getreceiver().equals(rname)){
            return true;
        }else continue;
    }
return false;
}

public String getEmailmessage (String rname){
for(Email email : emails){
        if(email.getreceiver().equals(rname)){
            return email.getmessag();
        }else continue;
    }
    return null;
}

public void deletEmail(String rname){
for(Email email : emails){
        if(email.getreceiver().equals(rname)){
            emails.remove(email);
            refreshemails();
            return;
        }else continue;
    }

}



public void refreshemails(){
    fileHandler.saveAllEmails(emails);
}






}
