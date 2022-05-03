module ru.gb.gbchat {

    requires javafx.controls;
    requires javafx.fxml;

    exports ru.gb.gbchat2.client;
    opens ru.gb.gbchat2.client to javafx.fxml;
}
