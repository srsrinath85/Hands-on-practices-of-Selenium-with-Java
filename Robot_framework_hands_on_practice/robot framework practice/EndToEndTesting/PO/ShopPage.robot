*** Settings ***
Library    SeleniumLibrary
Library    Collections
Resource    D://robot framework practice//EndToEndTesting//PO//Genric.robot



*** Variables ***
${btns} =  css:.nav-link 
${btnd} =  css:li.active a



*** Keywords *** 
wait until Element is located in the page
    wait until element is located on page    ${btns}

Verify Card titles in the shop page
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



select checkout button
    Click Link    ${btnd}