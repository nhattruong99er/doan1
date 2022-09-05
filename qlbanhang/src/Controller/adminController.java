package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class adminController {
    @FXML
    private Button btnDoanhthu;

    @FXML
    private Button btnDoimk;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnUpdatetk;

    @FXML
    private Button btnqlnv;

    @FXML
    private Button btnqlsp;

    @FXML
    void doanhthuOnAction(ActionEvent event) {
        try{
            Stage stage = (Stage) btnDoanhthu.getScene().getWindow();
            stage.close();

            Stage doanhthuScreen = new Stage();
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/Screen/doanhThu.fxml"));
                Scene scene = new Scene(root, 700, 460);
                doanhthuScreen.setScene(scene);
                doanhthuScreen.setTitle("Phần mềm quản lý bán hàng");
                doanhthuScreen.initModality(Modality.APPLICATION_MODAL);
                doanhthuScreen.show();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void doimkOnAction(ActionEvent event) {
        try{
            Stage stage = (Stage) btnDoimk.getScene().getWindow();
            stage.close();

            Stage userScreen = new Stage();
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/Screen/doiMK.fxml"));
                Scene scene = new Scene(root, 450, 400);
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
    void logoutOnAction(ActionEvent event) {
        try{
            Stage stage = (Stage) btnLogout.getScene().getWindow();
            stage.close();

            Stage userScreen = new Stage();
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/dangNhap/dangNhap.fxml"));
                Scene scene = new Scene(root, 450, 350);
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
    void qlnvOnAction(ActionEvent event) {
        try {
            Stage stage = (Stage) btnqlnv.getScene().getWindow();
            stage.close();

            Stage userScreen = new Stage();
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/Screen/qlnhanvien.fxml"));
                Scene scene = new Scene(root, 1000, 500);
                userScreen.setScene(scene);
                userScreen.setTitle("Phần mềm quản lý bán hàng");
                userScreen.initModality(Modality.APPLICATION_MODAL);
                userScreen.show();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        @FXML
    void qlspOnAction(ActionEvent event) {
            try{
                Stage stage = (Stage) btnqlsp.getScene().getWindow();
                stage.close();

                Stage userScreen = new Stage();
                try {
                    Parent root = FXMLLoader.load(getClass().getResource("/Screen/qlsanpham.fxml"));
                    Scene scene = new Scene(root, 1100, 550);
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
    void updatetkOnAction(ActionEvent event) {
        try{
            Stage stage = (Stage) btnUpdatetk.getScene().getWindow();
            stage.close();

            Stage userScreen = new Stage();
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/Screen/updateTK.fxml"));
                Scene scene = new Scene(root, 700, 400);
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
}
