module com.example.proyectodi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectodi to javafx.fxml;
    exports com.example.proyectodi;
    exports com.example.proyectodi.controladores;
    opens com.example.proyectodi.controladores to javafx.fxml;
}