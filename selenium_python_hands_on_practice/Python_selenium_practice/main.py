from selenium import webdriver
from selenium.webdriver.common.by import By
import time




driver=webdriver.Chrome()
driver.get("https://www.google.com")
driver.maximize_window()
driver.implicitly_wait(20)
print(driver.title)
time.sleep(5)
driver.find_element(By.NAME,'q').send_keys("Naveen Automation")
time.sleep(5)
optionlist=driver.find_elements(By.CSS_SELECTOR,'div.erkvQe div ul li')
print(len(optionlist))
for ele in optionlist:
    print(ele.text)
    if ele.text== 'naveen automationlabs youtube':
        ele.click()
        break
time.sleep(3)