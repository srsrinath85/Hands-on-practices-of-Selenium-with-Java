*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${url} =  https://www.google.com
${browser} =  edge

*** Keywords ***
opening application
    Open Browser    ${url}    ${browser} 
    Maximize Browser Window
    Sleep    20s
 
    

*** Test Cases ***
opening web application
    opening application
    
