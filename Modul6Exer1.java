package modul6exer1;
public class Modul6Exer1 {
public static void main(String[] args) {
    
    Empleat empleat1 = new Empleat("Pere", "Manager", "Pere cerimonios 4", "123456789", 56000);
    empleat1.souTotal(10);
    System.out.println("Name: " + empleat1.donaName() + ", Rol: " + empleat1.donaRols() +
            ", Adress: " + empleat1.donaAdress() + ", Phone: " + empleat1.donaPhone() + 
            ", SalaryMonth: " + empleat1.donaSalaryMonth() + ", SalaryTotal: " + 
            empleat1.donaSouTotal());
    
    Empleat empleat2 = new Empleat("Toño", "Boss", "Creu baixa 5", "987654321", 76000);
    empleat2.souTotal(50);
    System.out.println("Name: " + empleat2.donaName() + ", Rol: " + empleat2.donaRols() +
            ", Adress: " + empleat2.donaAdress() + ", Phone: " + empleat2.donaPhone() + 
            ", SalaryMonth: " + empleat2.donaSalaryMonth() + ", SalaryTotal: " + 
            empleat2.donaSouTotal());
    
    Empleat empleat3 = new Empleat("Roque", "Employee", "Campanar 9", "234567890", 43000);
    empleat3.souTotal(-15);
    System.out.println("Name: " + empleat3.donaName() + ", Rol: " + empleat3.donaRols() +
            ", Adress: " + empleat3.donaAdress() + ", Phone: " + empleat3.donaPhone() + 
            ", SalaryMonth: " + empleat3.donaSalaryMonth() + ", SalaryTotal: " + 
            empleat3.donaSouTotal());
    
    Empleat empleat4 = new Empleat("Suso", "Volunteer", "Monjo Riquer 13", "93 5687093", 0.0);
    empleat4.souTotal(0);
    System.out.println("Name: " + empleat4.donaName() + ", Rol: " + empleat4.donaRols() +
            ", Adress: " + empleat4.donaAdress() + ", Phone: " + empleat4.donaPhone() + 
            ", SalaryMonth: " + empleat4.donaSalaryMonth() + ", SalaryTotal: " + 
            empleat4.donaSouTotal());
    
    
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
    private double aument;
    
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
    
    public void prenSalaryMonth(double salaryMonth){//Setter
        this.salaryMonth = salaryMonth;
    }
    
    public double donaSalaryMonth(){//Getter
        return salaryMonth; 
    }
    
    public void souTotal(double percentaje){//Setter
        aument = salaryMonth*percentaje/100;
        aument = aument + salaryMonth;
    }
    
    public double donaSouTotal(){//Getter
        return aument;
    }
}

    
    
    
    
    




