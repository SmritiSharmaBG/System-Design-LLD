# Decorator Design Pattern

### Problem Statement :
Suppose we have one or more objects of a particular type, and we want to add some additional features to it in a customised manner. 
Say : class A and class B are the original classes which can have features like class one, class two, class three etc. 
Also, one class can have more than one features. 
The final product (like a combination class A having feature of two and three) should have its own unique behaviour.

### A problematic approach :
Make two interfaces : IOriginalClass which will be implemented by : class A, class B. 
And another interface : IFeature which will be implemented by classes like class one, two three.

The problem in this will be that the implementation will lead to ***Class-Explosion***. 
- That means for each permutation & combination there will be a saperate class
- Addition of a new feature or original class will lead to introduction of more classes and all its combinations.
- Code maintainablity will be chaotic

### Decorator Design Pattern
Decorator Pattern can handle the sitatuin gracefully.
- Decorator pattern allows us to add new functionality/feature to the existing class without altering it.
- It is able to do this dynamically at runtime (i.e. when the objects are created)
- It has 2 components (i) Original class (ii) Decorator
- **Original Class** : This is an abstract class. It should have one or more concrete implementation
- **Decorator Class** : This is also an abstract class which is a strcuture that wraps around or ***"decorates"*** the original class.
The Decorator has **"is-a"** as well as **"has-a"** relationship with the original class. That means the Decorator extends the original class and also contains an instance variable of original class which is introduced via dependency-injection using constructor.

 
