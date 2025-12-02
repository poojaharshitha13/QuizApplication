📚 Java Quiz Application

A simple and interactive Quiz Application built using Java Swing and CSV-based questions.  
This project demonstrates GUI development, file handling, and MVC architecture — suitable for learning and interviews.

  Features

-  Multiple-choice questions  
-  Questions loaded from `questions.csv`  
-  Next, Previous & Submit navigation  
-  Score calculation  
-  Clean GUI using Java Swing  
-  Fallback built-in questions if CSV not found  
-  Uses simple MVC structure  

 🧠 Technologies Used

- Java (JDK 17+)
- Java Swing (GUI)
- CSV File Handling
- MVC Architecture (Model-View-Controller)

 📁 Project Structure
 QuizApplication/
├── src/
│ ├── Main.java
│ ├── Question.java
│ ├── QuizController.java
│ ├── QuizModel.java
│ └── QuizView.java
├── questions.csv
└── QuizApplication.iml

---

▶️ How to Run

1️⃣ Clone the repository**
```bash
git clone https://github.com/poojaharshitha13/QuizApplication.git
cd QuizApplication
2️⃣ Run with Java
Compile:
javac src/*.java
Run:
java -cp src Main
Or run in IntelliJ IDEA
File → Open → Select the QuizApplication folder
Open Main.java
Click Run
📄 CSV Format (questions.csv)
Example:
Question,Option1,Option2,Option3,Option4,CorrectOptionIndex
Which planet is known as the Red Planet?,Earth,Mars,Jupiter,Venus,2
