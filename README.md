# ERA Check History Quiz

## Introduction
This Android app is a basic history quiz consisting of five true-or-false questions. The app starts with a main screen where the user can begin the quiz. The quiz presents one question at a time, allows the user to answer true or false, and provides immediate feedback on whether the answer was correct. After answering all questions, the app displays the user's final score along with personalized feedback and an option to review the correct answers. Users can also exit the app from the results screen. The app uses multiple activities to manage navigation between the main menu, quiz, and results.

## Overview
This app is a straightforward history quiz that tests the user with five true-or-false questions. It has three main screens: a start screen to begin the quiz, a quiz screen where questions are displayed and answered, and a results screen showing the user's score and feedback. The app tracks the user’s answers, provides instant correctness feedback, and shows the results with an option to review correct answers before exiting. The app flow is managed through Android activities and intents.

## Features
1. Start Screen: A welcome screen with a button to begin the quiz.
   ![image](https://github.com/user-attachments/assets/0c2c7fca-d7b8-4691-9637-54be1c8fb0ae)

2. True or False Questions: The quiz presents five history questions that the user answers by selecting True or False.
   a) "The Great Wall of China was built over many centuries by different dynasties, not in a single project."
   ![image](https://github.com/user-attachments/assets/49a83c51-48dc-4552-860c-a47cd6f3f904)
   
   b) "The Declaration of Independence was signed in 1776."
    ![image](https://github.com/user-attachments/assets/1bf963c3-a834-42e5-8cd2-0d55a510756e)
   
   c) "The Titanic sank on its maiden voyage in 1912."
   ![image](https://github.com/user-attachments/assets/de319a37-f0ba-47ef-9274-a38087e3a462)
   
   d) "The Berlin Wall fell in 1989, marking the end of the Cold War era."
   ![image](https://github.com/user-attachments/assets/5df88172-9233-4f42-a2f7-61563505663c)
   
   e) "Julius Caesar was a dictator, but the first emperor of Rome was Augustus (his adopted heir)."
   ![image](https://github.com/user-attachments/assets/a23dcd14-320e-4048-bcdd-c50ad0c6d064)

3. Full screen background- Uses an ImageView to set backgrounds that sills the entire screen while creating an engaging and readable experience.
   
   ![image](https://github.com/user-attachments/assets/5df628b1-0c21-4098-ac5b-8cdd749146fb)
   
   ![image](https://github.com/user-attachments/assets/935b5b5b-ea9b-4e76-950b-47b50095c58e)
   
   ![image](https://github.com/user-attachments/assets/87f7ace7-7e4f-4624-a733-915775e54d95)

4. Feedback messages
a. "False, The Great Wall of China was built over many centuries by different dynasties, not in a single project."

b. "True,  The Declaration of Independence was signed in 1776."

c. "True, The Titanic sank on its maiden voyage in 1912."

d. "True, The Berlin Wall fell in 1989, marking the end of the Cold War era."

e. "False, Julius Caesar was a dictator, but the first emperor of Rome was Augustus (his adopted heir)."

![Screenshot 2025-05-20 202346](https://github.com/user-attachments/assets/75c28b13-5bd5-436f-832b-2df64f45330a)

                    
## Technologies Used
a. Android SDK 
b. Kotlin 
c. XML Layouts 
d. Android Studio 
e. Gradle

## Usage 
1. Launch the App
Open the ERA Check History Quiz app on your Android device.

2. Start the Quiz
Tap the "Start Quiz" button on the main screen to begin.

3. Answer Questions
a.You will be presented with a series of True/False history questions.
b. Tap "True" or "False" to select your answer.
c. Instant feedback ("Correct!" or "Incorrect!") will appear below the question.

4. Proceed Through Quiz
a. After answering, tap "Next Question" to continue.
b. Your score is tracked automatically.

5. View Your Results
a. After the final question, you’ll be taken to the Results screen.
b. View your final score and a motivational message based on your performance.

6. Review Correct Answers
Tap "Review Answers" to see explanations for all five questions.

7. Exit the App
Tap "Exit" to close the app completely.

## Troubleshooting
1. App Crashes on Launch
Possible Cause:
 Missing or incorrect layout XML references.

Solution:
Make sure all layout files (activity_main.xml, activity_quiz.xml, activity_results.xml) are present in the res/layout directory.
Ensure the correct setContentView(R.layout.activity_xyz) is used in each activity.

2. App Won’t Run on Emulator or Device
Possible Causes:
Minimum SDK version is not met.
Emulator is not properly configured.

Solutions:
Ensure your emulator/device API level is 21 or higher.
Clean and rebuild the project with Build > Clean Project and then Build > Rebuild Project.

## Git Hub automations 
 This is a basic workflow that is manually triggered 
 
name: Manual workflow 
 
 Controls when the action will run. Workflow runs when manually triggered using the UI 
 or API. 
on: 
  workflow_dispatch: 
    # Inputs the workflow accepts. 
    inputs: 
      name: 
        # Friendly description to be shown in the UI instead of 'name' 
        description: 'Person to greet' 
        # Default value if no value is explicitly provided 
        default: 'World' 
        # Input has to be provided for the workflow to run 
        required: true 
        # The data type of the input 
  type: string 
 
 A workflow run is made up of one or more jobs that can run sequentially or in parallel 
jobs: 
   This workflow contains a single job called "greet" 
  greet: 
    # The type of runner that the job will run on 
    runs-on: ubuntu-latest 
 
    # Steps represent a sequence of tasks that will be executed as part of the job 
    steps: 
    # Runs a single command using the runners shell 
    - name: Send greeting 
      run: echo "Hello ${{ inputs.name }}"

## Conclusion
ERA Check History Quiz is a lightweight, educational Android application designed to make learning history both fun and accessible. With a clean interface and immediate feedback, users can quickly assess their knowledge of key historical events while enjoying a smooth user experience. Whether you're a student brushing up for an exam or a trivia lover looking for a quick challenge, this app offers an engaging way to test and improve your history knowledge.

We welcome feedback and contributions to help make the app even better. Happy quizzing!


