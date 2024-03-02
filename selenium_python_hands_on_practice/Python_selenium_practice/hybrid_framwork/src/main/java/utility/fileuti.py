import configparser
 

config=configparser.RawConfigParser()
config.read(".\\src\\test\\resources\\common.ini")

class readprop:
    @staticmethod
    def geturl():
        baseurl=config.get('url')
        return baseurl
    @staticmethod
    def getusername():
        user=config.get('usn')
        return user
    @staticmethod
    def getpassword():
        pas=config.get('pasw')
        return pas
    