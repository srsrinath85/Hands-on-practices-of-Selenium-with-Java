*** Settings ***
Library    SeleniumLibrary
Resource    D://robot framework practice//assingmentOrangeHRM//Assingment.robot
Resource    D://robot framework practice//assingmentOrangeHRM//Generic.robot


*** Test Cases ***
#TC_01
Opening application and login with valid details 
    Generic.Opening an OrangeHrm Application
    Verify the user account to login to be available
    #Verify the user is getting personal info page after login
#TC_02
Adding users form admin portal
   Assingment.Clicking on the admin page
   Enter the details in the form


#TC_04
# Verifying Timings of the user In
#     Opening Punch In User

#TC_05
# Verifying the dashboard content
#     Assingment.Verifying Pie Charts in Frames

#TC_06
# Verifying Timings of the user out
#     Opening Punch out User

#TC_07
# Verify Logout
#     OrangeHrm Logout page
#     Assingment.OrnageHRM Dropdown Logout page
