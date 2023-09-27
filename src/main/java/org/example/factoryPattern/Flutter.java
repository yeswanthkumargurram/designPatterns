package org.example.factoryPattern;

public class Flutter {
    SupportedPlatform platform;
    public Flutter(SupportedPlatform platform){
        this.platform = platform;
    }
    public void setTheme(){
        System.out.println("Setting Theme");
    }
    public void setRefreshRate(){
        System.out.println("setting RefreshRate");
    }
    public UIFactory createUiFactory(){
        return UiFactoryFactory.getUiFactoryFromPlatform(platform);
    }
}
