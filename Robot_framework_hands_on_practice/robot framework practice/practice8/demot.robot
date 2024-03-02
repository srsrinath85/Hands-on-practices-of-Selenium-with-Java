*** Settings ***
Library    SeleniumLibrary
Library    Collections
Library    ...//practice8//custom library//demo.py
Resource    D://veera project//seperat//robot framework practice//practice8//resource1.robot
Test Setup    opening browser with an application
#Test Teardown    Close Browser


*** Keywords ***

# Fill login form
#     [Arguments]    ${value}    ${invalid_password}
#     Input Text    ${uname}    ${value}
#     Input Password    ${pwd}    ${invalid_password}
#     Click Button    ${btn}
#     Wait Until Element Is Visible    ${error}
# error correct message or not
#     Element Text Should Be    ${error}    Incorrect username/password.  

Fill login form to display home page
    [Arguments]    ${value}    ${valid_password}
    Input Text    ${uname}    ${value}
    Input Password    ${pwd}    ${valid_password}
    Click Button    ${btn}
    Wait Until Element Is Visible    ${btns}
Display cards title verfication
    @{expected_list} =    Create List    iphone X    Samsung Note 8    Nokia Edge    Blackberry
    ${all_elements} =  Get WebElements    css:.card-title
    @{actual_list} =  Create List
    FOR    ${element}    IN    @{all_elements}
        Log To Console    ${element.text}
        Append To List    ${actual_list}    ${element.text}

    END
    Lists Should Be Equal    ${expected_list}    ${actual_list}

Select the card
    [arguments]    ${cardname}
    ${all_elements} =  Get WebElements    css:.card-title
    ${index} =  Set Variable    1
    FOR     ${ele}    IN    @{all_elements}
        Exit For Loop If    '${cardname}' == '${ele.text}'

                ${index}=    Evaluate    ${index} + 1     
    END  
    Click Button    xpath:(//*[@class='card-footer'])[${index}]/button    
    Sleep    20s







*** Test Cases ***
# validate unsuccessful login
#     Fill login form    ${value}    ${invalid_password}
#     error correct message or not
validate successful login    
    Fill login form to display home page    ${value}    ${valid_password}
    Display cards title verfication
    Hello World
    Add Items To Cart Checkout    ${ListofProducts}
    Sleep    20s
    #Select the card    Blackberry      
    