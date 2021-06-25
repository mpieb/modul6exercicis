package modul6exer3;
public class Modul6Exer3 {
public static void main(String[] args) {
    NousEmpleats nouEmpleat1 = new NousEmpleats("Pitu", "Senior", "Plateria 29", "625846978", 3900);
    nouEmpleat1.validarSenior(3900);
    nouEmpleat1.prenSouBrutAnual(3900);
    nouEmpleat1.prenSouNetAnualSenior(3900);
    nouEmpleat1.prenBonus(3900);
    System.out.println("Name: " + nouEmpleat1.donaNom() + ", Rol: " + nouEmpleat1.donaRols() +
            ", Adress: " + nouEmpleat1.donaAdreça() + ", Phone: " + nouEmpleat1.donaPhone() + 
            ", Sou brut mensual: " + nouEmpleat1.donaSouBrutMensual() + ", Sou net mensual: " + 
            nouEmpleat1.donaSouNetMensual() + ", Sou brut anual: " + nouEmpleat1.donaSouBrutAnual() +
            ", Sou net anual: " + nouEmpleat1.donaSouNetAnual() + ", Incentiu: " + 
            nouEmpleat1.donaBonus());
    
    NousEmpleats nouEmpleat2 = new NousEmpleats("Toful", "Mind", "Pou del glass 47", "111632459", 2400);
    nouEmpleat2.validarMind(2400);
    nouEmpleat2.prenSouBrutAnual(2400);
    nouEmpleat2.prenSouNetAnualMind(2400);
    nouEmpleat2.prenBonus(2400);
    System.out.println("Name: " + nouEmpleat2.donaNom() + ", Rol: " + nouEmpleat2.donaRols() +
            ", Adress: " + nouEmpleat2.donaAdreça() + ", Phone: " + nouEmpleat2.donaPhone() + 
            ", Sou brut mensual: " + nouEmpleat2.donaSouBrutMensual() + ", Sou net mensual: " + 
            nouEmpleat2.donaSouNetMensual() + ", Sou brut anual: " + nouEmpleat2.donaSouBrutAnual() +
            ", Sou net anual: " + nouEmpleat2.donaSouNetAnual() + ", Incentiu: " + 
            nouEmpleat2.donaBonus());
    
    NousEmpleats nouEmpleat3 = new NousEmpleats("Pitxi", "Junior", "Cuberó 1", "368254658", 1500);
    nouEmpleat3.validarJunior(1500);
    nouEmpleat3.prenSouBrutAnual(1500);
    nouEmpleat3.prenSouBrutAnual(1500);
    nouEmpleat3.prenSouNetAnualJunior(1500);
    nouEmpleat3.prenBonus(1500);
    System.out.println("Name: " + nouEmpleat3.donaNom() + ", Rol: " + nouEmpleat3.donaRols() +
            ", Adress: " + nouEmpleat3.donaAdreça() + ", Phone: " + nouEmpleat3.donaPhone() + 
            ", Sou brut mensual: " + nouEmpleat3.donaSouBrutMensual() + ", Sou net mensual: " + 
            nouEmpleat3.donaSouNetMensual() + ", Sou brut anual: " + nouEmpleat3.donaSouBrutAnual() +
            ", Sou net anual: " + nouEmpleat3.donaSouNetAnual() + ", Incentiu: " + 
            nouEmpleat3.donaBonus());
    
    Empleat empleat1 = new Empleat("Pere", "Manager", "Pere cerimonios 4", "123456789", 4500);
    empleat1.validarManager(4500);
    empleat1.prenSouBrutAnual(4500);
    empleat1.prenSouNetAnualManager(4500);
    empleat1.prenBonus(4500);
    System.out.println("Name: " + empleat1.donaNom() + ", Rol: " + empleat1.donaRols() +
            ", Adress: " + empleat1.donaAdreça() + ", Phone: " + empleat1.donaPhone() + 
            ", Sou brut mensual: " + empleat1.donaSouBrutMensual() + ", Sou net mensual: " + 
            empleat1.donaSouNetMensual() + ", Sou brut anual: " + empleat1.donaSouBrutAnual() +
            ", Sou net anual: " + empleat1.donaSouNetAnual() + ", Incentiu: " + 
            empleat1.donaBonus());
    
    Empleat empleat2 = new Empleat("Toño", "Boss", "Creu baixa 5", "987654321", 76000);
    empleat2.validarBoss(76000);
    empleat2.prenSouBrutAnual(76000);
    empleat2.prenSouNetAnualBoss(76000);
    empleat2.prenBonus(76000);
    System.out.println("Name: " + empleat2.donaNom() + ", Rol: " + empleat2.donaRols() +
            ", Adress: " + empleat2.donaAdreça() + ", Phone: " + empleat2.donaPhone() + 
            ", Sou brut mensual: " + empleat2.donaSouBrutMensual() + ", Sou net mensual: " + 
            empleat2.donaSouNetMensual() + ", Sou brut anual: " + empleat2.donaSouBrutAnual() +
            ", Sou net anual: " + empleat2.donaSouNetAnual() + ", Incentiu: " + 
            empleat2.donaBonus());
    
    Empleat empleat3 = new Empleat("Baque", "Volunteer", "Baixada 33", "258741259", 250);
    empleat3.validarVolunteer(250);
    empleat3.prenSouBrutAnual(250);
    empleat3.prenSouNetAnualVolunteer(250);
    System.out.println("Name: " + empleat3.donaNom() + ", Rol: " + empleat3.donaRols() +
            ", Adress: " + empleat3.donaAdreça() + ", Phone: " + empleat3.donaPhone() + 
            ", Sou brut mensual: " + empleat3.donaSouBrutMensual() + ", Sou net mensual: " + 
            empleat3.donaSouNetMensual() + ", Sou brut anual: " + empleat3.donaSouBrutAnual() +
            ", Sou net anual: " + empleat3.donaSouNetAnual() + ", Incentiu: " + 
            empleat3.donaBonusVolunteer());
    }
    
}

