package mukura.belajarjava.application;

import mukura.belajarjava.data.Company;

/*
* Membuat Object Inner Class
* */
public class CompanyApp {
    public static void main(String[] args) {

        // membuat object inner class
        Company company = new Company();
        company.setName("Mukura");

        Company.Employee employee = company.new Employee();
        employee.setName("Affandi");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("Belum Ada");

        Company.Employee employee2 =  company2.new Employee();
        employee2.setName("Affandi");
        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());


    }
}
