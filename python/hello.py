x=10
print(x)

#Use of function
def myfun():
	x="good"
    
	print(x)
    
myfun()

#using tuples
thistuple = ("apple", "banana", "cherry")
print(thistuple[1])

# for String Format
age = 36
txt = "My name is John, and I am {}"
print(txt.format(age))

#for Escape Character
txt = "We are the so-called \"Vikings\" from the north."
print(txt) 

#String Methods

txt = "hello, and welcome to my world."
x = txt.capitalize()
print (x)

txt = "banana"
y= txt.center(20)
print(y)

txt = "I love apples, apple are my favorite fruit"
x = txt.count("apple")
print(x)

txt = "Hello, welcome to my world."
x = txt.index("welcome")
print(x)
y=txt.upper()
print(y)

z=txt.title()
print(z)

#python boolean
print(10 > 9)
print(10 == 9)
print(10 < 9)

a = 200
b = 33

if b > a:
  print("b is greater than a")
else:
  print("b is not greater than a")

#below values will return True as it has some contents
print(bool("abc"))
print(bool(123))
print(bool(["apple", "cherry", "banana"]))

#Except for empty anything returns true, below are empty one examples so returns false
print(bool(False))
print(bool(None))
print(bool(0))
print(bool(""))
print(bool(()))
print(bool([]))
print(bool({}))

#Python Operators

x = 5
x += 3
print(x)

#Exponentiation
x = 2
y = 5
print(x ** y)

#python can have any data type in list
list1 = ["apple", "banana", "cherry"]
list2 = [1, 5, 7, 9, 3]
list3 = [True, False, False]

print(list1)
print(list2)
print(list3)

#We can change the list item
thislist = ["apple", "banana", "cherry"]
thislist[1] = "blackcurrant"

print(thislist)

#inerting in a list
thislist = ["apple", "banana", "cherry"]
thislist.insert(2, "watermelon")
print(thislist) 

