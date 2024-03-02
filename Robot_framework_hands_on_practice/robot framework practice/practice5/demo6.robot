*** Settings ***
Library    SeleniumLibrary
Library    Collections
Resource    D://veera project//seperat//robot framework practice//practice5//resource5.robot
Test Setup    opening browser with an application
#Test Teardown    Close Browser


*** Keywords ***

Fill login form
    Input Text    ${uname}    ${value}
    Input Password    ${pwd}    ${valid_password}
    Click Element    ${radio_btn}
    Wait Until Element Is Visible    css:.modal-body
    Click Button    ${alert}
    Click Button    ${alert}
    Wait Until Element Is Not Visible    css:.modal-body
    Select From List By Value    ${drop_down}    teach
    Select Checkbox    id:terms    
    Click Button    ${btn}
    Wait Until Element Is Visible    ${btns}
    Checkbox Should Be Selected    id:terms










*** Test Cases ***
# validate unsuccessful login
#     Fill login form    ${value}    ${invalid_password}
#     error correct message or not
validate successful login    
    Fill login form