rain_percentages = {
    "January": 50,
    "February": 45,
    "March": 30,
    "April": 20,
    "May": 10,
    "June": 5,
    "July": 3,
    "August": 5,
    "September": 15,
    "October": 25,
    "November": 40,
    "December": 50,
}
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

month = input("Enter month number (1-12): ")
month = int(month)
month_name = month_names[month]

if month_name in rain_percentages:
    rain_percentage = rain_percentages[month_name]
    print(f"Cloudy Rain Weather in Month {month_name} is {rain_percentage}%.")
else:
    print("Invalid month number.")