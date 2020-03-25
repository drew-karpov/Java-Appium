package lib.factories;

import lib.Platform;
import lib.intefaces.ISomePageObject;
import lib.ui.MainPageObject;
import lib.ui.android.AndroidSomeObject;
import lib.ui.ios.IOSSomePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SomePageObjectFactory {

    public static ISomePageObject get(RemoteWebDriver driver){
        MainPageObject mainPageObject = new MainPageObject(driver);
        if (Platform.getInstance().isAndroid()){
            return new AndroidSomeObject(mainPageObject);
        } else  {
            return new IOSSomePageObject(mainPageObject);
        }
    }
}
