from selenium import webdriver
import time
from selenium.webdriver.common.by import By
class mainacc:
    
    _textbox_username_id="username"
    _textbox_password_id="password"
    _btn_id="submit"


    def __init__(self,driver):
        self.driver=driver
    
    def login(self,uname,pwd):
        self.driver.find_element_By_id(self.textbox_username_id).send_keys(uname)
        self.driver.find_element_By_id(self.textbox_password_id).send_keys(pwd)
        self.driver.find_element_By_id(self.btn_id).click()