### Observer
1. Defined:
Observer pattern  is a design pattern belonging to the Behavioral patterns group(Behavioral patterns provide guidelines for implementing the communication and interplay of objects.).  
When an object (the Subject) changes its state, it automatically notifies all other objects (Observers) that have registered to follow it.
2. Structure:
4 roles:
    - Observer interface(main.java.weather.WeatherObserver): Interface that declares 1 method for receiving notify(update()).  
    - Concrete Observer(main.java.weather.Observer1, main.java.weather.Observer2, main.java.weather.Observer3): Implements interface Observer for receiving notify.
    - Subject interface(main.java.weather.WeatherSubject): Interface that is base class for objects(main.java.weather.WeatherStation) being followed. It implements methods(attach, detach, notify) observers(observer1,2,3..). 
    - Concrete Subject(main.java.weather.WeatherStation): Implements interface subject to manage observers.
     
