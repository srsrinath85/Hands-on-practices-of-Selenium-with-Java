from selenium import webdriver
import time
from selenium.webdriver.common.by import By

class demo_cha:
    def __init__(self) -> None:
        self.driver=webdriver.Chrome()
        
    def basic_login(self):
        url="https://testautomationpractice.blogspot.com/"
        self.driver.get(url)
        self.driver.maximize_window()
        time.sleep(6)
        # self.driver.switch_to.frame(0)
    
    def test_login(self):
        self.driver.find_element(By.ID,'name').send_keys("santhosh")
        time.sleep(4)
        self.driver.find_element(By.ID,'email').send_keys("sai@gmail.com")
        time.sleep(4)
        self.driver.find_element(By.ID,'phone').send_keys("9876543453")
        time.sleep(5)
        self.driver.find_element(By.ID,'textarea').send_keys("this is my textarea")
        list=self.driver.find_elements(By.NAME,'gender')
        print(len(list))
        time.sleep(4)
        # condition=list[0].is_selected()
        time.sleep(4)
        if list[0].is_selected():
            list[0].click()
            time.sleep(4)
            print("the radio button is selected")
        else:
            list[1].click()
            time.sleep(4)
            print("the second radio button is selected")
    def test_checkboxes(self):
        time.sleep(4)
        lists=self.driver.find_elements(By.XPATH,'//input[@type="checkbox"]')
        print(len(lists)) 
        time.sleep(4)
        for g in lists:
            # the text is in under label tag use this xpath
            ju=g.find_element(By.XPATH,'following-sibling::label')
            # k=g.tag_name("label")
            lk=ju.text
            print(lk)
            if lk== 'Tuesday':
                g.click()
                time.sleep(4)
                break
    
    def test_dropdown(self):
        self.driver.find_element(By.XPATH,'//*[@id="country"]').click()
        sld=self.driver.find_elements(By.XPATH,'//*[@id="country"]/option')
        print(len(sld))
        for m in sld:
            print(m.text)
            if m.text=="India":
                m.click()
                time.sleep(5)
                break

    def test_newPage(self):
        self.driver.find_element(By.LINK_TEXT,'orange HRM').click()
        time.sleep(4)
        self.driver.find_element(By.NAME,'username').send_keys('Admin')
        self.driver.find_element(By.NAME,'password').send_keys('admin123')
        self.driver.find_element(By.XPATH,'//button[@type="submit"]').click()
        time.sleep(5)






mbv=demo_cha()
mbv.basic_login()
mbv.test_login()
mbv.test_checkboxes()
mbv.test_dropdown()
mbv.test_newPage()
