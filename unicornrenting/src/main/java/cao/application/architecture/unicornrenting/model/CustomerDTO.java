package cao.application.architecture.unicornrenting.model;

import javax.validation.constraints.NotBlank;

public class CustomerDTO {


        public Long id;
        @NotBlank(message = "First name is mandatory")
        public String firstName;
        @NotBlank(message = "Last name is mandatory")
        public String lastName;
        public String email;
        public String phoneNumber;
        public String address;
        public String postalCode;
        public String city;
        public String country;
        public Boolean paymentValidated;
        public int staffId;


}

