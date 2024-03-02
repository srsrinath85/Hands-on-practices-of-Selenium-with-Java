*** Settings ***
Library    SeleniumLibrary
Library    Collections
#Test Setup    opening browser with an application
Test Setup    opening application in different browser    edge        
Resource    D://veera project//seperat//robot framework practice//practice6//resource21.robot
Library    String
*** Keywords ***
select the link of child window
    Click Element    ${link}
    Sleep    10s
verify the user is switched to child window
    Switch Window    NEW
    Element Text Should Be    css:h1    DOCUMENTS REQUEST
get the email id in the child window
    ${text} =  Get Text    css:.red
    Log To Console    ${text}
    @{words} =  Split String    ${text}    at
    Log To Console    ${words}
    ${secondPart_value} =  Get From List    ${words}    1
    Log To Console    ${secondPart_value}
    @{ssplit} =  Split String    ${secondPart_value}
    Log To Console    ${ssplit}
    ${email} =    Get From List    ${ssplit}    0
    #Set Global Variable    ${email}    
    Log To Console    ${email}
    Switch Window    MAIN
    Title Should Be    LoginPage Practise | Rahul Shetty Academy
    Input Text    ${uname}    ${email}  
    
#swith to parent window and enter the email
    



*** Test Cases ***
validate window handles functionality
    #[Tags]    SMOKE
    select the link of child window
    verify the user is switched to child window
    
    #swith to parent window and enter the email
Check email
    get the email id in the child window