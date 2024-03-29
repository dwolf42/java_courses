# CoffeeMachine final_stage
### What I've learned, except all the theory stuff:
A learning has been an understanding of why many people on the internet say the main method should only contain an initial call for a method. Nothing more.
You can not call the main method from another method, but if your method ends, the main method will be proceeding where it stopped last time.
In case the stopping point was a break in a switch statement, and there is no further code after that switch statement, your program ends there.
That's the principle of sequential flow. At least, I think it is.

Paper is your best friend, when it comes to code.
I like to start hacking stuff in my keyboard, trying out things, move code from here to there, implement, remove stuff, you name it.
But as simple as it might sound in the first place to process a string depending on the machine state, which is represented by an enum, as hard it was for me to wrap my head around it.
I'm not sure if staring at all of my code was some kind of overloading my brain, or if the near finish line of this course was intimidating me. What I know is, that it was not a sane idea to have a nearly three months break after just been learning OOP and enums, even if it was for important reasons. It took me some days to admit to myself that I can't just jump right back in without taking a deeper look at what I've learned so far and experiment with it.
Another couple of days accompanied by rising frustration and rising doubts about my general ability to code had to pass by befor I finally grabbed a darn piece of paper and a pencil, to write down what I need to code in order to make this thing working.
I had no clue about it can be this hard to get back to the "coding thinking", so my shout-out to every other new programmer is: Keep on it. Every day. And use a sheet of paper to write a concept!


### Description
Let's redesign our program and write a class that represents a coffee machine. The class should have a method that takes a string as input. Every time the user inputs a string to the console, the program invokes this method with one argument: the line that the user inputs to the console. This system simulates pretty accurately how real-world electronic devices work. External components (like buttons on the coffee machine or tapping on the screen) generate events that pass into the single interface of the program.

The class should not use system input at all; it will only handle the input that comes to it via this method and its string argument.

The first problem that comes to mind: how to write that method in a way that it represents all that coffee machine can do? If the user inputs a single number, how can the method determine what that number is: a variant of coffee chosen by the user or the number of the disposable cups that a special worker added into the coffee machine?

The right solution to this problem is to store the current state of the machine. The coffee machine has several states it can be in. For example, the state could be "choosing an action" or "choosing a type of coffee". Every time the user inputs something and a program passes that line to the method, the program determines how to interpret this line using the information about the current state. After processing this line, the state of the coffee machine can be changed or can stay the same.

Remember, that:

For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.
Objective
Your final task is to refactor the program. Make it so that you can communicate with the coffee machine through a single method.

Example
Your coffee machine should have the same initial resources as in the example (400 ml of water, 540 ml of milk, 120 g of coffee beans, 9 disposable cups, $550 in cash).
The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

Write action (buy, fill, take, remaining, exit):
> remaining

The coffee machine has:
400 ml of water
540 ml of milk
120 g of coffee beans
9 disposable cups
$550 of money

Write action (buy, fill, take, remaining, exit):
> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
> 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit):
> remaining

The coffee machine has:
50 ml of water
465 ml of milk
100 g of coffee beans
8 disposable cups
$557 of money

Write action (buy, fill, take, remaining, exit):
> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
> 2
Sorry, not enough water!

Write action (buy, fill, take, remaining, exit):
> fill

Write how many ml of water you want to add:
> 1000
Write how many ml of milk you want to add:
> 0
Write how many grams of coffee beans you want to add:
> 0
Write how many disposable cups you want to add:
> 0

Write action (buy, fill, take, remaining, exit):
> remaining

The coffee machine has:
1050 ml of water
465 ml of milk
100 g of coffee beans
8 disposable cups
$557 of money

Write action (buy, fill, take, remaining, exit):
> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
> 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit):
> remaining

The coffee machine has:
700 ml of water
390 ml of milk
80 g of coffee beans
7 disposable cups
$564 of money

Write action (buy, fill, take, remaining, exit):
> take

I gave you $564

Write action (buy, fill, take, remaining, exit):
> remaining

The coffee machine has:
700 ml of water
390 ml of milk
80 g of coffee beans
7 disposable cups
$0 of money

Write action (buy, fill, take, remaining, exit):
> exit
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