# basics_of_oop

Exercise about the basics of oop.
 
- A class is a blueprint for an object -
- An object is basically everything, your headphones, computer, smartphone etc. -

The pillars of OOP are:
1. Encapsulation
   Private and public are access modifiers.
   To access a private variable we need setters and getters.
   This is called encapsulation.
<br/>


2. Abstraction
   -> Interface
   An interface is just a list of objects and methods.
   Like everything about object-oriented programming is just a list of variables and methods.
   There don't have to be any implemented methods, because in an interface we're just listing these methods up.
   Which leads to abstraction, which means, only the details the user needs to know are there and
   everything else is hidden.
   Like the power switch of your monitor, you only know that it turns on the screen, but how exactly it works is hidden.
   The interface of Example5 is completely abstracted, because it doesn't say how openBag() is implemented,
   it doesn't show what the code is for openBag().
   <br/>


3. Inheritance
   When we extend Example2 with Example1, like we did here, than this is inheritance. We inherit the methods, objects,
   variables of Example2, into Example1.
   So if you see something like "public class Example1 extends Example2", this means there is an inheritance
   relationship here.
   Example1 is the sub-class and the one it inherits is the super-class.
   Inheritance is good for the reusability of code.
<br/>  


4. Polymorphism
   We can have multiple methods with the same name, but with different parameters (those inside the parenthesis).
   Polymorphism means many forms, so a method could have many forms, like sayName() and sayName(String name).
   This is also called overloading a method.
   The other type of polymorphism is overwriting a method.
   In Example2 we have a sayHi method, which is overwritten by the sayHi method in Example1.

---
## Prerequisites to run my Java programs

At this point I assume you already have installed the JDK
(Java Development Kit), as well as the JRE (Java Runtime Environment).
In case there is one of them missing, you can get both here:

- [ ] `JDK`: https://www.oracle.com/java/technologies/downloads/
- [ ] `JRE`: https://java.com/en/download/

---
## 1# Compiling a JAVA file:

-   Download all Java files related to the program you are intending to run in
    a new folder on your desktop.
    <br/><br/>
-   Open Windows start menu, type CMD and run it.
    <br/><br/>
-   The standard directory you are currently in is usually<br/>
    `C:\Users\YOUR_USERNAME` (on Win10 at least).
    <br/><br/>
-   Navigate to the folder you created previously, type<br/>
    `cd Desktop\FOLDER_NAME` into the CMD and hit `enter`.
    <br/><br/>
-   In order to compile your project to bytecode,<br/>
    type `javac FILENAME.java` and, again, hit `enter`.
    <br/><br/>
-   Now you have the `FILENAME.class` in your folder at the desktop.<br/>
    You can check this by typing `dir` into CMD, followed by `enter`.<br/>
    This lists all files inside that folder.

## 2# Running a CLASS file:
-   For the program to be executed, you need to run the file containing the
    `main method`. To do so, you either open each `.java` file by  making a
    `right-click` on the file, choose `Open with...`, select `Notepad`.
    Now look in the first couple of code for a line called
    `public static void main(String[] args) {`.
    <br/><br/>
- Too complicated? I've got your back!<br/>
  Alternatively, you may just run one file after another until you found the
  correct file ;)
  <br/><br/>
- Since you should still be in your folder on the desktop (see step 1#),
  just enter `java FILENAME` and hit `enter`.
---
## TROUBLE SHOOTING:

Unable to run `javac` or `PATH` entry / `Environment Variable` is missing.
To fix this, `open` Windows start menu and type `environ`, this should be
enough to bring up `Edit the system environment variables` - run it.

-   Go to the `Advanced` tab (top side) and click `Environment Variables…`
    <br/><br/>
-   In the lower part of the upcoming window, you find the `System variables`,
    look for the entry named `Path` (*take care, there is another entry with a similar name*),
    `highlight / single click` it and click `Edit…`
    <br/><br/>
-   There should be a variable called `C:\Program Files\Java` or similar.
    Mine contained something with *Oracle* in it. `Select it` and click `Browse…`
    <br/><br/>
-   Now, navigate to `C:\Program Files\Java\` - select the `Bin` folder -
    hit 4 times `OK`, once  in each window.
    <br/><br/>
-   In case your CMD is open, `close` and `re-open` it. You now can run `javac`.