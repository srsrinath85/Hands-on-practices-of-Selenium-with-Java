from selenium import webdriver
import pytest
@pytest.fixture()
def setup(browser):
    if browser=='chrome':
        driver=webdriver.chrome()
        print("launching Chrome browser")
    elif browser=='edge':
        driver=webdriver.Edge()
        print("Launching Microsoft Edge browser")
    elif browser=='firefox':
        driver=webdriver.Firefox()
        print("Launching firefox browser")
    else:
        print("there is no browser is opening")
@pytest.fixture        
def browser(request):
    return request.config.getoption("--browser")




