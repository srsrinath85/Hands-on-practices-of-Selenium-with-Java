*** Settings ***
Library    SeleniumLibrary
Test Setup    opening application
Test Template    validte multiple data sets working with invalid and valid data
Test Teardown    Close Browser

*** Variables ***
${url} =  https://rahulshettyacademy.com/loginpagePractise/
${browser} =  chrome
${uname} =  xpath =  //*[@id='username']
${pwd} =  xpath =  //*[@id='password']
${btn} =  xpath =  //*[@id='signInBtn']
${error} =    css:.alert-danger
*** Keywords ***
validte multiple data sets working with invalid and valid data
    [Arguments]    ${username}    ${password}
    Fill login form    ${username}    ${password}
    error correct message or not
opening application
    Open Browser    ${url}    ${browser} 
    Maximize Browser Window  
Fill login form
    [Arguments]    ${username}    ${password}
    Input Text    ${uname}    ${username}
    Input Password    ${pwd}    ${password}
    Click Button    ${btn}
    Wait Until Element Is Visible    ${error}
error correct message or not
    # ${result} =  Get Text    ${error}
    # Log To Console    ${result}
    # Should Be Equal As Strings    ${result}    Incorrect username/password.   
    Element Text Should Be    ${error}    Incorrect username/password.    
    

*** Test Cases ***    username        password           
Invalid uname&pwd     rahulshetty     srinath   
Invalid uname&pwd     srinath          learning   
Invalid uname&pwd     @!#4rt234         het#@4342  
Invalid uname&pwd     123456w           hurtyerse
valid uname&pwd     rahulshettyacademy         learning