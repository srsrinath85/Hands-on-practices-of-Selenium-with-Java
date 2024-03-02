from selenium import webdriver
from selenium.webdriver.common.by import By
import time

driver=webdriver.Chrome()
url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
driver.get(url)
driver.maximize_window()
time.sleep(3)
driver.find_element(By.NAME,'username').send_keys('Admin')
driver.find_element(By.NAME,'password').send_keys('admin123')
driver.find_element(By.XPATH,'//button[@type="submit"]').click()
time.sleep(5)
# Genrice method for select item in the side list
# def side_list(slist,val):
#     for i in sidelist:
#         # print(i.text)
#         for j in range(len(val)):
#             if i.text == val[j]:
#                 i.click()
#                 time.sleep(5)
#                 break
#             raise Exception("Element is not found")


# sidelist=driver.find_elements(By.CSS_SELECTOR,'ul li.oxd-main-menu-item-wrapper')
# # print(len(sidelist))
# # for i in sidelist:
# #     print(i.text)
# sl=['Admin']
# side_list(sidelist,sl)

sidelist=driver.find_elements(By.CSS_SELECTOR,'ul li.oxd-main-menu-item-wrapper')
print(len(sidelist))
for i in sidelist:
    print(i.text)
    if i.text=='Admin':
        i.click()
        break

time.sleep(5)
multiple_select=driver.find_elements(By.XPATH,"//*[@role='row']")
print(len(multiple_select))
for k in multiple_select:
    # print(k.text)
    if k.text == 'David.Morris':
        time.sleep(5)
        # k.click()
        driver.find_elements(By.XPATH,"//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']").click()
        # print(len(Icons))
        # Icons.get(k).click()   
        # k.click()
        time.sleep(5)
        break
    else:
        print("Not clickable")

time.sleep(5)