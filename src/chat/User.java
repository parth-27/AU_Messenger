package chat;

public class User {
    private static String fname;
    private static String lname;
    private static String uname;
    private static String pass;
    private static String re_pass;
    private static String bdate;
    private static String email;

    public static String getFname() {
        return fname;
    }

    public static void setFname(String fname) {
        User.fname = fname;
    }

    public static String getLname() {
        return lname;
    }

    public static void setLname(String lname) {
        User.lname = lname;
    }

    public static String getUname() {
        return uname;
    }

    public static void setUname(String uname) {
        User.uname = uname;
    }

    public static String getPass() {
        return pass;
    }

    public static void setPass(String pass) {
        User.pass = pass;
    }

    public static String getRe_pass() {
        return re_pass;
    }

    public static void setRe_pass(String re_pass) {
        User.re_pass = re_pass;
    }

    public static String getBdate() {
        return bdate;
    }

    public static void setBdate(String bdate) {
        User.bdate = bdate;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        User.email = email;
    }
}
