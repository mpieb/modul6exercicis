package modul6exer2;
public class Modul6Exer2 {
public static void main(String[] args) {
    NousEmpleats nouEmpleat1 = new NousEmpleats("Pitu", "Senior", "Plateria 29", "625846978", 3900);
    nouEmpleat1.validarSenior(3900);
    System.out.println("Name: " + nouEmpleat1.donaName() + ", Rol: " + nouEmpleat1.donaRols() +
            ", Adress: " + nouEmpleat1.donaAdress() + ", Phone: " + nouEmpleat1.donaPhone() + 
            ", SalaryMonth: " + nouEmpleat1.donaSalaryMonth() + ", SalaryTotal: " + 
            nouEmpleat1.donaSouTotal());
    
    NousEmpleats nouEmpleat2 = new NousEmpleats("Toful", "Mind", "Pou del glass 47", "111632459", 2400);
    nouEmpleat2.validarMind(2400);
    System.out.println("Name: " + nouEmpleat2.donaName() + ", Rol: " + nouEmpleat2.donaRols() +
            ", Adress: " + nouEmpleat2.donaAdress() + ", Phone: " + nouEmpleat2.donaPhone() + 
            ", SalaryMonth: " + nouEmpleat2.donaSalaryMonth() + ", SalaryTotal: " + 
            nouEmpleat2.donaSouTotal());
    
    NousEmpleats nouEmpleat3 = new NousEmpleats("Pitxi", "Junior", "Cuberó 1", "368254658", 1500);
    nouEmpleat3.validarJunior(1500);
    System.out.println("Name: " + nouEmpleat3.donaName() + ", Rol: " + nouEmpleat3.donaRols() +
            ", Adress: " + nouEmpleat3.donaAdress() + ", Phone: " + nouEmpleat3.donaPhone() + 
            ", SalaryMonth: " + nouEmpleat3.donaSalaryMonth() + ", SalaryTotal: " + 
            nouEmpleat3.donaSouTotal());
    
    Empleat empleat1 = new Empleat("Pere", "Manager", "Pere cerimonios 4", "123456789", 4500);
    empleat1.validarManager(4500);
    System.out.println("Name: " + empleat1.donaName() + ", Rol: " + empleat1.donaRols() +
            ", Adress: " + empleat1.donaAdress() + ", Phone: " + empleat1.donaPhone() + 
            ", SalaryMonth: " + empleat1.donaSalaryMonth() + ", SalaryTotal: " + 
            empleat1.donaSouTotal());
    
    Empleat empleat2 = new Empleat("Toño", "Boss", "Creu baixa 5", "987654321", 76000);
    empleat2.validarBoss(76000);
    System.out.println("Name: " + empleat2.donaName() + ", Rol: " + empleat2.donaRols() +
            ", Adress: " + empleat2.donaAdress() + ", Phone: " + empleat2.donaPhone() + 
            ", SalaryMonth: " + empleat2.donaSalaryMonth() + ", SalaryTotal: " + 
            empleat2.donaSouTotal());
    
    Empleat empleat3 = new Empleat("Baque", "Volunteer", "Baixada 33", "258741259", 0);
    empleat3.validarVolunteer(0);
    System.out.println("Name: " + empleat3.donaName() + ", Rol: " + empleat3.donaRols() +
            ", Adress: " + empleat3.donaAdress() + ", Phone: " + empleat3.donaPhone() + 
            ", SalaryMonth: " + empleat3.donaSalaryMonth() + ", SalaryTotal: " + 
            empleat3.donaSouTotal());
    }
}

//Declaració de clase empleat
class Empleat{
    //Declaració de variables de 
    private String name;
    private String rols;
    private String adress;
    private String phone;
    private double salaryMonth;
    double aument;
    
     //Declaració del constructor i paràmetres 
    public Empleat(String name, String rols, String adress, String phone, double salaryMonth){
        this.name = name;
        this.rols = rols;
        this.adress = adress;
        this.phone = phone;
        this.salaryMonth = salaryMonth;
    }
        
    public void prenName(String name){//Setter
        this.name = name;
    }
    
    public String donaName(){//Getter
        return  name;
    }
    
    public void prenRols(String rols){//Setter
        this.rols = rols;
    }
    
    public String donaRols(){//Getter
        return rols;
    }
    
    public void prenAdress(String adress){//Setter
        this.adress = adress;
    }
    
    public String donaAdress(){//Getter
        return adress;
    }
    
    public void prenPhone(String phone){//Setter
        this.phone = phone;
    }
    
    public String donaPhone(){//Getter
        return  phone;
    }
    
    public void prenSalaryMonth(double salaryMonth){
        this.salaryMonth = salaryMonth;
    }
    
    public double donaSalaryMonth(){//Getter
        return salaryMonth; 
    }
    
    public void validarBoss(double salaryMonth) throws ArithmeticException{//Setter
        if(salaryMonth > 8000){
            aument = salaryMonth * 1.5;
        } else {
            throw new ArithmeticException("El sou del Boss té que ser major " +
                    "de 8000 euros!");
        }
    }
    
    public void validarManager(double salaryMonth) throws ArithmeticException{//Setter
        if(salaryMonth >= 3000 && salaryMonth < 5000){
            aument= salaryMonth * 1.1;
        } else {
            throw new ArithmeticException("El sou d´un Manager oscil.la " +
                    "entre 3000 i 4999 euros!");
        }
    }
    
    public void validarVolunteer(double salaryMonth) throws ArithmeticException{//Setter
        if(salaryMonth == 0){
            aument = salaryMonth;
        } else {
            throw new ArithmeticException("El Volunter no cobra!");
        }
    }
    
    public double donaSouTotal(){//Getter
        return aument;
    }
}
    
class NousEmpleats extends Empleat{
    public NousEmpleats(String name, String rols, String adress, String phone, double salaryMonth){
        super(name, rols, adress, phone, salaryMonth);
    }
    
    public void validarSenior(double salaryMonth) throws ArithmeticException{//Setter
        if(salaryMonth >= 2700 && salaryMonth < 4000){
            aument = salaryMonth * 0.85;
        } else {
            throw new ArithmeticException("El sou d´un Senior oscil.la " +
                    "entre 2700 i 3999 euros!");
        }
    }
    
    public void validarMind(double salaryMonth) throws ArithmeticException{//Setter 
        if(salaryMonth >= 1800 && salaryMonth < 2500){
            aument = salaryMonth * 0.9;
        } else {
            throw new ArithmeticException("El sou d´un Mind oscil.la " +
                    "entre 1800 i 2499 euros!");
        }
    }
    
    public void validarJunior(double salaryMonth) throws ArithmeticException{//Setter
        if(salaryMonth >= 900 && salaryMonth < 1599){
            aument = salaryMonth * 0.95;
        } else {
            throw new ArithmeticException("El sou d´un Junior oscil.la " + 
                    "entre 900 i 1599 euros!");
        }
    }
}




    
    
    
    
    

