*** Settings ***
Library    SeleniumLibrary
Library    Collections
Resource    D://robot framework practice//assingmentOrangeHRM//Generic.robot
*** Variables ***
${Expected} =  https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7
${admin} =  xpath =  //*[@class='oxd-main-menu']/li[1]/a
${btnr} =  xpath =  //button[@class='oxd-button oxd-button--medium oxd-button--secondary']
${drop_down} =  xpath =  //*[@class='oxd-form-row']//div//div[2]/i
${var} =  ESS
${down} =  xpath =  //*[@class='oxd-form-row']//div//div[3]//div/i
${var1} =  Disabled
${valueent} =  xpath =  //input[@placeholder='Type for hints...']
${values} =  P
${usname} =  xpath =  (//input[@class='oxd-input oxd-input--active'])[2]
${vname} =  Example
${password} =  xpath =  (//input[@type='password'])[1]
${pvalues} =  Example.@87
${cpwd} =  xpath =  (//input[@type='password'])[2]
${cpvalue} =  Example.@87
${btnsave} =  xpath =  //*[@class='oxd-form-actions']/button[2]
${eptitle1} =  xpath =  (//p[@class='oxd-text oxd-text--p'])[1]
${eptitle2} =  xpath =  (//p[@class='oxd-text oxd-text--p'])[4]
${eptitle3} =  xpath =  (//p[@class='oxd-text oxd-text--p'])[7]
${eptitle4} =  xpath =  (//p[@class='oxd-text oxd-text--p'])[8]
${eptitle5} =  xpath =  (//p[@class='oxd-text oxd-text--p'])[9]
${eptitle6} =  xpath =  (//p[@class='oxd-text oxd-text--p'])[11]
${eptitle7} =  xpath =  (//p[@class='oxd-text oxd-text--p'])[12]
${hmou} =  xpath =  //*[@id='zOSWtzV_']
${dlist} =  xpath =  //*[@class='oxd-topbar-header']//div[2]/ul/li/span/i
${list1} =  xpath =  //*[@class='oxd-dropdown-menu']/li[1]/a
${list2} =  xpath =  //*[@class='oxd-dropdown-menu']/li[2]/a
${list3} =  xpath =  //*[@class='oxd-dropdown-menu']/li[3]/a
${list4} =  xpath =  //*[@class='oxd-dropdown-menu']/li[4]/a
${picon} =  xpath =  //*[@class='orangehrm-attendance-card-bar']/button
${dinput} =  xpath =  //*[@class='oxd-date-input']/input
${dvalu} =  2023-04-01
${tinput} =  xpath =  //*[@class='oxd-time-input']/input
${tvalu} =  4:00 PM
${texta} =  xpath =  //*[@class='oxd-form-row'][2]//div[2]/textarea
${textval} =  Logging out remote work
${timebtn} =  xpath =  //*[@class='oxd-form-actions']/button
${vtitle} =  xpath =  //h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']








*** Keywords ***
Verify the user is getting personal info page after login
    ${actual} =  Get Location
    Log    ${actual}
    Should Be Equal As Strings    ${Expected}    ${actual}     
#TC_02
Clicking on the admin page
    Click Element    ${admin}
    Sleep    10s
    Click Button    ${btnr}
    Sleep    10s
    #Click Element    ${drop_down}
Enter the details in the form
    # FOR  ${i}  IN RANGE  1  5 
    #     Press Keys    none    ARROW_DOWN
    #     ${j} =  Run Keyword And Return Status  Element Should Be Visible    ${var}    isdisplayed 
           
    #     IF    ${j}
    #          Log To Console    isdisplayed
    #          #Wait Until Element Is Visible    ${j}
    #          #Press Keys    ${var}    ENTER
             
    #          Click Link    ${j}
    #          Exit For Loop 
    #     ELSE
    #         Log  continue         
    #     END
        

    # END
    Click Element    ${drop_down}
    Press Keys    none    ARROW_DOWN
    Press Keys    none    ENTER
    Sleep    10s
    Click Element    ${valueent}
    Sleep    5s
    Input Text    ${valueent}    ${values}
    Sleep    10s
    Press Keys    none    ARROW_DOWN
    Press Keys    none    ARROW_DOWN
    Press Keys    none    ENTER
    Sleep    10s
    Click Element    ${down}
    Press Keys    none    ARROW_DOWN
    Press Keys    none    ENTER
    Sleep    10s
    # FOR  ${u}  IN RANGE  1  5 
    #     Press Keys    none    ARROW_DOWN
    #     ${t} =  Run Keyword And Return Status  Element Should Be Visible    ${var1}    isdisplayed 
           
    #     IF    ${t}
    #          Log To Console    isdisplayed
    #          #Wait Until Element Is Visible    ${t}
    #          #Press Keys    ${var}    ENTER
             
    #          Click Link    ${t}
    #          Exit For Loop 
    #     ELSE
    #         Log  continue         
    #     END
        

    # END
    Input Text    ${usname}    ${vname}
    Sleep    5s
    Input Password    ${password}    ${pvalues}
    Input Password    ${cpwd}    ${cpvalue}
    Sleep    10s
    Click Button    ${btnsave}
    Sleep    10s    
        








#Test case 05##
Verifying Pie Charts in Frames 
    # ${te} =  Get Text    ${eptitle1}
    # ${te2} =  Get Text    ${eptitle2}
    # ${te3} =  Get Text    ${eptitle3}
    # ${te4} =  Get Text    ${eptitle4}
    # ${te5} =  Get Text    ${eptitle5}
    # ${te6} =  Get Text    ${eptitle6}
    # ${te7} =  Get Text    ${eptitle7}
    # Should Be Equal As Strings    ${te}     Time at Work
    # Should Be Equal As Strings    ${te2}    My Actions
    # Should Be Equal As Strings    ${te3}    Quick Launch
    # Should Be Equal As Strings    ${te4}    Buzz Latest Posts
    # Should Be Equal As Strings    ${te5}    Employees on Leave Today
    # Should Be Equal As Strings    ${te6}    Employee Distribution by Sub Unit
    # Should Be Equal As Strings    ${te7}    Employee Distribution by Location 
    #Execute Javascript    window.scrollTo(0,900)
    #Scroll Element Into View    ${hmou}  


#Testcase_04#
Opening Punch In User
    #Scroll Element Into View    ${picon}
    ${vetitle} =  Get Text    ${vtitle}
    Should Be Equal As Strings    ${vetitle}    Punch In
    Sleep    10s
    Click Button   ${picon}
    Sleep    10s
    Click Element    ${dinput}
    Sleep    5s
    Press Keys    ${dinput}    CTRL+A+DELETE
    Sleep    5s
    Input Text    ${dinput}    ${dvalu}
    Sleep    10s
    Input Text    ${tinput}    ${tvalu}
    Sleep    10s
    Input Text    ${texta}    ${textval}
    Sleep    10s
    Click Button    ${timebtn}
    Sleep    10s    

#Testcase_06#
Opening Punch out User
    #Scroll Element Into View    ${picon}
    ${vetitle} =  Get Text    ${vtitle}
    Should Be Equal As Strings    ${vetitle}    Punch Out
    Sleep    10s
    Click Button   ${picon}
    Sleep    10s
    Click Element    ${dinput}
    Sleep    5s
    Press Keys    ${dinput}    CTRL+A+DELETE
    Sleep    5s
    Input Text    ${dinput}    ${dvalu}
    Sleep    10s
    Input Text    ${tinput}    ${tvalu}
    Sleep    10s
    Input Text    ${texta}    ${textval}
    Sleep    10s
    Click Button    ${timebtn}
    Sleep    10s    












#Logout# #Test case_07#
OrangeHrm Logout page
    Click Element    ${dlist}
    Sleep    10s
OrnageHRM Dropdown Logout page
    ${le1} =  Get Text    ${list1}
    ${le2} =  Get Text    ${list2}
    ${le3} =  Get Text    ${list3}
    ${le4} =  Get Text    ${list4}
    Should Be Equal As Strings    ${le1}    About
    Should Be Equal As Strings    ${le2}    Support
    Should Be Equal As Strings    ${le3}    Change Password
    Should Be Equal As Strings    ${le4}    Logout
    Click Element    ${list4}
    Sleep    10s





    
    





