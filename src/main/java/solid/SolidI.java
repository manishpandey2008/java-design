package solid;


interface Hospital{
   void checkPatient();
   void monitorPatient();
   void maintainBillsAndFee();
}

class Doctor implements Hospital{

    @Override
    public void checkPatient() {
        // Write code for checking patient
    }

    @Override
    public void monitorPatient() {
        // This function not usefull for doctor
    }

    @Override
    public void maintainBillsAndFee() {
        // This function not usefull for doctor
    }
}

// In Above implementation monitorPatient() and maintainBillsAndFee() function is not usefull for Doctor
// Now apply  Interface Segmented Principle

interface DoctoInteface{
    void checkPatient();
}

interface NurseInteface{
    void monitorPatient();
}

interface HospitalCounterInteface{
    void maintainBillsAndFee();
}

public class SolidI {
    public static void main(String[] args) {
        // Interface Segmented Principle
        // Split your interface in multiple small Interface, because implemented client not use unnecessary function
    }
}
