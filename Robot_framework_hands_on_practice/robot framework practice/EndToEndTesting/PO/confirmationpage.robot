*** Settings ***
Library    SeleniumLibrary
Resource    D://robot framework practice//EndToEndTesting//PO//Genric.robot



*** Variables ***
${cname} =  id:country
${country_name} =  India




*** Keywords ***
Enter the country
    [Arguments]    ${countryname}
    Input Text    ${cname}    ${countryname}
    wait until element is located on page    //a[text()='${countryname}'] 
    Click Link    //a[text()='${countryname}']
    Click Element    //label[@for='checkbox2']      


purchase the product and confirm the purchase
    Click Button    css:.btn-success
    Page Should Contain    Success!
    
    


