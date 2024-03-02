from selenium import webdriver
from selenium.webdriver.common.by import By
import time
driver=webdriver.Chrome()
driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/")
driver.maximize_window()
time.sleep(5)
driver.find_element(By.ID,'justAnInputBox').click()
time.sleep(4)


# def select_values(optionlist,value):
#     # print(len(optionlist))
#     for el in optionlist:
#         print(el.text)
#         if el.text == value:
#             el.click()
#             time.sleep(2)
#             break
# time.sleep(4)

# Scenario is to select 10 different values in same drop down we have to write a method to solve particular
# problem give you list of values like array of values and select
# def select_values(optionlist,value):
#     # print(len(optionlist))
#     for el in optionlist:
#         print(el.text)
#         for j in range(len(value)):
#             if el.text == value[j]:
#                 el.click()
#                 time.sleep(3)
#                 break
# time.sleep(4)

# Scenarion to select all the values in the drop down
def select_values(option_list,value):
    if not value[0] == 'all':
        for el in optionlist:
            print(el.text)
            for j in range(len(value)):
                if el.text == value[j]:
                    el.click()
                    time.sleep(3)
                    break
    else:
        for es in option_list:
            es.click()
            time.sleep(3)
time.sleep(4)



optionlist=driver.find_elements(By.CSS_SELECTOR,'span.comboTreeItemTitle')
# values_list=['choice 2','choice 3','choice 6 2 1']
values_list=['all']
select_values(optionlist,values_list)
# driver.find_element(By.ID,'justAnotherInputBox').click()
# time.sleep(4)
# optionlist1=driver.find_elements(By.CSS_SELECTOR,'span.comboTreeItemTitle')


