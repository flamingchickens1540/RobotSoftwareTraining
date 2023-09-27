# Getting a C1 in Robot Software
## Downloading the repository and setting up your branch
* Make sure you have git installed on your computer
* Create a new folder on your computer with nothing in it for robot code (if you have already done this skip this step).
* Open that folder on VS Code.
* Find the terminal at the bottom of Vs Code (if this is hidden you can show it under View and Terminal).
* Into the terminal enter `git clone https://github.com/flamingchickens1540/RobotSoftwareTraining` (this will download the repository onto your computer).
* Into the terminal enter `cd RobotSoftwareTraining` (this will move you to the RobotSoftwareTraining folder in the terminal).
* Into the terminal enter `git checkout c1Template` (this will switch to the c1Template branch).
* Into the terminal enter `git checkout -b *your first name*c1` (this will create a new branch called `*your first name*c1` and then switch to it).
## Libraries
* Fishstick uses TalonSRX motor controllers provided by the [Phoenix library](https://docs.wpilib.org/en/stable/docs/software/vscode-overview/3rd-party-libraries.html#libraries). You will need to install it before you can control the drive motors
