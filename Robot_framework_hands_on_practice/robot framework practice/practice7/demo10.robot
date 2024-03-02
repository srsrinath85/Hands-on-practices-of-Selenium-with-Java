*** Settings ***
Library    SeleniumLibrary
Library    DataDriver  file=.//resources//data.csv
Test Setup    opening application
Test Template    validate multiple data sets working with invalid and valid data
Test Teardown    Close Browser

*** Variables ***
${url} =  https://rahulshettyacademy.com/loginpagePractise/
${browser} =  chrome
#${uname} =  xpath =  //*[@id='username']
#${pwd} =  xpath =  //*[@id='password']
${btn} =  xpath =  //*[@id='signInBtn']
${error} =    css:.alert-danger

*** Test Cases ***
#Login with username ${username} and password ${password}
#Executing multiple data sets using csv ${username} and ${password}    xys    1234
Demo

*** Keywords ***
validate multiple data sets working with invalid and valid data
    [Arguments]    ${username}    ${password}
    Fill login form    ${username}    ${password}
    error correct message or not
opening application
    Open Browser    ${url}    ${browser} 
    Maximize Browser Window  
Fill login form
    [Arguments]    ${username}    ${password}
    Input Text    id:username    ${username}
    Input Password    id:password   ${password}
    Click Button    ${btn}
    Wait Until Element Is Visible    ${error}
error correct message or not
    # ${result} =  Get Text    ${error}
    # Log To Console    ${result}
    # Should Be Equal As Strings    ${result}    Incorrect username/password.   
    Element Text Should Be    ${error}    Incorrect username/password.    
    

