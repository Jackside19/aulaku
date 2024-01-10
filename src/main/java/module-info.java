module com.example.aulaku {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.aulaku to javafx.fxml;
    exports com.example.aulaku;
}