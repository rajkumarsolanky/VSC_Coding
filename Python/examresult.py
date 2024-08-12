score = int(input("Enter your exam score: "))

if score >= 90:
    grade1 = 'A1'
    print("Grade : " + grade1)
elif score >= 80:
    grade2 = 'A'
    print("Grade : " + grade2)
elif score >= 70:
    grade3 = 'B'
    print("Grade : " + grade3)
elif score >= 60:
    grade4 = 'C'
    print("Garde : " + grade4)
elif score >= 50:
    grade5 = 'D'
    print("Garde : " + grade5)
else:
    grade6 = 'F'
    print("Garde : " + grade6)