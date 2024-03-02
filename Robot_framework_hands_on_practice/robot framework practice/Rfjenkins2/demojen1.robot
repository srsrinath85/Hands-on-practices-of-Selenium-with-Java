*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${url} =  https://www.Flipkart.com
${browser} =  edge

*** Keywords ***
opening application
    Open Browser    ${url}    ${browser}
    Sleep    10s 
    Maximize Browser Window
    Sleep    20s
    
 
    

*** Test Cases ***
opening web application
    opening application
    
