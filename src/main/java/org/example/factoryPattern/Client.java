package org.example.factoryPattern;
import org.example.factoryPattern.buttons.Button;
import org.example.factoryPattern.menus.Menu;

public class Client {
    Flutter flutter = new Flutter(SupportedPlatform.ANDROID);
    UIFactory uiFactory = flutter.createUiFactory();
    Button button = uiFactory.createButton();
    Menu menu = uiFactory.createMenu();

}
