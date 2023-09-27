package org.example.factoryPattern;

import org.example.factoryPattern.buttons.Button;
import org.example.factoryPattern.buttons.IosButton;
import org.example.factoryPattern.dropDowns.DropDown;
import org.example.factoryPattern.dropDowns.IosDropdown;
import org.example.factoryPattern.menus.IosMenu;
import org.example.factoryPattern.menus.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropdown();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