//Declaració de clase empleat
class Empleat{
    //Declaració de variables de clase
    private String nom;
    private String rols;
    private String adreça;
    private String phone;
    double souBrutMensual;
    double souNetMensual;
    double souBrutAnual;
    double souNetAnual;
    double bonus;
    
     //Declaració del constructor i paràmetres 
    public Empleat(String nom, String rols, String adreça, String phone, double souBrutMensual){
        this.nom = nom;
        this.rols = rols;
        this.adreça = adreça;
        this.phone = phone;
        this.souBrutMensual = souBrutMensual;
        this.souNetMensual = souNetMensual;
        this.souBrutAnual = souBrutAnual;
        this.souNetAnual = souNetAnual;
    }
        
    public void prenNom(String nom){//Setter
        this.nom = nom;
    }
    
    public String donaNom(){//Getter
        return  nom;
    }
    
    public void prenRols(String rols){//Setter
        this.rols = rols;
    }
    
    public String donaRols(){//Getter
        return rols;
    }
    
    public void prenAdreça(String adreça){//Setter
        this.adreça = adreça;
    }
    
    public String donaAdreça(){//Getter
        return adreça;
    }
    
    public void prenPhone(String phone){//Setter
        this.phone = phone;
    }
    
    public String donaPhone(){//Getter
        return  phone;
    }
    
    public void prenSouBrutMensual(double souBrutMensual){
        this.souBrutMensual = souBrutMensual;
    }
    
    public double donaSouBrutMensual(){//Getter
        return souBrutMensual; 
    }
    
