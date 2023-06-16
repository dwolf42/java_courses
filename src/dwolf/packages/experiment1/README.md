# packages

As I learned about packages, how to use and name them.
This guided me the way to properly rename my whole folder or package structure.
I liked it most to learn how to use the import statement
at the beginning of a Java file, to make use of a class and its
features and the advantage of writing the full name of a
class to do the very same thing. It was super exciting to me.

Because of that, you find one of my classes imported by the
import statement at the top, and another imported by its name within the code.
Java's standard class Scanner was a good orientation on how to
properly do so.

In this experiment I access my clock project, to ask for the
time to be input and print it.
I soon recognized that the name I choose for the Display class
was not quite ideal, as I got my self confused by it when I
simply tried to print the current time.

This will remind me in future projects to take more care about
the naming, so the usage of classes and methods will feel more
natural to the person who's working with my code.

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