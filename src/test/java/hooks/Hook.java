package hooks;

import org.junit.After;
import utils.LocalDriverManager;

public class Hook {

    @After
    public void tearDown(){
        LocalDriverManager.closeDriver();
    }
}
