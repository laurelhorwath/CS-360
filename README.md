CS 360 Module Eight Journal – Inventory App





1. Briefly summarize the requirements and goals of the app you developed. What user needs was this app designed to address?

The goal of the app was to create a mobile inventory management system that allows users to log in securely and manage inventory items. It was designed to help users easily track, update, and organize inventory while providing optional SMS alerts for low stock.



2. What screens and features were necessary to support user needs and produce a user-centered UI for the app? How did your UI designs keep users in mind? Why were your designs successful?

The app required a login screen, an inventory grid view, and screens for adding, editing, and deleting items. I kept the UI simple with clear labels, consistent layouts, and intuitive navigation so users could manage inventory without confusion. The designs were successful because they prioritized ease of use and efficiency.



3. How did you approach the process of coding your app? What techniques or strategies did you use? How could those techniques or strategies be applied in the future?

I broke coding into phases: login, database setup, CRUD functionality, and SMS permissions. I used modular code, consistent naming conventions, and inline comments to keep the code organized. This structured approach can be applied to future projects to manage complexity and reduce errors.



4. How did you test to ensure your code was functional? Why is this process important, and what did it reveal?

I tested with the Android Emulator, running scenarios like correct and incorrect logins, creating accounts, adding/editing/deleting inventory items, and granting or denying SMS permissions. Testing revealed edge cases, such as handling invalid logins, and confirmed that the app worked even without SMS permissions. This process was important for ensuring reliability and user trust.



5. Consider the full app design and development process from initial planning to finalization. Where did you have to innovate to overcome a challenge?

I had to innovate when handling SMS permissions. If users denied permissions, the rest of the app still needed to function smoothly. Adding condition checks and fallback behavior solved this challenge. I also had to carefully structure the database to ensure persistence and proper grid display.



6. In what specific component of your mobile app were you particularly successful in demonstrating your knowledge, skills, and experience?

I was most successful in implementing the CRUD database functionality. It demonstrated my ability to connect the backend (SQLite database) with the frontend UI, ensuring that user actions updated the app in real time while maintaining data persistence.

