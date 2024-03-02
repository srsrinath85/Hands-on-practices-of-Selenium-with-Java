*** Settings ***
Library    SeleniumLibrary
Test Teardown    Close Browser

*** Variables ***
${url} =  https://www.amazon.in/
${browser} =  chrome
${deals} =  xpath =  //div[contains(h2,'Today’s Deals')]
${item} =  xpath =  //div[@class='a-section feed-carousel-viewport']/ul/li[3]
${clickitem1} =  xpath =  //*[@id='octopus-dlp-asin-stream']/ul/li[2]
${clickitem} =  xpath =  //*[@class='ProductGrid__grid__f5oba']/li[2]
${click} =  xpath =  //*[@class='ProductShowcase__actions__QNH7D']/div[1]/a
${price2} =  xpath =  //*[@class='a-section a-spacing-none aok-align-center']/span[2]/span/span[1]
${price} =  xpath =  //*[@class='a-section a-spacing-none aok-align-center']/span[2]/span/span[2]
${link} =  xpath =  //*[@id='feature-bullets']/a
${btn} =  xpath =  //div[contains(span,'See all details')]
*** Keywords ***
opening application
    Open Browser    ${url}    ${browser} 
    Maximize Browser Window
    Scroll Element Into View    ${deals}        
    Click Element    ${item}
    Sleep    10s
    # Click Element   ${clickitem1} 
    Click Element    ${clickitem}
    sleep     5s
    Scroll Element Into View    ${btn}
    Sleep    10s
    Click link    ${click}
    Scroll Element Into View   ${price}
    ${val} =  Get Text    ${price2}
    ${val1} =  Get Text    ${price}
    ${val3} =  Set Variable    ${val}${val1}
    Should Be Equal As Strings    ${val3}    ₹49,490   
    sleep    5s
    Scroll Element Into View    ${link}
    Sleep    10s
    Click Link    ${link}
    sleep     10s    
     
    

*** Test Cases ***
opening web application
    opening application
   

