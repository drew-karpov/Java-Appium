package lib.ui.ios;

import lib.intefaces.ISomePageObject;
import lib.ui.MainPageObject;

public class IOSSomePageObject implements ISomePageObject {

    private MainPageObject mainPage;

    public IOSSomePageObject (MainPageObject mainPageObject){
        this.mainPage = mainPageObject;
    }

    @Override
    public void someMethod() {

    }
}
