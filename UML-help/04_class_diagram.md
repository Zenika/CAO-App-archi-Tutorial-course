# Class Diagram

<!-- .slide: class="page-title" -->

Notes :



## Summary

<!-- .slide: class="toc" -->

- *Introduction*
- Element used in the diagram
- Object diagram
- Elaborating a class diagram
- Example class diagram
  
Notes :



## Introduction - Definition

- Models the static view of an application
  - It is static because the time is not taken into account

- The most important and the widely used diagram in the OOP design
  - The diagram can be mapped directly with object-oriented languages

- Describes the classes, the interfaces and their relations

- So, it enables to model the internal structure of the application

Notes :

A voir si je mets un exemple



## Introduction - Purpose

- Analysing and designing the static view of an application

- Describe the functionalities of a system

- Forward and reverse engineering

Notes :



## Summary

<!-- .slide: class="toc" -->

- Introduction
- *Element used in the diagram*
- Object diagram
- Elaborating a class diagram
- Example class diagram

Notes :



## Element used in the diagram - List

- Structural:
  - Classes and other entities

- Relationship:
  - Instance-level
      - Association
      - Aggregation
      - Composition
  - Class-level
    - Generalisation
    - Realisation
  - Generic
    - Dependency

Notes :



## Element used in the diagram - List

- *Structural:*
  - *Classes and other entities*

- Relationship:
  - Instance-level
      - Association
      - Aggregation
      - Composition
  - Class-level
    - Generalisation
    - Realisation
  - Generic
    - Dependency

Notes :



## Class - Reminder Class/Instance

- A class is the abstract description of a physical object or concepts such as:
  - concrete elements (ex: Cars)
  - abstract elements (ex: Services)
  - application components (ex: Buttons)
  - Behaviour elements (ex: tasks)
  - etc.

- A class is composed of:
  - _Name_ (ex: Car)
  - _Fields_ to characterise its State (ex: brand, model, colour)
  - _Methods_ to describe its Behaviour (ex: move(), turn(), brake()...)

Notes :



## Class - Reminder Class/Instance

- An instance (= object) of a class is the concrete element of the abstract idea
  - Example: The White Porsche Cayenne is an instance of the Class Car

- If we consider "Human" as the class describing human being, we all are an instance of this class

<figure style="margin-top: -2%;">
    <img src="ressources/04_classe_instances.png" alt="Class and instances"/>
</figure>

Notes :



## Class - Graphical representation

<figure style="margin-top: 0%;zoom: 200%">
    <img src="ressources/04_graphical_representation_class.svg"/>
</figure>

Notes :



## Class - Visibility for encapsulation

- `private` (-): only accessible within the class itself

- `no modifier` (~): accessible from all the classes in the same package

