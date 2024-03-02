*** Settings ***
Library    SeleniumLibrary
Test Teardown    Close Browser

*** Variables ***
${url} =  https://rahulshettyacademy.com/loginpagePractise/
${browser} =  chrome
${uname} =  xpath =  //*[@id='username']
${pwd} =  xpath =  //*[@id='password']
${btn} =  xpath =  //*[@id='signInBtn']
${error} =    css:.alert-danger
*** Keywords ***
opening application
    Open Browser    ${url}    ${browser} 
    Maximize Browser Window  
    # Create Webdriver    chrome    executable_path="D:\chromedriver.exe"
    # Go To    https://rahulshettyacademy.com/loginpagePractise/
Fill login form
    Input Text    ${uname}    rahulshetty
    Input Password    ${pwd}    123456
    Click Button    ${btn}
    Wait Until Element Is Visible    ${error}
error correct message or not
    # ${result} =  Get Text    ${error}
    # Log To Console    ${result}
    # Should Be Equal As Strings    ${result}    Incorrect username/password.   
    Element Text Should Be    ${error}    Incorrect username/password.    
    

*** Test Cases ***
opening web application
    opening application
    Fill login form
    error correct message or not