    public void validarBoss(double souBrutMensual) throws ArithmeticException{//Setter
        if(souBrutMensual > 8000){
            souNetMensual = souBrutMensual * 0.68;
        } else {
            throw new ArithmeticException("El sou mensual brut del Boss té " +
                    "que ser major de 8000 euros!");
        }
    }
    
    public void validarManager(double souBrutMensual) throws ArithmeticException{//Setter
        if(souBrutMensual >= 3000 && souBrutMensual < 5000){
            souNetMensual = souBrutMensual * 0.74;
        } else {
            throw new ArithmeticException("El sou brut mensual d´un " +
                    "Manager oscil.la entre 3000 i 4999 euros!");
        }
    }
    
    public void validarVolunteer(double souBrutMensual) throws ArithmeticException{//Setter
        if(souBrutMensual <= 300){
            souNetMensual = souBrutMensual;
        } else {
            throw new ArithmeticException("El Volunter cobra fins a 300 euros " + 
                    "d´ajut gubernamental!");
        }
    }
    
    public double donaSouNetMensual(){//Getter
        return souNetMensual;
    }
    
    public void prenSouBrutAnual(double souBrutMensual){//Setter
        souBrutAnual = souBrutMensual * 12;
    }
    
    public double donaSouBrutAnual(){//Getter
        return souBrutAnual;
    }
    
    public void prenSouNetAnualBoss(double souBrutMensual){//Setter
        souNetAnual = (souBrutMensual * 0.68) * 12; 
    }
    
    public void prenSouNetAnualManager(double souBrutMensual){//Setter
        souNetAnual = (souBrutMensual * 0.74) * 12;
    }
    
    public void prenSouNetAnualVolunteer(double souBrutMensual){//Setter
        souNetAnual = souBrutMensual * 12;
    }
            
    public double donaSouNetAnual(){//Getter
        return souNetAnual;
    }
    
    public void prenBonus(double souBrutMensual){//Setter
        bonus = (souBrutMensual * 0.1) * 12;
    }
    
    public double donaBonus(){//Getter
        return bonus;
    }
    
    public String donaBonusVolunteer(){//getter
        return "El Volunteer no té incentiu!";
    }
}
    
class NousEmpleats extends Empleat{
    public NousEmpleats(String nom, String rols, String adreça, String phone, double souBrutMensual){
        super(nom, rols, adreça, phone, souBrutMensual);
    }
    
    public void validarSenior(double souBrutMensual) throws ArithmeticException{//Setter
        if(souBrutMensual >= 2700 && souBrutMensual < 4000){
            souNetMensual = souBrutMensual * 0.76;
        } else {
            throw new ArithmeticException("El sou brut mensual d´un Senior " +
                    "oscil.la entre 2700 i 3999 euros!");
        }
    }
    
    public void validarMind(double souBrutMemsual) throws ArithmeticException{//Setter 
        if(souBrutMensual >= 1800 && souBrutMensual < 2500){
            souNetMensual = souBrutMensual * 0.85;
        } else {
            throw new ArithmeticException("El sou mensual brut d´un Mind " +
                    "oscil.la + entre 1800 i 2499 euros!");
        }
    }
    
    public void validarJunior(double souBrutMensual) throws ArithmeticException{//Setter
        if(souBrutMensual >= 900 && souBrutMensual < 1599){
            souNetMensual = souBrutMensual * 0.98;
        } else {
            throw new ArithmeticException("El sou brut mensual d´un Junior " +
                    "oscil.la entre 900 i 1599 euros!");
        }
    }
    
    public void prenSouNetAnualSenior(double souBrutMensual){//Setter
        souNetAnual = (souBrutMensual * 0.76) * 12;
    }
    
    public void prenSouNetAnualMind(double souBrutMensual){//Setter
        souNetAnual = (souBrutMensual * 0.85) * 12;
    }
    
    public void prenSouNetAnualJunior(double souBrutMensual){//Setter
        souNetAnual = (souBrutMensual * 0.98) * 12;
    }
}




    
    
    
