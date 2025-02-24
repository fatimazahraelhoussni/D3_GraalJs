# GraalJS Chart Generation with Spring Boot

This project demonstrates how to use **GraalJS** in a **Spring Boot** application to generate dynamic charts using JavaScript (D3.js or custom JavaScript code). The chart is rendered on the server side and returned to the frontend as an SVG.

## Project Structure

```
/src/main/java/com/example/demo
 ├── DemoApplication.java              # Main Spring Boot application class
 ├── controllers
 │   ├── ChartController.java         # Controller for handling chart requests
 ├── services
 │   ├── JavaScriptService.java      # Service responsible for generating the chart using GraalJS
 
```

## Features

- **Chart Generation**: The project uses GraalJS to execute JavaScript within the Spring Boot backend to generate an SVG chart.
- **Dynamic Data**: You can easily modify the chart data and appearance using JavaScript in the `JavaScriptService`.
- **Rendering**: The generated SVG is sent to the frontend and displayed in the `index.html` page.

## Prerequisites

To run this project, you'll need the following installed:

- **Java 17+** (for Spring Boot)
- **Maven** (for building the project)
- **GraalVM** (for running JavaScript within Java using GraalJS)
- **Spring Boot** (for building the backend application)

## Getting Started

### 1. Clone the repository

```
git clone <repository-url>
cd <project-directory>
```

### 2. Build the project

You can use Maven to build and run the project:

```
mvn clean install
```

### 3. Run the application

To start the application, run the `DemoApplication` class in your IDE or from the command line:

```
mvn spring-boot:run
```

This will start the Spring Boot application on `http://localhost:8080`.

### 4. View the Chart

Open your browser and go to `http://localhost:8080/chart`. The page will display the dynamically generated chart with the styling applied by the JavaScript code.

## Example Chart

The generated chart displays a set of bars with heights based on the array data `[10, 20, 30, 40, 50]`. You can modify this data in the `JavaScriptService` to change the chart dynamically.

## Contributing

Feel free to fork this project and submit pull requests. If you have suggestions or improvements, don't hesitate to open an issue.

