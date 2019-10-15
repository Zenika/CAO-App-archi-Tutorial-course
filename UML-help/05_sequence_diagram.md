# Sequence diagram

<!-- .slide: class="page-title" -->



## Summary

<!-- .slide: class="toc" -->

- Introduction
- Element used in the diagram
- Tips to elaborate a sequence diagram

Notes :



## Summary

<!-- .slide: class="toc" -->

- *Introduction*
- Element used in the diagram
- Tips to elaborate a sequence diagram

Notes :



## Introduction - Definition and purpose

- The sequence diagram establishes a link between the use case diagram and the class diagram

- It describes the interactions (information flow) between objects to complete a process in a <b>time</b> sequence order

- Models the logic of a sophisticated procedure, function or operation

<figure style="margin-top: -3%; margin-left: -20%; zoom: 110%">
  <img src="ressources/05_example_sequence_diagram.svg"/>
</figure>

Notes :

Of course:  Used by software developers and business professionals to understand requirements for a new system or to document an existing process



## Summary

<!-- .slide: class="toc" -->

- Introduction
- *Element used in the diagram*
- Tips to elaborate a sequence diagram

Notes :



## Element used in the diagram - List

- Structural
  - Role (Actor and Object/Class)
  - Lifeline
  - Activation box
- Messages
  - Synchronous and Asynchronous messages
  - Create and delete messages
  - lost and found messages
- Combined fragments
  - Representation
  - Interaction operators

Notes :



## Element used in the diagram - List

- *Structural*
  - Role (Actor and Object/Class)
  - Lifeline
  - Activation box
- Messages
  - Synchronous and Asynchronous messages
  - Create and delete messages
  - lost and found messages
- Combined fragments
  - Representation
  - Interaction operators

Notes :



## Element used in the diagram - Role (Actor and Object/Class)

- <b> Actor: </b>

  - Same element used in the use case diagram

  - Represents an entity that is implied in the process, usually external to the system

  <figure style="zoom: 130%; position: absolute; top: 100px; right: 80px;">
    <img src="ressources/05_actor_notation.svg"/>
  </figure>

<br>

- <b> Object: </b>

  - Represents an instance or a class of the system  

  - This instance or class is implied during the process

  <figure style="zoom: 150%; position: absolute; top: 250px; right: 30px;">
    <img src="ressources/05_object_notation.svg"/>
  </figure>

Notes :



## Element used in the diagram - Lifeline and Activation box

- <b>Lifeline: </b> Represents the time in which the elements is alive
  - It is always associated to an entity

<figure style="position: absolute; top: 100px; right: 30px">
  <img src="ressources/05_lifeline_notation.svg"/>
</figure>

 <br>
 <br><br>
 <br><br>

- <b> Activation box: </b> Represents the needed time for <br> an entity to perform a task

  - The longer the task will take,  <br> the longer the activation box becomes

<figure style="position: absolute; top:400px; right: -5px">
  <img src="ressources/05_activationBox_notation.svg"/>
</figure>

Notes :




## Element used in the diagram - List

- Structural
  - Role (Actor and Object/Class)
  - Lifeline and Activation box
- *Messages*
  - Synchronous and Asynchronous messages
  - Create and delete an object
  - lost and found messages
- Combined fragments
  - Representation
  - Interaction operators

Notes :



## Element used in the diagram - Synchronous and Asynchronous messages

- <b> Synchronous messages</b>:
  - Represents the call of an operation
  - During this time, the caller is frozen.
  - It is often followed by a reply message
  - Be careful about the difference between arrows

<figure style="position: absolute; top: 75px; right: 20px; zoom: 150%">
  <img src="ressources/05_example_synchronous_message.svg"/>
</figure>

<br><br>

- <b> Asynchronous messages</b>:
  - Represents an asynchronous operation
  - The caller is not frozen
  - Do not require a response, but it can have one

<figure style="position: absolute; top: 300px; right: 20px; zoom: 150%"/>
  <img src="ressources/05_example_asynchronous_message.svg"
</figure>

Notes :



## Element used in the diagram - Synchronous and Asynchronous messages

- Sometimes an object with already an activation box is called by another object

- We represent this particular case like this:

<figure style="margin-top: -3%; zoom: 200%">
  <img src="ressources/05_double_activation_representation.svg"/>
</figure>

Notes :



## Element used in the diagram - Create and delete an object

- An object can create another one

- We use a cross and a dashed line to delete the object

- It is useful for modelling a reference with a local scope

<figure style="margin-top: -3%; zoom: 200%">
  <img src="ressources/05_example_creation_destroy.svg"/>
</figure>

Notes :



## Element used in the diagram - Lost and found messages

- Sometimes messages are not complete:

- In <b> lost messages</b>, the destination is unknown or it is not within the scope of the description

- In <b> found messages</b>, we know the receiver but the sender is not described within the specification

<figure style="zoom:200%; margin-top: -5%">
  <img src="ressources/05_lost_and_found_messages.svg"/>
</figure>

Notes :



## Element used in the diagram - List

- Structural
  - Role (Actor and Object/Class)
  - Lifeline and Activation box
- Messages
  - Synchronous and Asynchronous messages
  - Create and delete an object
  - lost and found messages
- *Combined fragments*
  - Representation
  - Interaction operators

Notes :



## Element used in the diagram - Combined fragments

- With the last elements, we will be able to create some sequence diagram but often it won't be sufficient to handle the logic

- Indeed, for the moment, we are not able to model loops, conditions...

- That is why, UML 2 has introduced the <b> combined fragments </b>

<figure style="margin-top: 5%;zoom: 130%">
  <img src="ressources/05_combined_fragment.svg"/>
</figure>

Notes :



## Element used in the diagram - Interaction operators

- Operators for <b>choices</b> and <b>loop</b>:
  - alternative (alt), option (opt), break and loop

- Operators controlling <b>the parallel sending messages</b>:
  - parallel (par) and critical region (critical)

- Operators controlling <b>the sending message</b>:
  - ignore, consider, assertion and negative (neg)

- Operators setting <b>the order</b> of sending messages:
  - weak sequencing (seq), strict sequencing (strict)

- we can also use a reference (ref) to another sequence diagram

Notes :



## Element used in the diagram - Example of Alt combined fragment


<figure style="zoom:130%">
  <img src="ressources/05_example_alt_combined_fragment.svg"/>
</figure>

Notes :



## Summary

<!-- .slide: class="toc" -->

- Introduction
- Element used in the diagram
- *Tips to elaborate a sequence diagram*

Notes :



## Tips to elaborate a sequence diagram

- The following things have to be identified clearly to simplify the sequence diagram drawing:
  - Objects taking part in the interaction
  - Message flows among the objects
  - The sequence in which the messages are flowing
  - Object organisation

Notes :



## Question?

<!-- .slide: class="page-questions" -->

Notes :
