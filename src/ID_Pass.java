import java.util.HashMap;

public class ID_Pass {
    HashMap<String,String> LoginInfo = new HashMap<String,String>();

    ID_Pass() {

        LoginInfo.put("Ethical","Aniruddha");
        LoginInfo.put("Hello","World");
        LoginInfo.put("User","Pass");

    }

    protected HashMap getLoginInfo () {
        return LoginInfo;
    }
}
