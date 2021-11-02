***Currently working on project. Features not fully implemented.***

# Food-4-Kids
Designed and programmed a Java script for creating weekly nutritional menus on MS Excel for my family’s local business. Files upload on GitHub are modified, as to not reveal sensitive information.

### Included Files + Usage
1. ***"Menus.java"*** - Is the main java page. Reads food items from "Food Items" folder. Randomizes weekly food items and checks that food items do ***NOT*** repeat more than two times ***in a row***. Also calls PrintExcelFile.java to print data into a Microsoft Excel Spreadsheet. 
2. ***"PrintExcelFile.java"*** - Is responsible for formatting the data (Food items, acquired from Menus.java) into a Microsoft Excel File. It utilizes Apache POI to create a workbook, spreadsheets, cell outlines, and various data formats. 
3. ***"Food Items"*** - A folder containing four .txt files: Fruits.txt, Grains.txt, Proteins.txt, Vegetables.txt. Each file will contain a vertical list of food items (1 food item per line) that the establishment can serve that week. 
