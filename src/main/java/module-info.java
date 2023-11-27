module com.example.dynamiclist {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.dynamiclist to javafx.fxml;
    exports com.example.dynamiclist;
}