from selenium import webdriver
import time
from selenium.webdriver.common.by import By

driver=webdriver.Chrome()
# driver.get("https://www.Flipkart.com")
driver.get("https://www.amazon.in")
driver.maximize_window()
# driver.implicitly_wait(20)
# time.sleep(5)
# print(driver.execute_script("return document.documentElement.innerText;"))
# time.sleep(4)
# driver.execute_script("history.go(0);")
# time.sleep(5)
# driver.execute_script("alert('this is srinath')")
time.sleep(6)
# go to bottom of the page using javascipt
# driver.execute_script("window.scroll(0,document.body.scrollHeight)")
# link=driver.find_element(By.LINK_TEXT,'See more from Amazon Live')
# driver.execute_script("arguments[0].scrollIntoView(true);",link)
# time.sleep(5)
# link.click()
# time.sleep(6)
print(driver.execute_script("return navigator.userAgent;"))