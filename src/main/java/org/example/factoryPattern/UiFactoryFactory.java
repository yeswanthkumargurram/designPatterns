package org.example.factoryPattern;

public class UiFactoryFactory {
    public static UIFactory getUiFactoryFromPlatform(SupportedPlatform platform){
        if(platform == SupportedPlatform.ANDROID){
            return new AndroidUIFactory();
        }else if(platform == SupportedPlatform.IOS){
            return new IosUIFactory();
        }
        return null;
    }
}
