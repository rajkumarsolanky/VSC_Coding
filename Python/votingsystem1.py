parties = {
    "PPP": "Arrow",
    "PML-N": "Tiger",
    "PTI": "Bat",
}
voting = {
    1: "PPP",
    2: "PML-N",
    3: "PTI",
}
votes = {
    "PPP": 0,
    "PML-N": 0,
    "PTI": 0,
}

voting = int(input("Enter the number corresponding to your chosen party: "))

if 1 <= voting <= 3:
    chosen_party = voting
    votes[chosen_party] += 1
    print(f"Thank you for voting for {parties[chosen_party]} ({chosen_party}).")
else:
    print("Invalid input, please try again.")

if votes["PPP"] > votes["PML-N"] and votes["PPP"] > votes["PTI"]:
    winning_party = "PPP"
elif votes["PML-N"] > votes["PPP"] and votes["PML-N"] > votes["PTI"]:
    winning_party = "PML-N"
else:
    winning_party = "PTI"

print(f"The winning party is {winning_party} with {votes[winning_party]} votes.")