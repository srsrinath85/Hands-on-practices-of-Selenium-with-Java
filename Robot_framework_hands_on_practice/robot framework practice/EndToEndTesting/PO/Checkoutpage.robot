*** Settings ***
Library    SeleniumLibrary


*** Variables ***

${btne} =  css:.btn-success



*** Keywords ***
Verify items in the checkout page and proceed
    Click Element    ${btne}
    