![image](https://github.com/user-attachments/assets/0f069a67-8282-47dd-8742-4936fb8d6e35)
BEGIN
    // Initialize arrays for data storage
    days[] = {"2024-04-02", "2024-04-03", "2024-04-04", "2024-04-05", "2024-04-06", "2024-04-07", "2024-04-08"}
    morningScreenTime[] = {60, 12, ##, ##, ##, ##, ##}
    afternoonScreenTime[] = {100, 200, ##, ##, ##, ##, ##}
    activityNotes[] = {"Purchaed lunch and snacks", "Bought coffeee and study supplies", "", "", "", "", "Forgot wallet at home"}

    // Splash Screen
    DISPLAY logo, app name, user name, student number
    BUTTON "Navigate to Main Screen"
    BUTTON "Exit App"

    IF Navigate Button Pressed THEN
        GO TO Main Screen
    ELSE IF Exit Button Pressed THEN
        EXIT program

    // Main Screen
    DISPLAY input fields for morning and afternoon screen DAYS
    DISPLAY input field for activity notes
    BUTTON "View Detailed Data"
    BUTTON "Clear Data"

    IF "View Detailed Data" Button Pressed THEN
        VALIDATE inputs
        IF VALID THEN
            GO TO Detailed View Screen
        ELSE
            DISPLAY error message

    IF "Clear Data" Button Pressed THEN
        RESET all input fields

    // Detailed View Screen
    DISPLAY dataset in a table layout or list view
    CALCULATE average screen time
    CALCULATE day with the most screen time
    CALCULATE day with the least screen time
    DISPLAY calculated values
    BUTTON "Back to Main Screen"

    IF "Back to Main Screen" Button Pressed THEN
        GO TO Main Screen
END
Validation Logic

FUNCTION validateInput(morning, afternoon):
    IF morningTime < 0 OR afternoonTime < 0 THEN
        RETURN "Error: Screen time cannot be negative"
    END IF

    IF morning + afternoon > 1440 THEN
        RETURN "Error: Total screen time exceeds 24 hours"
    END IF

    RETURN "Valid"
END FUNCTION
Calculation Logic

FUNCTION calculateAverage(morningTimes[], afternoonTimes[]):
    totalMinutes = SUM of morningTimes + SUM of afternoonTimes
    days = LENGTH of morningTimes
    RETURN totalMinutes / days
END FUNCTION

FUNCTION findMaxDay(morningDays[], afternoonDays[], days[]):
    totalTimes[] = [morningDays[i] + afternoonDays[i] FOR EACH i IN morningDays]
    maxIndex = INDEX of MAX(totalTimes)
    RETURN days[maxIndex]
END FUNCTION

FUNCTION findMinDay(morningDays[], afternoonDays[], days[]):
    totalTimes[] = [morningTimes[i] + afternoonDays[i] FOR EACH i IN morningDays]
    minIndex = INDEX of MIN(totalTimes)
    RETURN days[minIndex]
END FUNCTION
Error Handling

IF user enters invalid input THEN
    DISPLAY error message
        "Invalid input. Please enter correct value spent."
END IF

IF activity notes LENGTH > 250 THEN
    DISPLAY error message
        "Activity notes are too lengthy. Please shorten them."
END IF
Splash Screen Navigation

IF user presses "Navigate to Main Screen" THEN
    GO TO Main Screen
ELSE IF user presses "Exit App" THEN
    TERMINATE program
END IF
Detailed View Screen Navigation

DISPLAY:
    Table of daily screen time and activity notes
    Day with most screen time
    Day with least screen time
    Average screen time

IF user presses "Back to Main Screen" THEN
    GO TO Main Screen
END IF

