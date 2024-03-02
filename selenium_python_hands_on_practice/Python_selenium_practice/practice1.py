from selenium import webdriver
# from webdriver_manager.chrome import ChromeDriverManager
# from webdriver_manager.firefox import GeckoDriverManager
import time
browsername="edge"
if browsername=="chrome":
    driver=webdriver.Chrome()
    driver.maximize_window()
elif browsername == "edge":
    driver=webdriver.Edge()
    driver.maximize_window()
else:
    print("please pass the current browsername:"+ browsername)
time.sleep(3)
driver.get("https://app.hubspot.com/login")
time.sleep(3)