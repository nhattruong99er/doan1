package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class banhangController {
    @FXML
    private Button btnInhoadonbanhang;

    @FXML
    private Button btnLuusp;

    @FXML
    private Button btnQuaylai;

    @FXML
    private Button btnSuadonhang;

    @FXML
    private Button btnSuasp;

    @FXML
    private Button btnThemdonhang;

    @FXML
    private Button btnThemsp;

    @FXML
    private Button btnXoadonhang;

    @FXML
    private Button btnXoasp;

    @FXML
    private ComboBox<?> cbMadonhang;

    @FXML
    private TableColumn<?, ?> clGiaban;

    @FXML
    private TableColumn<?, ?> clLoaisp;

    @FXML
    private TableColumn<?, ?> clMadonhang;

    @FXML
    private TableColumn<?, ?> clMakhachhang;

    @FXML
    private TableColumn<?, ?> clMasp;

    @FXML
    private TableColumn<?, ?> clSoluongsp;

    @FXML
    private TableColumn<?, ?> clTensp;

    @FXML
    private TableColumn<?, ?> clThanhtien;

    @FXML
    private Label labelNVban;

    @FXML
    private Label labelThanhtien;

    @FXML
    private Label labelTime;

    @FXML
    private TextField txtGiaban;

    @FXML
    private TextField txtMadonhang;

    @FXML
    private TextField txtMakhachhang;

    @FXML
    private TextField txtSLSP;

    @FXML
    private TextField txtThanhtien;

    @FXML
    private TextField txtloaisp;

    @FXML
    private TextField txtmasp;

    @FXML
    private TextField txttensp;

    @FXML
    void SuadonhangOnAction(ActionEvent event) {

    }

    @FXML
    void ThemdonhangOnAction(ActionEvent event) {

    }

    @FXML
    void XoadonhangOnAction(ActionEvent event) {

    }

    @FXML
    void cbMadonhangOnAction(ActionEvent event) {

    }

    @FXML
    void inhoadonOnAction(ActionEvent event) {

    }

    @FXML
    void luuspOnAction(ActionEvent event) {

    }

    @FXML
    void previousOnAction(ActionEvent event) {

        try{
            Stage stage = (Stage) btnQuaylai.getScene().getWindow();
            stage.close();

            Stage userScreen = new Stage();
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/Screen/users.fxml"));
                Scene scene = new Scene(root, 540, 300);
                userScreen.setScene(scene);
                userScreen.setTitle("Phần mềm quản lý bán hàng");
                userScreen.initModality(Modality.APPLICATION_MODAL);
                userScreen.show();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void suaspOnAction(ActionEvent event) {

    }

    @FXML
    void themspOnAction(ActionEvent event) {

    }

    @FXML
    void xoaspOnAction(ActionEvent event) {

    }

}
