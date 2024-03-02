from selenium import webdriver
import time
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select
from selenium.webdriver.common.alert import Alert
import pytest
class demo_ch:
    def __init__(self) -> None:
        self.driver=webdriver.Chrome()
        
    def test1(self):
        url="https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login"
        self.driver.get(url)
        self.driver.maximize_window()
        time.sleep(6)
        # self.driver.switch_to.frame(0)
    
    # def test_lo(self):
    #     self.driver.find_element(By.XPATH,'//*[@class="btn btn-primary btn-lg"]').click()
    #     time.sleep(4)
    #     # self.driver.find_element(By.ID,'textarea').send_keys("this is my textarea")
    #     ds=self.driver.find_element(By.XPATH,'//select[@name="userSelect"]')
    #     se=Select(ds)
    #     se.select_by_visible_text("Neville Longbottom")
    #     self.driver.find_element(By.XPATH,'//button[@type="submit"]').click()
    #     time.sleep(5)
    #     self.driver.find_element(By.XPATH,'//*[@class="btn logout"]').click()
    #     time.sleep(4)
        
    def test2(self):
        self.driver.find_element(By.XPATH,'//*[contains(text(),"Bank Manager Login")]').click()
        time.sleep(4)
        self.driver.find_element(By.XPATH,'//button[@ng-class="btnClass1"]').click()
        time.sleep(3)
        self.driver.find_element(By.XPATH,'//*[@ng-model="fName"]').send_keys("sri")
        time.sleep(3)
        self.driver.find_element(By.XPATH,'//*[@ng-model="lName"]').send_keys("sri")
        time.sleep(3)
        self.driver.find_element(By.XPATH,'//*[@ng-model="postCd"]').send_keys("1234")
        self.driver.find_element(By.XPATH,'//*[@class="btn btn-default"]').click()
        time.sleep(5)
        df=self.driver.switch_to.alert
        df.accept()
        time.sleep(4)
        self.driver.find_element(By.XPATH,'//button[@ng-class="btnClass2"]').click()
        time.sleep(3)



mn=demo_ch()
mn.test1()
mn.test2()












