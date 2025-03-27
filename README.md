
# javaTips Project

Modular Project with samples, tips, demos and more ;)


#### Project Structure

This is a Maven Modular Project.
Contains several modules that can be executed sequentially in one go, or individually. 

Folders structure is standard Java:
- **main** directory. Contains main code Java.
- **test** directory. Contains unit and other tests to test main code.
Both folders have same structure:
- **java**. With packages and classes Java.
- **resources**. Neccessary resources to execute, either main code or the tests.

You can see longer explanation of this topic or how organize
your Maven projects in [Official Maven Documentation](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html)



#### Running the examples
This project is a modular project, so you can run the modules using following commands:
```
./mvnw -pl [module] compiler:compile
./mvnw -pl [module] exec:java
```

## Modules

- **Callback Pattern**: Short demo of callback Pattern.
  - **Main**. Main class execute callback passing as parameter an object type IPaymentMethod. 
    This operation is similar to which the payment gateways run.
 
- **Properties**: Load an external file with properties. Access to system properties.
  - **Main**. Main class that loads properties file
  - **application.properties**. Properties file located in folder java/resources.
  
- **Bubble**: Bubble Sort Algorithm.
  - **Bubble sort**, sometimes referred to as sinking sort, is a simple sorting algorithm that 
   repeatedly steps through the list, compares adjacent elements and swaps them if they are in 
   the wrong order. The pass through the list is repeated until the list is sorted. 
   The algorithm, which is a comparison sort, is named for the way smaller or larger elements "bubble" 
   to the top of the list.
   - **Main**. Shows Bubble Sort, equivalent to invoking the _Collections.Sort_ method (see 
     [Official Docs](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collections.html) for
     more details.
     
- **Streams**: 
    - Java8 introduced functional programming, with **Streams** and others.
    - **StreamBasic** class shows how how to use streams to make comparisons, go through lists in a minimalist and 
      effective code. See _getLowCaloricDishesNamesInJava8()_ method.

- **Lambdas**: 
    - This module contains a short demo how to use lambdas, powerful java functions for filtering and execution.
    See _Lambdas.java_.

- **Reflection**: Contains a demo of API Reflection uses. Reflection allows us to access internal properties 
  of Java objects without knowing their definition.
  You can see how at Main.class

- **Inner Classes**:Although they need to be used wisely, inner classes also allow many possibilities

- **Enumerations**: Introduced in Java5
  
- **Restaurant**: Java has been designed to support concurrent programming, and all execution takes place
  in the context of threads. Objects and resources can be accessed by many separate threads; 
  each thread has its own path of execution but can potentially access any object in the program. 
  The programmer must ensure read and write access to objects is properly coordinated (or "synchronized") 
  between threads. Thread synchronization ensures that objects are modified by only one thread at a time and 
  that threads are prevented from accessing partially updated objects during modification by another thread. 
  The Java language has built-in constructs to support this coordination.
  - This sample is a demo of Consumer-Producer Threads.

- **Polymorphism**: Polymorphism and inheritance are some of the great benefits of OOP. This folder contains a brief
  example, see the main in _Music2.java_.

- **RegExp**: Regular Expressions in Java Language.
  
- **Optional**: 
    - Java 8 introduced the class **Optional**.
    - The purpose of this class is to provide a type-level solution for representing optional values instead of null references, avoid
    NullPointerException.

- **JacksonMapper**. This demo contains Jackson uses to serialize/deserialize JSON objects.
    - Visit [Baeldung Tutorial](https://www.baeldung.com/jackson-object-mapper-tutorial) for more use cases.
    - You can find more examples at [Baeldung Tutorials]())     

- **TravelAgency**. This sample shows how using Singleton, Strategy, Factory and Builder patterns at same time. It suppose a travel agency
    that offers different types of tickets, with several conditions:
    - Bus Ticket to Kids
    - Plane Ticket to Adults
    - Train Ticket to Seniors
  
  Some notes:
    - ITravelAgencyBuilder: Abstract Factory to build travel agencies.
    - TravelAgencyFactory: Singleton that contains a concrete factory to create specific agencies (it depends on the customer type).
    - Factory package: Definition and implementation of agency types.

**Note**: Some examples are adaptations of course **Thinking In Java** of Bruce Eckel. You can see more examples [here](https://www.mindviewinc.com/)  

[![Contributor Covenant](https://img.shields.io/badge/Contributor%20Covenant-v2.0%20adopted-ff69b4.svg)](code_of_conduct_EN.md) 
 [![Contributor Covenant](https://img.shields.io/badge/Contributor%20Covenant-v2.0%20adopted-ff69b4.svg)](code_of_conduct_ES.md) 
  [![Contributor Covenant](https://img.shields.io/badge/Contributor%20Covenant-v2.0%20adopted-ff69b4.svg)](code_of_conduct_CA.md) 
