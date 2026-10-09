distance = float(input("Enter the driving distance: "))
mpg = float(input("Enter miles per gallon: "))
price = float(input("Enter price per gallon: "))

cost = (distance / mpg) * price

print(f"The cost of driving is ${cost:.2f}")