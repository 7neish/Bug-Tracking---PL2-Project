public interface email_service_blueprint {
    void sendEmailToDev(String testername, String devname, String bugname);

    void sendEmailTotester(String testername, String devname, String bugname);

    boolean ckeckUserEmail(String rname);

    String getEmailmessage(String rname);

    void deletEmail(String rname);

    void refreshemails();

}
