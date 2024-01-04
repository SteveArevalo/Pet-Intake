Pet Boarding System
This Java program is designed to manage a pet boarding system where pets can be checked in, assigned spaces, and checked out while calculating boarding fees based on various criteria such as pet type, stay duration, grooming services, and weight (for dogs).

Features
Pet Check-In: Allows for checking in pets (dogs and cats) by gathering necessary information such as pet type, name, age, and duration of stay.
Space Management: Tracks available spaces for dogs and cats and assigns spaces accordingly.
Pet Check-Out: Calculates boarding fees considering the pet's type, duration of stay, grooming services (for dogs), and weight-based fee (for dogs).
Space Vacancy: Marks boarding spaces as vacant upon pet check-out.
Usage
Pet Check-In:

Run the program and follow the prompts to check in a pet. Enter the pet type (Dog/Cat), name, age, and duration of stay.
For dogs staying two or more days, the system prompts for grooming preference.
Pet Check-Out:

Upon completion of the pet's stay, access the check-out feature.
Enter the assigned space number and, for dogs, their weight to calculate the total fees.
Instructions
Compile:

Compile the Pet.java file using javac Pet.java.
Run:

Execute the compiled program with java Pet.
Follow Prompts:

Interact with the system by following the prompts to check in or check out a pet.
Considerations
Grooming Fee: Grooming fees are applicable for dogs staying two or more days.
Weight-based Fees: For dogs, boarding fees vary based on their weight.
Space Availability: The system tracks available spaces for dogs and cats separately.
Future Improvements
Enhanced UI: Implement a graphical user interface (GUI) for a more user-friendly experience.
Database Integration: Incorporate a database to store and manage pet boarding records.
Extended Pet Types: Expand functionality to accommodate other types of pets beyond dogs and cats.
Contributions
Contributions to this project are welcome! Fork the repository, make improvements, and create a pull request with your enhancements.
