module pl.lublin.wsei.java.cwiczenia.lab6a {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.lublin.wsei.java.cwiczenia.lab6a to javafx.fxml;
    exports pl.lublin.wsei.java.cwiczenia.lab6a;
}