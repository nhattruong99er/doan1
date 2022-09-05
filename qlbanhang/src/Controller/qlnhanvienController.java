package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class qlnhanvienController {
    @FXML
    private Button btnAddnv;

    @FXML
    private Button btnQuaylaiAdmin;

    @FXML
    private Button btnSavenv;

    @FXML
    private Button btnUpdatenv;

    @FXML
    private Button btnXoanv;

    @FXML
    private ComboBox<?> cbGioitinh;

    @FXML
    private DatePicker datenv;

    @FXML
    private TextField txtChucvu;

    @FXML
    private TextField txtDiachi;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtLuong;

    @FXML
    private TextField txtManv;

    @FXML
    private TextField txtTennv;

    @FXML
    private TextField txtsdt;

    @FXML
    void addOnAction(ActionEvent event) {

        String manv = txtManv.getText();
        String tennv = txtTennv.getText();
    }

    @FXML
    void birthOnAction(ActionEvent event) {

    }

    @FXML
    void deleteOnAction(ActionEvent event) {

    }

    @FXML
    void priviousOnAction(ActionEvent event) {
        try{
            Stage stage = (Stage) btnQuaylaiAdmin.getScene().getWindow();
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
    void saveOnAction(ActionEvent event) {

    }

    @FXML
    void sexOnAction(ActionEvent event) {

    }

    @FXML
    void updateOnAction(ActionEvent event) {

    }
}
