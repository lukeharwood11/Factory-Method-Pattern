# Lab 6 - Factory Method Pattern
**By: Luke Harwood, Nathan Berglund, and Alexander Ottelien**
## Purpose
The purpose of this Lab is to demonstrate the application of the Factory Pattern and the 
use cases in which it both is and isn't applicable. 

## What is the Factory Method Pattern?
#### What it looks like:
The factory method pattern delegates the responsibility of creating objects to another class.
#### Positives
- Removes control coupling in client code, making code cleaner
- Allows for customization of objects within factory to reduce repetition
- Grants further separation of concerns within client code, so handling the logic of 
creating new objects remains within the factory not in client code
#### Negatives
- Coupling is not removed, it's only pushed back into the factory
## Key Point
Question : 
- What makes the **Factory Method Pattern** different from the Strategy Pattern? 
- And why would you (the client) use the factory pattern, which uses control coupling 
  instead of simply creating an Object manually? 

## Answers
The factory method has a very specific purpose and application. If you look at a UML 
diagram of the Factory Method Pattern you'll see that it looks a lot like the Strategy Pattern. 
However, they have two different purposes.
Strategy Pattern:
- **Goal is to remove control coupling in client code with regard to method calls**

**Example**

`
if (bird.type == BirdType.FALCON){
`

`    bird.falconFly();`

`
} else if (bird.type == BirdType.SPARROW) {
`

`    bird.sparrowFly();`

`
} else if (...)
`

The control coupling seen above could be eliminated with polymorphism and extension off of 
an abstract 'Bird' class (or interface). This way all the children of the Bird class
could implement their own method of `fly()` and the client code can be simplified to 
`bird.fly()`.

Factory Method Pattern: 
- Goal is to remove control coupling within the creation of new objects. 
- Applies when the client doesn't know what kind of objects need to be created at runtime. 


## Project demonstration
#### Lab 6 : Car Factory Lab

In this lab we have a (literal) factory that receives orders from online buyers. 
The goal is to keep up with the orders coming in by creating new toys in the factory. 
If the order takes too long to fulfill, the customer gets angry and returns the order. 
This results in a loss of money...
If you go bankrupt you lose, however, if you become a billionaire, you win the game. 

#### Design patterns in this lab
The goal is to demonstrate the difference between the strategy pattern and the 
factory method pattern... so we'll implement both methods.

**Strategy Pattern:**
At its core we need to have different types of toys that the 'Car Factory' will 
be able to create. Each toy must have specific attributes that must be implemented 
in every car, and specific actions that must be implemented for each car. 

Each toy must have: 

**Attributes**
- cost of car 
- cost of materials (cost to make)
- time to make

**Methods**
- orderParts()
- assemble()

The Car class must be an abstract class that implements these attributes and 
methods and there must be concrete children of the Car class
(e.g. Mercedes, Toyota, FordMustang.).

**Factory Method Pattern**: when buttons are clicked within the gui we need specific 
objects (instances of the car classes) to be initialized. The problem is we don't 
know which objects need to be created before we run the program.

This means that we would need to have specific functions for each button that is pressed
corresponding to a new object that would be created as a result..

..or.. 

We could implement the Factory Method Pattern to create the objects for us based on 
what button was pressed.
So instead of having 10 different methods for creating 10 different kinds of toys, 
we can give that responsibility to an abstract class we can call `CarFactory` which
will return the correct object corresponding to the button that was pressed. 

(*insert uml diagram*)



