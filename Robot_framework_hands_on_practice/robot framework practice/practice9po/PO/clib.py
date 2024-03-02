from robot.api.deco import library,keyword
from robot.libraries.BuiltIn import BuiltIn



@library
class clib:

    def __init__(self):
        self.sellib = BuiltIn().get_library_instance("SeleniumLibrary")




    @keyword
    def hello_world(self):
        print("srinath")


    @keyword
    def add_items_to_cart_checkout(self,productsList):
       #Get WebElements
       i = 1
       productsTitles =  self.sellib.get_webelements("css:.card-title")
       for  productsTitle  in  productsTitles:
            if  productsTitle.text  in  productsList:
                self.sellib.click_button("xpath:(//*[@class='card-footer'])["+str(i)+"]/button")
            i = i+1
