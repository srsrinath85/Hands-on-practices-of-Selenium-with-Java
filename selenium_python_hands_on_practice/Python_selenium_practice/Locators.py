from selenium import webdriver
from selenium.webdriver.common.by import By
import time

driver=webdriver.Chrome()
# url="https://www.orangehrm.com/30-day-free-trial/"
# driver.get(url)
# driver.maximize_window()
# time.sleep(3)
# driver.find_element(By.NAME,'subdomain').send_keys("example")
# driver.find_element(By.ID,'Form_getForm_Name').send_keys("sri")
# driver.find_element(By.CLASS_NAME,'email text').send_keys('sr@gmail.com')
# driver.find_element(By.LINK_TEXT,'Privacy Policy').click()

driver.get("https://www.amazon.in/")
driver.maximize_window()
Linkslist=driver.find_elements(By.TAG_NAME,'a')
print(len(Linkslist))
time.sleep(4)

for ele in Linkslist:
    r=ele.text
    g=ele.get_attribute('href')
    print(r)
    print(g)

time.sleep(4)

imagelist=driver.find_elements(By.TAG_NAME,'img')
print(len(imagelist))
time.sleep(3)
for elew in imagelist:
    print(elew.get_attribute('src'))
time.sleep(5)