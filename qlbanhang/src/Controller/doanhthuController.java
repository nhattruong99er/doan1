package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class doanhthuController {
    @FXML
    private Button btnInthongke;

    @FXML
    private Button btnQuaylai;

    @FXML
    private Button btnSapxep;

    @FXML
    private Button btnThongke;

    @FXML
    private TableColumn<?, ?> clDongia;

    @FXML
    private TableColumn<?, ?> clLoaisp;

    @FXML
    private TableColumn<?, ?> clMadonhang;

    @FXML
    private TableColumn<?, ?> clMasanpham;

    @FXML
    private TableColumn<?, ?> clSoluongsp;

    @FXML
    private TableColumn<?, ?> clTensp;

    @FXML
    private TableColumn<?, ?> clThanhtien;

    @FXML
    private TableColumn<?, ?> clTime;

    @FXML
    private DatePicker dateDown;

    @FXML
    private DatePicker dateUp;

    @FXML
    void datedownOnAction(ActionEvent event) {

    }

    @FXML
    void dateupOnAction(ActionEvent event) {

    }

    @FXML
    void inthongkeOnAction(ActionEvent event) {

    }

    @FXML
    void previousOnAction(ActionEvent event) {
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
    void sapxepOnAction(ActionEvent event) {

    }

    @FXML
    void thongkeOnAction(ActionEvent event) {

    }
}
