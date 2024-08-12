parties = {
    1: "PPP",
    2: "PML-N",
    3: "PTI",
}
if parties["PPP"] > parties["PML-N"] and parties["PPP"] > parties["PTI"]:
    print("winning is PTI")
elif  parties["PML-N"] > parties["PPP"] and parties["PML-N"] > parties["PTI"]:
    print("winning is PML-N")
