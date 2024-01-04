import java.util.Scanner;

public class Pet {
	// Attributes with appropriate data types
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpaces;
	private int catSpaces;
	private int daysStay;
	private double amountDue;
	
    // Default constructor initializing petType, petName, petAge, and daysStay
    public Pet() {
        this.petType = "Unknown";
        this.petName = "Unnamed";
        this.petAge = 0;
        this.daysStay = 1; // Default stay duration
    }
    
	// Constructor with parameters
	public Pet(String petType, String petName, int petAge, int daysStay){
		this.petType = petType;
		this.petName = petName;
		this.petAge = petAge;
		this.daysStay = daysStay;
		
	} 
	
    // Accessors (getters) for all attributes
    public String getPetType() {
        return petType;
    }

    public String getPetName() {
        return petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public int getDaysStay() {
        return daysStay;
    }

    public int getDogSpaces() {
        return dogSpaces;
    }

    public int getCatSpaces() {
        return catSpaces;
    }

    public int getdaysStay() {
        return daysStay;
    }

    public double amountDue() {
        return amountDue;
    }

    // Mutators (setters) for all attributes
    public void setPetType(String petType) {
        this.petType = petType;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }
    
    public void setDogSpaces(int dogSpaces) {
        this.dogSpaces = dogSpaces;
    }

    public void setCatSpaces(int catSpaces) {
        this.catSpaces = catSpaces;
    }

    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
    
	// Method allows to update amount of spaces as petBAG grows
	public void updateSpaces(int newDogSpaces, int newCatSpaces) {
		this.dogSpaces = newDogSpaces;
		this.catSpaces = newCatSpaces;
	}
	
	public void assignSpace(int spaceNumber) {
		int assignedSpace = spaceNumber;
	}
	
	// Method to check if pet spaces are available.
	public void petCheckIn() {
		Scanner scnr = new Scanner(System.in);
		dogSpaces = 30;
		catSpaces = 12;
		
		// Gather Pet information (Type, Name, Age, DaysStayed, Groom)
		petType = scnr.nextLine();
		if (petType.equalsIgnoreCase("Dog")) {
			if (dogSpaces > 0 && dogSpaces < 30) {
				System.out.println("Spaces are available for dogs.");
				System.out.println("Pet Name?");
				petName = scnr.nextLine();
				System.out.println("Pet Age?");
				petAge = scnr.nextInt();
				System.out.println("Amount of days staying?");
				daysStay = scnr.nextInt();
				
				// Checks if dog will be groomed or not. 
				if (daysStay >= 2) {
					System.out.println("Would you like the dog to be groomed? (Yes/No):");
					String groomingChoice = scnr.nextLine();
					if (groomingChoice.equalsIgnoreCase("Yes")) {
						boolean groomed = true;
					}
					
				}
				
				dogSpaces = dogSpaces - 1; // Decrements dog spaces if space is available. 
				assignSpace(dogSpaces);
			}
			else {
				System.out.println("There are NO spaces available for dogs.");
			}
		}
		// Gather Pet information (Type, Name, Age, DaysStayed)
		else if (petType.equalsIgnoreCase("Cat")) {
			if (catSpaces > 0 && catSpaces < 12) {
				System.out.println("Spaces are availale for cats.");
				System.out.println("Pet Name?");
				petName = scnr.nextLine();
				System.out.println("Pet Age?");
				petAge = scnr.nextInt();
				System.out.println("Amount of days staying?");
				daysStay = scnr.nextInt();
				
				catSpaces = catSpaces - 1; // Decrements cat spaces if space is available. 
				assignSpace(catSpaces);
			}
			else {
				System.out.println("There are NO spaces available for cats");
			}
		}
	}
	
    public void petCheckOut() {
        Scanner scnr = new Scanner(System.in);
        int petWeight;
        

        System.out.println("Enter the pet's assigned space:");
        int assignedSpace = scnr.nextInt();

        // Determine if the pet had a grooming fee
        boolean hadGroomingFee = false;
        boolean groomed = true;
        if (petType.equalsIgnoreCase("Dog") && daysStay >= 2 && groomed) {
            hadGroomingFee = true;
        }

        // Calculate total fees based on pet type and days stayed
        double dailyBoardingFee = 0.0;
        double groomingFee = 0.0;
        if (petType.equalsIgnoreCase("Dog")) {
        	petWeight = scnr.nextInt();
            if (petWeight >= 30) {
                dailyBoardingFee = 34.00;
                groomingFee = 29.95;
            } 
            
            else if (petWeight >= 20 && petWeight < 30) {
                dailyBoardingFee = 29.00;
                groomingFee = 24.95;
            } 
            
            else {
                dailyBoardingFee = 24.00;
                groomingFee = 19.95;
            }
        } 
        
        else if (petType.equalsIgnoreCase("Cat")) {
            dailyBoardingFee = 18.00;
            // Cat has no grooming fee
        }

        amountDue = dailyBoardingFee * daysStay;
        if (hadGroomingFee) {
            amountDue = groomingFee + amountDue;
        }

        // Mark the boarding space as vacant
        if (petType.equalsIgnoreCase("Dog")) {
            dogSpaces = dogSpaces + 1;
        } 
        
        else if (petType.equalsIgnoreCase("Cat")) {
            catSpaces = catSpaces + 1;
        }

        System.out.println("Pet's assigned space: " + assignedSpace);
        System.out.println("Total fees: $" + amountDue);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
