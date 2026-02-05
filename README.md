## 📅 Solution Designing(Design Principles & Patterns)

---

### 📅 Day 1 – Design Principles, GoF Patterns & Optional (Java 8)
**Date: 31-Jan-2026)**         
**Branch:** `java-design-pattern-practice`

#### 📂 Project Structure

```
BridgeLabz-Training/
|
├── 📁 java-design-pattern-practice/
│   ├── 📁 gcr-codebase/
│   │   └── 📁 JavaSolutionDesigning/
│   │       └── 📁 src/
│   │           └── 📁 com/
│   │               ├── 📁 DesignPattern/
|   |               └── 📁 Multithreading/
|   └── 📁 scenario-based-codebase/
|
└── README.md
```

#### 🔹 Design Principles Covered
- **SOLID Principles:** SRP, OCP, LSP, ISP, DIP  
- **Clean Code Principles:** DRY, KISS, YAGNI  
- Focus on maintainability, scalability, and loose coupling

#### 🔹 GoF Design Patterns
- **Singleton Pattern** – controlled object creation
- **Factory Pattern** – abstraction of object instantiation
- **Builder Pattern** – step-by-step object construction
- **Observer Pattern** – event-based communication
- Introduction to **UML diagrams** for pattern representation

#### 🔹 Java 8 – Optional Class
- Used to eliminate `NullPointerException`
- Practiced `of()`, `ofNullable()`, `isPresent()`, `ifPresent()`
- Applied `orElse()`, `orElseGet()`, `orElseThrow()` for safe defaults
- Solved real-world scenarios across **Student, Employee, Banking,
  E-Commerce, and System utility** modules

🔗 **Code Link:** 
👉 [Day 1 - Design Patterns](https://github.com/devarshim973/BridgeLabz-Training/tree/java-design-pattern-practice/java-design-pattern-practice/gcr-codebase/JavaSolutionDesigning/src/com/DesignPatterns/SmartUniversityLibraryManagementSystem)

---

### 📅 Day 2 – Java Multithreading
**(Date: 02-Feb-2026)**                  
**Branch:** `java-design-pattern-practice`

#### 🔹 Core Concepts
- **Process:** OS-level execution unit containing one or more threads  
- **Thread:** Lightweight sub-process; smallest unit of execution  
- Threads share process memory but have independent execution paths  
- **Multithreading:** Enables parallel task execution and better CPU utilization

#### 🔹 Pros & Cons
**Pros:** Better resource usage, faster execution, responsive GUI, fault isolation  
**Cons:** Complex code, synchronization overhead, debugging difficulty, deadlock & starvation risks

#### 🔹 Thread Lifecycle
- New → Runnable → Running → Blocked/Waiting → Terminated  
- Managed by JVM thread scheduler

#### 🔹 Thread Creation
- Extending `Thread` class  
- Implementing `Runnable` interface (preferred for flexibility)

#### 🔹 Thread Class Highlights
- Methods practiced: `start()`, `run()`, `sleep()`, `join()`, `yield()`, `isAlive()`  
- Thread naming, priority, interruption handling  
- **User vs Daemon threads** and JVM termination behavior  
- Explored `Thread.State`, `currentThread()`, and lifecycle monitoring

🔗 **Code Link:** 
👉 [Day 2 - Multithreading](https://github.com/devarshim973/BridgeLabz-Training/tree/java-design-pattern-practice/java-design-pattern-practice/gcr-codebase/JavaSolutionDesigning/src/com/MultiThreading)

