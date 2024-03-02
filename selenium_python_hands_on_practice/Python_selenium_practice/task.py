from selenium import webdriver
from selenium.webdriver.common.by import By
import time
from selenium.webdriver.support.ui import Select

driver=webdriver.Chrome()
url1="https://chercher.tech/practice/practice-dropdowns-selenium-webdriver"
url2="https://www.softwaretestingmaterial.com/sample-webpage-to-automate/"
# url3="https://demos.telerik.com/kendo-ui/multiselect/index?autoRun=true&theme=default-main"
# url4="https://demoqa.com/automation-practice-form"
driver.get(url1)
driver.maximize_window()
time.sleep(7)
# sel_list=driver.find_element(By.ID,'first').click()
select=Select(driver.find_element(By.XPATH,"//select[@id='first']"))
# time.sleep(7)
select.select_by_visible_text('Iphone')
time.sleep(3)
# print(len(sel_list))
driver.get(url2)
# generic method for multiple select
def mul_sele(sd,value):
    for n in sd:
        text_content = driver.execute_script("return arguments[0].nextSibling.textContent.trim();", n)
        # print(text_content)
        for kl in range(len(value)):
            if text_content== value[kl]:
                n.click()
                time.sleep(5)
                break
sd=driver.find_elements(By.NAME,'checkboxes[]')
slp=['QTP','LoadRunner']
mul_sele(sd,slp)


