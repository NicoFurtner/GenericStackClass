A stack is a structure for storing elements in which the last saved element is also the first to be read out. Write a generic Stack class that implements this principle. An array (not a collection!) should be used as an attribute. In addition to the constructors (one without parameters, one with the attribute fields as parameters), the class should also contain the stack methods push, pop and peek (see the relevant Wikipedia article on how they work). Depending on the type of error, these methods should either throw the StackFullException or the StackEmptyException (write them yourself). Furthermore, the class should provide a method list in which all elements of the stack are concatenated into a string separated by ;. This string should then be returned.

Write a test class for your stack in which you test both a number stack and then a text stack. Try to think of meaningful test scenarios so that the functionality of your stack is well demonstrated. Document both your class with documentation comments and the test class with line comments.

**Pay particular attention to:**
- Attention: Arrays cannot be created generically (as shown in the video). It is therefore necessary to resort to runtime polymorphism and create and use an object array. The methods must recast the data type if necessary.
- The push method should take a generic data type as a parameter
- The pop and peek methods should have a generic data type as the return type
- Use English identifiers (aka names), write your comments in English and be prepared to make your assignment talk in English as well