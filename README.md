Task to EPAM  - CopyPrintSystem

Requirements to publicly available a public printer/copier at a university.
//////////////////////////////////////////////////////////////////////////////////////////////
Functional Requirements:

1.	User Authentication:
      •	The system must support authentication via student ID or else.
2.	Printing and Copying:
      •	The system must support printing documents from various formats (PDF, DOCX, JPEG, etc.).
      •	The system must support different paper sizes (A4, A3, letter, etc.).
      •	The system must allow users to select the number of copies.
      •	The system must allow users to choose single-sided or double-sided printing.
3.	Scanning:
      •	The system must support scanning documents and returning them to the user.
      •	The system must support different file formats for scanned documents (PDF, JPEG, etc.).
4.	Copying
      •	All devices must be able to copying documents independently of the system.
5.	  Maintenance Alerts:
        •	The system must user when consumables (paper, toner) are low or when maintenance is required.
6.	  Network Connectivity:
        •	The system must connect to the  network to receive print jobs from user devices.

Non-Functional Requirements:

1.	  Performance:
        •	The system should handle a high volume of print jobs during peak times without significant delays.
        •	The system should have a fast response time for user interactions (less than 2 seconds).
2.	Reliability:
      •	The system should recover automatically from minor faults and notify administrators of critical issues.
3.	Usability:
      •	The interface should be intuitive, with minimal training required for new users.
      •	The system should support multiple languages to accommodate international students and staff.
4.	Scalability:
      •	The system should be able to support additional printers/copiers as the university expands.
      •	The system should handle increased user loads during peak periods, such as exam times.

5.	Security:
      •	The security system should check the user before allowing interaction with the main system.
      •	The system should ensure user data (documents, credentials) is securely transmitted and stored.
6.	Maintainability:
      •	The system should have modular components to facilitate easy maintenance and upgrades.
      •	The system should log all transactions and events for troubleshooting and auditing purposes.
7.	  Compatibility:
        •	The system should be compatible with various operating systems (Windows, macOS, Linux) and mobile devices.
        •	The system should integrate with the university’s existing IT infrastructure and services.
8.	  Energy Efficiency:
        •	The system should meet energy efficiency standards to minimize power consumption.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
Use cases:

        
Use Case 1: User Authentication
Primary Actor: User
Goal: Authenticate the user to allow interaction with the system.
Preconditions: The user has a valid student ID or authentication credentials.
Postconditions: The user is authenticated and granted access to the system.
Steps:
1.	The user approaches the device and selects "Login" or scans their student ID card.
2.	The system checks the credentials.
      o	If valid, the system grants access and proceeds to the main interface.
      o	If invalid, the system displays an error message and asks for re-authentication.

      Use Case 2: Printing
      Primary Actor: User
      Goal: Print a document.
      Preconditions: The user is authenticated and has a document ready to print.
      Postconditions: The document is printed according to the user's preferences.
      Steps:
1.	The user selects "Print" from the main interface.
2.	The user uploads a document (PDF, DOCX, etc.) to the system.
3.	The user selects print settings:
      o	Paper size (A4, A3, letter, etc.)
      o	Number of copies
      o	Single-sided or double-sided printing
4.	The user confirms the settings and sends the document for printing.
5.	The system processes the print job and notifies the user when the document is ready.

      Use Case 3: Scanning
      Primary Actor: User
      Goal: Scan a document.
      Preconditions: The user is authenticated and has a document ready to scan.
      Postconditions: The document is scanned and returned to the user.
      Steps:
1.	The user selects "Scan" from the main interface.
2.	The user places the document in the scanner.
3.	The user selects scan settings:
      o	File format (PDF, JPEG, etc.)
4.	The user confirms the scan settings.
5.	The system scans the document and provides the user with options to:
      o	Download the scanned file
      o	Email the file
      o	Save to cloud storage (if enabled)
6.	The user selects the preferred option and completes the process.

      Use Case 4: Copying (Independent)
      Primary Actor: User
      Goal: Make copies of a document without interaction with the system.
      Preconditions: The device is powered on and operational.
      Postconditions: The document is copied.
      Steps:
1.	The user places the document in the copier.
2.	The user selects the number of copies and any other settings (e.g., color, single/double-sided).
3.	The copier makes the copies autonomously, without requiring network or system interaction.
4.	The copies are returned to the user.

      Use Case 5: Maintenance Alerts
      Primary Actor: System (Administrator receives notifications)
      Goal: Notify the administrator when consumables are low or when maintenance is needed.
      Preconditions: The system is connected and running.
      Postconditions: The system sends a maintenance alert to the administrator.
      Steps:
1.	The system monitors consumables (e.g., paper, toner).
2.	When a consumable is low, the system generates a maintenance alert.
3.	The system notifies the administrator via email or on the system interface.
4.	The administrator takes necessary action to replace the consumable or maintain the device.














