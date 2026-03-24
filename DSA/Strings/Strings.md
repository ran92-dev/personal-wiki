# Strings 

    - Strings are series of characters stored in liner order like elements of arrays stored in liner order.
    - Each character is a string is accessed using an index, starting from 0.
    - To determine length of string we can use size or length function


        String s = anbcd;
        s.length();
        
    - Strings are mutable, so to change a character in a string, we must assign it a new character value. (Only in C++ and C)

    - In Java/Python/JavaScript Strings are immutable and hence s[5]=3; will give compile time error.

    - String concatination : Strings can be concatinated using + operator. This combines 2 string into a single string. 
        s1 + s2;
        
## Runtime vs compile time concatination
    String a ="Hello";
    String b = "World";

    String c = a+b; //This happen at runtime
    Since a and b are variables , Java cannot know their values at compile time.

    So it uses StringBuilder at runtime -> creates a new Object
 
    String c ="Hello" + "World";   //Happen at Compile time

    Both operands at right side are String literals not variables.
    So compiler convert it to 
    String c ="HelloWorld";
    Only 1 object is created in String Pool.
    


## String Pool:
 String constant pool is a special memory area inside the heap where Java stores 
 unique string literals.

    Goal:
        - Save memory
        - reuse strings instead of creating duplicates
    
    So in java strings are immutable and are stored in string pool 1 time only.
    no new object is crated for duplicate strings.
    String a="Hello";
    String b="hello";
    Only  1 object is creted ;
    
- String Pool only stores unique string literals. 
- If a string literal already present in pool new one will not be created same will be referenced. 
- new String() will always creates a new object inside heap outside pool which will refere the actual pool object.
- but intern() will make a variable point to actual pool object insteaed of heap objet.
- String c= new String("Hello").intern();  // C will piont to Pool object instead of heap one. 
- `+` operator for strings will internally use String builder to contactinate the string and use new String to create a new contactinated string object. 



### Why Strings are immutable?

    - Because of String Pool that java uses to optimize memory and avoid creating object for duplicate String literals.

    - As we know java same string literal as referenced by same object
        So String a ="hello"
        String b = "hello"
        both a,b will point to same object
        Now if strings were mutable , if we change b="siso"
        this will change a also.
        So to avoid duplicate strings -> String Pool- using same object for duplicates-> its become necessary for string to be immutable.
    

## why String is immutable in Java/Python/JavaScript
    - Most of the high level language keeps string immutable becuase
        - security
        - thread saftey
        - memory optimization ( string polling, intering)
    
    # security:
        - 
        

