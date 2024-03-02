*** Settings ***
Library    SeleniumLibrary
Resource    D://robot framework practice//practice2//resource.robot
Test Setup    opening browser with an application
Test Teardown    Close Browser


*** Keywords ***

Fill login form
    [Arguments]    ${value}    ${invalid_password}
    Input Text    ${uname}    ${value}
    Input Password    ${pwd}    ${invalid_password}
    Click Button    ${btn}
    Wait Until Element Is Visible    ${error}
error correct message or not
    Element Text Should Be    ${error}    Incorrect username/password.  

Fill login form to display home page
    [Arguments]    ${value}    ${valid_password}
    Input Text    ${uname}    ${value}
    Input Password    ${pwd}    ${valid_password}
    Click Button    ${btn}
    Wait Until Element Is Visible    ${btns}
*** Test Cases ***
validate unsuccessful login
    #[Tags]    SMOKE
    Fill login form    ${value}    ${invalid_password}
    error correct message or not
validate successful login    
    Fill login form to display home page    ${value}    ${valid_password}

