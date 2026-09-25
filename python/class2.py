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

maya = dog("maya", "small")


print(maya.bark())
print(maya.name)