package dangNhap;

import Contants.databaseConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;


import java.io.IOException;
import java.sql.*;

public class dangNhapController {
    @FXML
    private Button btnExit;

    @FXML
    private Label labelNotification;

    @FXML
    private Button btnlogin;

    @FXML
    private PasswordField txtPass;

    @FXML
    private TextField txtUser;

    Stage window;
//    Scene scene;

    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    @FXML
    void cancleOnAction(ActionEvent event) {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }

    @FXML
    void loginOnAction(ActionEvent event) {
        if(txtPass.getText().isBlank()== false && txtUser.getText().isBlank() == false){
            validatelogin();
        }else {
            labelNotification.setText("Xin mời nhập đầy đủ tài khoản và mật khẩu");
        }
    }

    private void validatelogin() {
        Stage newStage = new Stage();
        try{
        databaseConnection connectNow = new databaseConnection();
        Connection connectDB = connectNow.getConnection();

        String verifyLogin = "select matk from user where username = '" + txtUser.getText()
                            + "' and password = '" + txtPass.getText() +"'";


            Statement statement = connectDB.createStatement();
            ResultSet rs = statement.executeQuery(verifyLogin);

            while(rs.next()) {
                if(rs.getInt(1) == 1){
                    try{
                        Stage stage = (Stage) btnlogin.getScene().getWindow();
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
                }else{
                    try{
                        Stage stage = (Stage) btnlogin.getScene().getWindow();
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
//                    labelNotification.setText("Sai tài khoản hoặc mật khẩu. Xin mời nhập lại!");
                }
            }
            connectDB.close();
        }catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
   }

//    @Override
//    public void start(Stage stage) throws Exception {
//        try {
//            BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("banHang.fxml"));
//            Scene scene = new Scene(root,600,400);
//            stage.setTitle("Phần mềm quản lý bán hàng");
//            stage.setScene(scene);
//            stage.show();
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//    }
}
