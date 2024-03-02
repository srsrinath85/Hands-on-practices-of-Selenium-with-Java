*** Settings ***
Library    SeleniumLibrary
Resource    D://robot framework practice//practice9po//PO//Genric.robot

*** Variables ***
${error} =    css:.alert-danger





*** Keywords *** 
Fill login form 
    [Arguments]    ${value}    ${valid_password}
    Input Text    ${uname}    ${value}
    Input Password    ${pwd}    ${valid_password}
    Click Button    ${btn}

wait until Element is located in the page
    wait until element is located on page    ${error}   


verify error message correct or not.
    Element Text Should Be    ${error}    Incorrect username/password.



Fill the login details and login form
    Input Text    ${uname}    ${value}
    Input Password    ${pwd}    ${valid_password}
    Click Element    ${radio_btn}
    Wait Until Element Is Visible    ${bod}
    Click Button    ${alert}
    Click Button    ${alert}
    Wait Until Element Is Not Visible    ${bod}
    Select From List By Value    ${drop_down}    teach
    Select Checkbox    ${che}
    Checkbox Should Be Selected    ${che}




