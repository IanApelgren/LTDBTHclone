# Lock The Doors, Batten The Hatches, A Cyber Security GUI
 
Developers
----------
Ian Apelgren & James Cooke

Project Type
----------
Java swing application, incorporating linux/windows scripts, and external security applications. 

Project Domain
----------
This project will be focused around Cyber Security and education aimed specifically at novices in the field. 
The product intends to have a good balance of housing practical tools for the average homeowner whilst educating the user on why the tools have been incorporated and their use.

Description
----------
Lock The Doors, Batten The Hatches intends to provide a safe user-friendly suit of tools aimed at educating cyber security novices on how to protect their
home and/or business on both the system side with tools like a secure password generator, and on the network side with tools like wireshark and netsh.
Other tools incorporated will include applications created by external companies and also tools created by the developers at Synergy Systems INC.
Lock The Doors, Batten The Hatches is a scalable application, meaning, the amount of tools and resources the application provides can be increased with time.
Currently the application houses 12 tools, 6 system tools, and 6 network tools as well as a plethora of useful links.

Features Implemented
----------
Working Graphical User Interface
 - Implemented with Java Swing Library

Local Account Registration
 - Implemented with JDBC external Java Library for MySQL database querying.

Local Account verification and Login
 - Implemented with JDBC external Java Library for MySQL database querying.

Main Splash Screen was 3 categories.
 - Implemented with Java Swing Library (JButton, JLabel, JTextField)

Password Generator Tool
 - Implemented with Java Swing Library (JButton, JLabel, JTextField, JCheckBox) and Java data structures.

Cross Operating System Functionality
 - Implemented with Java System Class and logic.

Launching External Applications
 - Implemented with Java Runtime Class.

Command Prompt / Terminal Querying.
 - Implemented with Java Runtime Class.
 
Command Prompt / Terminal output parsing.
 - Used in IP Config tool and MAC Address Finder for displaying output.

Tools Images
 - Implemented with Java Swing Library (IconImage).

URL Opening
 - Implemented with Java Desktop Class and URI Object.

Unique Tool Windows
 - Each Tool has its own unique window.
 - Implemented with Java Swing Library (JButton, JLabel, JTextField, JCheckBox, IconImage).

*The single executable/.jar feature was discontinued as our implementation did not allow us to display the images on the window*

Links
----------
GitHub Link: https://github.com/cookejm1/LockDoorsBattenHatchesGUI

Demo and Installation Guide: https://www.youtube.com/watch?v=DjhvUWfFUHo&ab_channel=JamesCooke

Challenges 
----------
Challenges for the team include: making the application layout and tools user friendly, 
making the graphical user interface itself and integrating tools, adding images to swing applications while keeping the look, feel, and size we wanted.

Installation
----------
Before begin the installation process make sure to have a Java Development Kit and Virtual Machine installed.

Java Development Kit: https://www.oracle.com/java/technologies/downloads/#jdk19-windows

Java Virtual Machine: https://www.java.com/en/download/

Please restart you machine after installing these.

1) Create a new folder on your Desktop.

2) Open the terminal/command prompt and navigate to the folder you just created:

   cd ./Desktop./*YOURFOLDERNAMEHERE*

3) Once inside the directory enter:

   git clone https://github.com/cookejm1/LockDoorsBattenHatchesGUI
   
   You will now have a copy of the source files.
   
4) Navigate to the source files via:

   cd ./LockTheDoorsBattenTheHatches/src/com/ltdbth/gui
 
5) Once inside enter:

   javac *.java
   
   This shall compile all source files. Ignore the two warnings.
   
6) Enter:

   java login
   
   And the application will launch.
   
Please refer to the "Demo and Installation guide linked above if any issues happen
