package lib.ui.android;

import lib.intefaces.ISomePageObject;
import lib.ui.MainPageObject;

public class AndroidSomeObject implements ISomePageObject {

    private MainPageObject mainPage;

    public AndroidSomeObject(MainPageObject mainPageObject){
        this.mainPage = mainPageObject;
    }

    @Override
    public void someMethod() {

    }
}
