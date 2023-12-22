# README


## Table of Contents

- [Background](#background)
- [Install](#install)
- [Usage](#usage)

## Background

For time reasons this project is missing detailed tests and a detailed implementation.
I implemented a model controller structure to cleanly seperate the logic. Furthermore DB access is handeled by the repository classes and the service classes to handle business logic. 
I choose MongoDB for flexibility and speed in accessing Video files directly.
I worked on master since the project size / team size did not demand it.
Passwords are purposely not generated

## Install

### Java Development Kit (JDK):
Ensure that you have Java JDK 17 or a higher version installed. You can download it from the official Oracle or OpenJDK website.

### Maven:
Install Apache Maven. You can download it from the official Apache Maven website.

### MongoDB:
Install MongoDB on your local machine or use a cloud-based MongoDB service. Follow the MongoDB installation instructions for your operating system.
    

### Repository 
Clone the repository


## Setup

### MongoDB:
    Ensure that MongoDB is running and configured as follows: 
    Port 27017
    Name jvsapiDB
    Username JVSAPIServiceAccount
    Password password123

### Maven
Build the Project with the console command: 

    mvn clean install

## Usage

### Start the application

Start the Project with the console command: 

    mvn spring-boot:run
Reach the program at [http://localhost:8080](http://localhost:8080)

### Endpoints
#### /engagement/{videoId}
    GET     Returns the engagement statistics of the requested ID
#### /metadata
    POST    Modifies metadata for Video IDed by the ID in object
#### /videos/
    GET     Returns all available Videos
#### /videos/{videoId}
    GET     Returns video identyfied by requested ID
#### /videos/{videoId}
    POST    Uploads video with ID
#### /videos/{videoId}
    DELETE  Unlists video with ID
