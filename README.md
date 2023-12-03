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

# STRUCTURAL DESIGN PATTERN

## Decorator Design Pattern -
    It allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class. It is achieved by creating a set of decorator classes that are used to wrap concrete components.
    another definition - The Decorator attaches additional responsibilities to an object dynamically. The ornaments that are added to pine or fir trees are examples of Decorators. Lights, garland, candy canes, glass ornaments, etc., can be added to a tree to give it a festive look. The ornaments do not change the tree itself which is recognizable as a Christmas tree regardless of particular ornaments used. As an example of additional functionality, the addition of lights allows one to "light up" a Christmas tree.
    https://github.com/kanmaytacker/design-patterns/blob/master/notes/06-decorator-facade.pdf
## Flyweight pattern -
    The Flyweight Design Pattern is a structural pattern that aims to minimize memory usage or computational expenses by sharing as much as possible with related objects. It's particularly useful when a large number of similar objects need to be created, and the overhead of creating each object individually is significant.
    In the Flyweight pattern, common portions of the state of multiple objects are factored out into a shared object (the flyweight), and the unique parts are stored separately. This can greatly reduce memory consumption.