# designPatterns

Always code to an interface but not to the class, it helps to achieve DEPENDENCY INVERSION. If we code to a class it will be tightly coupled.
Ex : 
class a = new class(); //tightly coupled
Interface i = new class(); //dependency inversion

CREATIONAL DESIGN PATTERN

BuilderDesignPattern -  used for constructing complex objects step by step. This pattern is especially useful when you have a class with many optional parameters in its constructor.

FactoryDesignPattern - It provides an interface for creating objects, but it allows subclasses to alter the type of objects that will be created. This pattern is often used when you want to decouple object creation from the rest of your code, making it more flexible and maintainable. 
it's divided into 3 parts
  1)FactoryMethods - createButton(), createDropDown(), createMenu() -- helps to create an object
  2)AbstractFactory - says that in flutter class(main class) have the basic methods and move all the factory methods to an interface
  3)Practicalfactory (this is not a part of gang Of four but will be used in our day to day code) - helps us to create objects of same class Xfactory will return x (ex: UiFactoryFactory). If you have an requirement to create an object based on some parameter, practicalfactory can be used 
  ex : here we are creating an object based on platform parameter
  public static UIFactory getUiFactoryFromPlatform(SupportedPlatform platform){
        if(platform == SupportedPlatform.ANDROID){
            return new AndroidUIFactory();
        }else if(platform == SupportedPlatform.IOS){
            return new IosUIFactory();
        }
        return null;
    }
  
