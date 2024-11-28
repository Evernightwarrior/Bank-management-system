
# Requirements for Bank Management System

## Software Requirements

1. **Java Development Kit (JDK)**
   - Version: **JDK 11** or above
   - The project uses Java as the primary programming language. Ensure you have the correct version of the JDK installed to build and run the application.

   **Installation:**
   - Download and install from the official [Oracle JDK Downloads](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or use [OpenJDK](https://openjdk.java.net/).
   
   Verify installation:
   ```bash
   java -version
   ```

2. **Integrated Development Environment (IDE)**
   - Recommended IDE: **IntelliJ IDEA** (or another Java-supporting IDE like Eclipse or NetBeans).
   - IntelliJ IDEA is suggested for its rich integration with Git, Java, and other tools.

   **Installation:**
   - Download from [IntelliJ IDEA Downloads](https://www.jetbrains.com/idea/download/).

3. **Git**
   - Git is required to clone and push changes to the GitHub repository.
   
   **Installation:**
   - Download and install from [Git Downloads](https://git-scm.com/).

   Verify installation:
   ```bash
   git --version
   ```

4. **GitHub Account**
   - Ensure you have a GitHub account to access the repository and make changes to the codebase.

   **Create an account:**
   - Sign up at [GitHub](https://github.com/).

---

## Library and Framework Requirements

- **Java Collections Framework**: The project uses the built-in Java collections such as `HashMap`, `PriorityQueue`, and `TreeMap` for efficient data management.

- **Java IO and File Handling**: The project uses Java's I/O libraries to handle file-based transactions and customer data management.

---

## Hardware Requirements

1. **Operating System**: 
   - Windows 10 or higher, macOS, or Linux (Ubuntu recommended for development).
   
2. **System Memory**: 
   - At least **4 GB of RAM** is recommended for smooth operation, especially if working with larger data sets.

3. **Storage Space**:
   - Minimum **1 GB of available disk space** for the project files and dependencies.

---

## Setup Instructions

1. **Clone the Repository**:
   To clone the repository, use the following command:
   ```bash
   git clone https://github.com/Evernightwarrior/Bank-management-system.git
   ```

2. **Open the Project**:
   - Open the project in IntelliJ IDEA or your preferred IDE.

3. **Build the Project**:
   - If using IntelliJ IDEA, it should automatically detect the project as a Java project and build it.
   - If necessary, ensure the **JDK** is set up correctly in your IDE.

4. **Run the Project**:
   - Run the `Main.java` file to start the application.
   
   For IntelliJ, go to **Run → Run 'Main'**.

---

## Future Enhancements

- Add database support (SQL or NoSQL) for storing customer and transaction data.
- Improve multi-threading for better performance in large data scenarios.
- Integrate with web technologies to create a web-based interface for the system.
