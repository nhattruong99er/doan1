package Controller;

import Contants.databaseConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class updateTKController {
    @FXML
    private Button btnLuulaiTK;

    @FXML
    private Button btnQuaylai;

    @FXML
    private Button btnSuaTK;

    @FXML
    private Button btnThemTK;

    @FXML
    private Button btnXoaTK;

    @FXML
    private ComboBox<?> cbNhanvien;

    @FXML
    private ComboBox<?> cbTaikhoan;

    @FXML
    private TableColumn<?, ?> clDateup;

    @FXML
    private TableColumn<?, ?> clLoaiTK;

    @FXML
    private TableColumn<?, ?> clMatkhau;

    @FXML
    private TableColumn<?, ?> clTaikhoan;

    @FXML
    private TableColumn<?, ?> clTennv;

    @FXML
    private DatePicker dateTK;

    @FXML
    private TextField txtMatkhau;

    @FXML
    private TextField txtTaikhoan;

    @FXML
    void datetkOnAction(ActionEvent event) {

    }

    @FXML
    void luutkOnAction(ActionEvent event) {

    }

    @FXML
    void dsnhanvienOnAction(ActionEvent event) {

    }

    @FXML
    void priviousOnAction(ActionEvent event) {
        try{
            Stage stage = (Stage) btnQuaylai.getScene().getWindow();
            stage.close();

            Stage userScreen = new Stage();
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/Screen/admin.fxml"));
                Scene scene = new Scene(root, 600, 400);
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
    void suatkOnAction(ActionEvent event) {

    }

    @FXML
    void loaitaikhoanOnAction(ActionEvent event) {

    }

    @FXML
    void themtkOnAction(ActionEvent event) {

    }

    @FXML
    void xoatkOnAction(ActionEvent event) {

    }

}
