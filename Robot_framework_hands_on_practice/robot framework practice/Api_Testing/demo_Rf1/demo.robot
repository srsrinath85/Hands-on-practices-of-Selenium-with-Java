*** Settings ***
Library    Collections
Library  RequestsLibrary
*** Variables ***
${bookid}
${book_name} =  RobotFramework    
*** Keywords ***
play with dictionary
    &{data}=  Create Dictionary    name=srinath    course=robot    website=www.google.com
    Log    ${data}
    Dictionary Should Contain Key    ${data}    name 
    ${fr}=    Get From Dictionary    ${data}    name 
    Log    ${fr} 
Adding book to database
    &{request}=    Create Dictionary    name=${book_name}    isbn=2347665    aisle=2544345    author=srinath    
    ${response}=    POST    https://rahulshettyacademy.com/Library/Addbook.php    json=${request}    expected_status=200
    Log    ${response.json()}
    Dictionary Should Contain Key    ${response.json()}    ID 
    ${bookid}=    Get From Dictionary    ${response.json()}    ID
    Set Global Variable    ${bookid}  
    Log    ${bookid}
    Should Be Equal As Strings    successfully added    ${response.json()}[Msg]
       

Getting book to database
    ${res}=    GET    https://rahulshettyacademy.com/Library/GetBook.php    params=ID=${bookid}    expected_status=200
    Log    ${bookid}
    Log    ${res.json()}
    #Status Should Be    200
    Should Be Equal As Strings    ${book_name}    ${res.json()}[0][book_name]

Deleting book from database
    ${reque}=    Create Dictionary    ID=${bookid}
    ${resp}=    POST    https://rahulshettyacademy.com/Library/DeleteBook.php    json=${reque}    expected_status=200    
    Log    ${resp.json()}
    Should Be Equal As Strings    book is successfully deleted    ${resp.json()}[msg]


*** Test Cases ***
Executing testcase
    play with dictionary
    Adding book to database
    Getting book to database
    Deleting book from database