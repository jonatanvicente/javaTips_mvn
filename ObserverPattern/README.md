


### Observer Pattern

The Observer Pattern is a behavioral design pattern where an object, known as the subject, maintains a list of its dependents, 
called observers, and notifies them of any state changes, usually by calling one of their methods.

In this example:
* The Subject interface defines methods for attaching and detaching observers.
* The Observer interface defines the update method that observers must implement.
* The WeatherData class implements the Subject interface and maintains a list of observers.
* The CurrentConditionsDisplay class implements the Observer interface and registers itself with the WeatherData object.
* The WeatherStation class is the client that sets up the subject and observers and simulates changes in weather data.