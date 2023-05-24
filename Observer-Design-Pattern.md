# Observer-Design-Pattern

### Problem Statement :
Sometimes when one or more objects need to observe something which gets updated frequently, then observer pattern can be used.

### Observer Design Pattern
The Observer Pattern defines a one to many dependency between objects so that one object changes state, all of its dependents are notified and updated automatically.
It consists of 2 major component : 
- Observable (Something that changes its state)
- Observers (Something that needs to get updated whenever Observable changes its state)

### Points to Note : 
- Both Observer and Observable are Interfaces
- Concrete implementation of Observer needs to have 'is-a' relationship with Observer
- Concrete implementation of Observer should have 'has-a' relationship with concrete implementation of Observable which should be defined during instantiation using *Dependency injection*
- In case of one observer having multiple observable, that observer should specify those (concrete implementation of) observables in the dependency injection (using constructor) and the update() method should be parameterised as : `update(IObservable observable)` and the to know which concrete implementation of Observable had notified the observer, use `instanceof` condition.
