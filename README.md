![Splash Screen](https://github.com/user-attachments/assets/8da03c76-3c8b-4b9b-ab31-81ce03133199)




SplashActivity:
 Display Splash Screen with app name, your name, student number, and logo
 If main button clicked:
 Navigate to MainActivity
 If Exit button clicked:
 Close the app
MainActivity:
 Initialize dates as ArrayList<String>
 Initialize morningSpending as ArrayList<Int>
 Initialize afternoonSpending as ArrayList<Int>
 Initialize activityNotes as ArrayList<String>
 
 Initialize dateEditText
 Initialize morningSpendingEditText
 Initialize afternoonSpendingEditText
 Initialize activityNotesEditText
 Initialize addButton
 Initialize clearButton
 Initialize detailedViewButton
 On addButton click:
 Retrieve date from dateEditText
 Retrieve morningScreenTime from morningSpendingEditText
 Retrieve afternoonScreenTime from afternoonSpendingEditText
 Retrieve notes from activityNotesEditText
 If all inputs are valid:
 Add date to dates
 Add morningScreenTime to morningSpending
 Add afternoonScreenTime to afternoonSpending
 Add notes to activityNotes
 Clear input fields
 Show success message
 Else:
 
 Show error message
 On clearButton click:
 Clear dates
 Clear morningSpending
 Clear afternoonSpending
 Clear activityNotes
 Show data cleared message
 On detailedViewButton click:
 Create Intent to navigate to DetailedViewActivity
 Pass dates, morningSpending, afternoonSpending, activityNotes to DetailedViewActivity
 Start DetailedViewActivity
 
DetailedViewActivity:
 Initialize detailsTextView
 Initialize averageTextView
 Retrieve dates from Intent
 Retrieve morningSpending from Intent
 Retrieve afternoonSpending from Intent
 Retrieve activityNotes from Intent
 Initialize details as StringBuilder
 Initialize totalSpending as 0
 For each date in dates:
 Append date, morningSpending, afternoonSpending, and notes to details
 Add morningScreenTime and afternoonSpending to totalSpending
 If dates is not empty:
 Calculate averageSpending as totalScreenTime / number of days
 Else:
 
 Set averageScreenTime to 0
 Display details in detailsTextView
 Display averageSpending in averageTextView
 On backButton click:
 Finish current activity and navigate back to MainActivity
