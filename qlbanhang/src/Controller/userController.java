package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class userController {
    @FXML
    private Button btnBanhang;

    @FXML
    private Button btnDoimk;

    @FXML
    private Button btnLogout;

    @FXML
    void banhangOnAction(ActionEvent event) {
        try{
            Stage stage = (Stage) btnBanhang.getScene().getWindow();
            stage.close();

            Stage userScreen = new Stage();
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/Screen/banHang.fxml"));
                Scene scene = new Scene(root, 1000, 590);
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

}
