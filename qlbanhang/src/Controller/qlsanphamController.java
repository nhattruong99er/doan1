package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class qlsanphamController {
    @FXML
    private Button btnHinhanh;

    @FXML
    private Button btnQuaylaiAdmin;

    @FXML
    private Button btnSapxepSP;

    @FXML
    private Button btnSaveSP;

    @FXML
    private Button btnSavencc;

    @FXML
    private Button btnSuaSP;

    @FXML
    private Button btnSuancc;

    @FXML
    private Button btnThemncc;

    @FXML
    private Button btnThemsp;

    @FXML
    private Button btnXoaSP;

    @FXML
    private Button btnXoancc;

    @FXML
    private ComboBox<?> cbmancc;

    @FXML
    private TableColumn<?, ?> clDiachincc;

    @FXML
    private TableColumn<?, ?> clEmailncc;

    @FXML
    private TableColumn<?, ?> clFaxncc;

    @FXML
    private TableColumn<?, ?> clGiabansp;

    @FXML
    private TableColumn<?, ?> clHinhsp;

    @FXML
    private TableColumn<?, ?> clLoaisp;

    @FXML
    private TableColumn<?, ?> clMancc;

    @FXML
    private TableColumn<?, ?> clMasp;

    @FXML
    private TableColumn<?, ?> clSdtncc;

    @FXML
    private TableColumn<?, ?> clSoluongsp;

    @FXML
    private TableColumn<?, ?> clTenncc;

    @FXML
    private TableColumn<?, ?> clTensp;

    @FXML
    private DatePicker dateNhap;

    @FXML
    private ImageView imageSP;

    @FXML
    private TextField txtDiachincc;

    @FXML
    private TextField txtEmailncc;

    @FXML
    private TextField txtFaxncc;

    @FXML
    private TextField txtGiaban;

    @FXML
    private TextField txtImage;

    @FXML
    private TextField txtSdtncc;

    @FXML
    private TextField txtTenncc;

    @FXML
    private TextField txtloaisp;

    @FXML
    private TextField txtmancc;

    @FXML
    private TextField txtmasp;

    @FXML
    private TextField txtsoluongsp;

    @FXML
    private TextField txttensp;

    @FXML
    void hinhOnAction(ActionEvent event) {

    }

    @FXML
    void manccOnAction(ActionEvent event) {

    }

    @FXML
    void ngaynhapOnAction(ActionEvent event) {

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
    void sapxepspOnAction(ActionEvent event) {

    }

    @FXML
    void savenccOnAction(ActionEvent event) {

    }

    @FXML
    void savespOnAction(ActionEvent event) {

    }

    @FXML
    void suanccOnAction(ActionEvent event) {

    }

    @FXML
    void suaspOnAction(ActionEvent event) {

    }

    @FXML
    void themnccOnAction(ActionEvent event) {

    }

    @FXML
    void themspOnAction(ActionEvent event) {

    }

    @FXML
    void xoanccOnAction(ActionEvent event) {

    }

    @FXML
    void xoaspOnAction(ActionEvent event) {

    }

}
