module com.example.second_proyect_prime_numbers {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.second_proyect_prime_numbers to javafx.fxml;
    exports com.example.second_proyect_prime_numbers;
}