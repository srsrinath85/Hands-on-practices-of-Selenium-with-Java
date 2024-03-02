# chars=[]
# for ch in 'tutorialpoint':
#     if ch in 'aeiou':
#         chars.append(ch)
# print(chars)        

# chars=[char for char in 'tutorialpoint' if char in 'aeiou']
# print(chars)

# unique numbers
# list1=[1, 9, 1, 6, 3, 4, 5, 1, 1, 2, 5, 6, 7, 8]
# list2=[]
# # for x in list1:
# #     print(x,end=' ')
# #     if x not in list2:
# #         list2.append(x)
# # print(list2)
# for y in list1:
#     if y%2!=0:
#         # print(y,end=' ')
#         list2.append(y)
# print(list2)
# del list2
# print(list1)
# # remove odd numbers in the list
# list1=[x for x in list1 if x%2==0]
# print(list1)
# remove odd numbers in the list
# list1=[x for x in list1 if x%2!=0]
# print(list1)


# list3=['apple','mango','basket','butter']
# list3.sort()
# print(list3)
# count=0
# for v in list3:
#     print(v)
#     count=count+1
#     print(count, end=' ')

# function sums up the number of alphabets in the given word. For example:
# def alphabet_count(word):
#     return sum(c.isalpha() for c in word)

# # Example usage:
# original_list = ["apple", "banana", "kiwi", "grape", "orange"]

# # Sort the list in-place based on alphabet count
# original_list.sort(key=alphabet_count)

# print("Sorted List by Alphabet Count:", original_list)


# def extract_non_numeric(input_list):
#     non_numeric_list = [item for item in input_list if not isinstance(item, (int, float))]
#     return non_numeric_list

# # Example usage:
# original_list = [1, 'apple', 3.14, 'banana', '42', 'kiwi', 'grape', 'orange']

# non_numeric_list = extract_non_numeric(original_list)

# print("Original List:", original_list)
# print("Non-Numeric Items List:", non_numeric_list)


# def string_to_int_list(input_string):
#     int_list = [ord(char) for char in input_string]
#     return int_list
# # ord:-Return the Unicode code point for a one-character string.
# # Example usage:
# input_string = "hello"

# result_list = string_to_int_list(input_string)

# print("Input String:", input_string)
# print("List of Integers representing each character:", result_list)





# Example usage:
# list1 = [1, 2, 3, 4, 5]
# list2 = [3, 4, 5, 6, 7]

# # these is for display the list exclude common numbers
# common_numbers = set(list1) ^ set(list2)
# # these is for display the list with common numbers 
# common_numbers = set(list1) & set(list2)

# print("List 1:", list1)
# print("List 2:", list2)
# print("Common Numbers:", common_numbers)

# list1 = [1, 2, 3, 4, 5]
# # item=list1.pop()
# del list1[3]
# print(list1)


# accessing unique elements in a list
# list=[1,1,2,3,4,5,6,43,2,1,2,3,4,3]
# list2=[]
# for s in list:
#     print(s,end=' ')
#     print(list2)
#     if s not in list2:
#         list2.append(s)
# print(list2,end=' ')
# count number of elements in a list
# and
# print the addition of total numbers in list
# print unique numbers in the list and print addition of total numbers in the list
# list=[1,1,2,3,4,5,6,43,2,1,2,3,4,3]
# list3=[]
# count=0
# for d in list:
#     # total=count+d
#     # count=total
#     # count+=1
#     # print(count,end=' ')
# # print(count,end=' ')
#     if d not in list3:
#         list3.append(d)
# print(list3,end='')
# for g in list3:
#     total=count+g
#     count=total
# print(count,end=' ')   

# remove odd elements in the list
# list=[1,1,2,3,4,5,6,43,2,1,2,3,4,3]
# for e in list:
#     if e%2!=0:
#         print(e,end=' ')
#         while e in list:
#             list.remove(e)
# print(list,end=' ')
# print ascii values of given alphabets in the list
# list12=['a','A','b','B','G','i','L']

# for l in list12:
#     asc=ord(l)
#     print (f"the ascii value of '{l}' is {asc}")



















