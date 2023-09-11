package mukura.belajarjava.data;

/*
* Materi Inner Class
* */

// class Company merupakan outer class
public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // class Employee merupakan Inner Class dari Company
    public class Employee {
        private String name;

        // method untuk mengakses outer class
        public String getCompany(){
            return Company.this.getName();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
