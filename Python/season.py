#season 4
 #winter 11 12 1
 #Spring 2 3 4
 #Summer 5 7 6 
 #Autumn 8 9 10
month_names = {
    1: "January",
    2: "February",
    3: "March",
    4: "April",
    5: "May",
    6: "June",
    7: "July",
    8: "August",
    9: "September",
    10: "October",
    11: "November",
    12: "December"
}
#Enter math = (input numbers)
 
month = input ("Enter month number  :  ")
month = int(month)
month_name = month_names[month]

if month == 11 or month == 12 or month == 1:
    print("Wellcome to Winter in "+month_name)
elif month == 2 or month == 3 or month == 4:
    print("Wellcome to Spring in "+month_name)
elif month == 5 or month == 6 or month == 7:
    print("Wellcome to Summer in "+month_name)
elif month == 8 or month == 9 or month == 10:
    print("Wellcome to Autumn in "+month_name)
else:
    print("Invalid month number.")