- `protected` (#): accessible from
    - the classes in the same package
    - the subclasses

- `public` (+): free access

- `Other`:  "/" means <b>Derived</b>: not stored, but can be computed from other attribute values

Notes :



## Class - Graphical representation - Fields

- [visibility] name: [type] [multiplicity] [=defaultValue] [properties]
- Ex: - Color: String 1..* = "White"

- A <b>static</b> field is <u>underlined</u>

<figure style="margin-top: -5%;margin-bottom: -5%;zoom: 200%">
    <img src="ressources/04_graphical_car_class_attributes.svg"/>
</figure>

- <b>Properties:</b> enables to add supplementary information (ex: frozen or final)

Notes :



## Class - Graphical representation - Operations

- [visibility] name( <b>ParametersList</b> ): [returnType] [properties]
  - Ex:   + getColor(): String

- The <b>ParameterList</b> has this shape :
  - [direction] name : type [= defaultValue]
  - direction can be:
    - <b>in:</b> an input value (the modifications on the value are not given back), default behaviour
    - <b>out:</b> an output value (no input value and the final value is available to the caller)
    - <b>inout:</b> an input value returned to the caller (may be modified)
  - Ex: + cleanCar( inout Car ): Car

Notes :



## Class - Graphical representation - Operations

- <b>Properties:</b> enables to add a constraint or supplementary information (ex: abstract)

- <b>Static</b> methods are <u>underlined</u>

<figure style="margin-top: -5%;margin-bottom: -5%;zoom: 200%">
    <img src="ressources/04_graphical_car_class_attributes_operations.svg"/>
</figure>

Notes :



## Class - Graphical representation - Precision on the entities

- The name of the class starts with an uppercase letter
- We can use a stereotype to precise the entity:
  - << utility >>: A library using essentially static methods

  <figure style="margin-top: -3%; margin-bottom: -3%;zoom: 180%">
      <img src="ressources/04_graphical_utility_Math_class_representation.svg"/>
  </figure>

  - << exception >>: to explain that the class describes an exception
  - << interface >>
  - etc.

Notes :



## Summary

<!-- .slide: class="toc" -->

- Introduction
- *Element used in the diagram*
- Object diagram
- Elaborating a class diagram
- Example class diagram

Notes :



## Element used in the diagram - List

- Structural:
  - Classes and other entities

- *Relationship:*
  - *Instance-level*
      - Association
      - Aggregation
      - Composition
  - Class-level
    - Generalisation
    - Realisation
  - Generic
    - Dependency



## Relationship - Instance-level - Associations

- A system consists in a set of classes interacting with each other

- The interaction between two classes can be modelled by an association

<figure style="margin-top: 0%;zoom: 200%">
    <img src="ressources/04_association_relation.svg"/>
</figure>

- Elements of an association relation:
  - <b>Bidirectional:</b> the association can be read in the two way

  - <b>Multiplicity (Cardinality):</b> These symbols indicate the number of instances implied in the relation

Notes :



## Relationship - Instance-level - Associations

- <b>Type of multiplicity</b>


| Indicator     | Meaning                |
| ------------- | -----------------------|
| 0..1          | Zero or one            |
| 1             | One only               |
| 0..*          | 0 or more              |
| * or 1..      | 1 or more              |
|n              | Only n (where n > 1)   |
|0..n           | Zero to n (where n > 1)|
|1..n           | One to n (where n > 1) |

Notes :




## Relationship - Instance-level - Associations

- By convention, an association is read from <b>left to right</b> and from <b>up to down</b>. If the direction is not natural we can precise it:

<figure style="margin-top: 0%;zoom: 200%">
    <img src="ressources/04_association_relation_direction.svg"/>
</figure>

- In java it becomes:

<br>

```java
public class Person {
  private Company company;

}

public class Company {
  private Arraylist<Person> employees;

}
```

Notes :



## Relationship - Instance-level - Associations

- <b>Navigability:</b> We can have an association with only one way direction

<figure style="margin-top: 0%;zoom: 200%">
    <img style="margin-bottom: 0%" src="ressources/04_association_relation_navigability.svg"/>
</figure>

<br>

- It means that an instance of Point does not store a polygon but an instance of polygon stores at least three instances of Point

Notes :



## Relationship - Instance-level - Associations

- We can add an <b>association-class</b> to specify an association

<figure style="margin-top: 0%;zoom: 200%">
    <img src="ressources/04_association_relation_class_association.svg"/>
</figure>

Notes :



## Relationship - Instance-level - Associations

- A <b>N-ary association</b> is a relationship that exists between three or more classes.

<figure style="margin-top: 0%;zoom: 200%">
    <img src="ressources/04_association_n-ary.svg"/>
</figure>

Notes :



## Relationship - Instance-level - Associations

- A <b>qualified-association</b> has a qualifier that is used to select an object from a larger set of related objects.

<figure style="margin-top: 0%;zoom: 200%">
    <img src="ressources/04_qualified_association.svg"/>
</figure>

- We can also show an unbalanced relationship between two classes. For that, we use:
  - <b>Aggregation</b>
  - <b>Composition</b>

Notes :



## Relationship - Instance-level - Aggregation

- The <b>aggregation</b> relation precise that one class is part of the other

- The two objects are quite independent, which means their lifetime are not linked.

<figure style="margin-top: 0%;zoom: 200%">
    <img src="ressources/04_aggregation_relation.svg"/>
</figure>

- The chairs can be used in an office instead of a classroom

Notes :



## Relationship - Instance-level - Composition

- The <b> composition </b> is a "stronger" version of the aggregation

- The lifetimes of the components are linked to the entity. If the entity is destroyed, its parts are destroyed too.

<figure style="margin-top: 0%;zoom: 200%">
    <img src="ressources/04_composition_relation.svg"/>
</figure>

- If the folder is deleted, the files are deleted too.

Notes :



## Element used in the diagram - List

- Structural:
  - Classes and other entities

- Relationship:
  - Instance-level
      - Association
      - Aggregation
      - Composition
  - *Class-level*
    - Generalisation
    - Realisation
  - Generic
    - Dependency

Notes :



## Relationship - Class-level - Generalisation

- This relationship refers to the case where one class is a generic version of another class.

- It is also known as inheritance. For example, in Java the most generic class is <em>Object</em>. All the other class inherits from this one.

<figure style="margin-top: -3%; margin-bottom: -3%;zoom: 130%">
    <img src="ressources/04_generalisation_relation.svg"/>
</figure>

- It is like a tree
  - During a call, the research mechanism starts with the called Class. If there is not the implementation, the mechanism climb the tree until it finds one.
  - If there is not any implementation, an error is raised.

Notes :



## Relationship  - Class-level - Realisation

- A realisation relationship is used when a class implements (executes) a service/behaviour described by an other element

- For example, in Java we use this relation to describe the implementation of an interface

<figure style="margin-top: -3%; margin-bottom: -3%;zoom: 170%">
    <img src="ressources/04_realisation_relation.svg"/>
</figure>

Notes :



## Element used in the diagram - List

- Structural:
  - Classes and other entities

- Relationship:
  - Instance-level
      - Association
      - Aggregation
      - Composition
  - Class-level
    - Generalisation
    - Realisation
  - *Generic*
    - Dependency

Notes :



## Relationship  - Generic - Dependency

- All the previous relations describe specifics link between classes or other entities

- <b>The dependency relations</b> are used for all the other cases

- We use stereotypes to specify the type of dependence
  - << call >>: a class method call another
  - << use >>: An element need another one to work correctly
  - etc.

  <figure style="margin-top: -7%; margin-bottom: -3%;zoom: 170%">
      <img src="ressources/04_dependency_relation.svg"/>
  </figure>

Notes :



## Summary

  <!-- .slide: class="toc" -->

- Introduction
- Element used in the diagram
- *Object diagram*
- Elaborating a class diagram
- Example class diagram

Notes :



## Object diagram - Overview

- We can create an object diagram to represents possible instances of a class

- This diagram represents a frozen state at a given time of the system

- Possible purpose:
  - Illustrate the class diagram by showing an example
  - Precise some aspects of the system which are not raised in the class diagram
  - Express an exception or raise a problem by modelling a specific case
- Graphical representation of an object:

<figure style="zoom: 150%">
  <img src="ressources/04_representation_object.svg"/>
<figure>

Notes :



## Object diagram - Example

<figure style="margin-top: -3%; zoom: 120%">
  <img src="ressources/04_object_diagram_example.svg"/>
<figure>

Notes :



## Summary

  <!-- .slide: class="toc" -->

- Introduction
- Element used in the diagram
- Object diagram
- *Elaborating a class diagram*
- Example class diagram

Notes :



## Elaborating a class diagram

- One method for creating a class diagram consists in the following steps:

  1.  Find the classes of the studied domain
      - This step is usually done with an expert of the domain. The classes correspond to the abstract or concrete concepts implied in the domain.

  2. Find the associations between classes
      - They often refer to "verbs" like "is composed of", "work for" ...
      - Be careful to do not get confused between fields and relations

  3. Find the fields and the operations
      - It corresponds to the description of the concepts and their behaviour
      - For example, "The weight of a car" or "the car can turn"

Notes :



## Elaborating a class diagram

<ol start="4">
  <li>
    <p>Organise and simplify the model</p>
    <ul>
      <li>Eliminate redundant classes with the generalisation relation</li>
      <li>Structure behaviours in interfaces with the realisation relation</li>
    </ul>
  </li>
  <li>
    <p>Iterate and precise the model</p>
    <ul>
      <li>The construction is rarely correct at the first shot. The modelling is not a linear process but an iterative one.</li>
    </ul>
  </li>
</ol>

Notes :



## Summary

  <!-- .slide: class="toc" -->

- Introduction
- Element used in the diagram
- Object diagram
- Elaborating a class diagram
- *Example class diagram*



## Example class diagram

<figure style="margin-top: -5%">
    <img src="ressources/04_example_class_diagram.png"/>
</figure>




## Questions?

<!-- .slide: class="page-questions" -->

Notes :
