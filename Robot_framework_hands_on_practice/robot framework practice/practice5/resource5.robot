*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${url} =  https://rahulshettyacademy.com/loginpagePractise/
${browser} =  chrome
${uname} =  xpath =  //*[@id='username']
${value} =  rahulshettyacademy 
${pwd} =  xpath =  //*[@id='password']
${valid_password} =  learning
${btn} =  xpath =  //*[@id='signInBtn']
${btns} =  css:.nav-link 
${radio_btn} =  css:input[value='user']
${alert} =  xpath =  //*[@id='okayBtn']
${drop_down} =  css:select.form-control
# ${che} =  xpath =  //*[@id='terms']
# ${bod} =  css:.modal-body

# @{expected_list} =    Create List    iphone X    Samsung Note 8    Nokia Edge    Blackberry
# ${all_elements} =    Get WebElements    css:.card-title
*** Keywords ***
opening browser with an application
    Open Browser    ${url}    ${browser}
    Maximize Browser Window