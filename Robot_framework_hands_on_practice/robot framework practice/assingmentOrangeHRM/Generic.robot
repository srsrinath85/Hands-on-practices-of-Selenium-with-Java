*** Settings ***
Library    SeleniumLibrary


*** Variables ***
${url} =  https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
${browser} =  chrome
${uname} =  xpath =  //*[@name='username']
${uvalue} =  Admin
${pwd} =  xpath =  //*[@name='password']
${pvalue} =  admin123
${btn} =  xpath =  //*[@type='submit']


 



*** Keywords ***
Opening an OrangeHrm Application
    Open Browser    ${url}    ${browser} 
    Maximize Browser Window
    Sleep    10s
Verify the user account to login to be available
    Input Text    ${uname}    ${uvalue}
    Input Password    ${pwd}    ${pvalue}
    Click Button    ${btn}
    Sleep    10s