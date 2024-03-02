from selenium import webdriver
import time
from selenium.webdriver.common.by import By

class demo:
    def __init__(self) -> None:
        self.driver=webdriver.Chrome()
        
    def basic_login(self):
        url="https://www.hyrtutorials.com/p/frames-practice.html"
        self.driver.get(url)
        self.driver.maximize_window()
        time.sleep(6)
        self.driver.switch_to.frame(0)

    def test_login(self):
        time.sleep(4)
        self.driver.find_element(By.ID,'firstName').send_keys("santhosh")
        time.sleep(4)
        self.driver.find_element(By.ID,'lastName').send_keys("sai")
        list=self.driver.find_elements(By.NAME,'gender')
        print(len(list))
        time.sleep(4)
        condition=list.index(0).is_selected()
        if condition:
            list.index(0).click()
            print("the radio button is selected")
        else:
            list.index(1).click()
            print("the second radio button is selected")
            
    # def test_checkboxes(self,val):
    #     for g in myc.lists:
    #         print(g.text)
    #         for j in range(len(val)):
    #             if g.text== val[j]:
    #                 g.click()
    #                 break
    def test_checkboxes(self):
        time.sleep(4)
        lists=self.driver.find_elements(By.NAME,'language')
        print(len(lists)) 
        for g in lists:
            print(g.text)
            if g.text== 'English':
                g.click()
                break


# myc=demo()
# sel=['Spanish','English']
# myc.test_checkboxes(sel)
# lists=myc.driver.find_elements(By.NAME,'language')
# print(len(lists))    
myc=demo()
myc.basic_login()
myc.test_login()
myc.test_checkboxes()
time.sleep(4)