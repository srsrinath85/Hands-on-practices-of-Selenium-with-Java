# name = 'TutorialsPoint'
# marks = 50
# result = True
# a = 10
# b = 20
# def myfunction():
#     a=20
#     b=30
#     print(a+b)
   
# myfunction()
# print(a+b)
# marks = 50 # this is a global variable
# def myfunction():
#    marks = 70 # this is a local variable
#    print (marks)
   
# myfunction()
# print (marks) # prints global value

marks = 50 # this is a global variable
marks=marks+50
def myfunction():
   marks = 30 # this is a local variable
   print (marks)
   
myfunction()
print (marks) # prints global value

# list accessing ways in python

# [1:] it means access the list form 1 st index to last
# [:2] it means access the list from 0 to 2 index 
# [2:-1] it means access the list from start 2nd index to last index
# [:] it means access the complete list from 0 index
# [1:3] it means access the list from 1 st to 2nd index
# [-1] it means access the list from last index of 1st element
 

