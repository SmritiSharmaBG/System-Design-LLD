# Strategy-Design-Pattern

### Problem Statement : 
Lets assume a 'Vehicle' class having different properties like color, driving capabilities and seats. There will be some sort of implementation in each of these properties. But its not necessary that all the instances of Vehicle class may have the same implementation as defined in that class. Two or more instances might have same implementation which might be different than that defined in the original class. This leads to duplication of code. Also its eases maintainability as all the similar algorithms get a saperate bifercation.

### Strategy Design Pattern
It has 3 main components
- Context i.e. Client
- Strategy i.e Interface
- Concrete Strategy i.e. implementation of Interface

Strategy Design Pattern : 
- 1. Defines a family of algorithm
- 2. encapsulates each algorithm (into the Strategy interface)
- 3. makes algorithm interchangable within the family

*Refer the following repo for actual code :* [Strategy Design Pattern Code](https://github.com/SmritiSharmaBG/Strategy-Design-Pattern)
