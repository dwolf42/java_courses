Getting the fullname  
The User class provides the fields: ```firstName``` and ```lastName```.

Write a null-safety setter for both fields, and a combined getter to covert this:

Each of the setters only have to accept and set the value to a field if this value is not ```null``` or empty ```""```.
So the getter may return the user's full name by concatenating the ```firstName``` and the ```lastName``` having only
one whitespace between them.
If filed is not set, your getter must only return the other part, avoiding additional whitespaces.
In the case of both fields are empty, your getter must return the string ```"Unknown"```.
Here are some examples:

```User faruk = new User();  
faruk.setFirstName("Faruk");
faruk.setLastName("Swampeye");  
System.out.println(faruk.getFullName()); // Faruk Swampeye

User mamina = new User();  
mamina.setFirstName("Mamina");  
mamina.setLastName(null);  
System.out.println(mamina.getFullName()); // Mamina (without additional spaces)
```

