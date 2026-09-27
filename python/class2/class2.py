class dog:
    def __init__(self,name,size):
        self.name = name
        self.age = 5
        self.color = "brown"
        self.size = size

    def bark(self):
        if self.size == "small":
            return "yip yip"
        elif self.size == "medium":
            return "woof woof"
        elif self.size == "large":
            return "WOOF WOOF"


    def maxdog(d1,d2):
        if d1.age > d2.age:
            return d1
        else:
            return d2

maya = dog("maya", "small")
maya.toy = "car"

print(maya.bark())    
print(maya.name)
print(maya.toy)

dog1 = dog("dog1", "medium")
dog2 = dog("dog2", "large")

max_dog = dog.maxdog(dog1,dog2)
print(max_dog.name)
