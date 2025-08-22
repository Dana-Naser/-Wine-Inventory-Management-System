# 🍷 Wine Inventory Management System

<img src="Wine.png" alt="Wine Inventory System" width="300" height="400"/>

**Wine Inventory Management System** is a Java-based application designed to help wineries and wine shops manage their bottle inventory, suppliers, and reports efficiently.  
The system supports adding new wine bottles, editing stock, generating reports, and storing data in a lightweight database.

> ✅ Developed as part of an **Object-Oriented Programming (OOP)** university course project.

---

## 📌 Features

- 📦 Track wine inventory (add/remove bottles)
- 🗂️ Manage suppliers and wine types  
- 📑 Generate inventory reports (JasperReports)
- 💾 Use embedded database (UCanAccess with MS Access)
- 🧪 Structured using clean MVC and OOP architecture

---

## 🛠️ Technologies Used

- **Java** (JDK 17+)
- **JavaFX** or **Swing** (depending on version)
- **UCanAccess** (JDBC-ODBC bridge for MS Access)
- **JasperReports** (report generation)
- **JSON** for configuration  
- IDE: **IntelliJ IDEA** / **Eclipse**

---

## 📁 Project Structure

```
Wine-Inventory-Management/
├── boundaryy/               # UI components
├── control/                 # Logic controllers
├── entity/                  # Core data models
├── current_inventory.json   # Inventory configuration
├── GenerateReport.jasper    # Compiled report
├── GenerateReport.jrxml     # Report design file
├── UCanAccess-5.0.1.bin     # Database connector
├── module-info.java         # Java module config
├── README.md                # This file
```

---


### Prerequisites

- Java installed (JDK 17+)
- Add UCanAccess `.jar` to your classpath
- Compatible IDE (e.g., IntelliJ, Eclipse)

### Running the App

1. Clone or download the repository  
2. Add database connector: `UCanAccess-5.0.1.bin`  
3. Open the project in your IDE  
4. Run `Main.java` from the `boundaryy` or `control` package

---

## 📊 Generating Reports

To generate PDF/printable reports:
- Use `GenerateReport.jrxml` for layout
- The system compiles it to `.jasper` and fills it with current inventory data

---

## 💾 Database

- Uses **MS Access (.accdb)** format
- UCanAccess allows seamless interaction with Access DB  
- No installation of MS Access needed

---

## 📜 License

This project was built for educational purposes.  
You are free to modify and reuse it for learning or academic use.

