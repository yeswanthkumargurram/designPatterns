package org.example.factoryPattern;

import org.example.factoryPattern.buttons.AndroidButton;
import org.example.factoryPattern.buttons.Button;
import org.example.factoryPattern.dropDowns.AndroidDropdown;
import org.example.factoryPattern.dropDowns.DropDown;
import org.example.factoryPattern.menus.AndroidMenu;
import org.example.factoryPattern.menus.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropdown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
