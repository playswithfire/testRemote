
public class Hospital {

	
	public static void main(String[] args) {
	Doctor doc1 = new Doctor();
		doc1.name = "Dr. Dolittle";
		doc1.worksAtHospital = true;
		doc1.treatPatient();
		
		FamilyDoctor doc2 = new FamilyDoctor();
		doc2.name = "Dr. Spock";
		doc2.worksAtHospital = true;
		doc2.treatPatient();
		
		Surgeon doc3 = new Surgeon();
		doc3.name = "Dr. Lecter";
		doc3.worksAtHospital = false;
		doc3.treatPatient();
		
		if (doc3 instanceof Doctor) {
			System.out.println(doc3.name + " is a doctor.");
			
		}
		
	}
	}


