*** Settings ***
Library    SeleniumLibrary
Test Setup    opening application
Test Teardown    Close Browser

*** Variables ***
${url} =  https://rahulshettyacademy.com/loginpagePractise/
${browser} =  chrome
${uname} =  xpath =  //*[@id='username']
${value} =  srinath
${pwd} =  xpath =  //*[@id='password']
${val} =  1235
${btn} =  xpath =  //*[@id='signInBtn']
${error} =    css:.alert-danger
*** Keywords ***
opening application
    Open Browser    ${url}    ${browser} 
    Maximize Browser Window  
    # Create Webdriver    chrome    executable_path="D:\chromedriver.exe"
    # Go To    https://rahulshettyacademy.com/loginpagePractise/
Fill login form
    Input Text    ${uname}    ${value}
    Input Password    ${pwd}    ${val}
    Click Button    ${btn}
    Wait Until Element Is Visible    ${error}
error correct message or not
    # ${result} =  Get Text    ${error}
    # Log To Console    ${result}
    # Should Be Equal As Strings    ${result}    Incorrect username/password.   
    Element Text Should Be    ${error}    Incorrect username/password.    
    

*** Test Cases ***
opening web application
    Fill login form
    error correct message or not

