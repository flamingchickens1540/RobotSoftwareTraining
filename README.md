# Robot Software Training
Training materials for new robot software members.

If you don't know how to program in Java, or haven't installed WPILib and reviewed its
documentation, talk to a manager before getting started with these materials.

> :warning: **In these materials, we assume that you have at least some
> experience programming in Java and know how to competently use a computer. If
> this is not the case, speak with a manager to plan out your next steps**

### Setting up your workspace
The first thing that you will want to do is set up your workspace. We don't have
a standard development environment, but we do use Git and Github for
collaboration and code version control. Git is a tool that allows you to track
changes in your code, upload code to the web, and allows us to manage our projects 
efficiently. Github is an online tool that allows us to store and share code, and 
collaborate on our projects.

If you already have experience with Git and Github and know what you are doing, the 
rest of this document doesn't apply to you. You should clone this repository and read 
the instructions on the branch correspoinding to the cert that you are trying to get.
 - [Robot SW 1](https://github.com/flamingchickens1540/RobotSoftwareTraining/tree/c1Template) 
 - [Robot SW 2](https://github.com/flamingchickens1540/RobotSoftwareTraining/tree/c2Template) 

Otherwise, if you don't know how to use Git, proceed to the next section.

#### Installing Git
First, check if you already have Git installed. Open up your terminal app, and enter the 
command `git --version` and hit enter. If the terminal outputs something like 
`git version *version number*`, you already have Git installed and you can move on to 
the next section.

If the terminal instead gives you an error when you try to run the command, you
do not have Git installed, and should proceed to the proper install page for
your operating system, and follow the relevant instructions:
 - [Windows](https://git-scm.com/download/win)
 - [MacOS](https://git-scm.com/download/mac)

If there are any problems with the installation, feel free to contact a manager
or another member of the department.

#### Setting up your working directory
Now that you have installed Git, you can now set up your workspace for robot
software. First, open your file browser ("File explorer" on Windows, "Finder" on
MacOS) and create a new folder called something like "`RobotCode`" in a place that 
you'll be able to get to later (your `Documents` folder is a great place!). Make 
sure that this <u>isn't</u> your `Downloads` folder, since you may accidentally 
delete all your work when you clean your disk!

### Getting started
Now that you have set up your workspace and Git correctly, you can now get
started on robot software! 

#### Cloning the repository
First, you'll want to navigate to the folder that you created earlier in your file 
explorer. Right click on the folder and choose the option to "Copy address" on Windows 
or "Copy \*folder name\* as Pathname" on MacOS to copy the address of the folder.

Next, open up your terminal and run the command `cd *paste the folder address
here*`, so that all of your future commands will be run in this folder. Then,
enter the command `git clone https://github.com/flamingchickens1540/RobotSoftwareTraining.git`
This copies, or "clones " the contents of this repository onto your computer. 
When you navigate back to your workspace folder, you should find that there is 
now a new folder in it called "RobotSoftwareTraining". This will be the folder 
where you will write your code for your first two certifications.

#### Getting the proper template code
However, you aren't done yet. What you have on your computer right now is the
`main` branch of that repository, which only contains these instructions here.
Each branch of a Git repository contains a different version of the code that
allow you to test different features and ideas without affecting the main
version of the code. To get the template code for your certifications, you will 
have to change your Git branch to the branch with the relavant template.

To do this, you will first have to type the command `cd RobotSoftwareTraining`
in order to have all your future commands be run in your project folder. Then,
type `git checkout c1Template` to checkout the branch with the template code for
a Robot SW 1 certification. Change "`c1Template`" to "`c2Template`" if you are
working on a Robot SW 2.

#### Opening up your project folder in your IDE
Now that you have the proper template downloaded onto your computer, all that 
remains is to open it up in WPILib VSCode. First, open up WPILib VSCode (make
sure this isn't normal VSCode, since it won't have the proper features necessary
for robot software), and click File > Open Folder, and navigate to your project
folder and select it. Now, your robot code template should be open in VSCode

### Next steps
Now that you've finished all of the setup and configuration, you can start
programming robots! To get started in the best department on the team, you can
now proceed to the [instuctions](https://github.com/flamingchickens1540/RobotSoftwareTraining/tree/c1Template)
for getting a Robot SW 1 cert.

### Important downloads:
 - [WPILib installation](https://docs.wpilib.org/en/stable/docs/zero-to-robot/step-2/wpilib-setup.html)
 - [3rd party vendordeps](https://docs.wpilib.org/en/stable/docs/software/vscode-overview/3rd-party-libraries.html)
 - [Git installation](https://git-scm.com/downloads)

### Useful reference materials:
 - [WPILib documentation](https://docs.wpilib.org/en/stable/index.html#) (very helpful)
 - [Git tutorial](https://www.w3schools.com/git/) (also very helpful)
