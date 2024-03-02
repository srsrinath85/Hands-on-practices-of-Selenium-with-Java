# tuple1=('a','b','c','g','e')
# print(id(tuple1))
# list1=list(tuple1)
# print(id(list1))
# list1[3]='S'
# list1.append('R')
# print(list1)
# tuple2=tuple(list1)
# print(tuple2)

# tup1=(10,20,30)
# x,*y=tup1
# print("x:","y:",y)

# tup1 = (25, 12, 10, -21, 10, 100)
# indices = range(len(tup1))
# for i in indices:
#    print ("tup1[{}]: ".format(i), tup1[i])

# T1 = (10,20,30,40)
# T2 = ('one', 'two', 'three', 'four')
# for t in T2:
#    T1+=(t,)
# print (T1)

# in tuples we can join two tuples in many ways like(t1+t2,t1+=t2,sum(),extend(),
# list comprehsion using merging,for loop

# tup1 = (10, 10, 10, -21, 10, 100,10)
# print ("Tup1:", tup1)
# x = tup1.index(10)
# y=tup1.count(10)
# print ("First index of 10:", x)
# print ("First index of 10:", y)

# T1 = (1, 9, 1, 6, 3, 4, 5, 1, 1, 2, 5, 6, 7, 8)
# t2=()
# for x in T1:
#     if x not in t2:
#         t2+=(x,)
# print("unique numbers:",t2)    
# tu=('a','A','b','B','G','i','L')

# for l in tu:
#     asc=ord(l)
#     print (f"the ascii value of '{l}' is {asc}")

t1 = (1, 9, 1, 6, 3, 4, 5, 1, 1, 2, 5, 6, 7, 8)
t2=()
count=0
for h in t1:
    if h not in t2:
        t2+=(h,)
print(t2) 
for g in t2:
    total=count+g
    count=total
print(count)

