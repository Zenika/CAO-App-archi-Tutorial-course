# Use Case Diagrams

<!-- .slide: class="page-title" -->



## Summary

<!-- .slide: class="toc" -->

- *Introduction*
- Elements used in the diagram
- Reading the use case diagram
- Textual description of use case

Notes :



## Introduction - Definition

- A Use Case Diagram models the interaction between the external actors and the functions of the system without revealing the internal structure.

<br>

![](ressources/03_ATM_machine.svg)


Notes :



## Introduction - Purpose of Use Case Diagram

- Gather the requirements of the project or the client

- High level design

- Delimits the boundaries of the system

- Defining the relations between the system and the environment

Notes :



## Summary

<!-- .slide: class="toc" -->

- Introduction
- *Elements used in the diagram*
- Reading the use case diagram
- Textual description of use case

Notes :



## Elements used in the diagram

- <b>Actor:</b>
  - Models a type of role played by an entity that interacts with its associated Use Cases (by exchanging signals and data).
  - May represent roles played by human users, external hardware, or other systems.
  - External to the system

  - Notation:


![](ressources/03_actor_representation.svg)

Notes :



## Elements used in the diagram

- <b>Use Case:</b>
  - Represents a set of actions performed by a system
  - Each Use Case specifies a unit of useful functionality that the subject provides to its users.
  - To identify them, we have to identify how and why the actors use the system

  - Notation:

    - The name: usually an infinitive verb + complement (with the actor point of view and not the system)<br>
    Example: Withdraw Money and not Give Money
![](ressources/03_useCase_representation.svg)
<br>

Notes :



## Elements used in the diagram

- <b>Boundaries and subject:</b>
  - Anything not realized by the subject is considered outside the system boundaries.

  - A subject of a UseCase could be a system or any other element that may have a behavior, such as a Component or Class.

  - Notation:
![](ressources/03_boundaries_names.svg)

Notes :



## Elements in the diagram - Relations between Actors and Use Cases

- <b> Association relation: </b> It represents a link that connects the elements of a UML model. It shows that information are exchanged between those elements.

  <figure style="margin-top: -4%">
      <img src="ressources/03_association_relation.svg"/>
  </figure>


  - Multiplicity: We can add at the ends of the line the number of associated objects

  <figure style="margin-top: -3%; zoom: 90%">
      <img src="ressources/03_association_relation_multiplicity.svg"/>
  </figure>

Notes :



## Elements in the diagram - Relations between Use Cases

- <b>Dependency relations:</b> This relation precise that a use case require another use case to be implemented

  - <b>Include:</b>
    - An include relationship between two use cases means that the behavior defined in the including use case is included in the behavior of the base use case.

      <figure style="margin-top: -3%; margin-bottom: -5%">
          <img src="ressources/03_include_relation.svg"/>
      </figure>

  - <b>Extend:</b>
    - This relationship specifies that the behavior of a use case may be extended by the behavior of another use case

    <figure style="margin-top: -2%; margin-bottom: -5%">
        <img src="ressources/03_extend_relation.svg"/>
    </figure>

Notes :



## Elements in the diagram - Relations between Use Cases or between actors

- <b> Generalization relation: </b> Describes the inheritance relationship between two use cases.

![](ressources/03_generalization_relation.svg)

<!-- .element class="alert alert-warning" -->
Be careful to do not mix up between generalization and extend relations.

Notes :



## Summary

<!-- .slide: class="toc" -->

- Introduction
- Elements used in the diagram
- *Reading the use case diagram*
- Textual description of use case

Notes :



## Reading the use case diagram

ATM system with UseCases and Actors

![](ressources/03_ATM_machine.svg)

- We also use a <b> textual description </b> of use case to show the dialogue between the actors and the use case.

Notes :



## Summary

<!-- .slide: class="toc" -->

- Introduction
- Elements used in the diagram
- Reading the use case diagram
- *Textual description of use case*

Notes :



## Textual description of use case

- It often has this structure:

  <b>Title:</b> Use Case: Withdraw Money <br>
  <b>Goal in context:</b> ATM customer receives funds from ATM machine <br>
  <b>Primary actor:</b> ATM customer (CUSTOMER) <br>
  <b>Secondary actor:</b> ATM machine (ATM)  <br>
  <b>Preconditions:</b> Bank customer must have ATM card and ATM must have money <br>
  <b>Scenario:</b> <br>
  1. Customer inserts ATM card.<br>
  2. ATM reads information on the card.<br>
  3. ATM validates information on the card.<br>
  4. ATM displays prompts for PIN.<br>
  5. Customer enters PIN.<br>



## Textual description of use case

<b>Scenario:</b> <br>
6. ATM validates PIN by checking a MD5 hash.<br>
7. ATM displays prompt asking "Which operation do you want to perform?"<br>
8. Customer selects "Cash withdrawal". <br>
9. ATM displays prompt for amount to withdraw.  <br>
10. Customer enters amount. <br>
11. ATM displays prompt requesting from which account to withdraw.  <br>
12. Customer selects the account type (checking, saving, credit). <br>
13. ATM communicates with the ATM network to authorize user by validating account ID, PIN, and availability of the amount requested. <br>
14. The ATM displays prompt asking the Customer whether he/she wants a receipt.
15. ATM asks the client to withdraw the card. <br>
16. Customer withdraws the card. (This is a security measure to ensure that Customers do not leave their cards in the machine.)<br>
17. ATM sends a message over the ATM Comm link to the main bank computer commanding that the amount to be dispensed is deducted from the Customer's account.<br>
18. ATM dispenses the requested amount of cash.<br>
19. ATM prints receipt.<br>
20. The use case ends.<br>

Notes :



## Textual description of use case

<b> Alternative scenarii: </b> If the code is false, the ATM machine asks the customer another time the code. If the code is false three times, the ATM machine keep the card etc. <br>
<b> Postconditions: </b> The customer get the asking money. The ATM machine modified the total money it posses.


Notes :



## Questions?


<!-- .slide: class="page-questions" -->
