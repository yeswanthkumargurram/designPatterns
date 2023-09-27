package org.example.factoryPattern;

import org.example.factoryPattern.buttons.Button;
import org.example.factoryPattern.dropDowns.DropDown;
import org.example.factoryPattern.menus.Menu;

public interface UIFactory {
    Button createButton();
    DropDown createDropDown();
    Menu createMenu();

}
