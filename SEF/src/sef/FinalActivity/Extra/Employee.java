package sef.FinalActivity.Extra;

public class Employee
    {
        private String firstName;
        private String lastName;

        public Employee(String firstName, String lastName)
        {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // set firstName
        public void setFirstName(String firstName)
        {
            this.firstName = firstName;
        }

        // get firstName
        public String getFirstName()
        {
            return firstName;
        }

        // set lastName
        public void setLastName(String lastName)
        {
            this.lastName = lastName;
        }

        // get lastName
        public String getLastName()
        {
            return lastName;
        }


        // return Employee's first and last name combined
        public String getName()
        {
            return String.format("%s %s", getFirstName(), getLastName());
        }

        // return a String containing the Employee's information
        @Override
        public String toString()
        {
            return String.format("%-8s %-8s",
                    getFirstName(), getLastName());
        }
    }



