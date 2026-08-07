# Projectile-Motion-Simulation-Project

## Table of Contents
- Visual of Simulation
- Features in Simulation
- Physics Concepts in Simulation
- How it Works
- Requirements
- How to Run
- Video Details for Simulation

## Visual of Simulation
<img width="1476" height="732" alt="Image" src="https://github.com/user-attachments/assets/3d3a8c94-09de-4470-a2ee-6be8ea2cabbd" />

## Features in Simulation
- Simulates four balls undergoing their own parabolic motion.
- Force of gravity decreases the vertical velocity component over the period of time.
- Horizontal velocity motion stays constant throughout the journey.
- Has animation with the use of Java Timer.
- Implemented ground detection checks for each seperate ball, when ball makes contact rest is approached (0m/s).
- Can distinguish between the angles 22.5, 45, 67.5, and 90.0 for distance observation records.

## Physics Concepts in Simulation
- Horizontal Velocity (vX) = v * cos * θ.
- Vertical Velocity (vY) = v * sin * θ.
- Trigonometric Functions (Sine, Cosine, & Tangent).
  
## How it Works
- The program runs a window that is 1200 by 600 in size.
- Initializes four balls on the screen from JLabels.
- Balls are launched basiced on the angle it creates with the ground.
- Positions of the balls are updated by the horizontal and vertical velocity components.
- All balls are in the air and curved in following u-shape motion.

## Requirements
- Java (JDK or higher).
- IDE (e.g., VS Code, Eclipse, or IntelliJ).
- Images files:
    1. ball.png
    2. ball2.png
    3. ball3.png
    4. ball4.png

## How to Run
1. Copy the code into a Java file named "ProjectileMotion.java".
2. Make sure the image files are in the same directory, or else the balls won't appear in the following window.
3. Compile the program: "javac ProjectileMotion.java".
4. Run the program: "java ProjectileMotion.java".
   
## Video Details for Simulation
The video showcases the physics calculations and coding for how this simulation was made. Experimentation with the launch angles and velocities of the balls were recorded in this simulation. Overall, this video will help give me a reflection on what I learned and for others who are interesed in physics and this topic :D.

Video Link of Simulating Projectile Motion in Java (YouTube) - [https://youtu.be/__3sOAAOZck?si=eiUUCmwvbQiKECO].
