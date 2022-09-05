package Controller;

import Contants.databaseConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class doiMKController {
    @FXML
    private Button btnAccept;

    @FXML
    private Button btnCancle;

    @FXML
    private Button btnQuaylai;

    @FXML
    private PasswordField txtMK;

    @FXML
    private PasswordField txtMKmoi;

    @FXML
    private PasswordField txtMKmoi2;

    @FXML
    private TextField txtTaiKhoan;

    @FXML
    void acceptOnAction(ActionEvent event) {

    }

    @FXML
    void cancleOnAction(ActionEvent event) {

    }


//    private void validate() {
//        Stage newStage = new Stage();
//        try{
//            databaseConnection connectNow = new databaseConnection();
//            Connection connectDB = connectNow.getConnection();
//
//            String verifyLogin = " select loaitk from user";
//
//            Statement statement = connectDB.createStatement();
//            ResultSet rs = statement.executeQuery(verifyLogin);
//
//            while(rs.next()) {
//                if(rs.getString("loaitk") == "user"){
//                    try{
//                        Stage stage = (Stage) btnCancle.getScene().getWindow();
//                        stage.close();
//
//                        Stage userScreen = new Stage();
//                        try {
//                            Parent root = FXMLLoader.load(getClass().getResource("/Screen/users.fxml"));
//                            Scene scene = new Scene(root, 540, 300);
//                            userScreen.setScene(scene);
//                            userScreen.setTitle("Phần mềm quản lý bán hàng");
//                            userScreen.initModality(Modality.APPLICATION_MODAL);
//                            userScreen.show();
//                        }catch(Exception ex){
//                            ex.printStackTrace();
//                        }
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }else{
//                    if(rs.getString("loaitk") == "admin") {
//                        try {
//                            Stage stage = (Stage) btnCancle.getScene().getWindow();
//                            stage.close();
//                            Stage userScreen = new Stage();
//
//                            try {
//                                Parent root = FXMLLoader.load(getClass().getResource("/Screen/admin.fxml"));
//                                Scene scene = new Scene(root, 600, 400);
//                                userScreen.setScene(scene);
//                                userScreen.setTitle("Phần mềm quản lý bán hàng");
//                                userScreen.initModality(Modality.APPLICATION_MODAL);
//                                userScreen.show();
//                            } catch (Exception ex) {
//                                ex.printStackTrace();
//                            }
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
//                    } //if
//                } //else
//            } // while
//            connectDB.close();
//        }catch (Exception e) {
//            e.printStackTrace();
//            e.getCause();
//        }
//    } // validate
}
