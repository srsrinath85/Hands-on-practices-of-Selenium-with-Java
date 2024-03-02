from selenium import webdriver
from selenium.webdriver.common.by import By
import time

driver=webdriver.Chrome()
driver.get("https://www.Google.com")
driver.maximize_window()
time.sleep(4)
driver.switch_to.new_window()
driver.get("https://www.Flipkart.com")
o=driver.current_window_handle
time.sleep(5)
ss=driver.window_handles
print(len(ss))
for w in ss:
    if(w!=o):
        driver.switch_to.window(w)
    break
time.sleep(4)
print(driver.title)