module com.juego {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.juego to javafx.fxml;
    exports com.juego;
}
