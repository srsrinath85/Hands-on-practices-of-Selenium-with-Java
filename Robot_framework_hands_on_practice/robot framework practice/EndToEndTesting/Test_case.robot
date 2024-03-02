*** Settings ***
Library     SeleniumLibrary
Library     Collections
Library     D://robot framework practice//EndToEndTesting//custom library//Listshop.py
Resource    D://robot framework practice//EndToEndTesting//PO//Genric.robot
Resource    D://robot framework practice//EndToEndTesting//PO//LandingPage.robot 
Resource    D://robot framework practice//EndToEndTesting//PO//ShopPage.robot 
Resource    D://robot framework practice//EndToEndTesting//PO//Checkoutpage.robot 
Resource    D://robot framework practice//EndToEndTesting//PO//confirmationpage.robot 

Test Setup    opening browser with an application 



*** Test Cases ***
# validate unsuccessful login
#     LandingPage.Fill login form    ${value}    ${invalid_password}
#     LandingPage.wait until Element is located in the page
#     LandingPage.verify error message correct or not.
validate successful login    
    LandingPage.Fill login form     ${value}    ${valid_password}
    ShopPage.wait until Element is located in the page
    Verify Card titles in the shop page
    Hello world
    Add items to cart checkout   ${ListofProducts}
    select checkout button
    Verify items in the checkout page and proceed
    Enter the country    ${country_name}
    Sleep    10s
    purchase the product and confirm the purchase
    #ShopPage.Select the card    Nokia Edge
# Select the Form and navigte to Child Window
#     Fill the login details and login form






